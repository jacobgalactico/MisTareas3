package com.example.mistareas3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mistareas3.databinding.ItemTareaBinding

class TareasAdapter(
    private val tareas: List<Tarea>,
    private val onVerDetalle: (Tarea) -> Unit,
    private val onMarcarComoHecha: (Tarea) -> Unit
) : RecyclerView.Adapter<TareasAdapter.TareaViewHolder>() {

    inner class TareaViewHolder(val binding: ItemTareaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TareaViewHolder {
        val binding = ItemTareaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TareaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TareaViewHolder, position: Int) {
        val tarea = tareas[position]
        holder.binding.tvNombre.text = tarea.nombre
        holder.binding.btnVerDetalle.setOnClickListener { onVerDetalle(tarea) }
        holder.binding.btnMarcarHecha.setOnClickListener { onMarcarComoHecha(tarea) }
    }

    override fun getItemCount() = tareas.size
}
