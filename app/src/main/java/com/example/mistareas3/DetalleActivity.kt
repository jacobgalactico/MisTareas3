package com.example.mistareas3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mistareas3.databinding.ActivityDetalleBinding

class DetalleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tarea = intent.getSerializableExtra("tarea") as? Tarea
        tarea?.let {
            binding.tvNombre.text = it.nombre
            binding.tvDescripcion.text = it.descripcion
            binding.tvFecha.text = "Para el ${it.fecha}"
            binding.tvPrioridad.text = it.prioridad
            binding.tvCoste.text = "Tiene un coste de ${it.coste} €"
        }

        binding.btnVolver.setOnClickListener {
            finish()
        }
    }
}
