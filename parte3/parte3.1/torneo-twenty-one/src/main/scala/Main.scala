object Main extends App {

  // 3.1.6 Datos iniciales
  val jugadores = List(
    "Alex",
    "Chen",
    "Marta",
    "Sindhu",
    "Luis"
  )

  val puntuaciones = Array(
    18,
    24,
    21,
    20,
    26
  )

  // 3.1.7 Función bust
  def bust(puntuacion: Int): Boolean = {
    puntuacion > 21
  }

  // 3.1.8 Función estadoMano
  def estadoMano(puntuacion: Int): String = {
    if (bust(puntuacion)) "BUST" else "VALIDA"
  }

  // 3.1.9 Función mejorMano
  def mejorMano(handA: Int, handB: Int): Int = {
    if (bust(handA) && bust(handB)) {
      0
    } else if (bust(handA)) {
      handB
    } else if (bust(handB)) {
      handA
    } else {
      if (handA > handB) handA else handB
    }
  }

  // 3.1.10 y 3.1.11 Procesamiento y Estadísticas de la Primera Ronda
  println("--- PRIMERA RONDA ---")
  var i = 0
  var manosValidasRonda1 = 0
  var bustRonda1 = 0
  var mejorPuntuacionRonda1 = 0

  while (i < puntuaciones.length) {
    val jugador = jugadores(i)
    val punt = puntuaciones(i)
    val estado = estadoMano(punt)

    println(jugador + " -> " + punt + " -> " + estado)

    if (bust(punt)) {
      bustRonda1 = bustRonda1 + 1
    } else {
      manosValidasRonda1 = manosValidasRonda1 + 1
      mejorPuntuacionRonda1 = mejorMano(mejorPuntuacionRonda1, punt)
    }

    i = i + 1
  }

  println("\n--- Resumen de la ronda ---")
  println("Jugadores: " + jugadores.length)
  println("Manos validas: " + manosValidasRonda1)
  println("Bust: " + bustRonda1)
  println("Mejor puntuacion valida: " + mejorPuntuacionRonda1)

  // 3.1.12 Segunda ronda
  val puntuacionesRonda2 = Array(
    22,
    19,
    20,
    21,
    17
  )

  println("\n--- SEGUNDA RONDA ---")
  var j = 0
  var manosValidasRonda2 = 0
  var bustRonda2 = 0
  var mejorPuntuacionRonda2 = 0

  while (j < puntuacionesRonda2.length) {
    val jugador = jugadores(j)
    val punt = puntuacionesRonda2(j)
    val estado = estadoMano(punt)

    println(jugador + " -> " + punt + " -> " + estado)

    if (bust(punt)) {
      bustRonda2 = bustRonda2 + 1
    } else {
      manosValidasRonda2 = manosValidasRonda2 + 1
      mejorPuntuacionRonda2 = mejorMano(mejorPuntuacionRonda2, punt)
    }

    j = j + 1
  }

  println("\n--- Resumen de la ronda 2 ---")
  println("Jugadores: " + jugadores.length)
  println("Manos validas: " + manosValidasRonda2)
  println("Bust: " + bustRonda2)
  println("Mejor puntuacion valida: " + mejorPuntuacionRonda2)

  // 3.1.13 Comparación de rondas
  println("\n--- COMPARACION DE RONDAS ---")
  println("Mejor puntuacion de la primera ronda: " + mejorPuntuacionRonda1)
  println("Mejor puntuacion de la segunda ronda: " + mejorPuntuacionRonda2)

  if (mejorPuntuacionRonda1 > mejorPuntuacionRonda2) {
    println("La primera ronda tuvo la mejor puntuación.")
  } else if (mejorPuntuacionRonda2 > mejorPuntuacionRonda1) {
    println("La segunda ronda tuvo la mejor puntuación.")
  } else {
    println("Ambas rondas tuvieron la misma mejor puntuacion.")
  }

  // 3.1.14 Uso de foreach 
println("\n--- MOSTRAR PUNTUACIONES DE RONDA 1 USANDO FOREACH ---")
  puntuaciones.foreach(punt => println("Puntuación: " + punt + " -> " + estadoMano(punt)))
}