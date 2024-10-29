# MiTareas3

MiTareas3 es una aplicación de Android desarrollada en Kotlin para gestionar tareas. Permite al usuario registrar tareas con detalles como nombre, descripción, fecha, prioridad y coste. Las tareas se pueden ver en una lista de tareas pendientes, y al completarse, pueden marcarse como hechas. Esta aplicación utiliza `RecyclerView` para mostrar la lista de tareas y permite ver los detalles de cada tarea.

## Características

- **Registrar nueva tarea:** Permite añadir tareas con detalles específicos como nombre, descripción, fecha, prioridad y coste.
- **Listar tareas:** Muestra una lista de tareas pendientes.
- **Ver detalles de una tarea:** Visualiza los detalles completos de una tarea registrada.
- **Marcar tarea como hecha:** Permite mover una tarea a la lista de tareas hechas.

## Estructura del Proyecto

El proyecto contiene las siguientes actividades:

- **MainActivity:** Pantalla de inicio que permite navegar a la lista de tareas o registrar una nueva tarea.
- **ListadoActivity:** Muestra la lista de tareas pendientes y permite añadir nuevas tareas o ver los detalles de las tareas existentes.
- **RegistroActivity:** Permite al usuario registrar una nueva tarea y añadirla a la lista de tareas pendientes.
- **DetalleActivity:** Muestra los detalles de una tarea específica seleccionada desde la lista.

## Clases Principales

- `Tarea`: Clase de datos que representa una tarea. Implementa `Serializable` para poder pasar objetos `Tarea` entre actividades.
- `TareasAdapter`: Adapter para el `RecyclerView`, utilizado en `ListadoActivity` para mostrar la lista de tareas pendientes.

## Instalación y Configuración

### Requisitos Previos

- Android Studio (versión recomendada: Arctic Fox o superior).
- SDK de Android (versión 21 o superior).
- Kotlin configurado en Android Studio.

### Link

https://github.com/jacobgalactico/MisTareas3.git
