package com.example.mistareas3

import java.io.Serializable

data class Tarea(
    val nombre: String,
    val descripcion: String,
    val fecha: String,
    val prioridad: String,
    val coste: Double,
    var hecha: Boolean = false
) : Serializable
