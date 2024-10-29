package com.example.mistareas3

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mistareas3.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrar.setOnClickListener {
            val nombre = binding.etNombre.text.toString()
            val descripcion = binding.etDescripcion.text.toString()
            val fecha = binding.etFecha.text.toString()
            val prioridad = binding.etPrioridad.text.toString()
            val coste = binding.etCoste.text.toString().toDoubleOrNull() ?: 0.0

            val tarea = Tarea(nombre, descripcion, fecha, prioridad, coste)
            val resultIntent = Intent().apply {
                putExtra("tarea", tarea) // Aquí tarea es ahora Serializable
            }
            setResult(Activity.RESULT_OK, resultIntent)

            finish()
        }

        binding.btnCancelar.setOnClickListener {
            finish()
        }
    }
}
