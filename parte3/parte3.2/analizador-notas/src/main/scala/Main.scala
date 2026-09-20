object Main extends App {

  // Datos iniciales
  val estudiantes = List(
    "Ana",
    "Luis",
    "Marta",
    "Pedro",
    "Sofia"
  )

  val notas = Array(
    8,
    4,
    10,
    6,
    3
  )

  // 3.2.7 Función aprobado
  def aprobado(nota: Int): Boolean = {
    nota >= 5
  }

  // 3.2.8 Función estadoNota
  def estadoNota(nota: Int): String = {
    if (aprobado(nota)) "APROBADO" else "SUSPENSO"
  }

  // 3.2.9 Función maxNota
  def maxNota(a: Int, b: Int): Int = {
    if (a > b) a else b
  }

  // 3.2.12 Clasificación adicional
  def clasificacion(nota: Int): String = {
    if (nota >= 9) {
      "EXCELENTE"
    } else if (nota >= 7) {
      "NOTABLE"
    } else if (nota >= 5) {
      "APROBADO"
    } else {
      "SUSPENSO"
    }
  }

  // 3.2.10 y 3.2.11 Listado de estudiantes y Estadísticas
  println("--- PRIMERA EVALUACIÓN ---")
  var i = 0
  var numAprobados1 = 0
  var numSuspensos1 = 0
  var mejorNota1 = 0

  while (i < notas.length) {
    val est = estudiantes(i)
    val nota = notas(i)
    val estado = estadoNota(nota)

    println(est + " -> " + nota + " -> " + estado)

    if (aprobado(nota)) {
      numAprobados1 = numAprobados1 + 1
    } else {
      numSuspensos1 = numSuspensos1 + 1
    }

    mejorNota1 = maxNota(mejorNota1, nota)
    i = i + 1
  }

  println("\n--- Resumen del grupo ---")
  println("Estudiantes: " + estudiantes.length)
  println("Aprobados: " + numAprobados1)
  println("Suspensos: " + numSuspensos1)
  println("Mejor nota: " + mejorNota1)

  println("\n--- Clasificacion detallada ---")
  var k = 0
  while (k < notas.length) {
    println(estudiantes(k) + " -> " + notas(k) + " -> " + clasificacion(notas(k)))
    k = k + 1
  }

  // 3.2.13 Segunda evaluación
  val notasSegundaEvaluacion = Array(
    9,
    5,
    8,
    7,
    6
  )

  println("\n--- SEGUNDA EVALUACIÓN ---")
  var j = 0
  var numAprobados2 = 0
  var numSuspensos2 = 0
  var mejorNota2 = 0

  while (j < notasSegundaEvaluacion.length) {
    val est = estudiantes(j)
    val nota = notasSegundaEvaluacion(j)
    val estado = estadoNota(nota)

    println(est + " -> " + nota + " -> " + estado)

    if (aprobado(nota)) {
      numAprobados2 = numAprobados2 + 1
    } else {
      numSuspensos2 = numSuspensos2 + 1
    }

    mejorNota2 = maxNota(mejorNota2, nota)
    j = j + 1
  }

  println("\n--- Resumen del grupo (Segunda Evaluación) ---")
  println("Estudiantes: " + estudiantes.length)
  println("Aprobados: " + numAprobados2)
  println("Suspensos: " + numSuspensos2)
  println("Mejor nota: " + mejorNota2)

  // 3.2.14 Comparación de evaluaciones
  println("\n--- COMPARACIÓN DE EVALUACIONES ---")
  println("Mejor nota de la primera evaluación: " + mejorNota1)
  println("Mejor nota de la segunda evaluación: " + mejorNota2)
  println("Aprobados primera evaluación: " + numAprobados1)
  println("Aprobados segunda evaluación: " + numAprobados2)

  if (numAprobados2 > numAprobados1) {
    println("El grupo ha mejorado.")
  } else if (numAprobados2 < numAprobados1) {
    println("El grupo ha empeorado.")
  } else {
    println("El grupo se ha mantenido igual.")
  }

  // 3.2.15 Uso de listas
  println("\n--- USO DE LISTAS ---")
  val nuevosEstudiantes = "Carlos" :: estudiantes

  println("Lista original: " + estudiantes)
  println("Nueva lista: " + nuevosEstudiantes)
}