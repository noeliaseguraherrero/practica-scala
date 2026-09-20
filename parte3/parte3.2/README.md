# Mini proyecto 3.2 - Análisis de Notas de Estudiantes


## Entorno

- IntelliJ IDEA Community
- Scala 2.12.21
- JDK 17
- sbt

## Descripción

El programa procesa las notas de los estudiantes en 2 evaluaciones:

* Determina si cada estudiante está **APROBADO** ($\ge 5$) o **SUSPENSO**.
* Clasifica las notas en **EXCELENTE**, **NOTABLE**, **APROBADO** o **SUSPENSO**.
* Muestra el resumen estadístico del grupo (total, aprobados, suspensos y mejor nota).
* Compara si el grupo ha mejorado, empeorado o se mantiene igual entre evaluaciones.
* Demuestra el uso del operador `::` y la inmutabilidad de las listas en Scala.

## Estructura del proyecto

```
gestion-estudiantes/
├── build.sbt
├── project/
└── src/
    └── main/
        └── scala/
            └── Main.scala
```

## 3. Explicación de inmutabilidad y operador `::` (3.2.15)

Al ejecutar la línea:

```scala
val nuevosEstudiantes = "Carlos" :: estudiantes
```

* **¿Por qué la lista original no cambia?**  
  En Scala, la colección `List` es **inmutable**, lo que significa que sus elementos nunca se pueden modificar ni eliminar una vez creada.

* **¿Qué hace el operador `::`?**  
  El operador cons (`::`) crea una **nueva lista** añadiendo el nuevo elemento ("Carlos") al principio de la lista existente. La lista `estudiantes` sigue intacta en memoria y la variable `nuevosEstudiantes` apunta a la nueva estructura generada.

## Capturas de pantalla requeridas

### 1. Entorno de Desarrollo (IntelliJ IDEA)
- **Plugin de Scala instalado**: `![Plugin Scala](images/plugin-scala.png)`
- **Estructura sbt del proyecto**: `![Estructura sbt](images/estructura.png)`

### 2. Archivos del Proyecto
- **Archivo build.sbt**: `![build.sbt](images/build-sbt.png)`
- **Archivo Main.scala**: `![Main.scala](images/main-scala.png)``![Main.scala](images/main-scala2.png)``![Main.scala](images/main-scala3.png)``![Main.scala](images/main-scala4.png)``![Main.scala](images/main-scala5.png)`

### 3. Compilación y Ejecución
- **Resultado de sbt compile**: `![sbt compile](images/sbt-compile.png)`
- **Resultado de sbt run y Salida final de la aplicación**: `![sbt run](images/sbt-run1.png)` `![sbt run](images/sbt-run2.png)`
