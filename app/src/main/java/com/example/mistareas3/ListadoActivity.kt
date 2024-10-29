package com.example.mistareas3

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mistareas3.databinding.ActivityListadoBinding

class ListadoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListadoBinding
    private val tareasPendientes = mutableListOf<Tarea>()
    private val tareasHechas = mutableListOf<Tarea>()

    private val registroLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == RESULT_OK) {
            val tarea = result.data?.getSerializableExtra("tarea") as? Tarea
            tarea?.let {
                tareasPendientes.add(it)
                actualizarLista()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = TareasAdapter(tareasPendientes, ::verDetalle, ::marcarComoHecha)

        binding.btnAgregar.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            registroLauncher.launch(intent)
        }
    }

    private fun actualizarLista() {
        binding.recyclerView.adapter?.notifyDataSetChanged()
    }

    private fun verDetalle(tarea: Tarea) {
        val intent = Intent(this, DetalleActivity::class.java).apply {
            putExtra("tarea", tarea)
        }
        startActivity(intent)
    }

    private fun marcarComoHecha(tarea: Tarea) {
        tarea.hecha = true
        tareasPendientes.remove(tarea)
        tareasHechas.add(tarea)
        actualizarLista()
    }
}
