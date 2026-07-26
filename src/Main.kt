fun main() {
    val producto1 = "sueter"
    var cantidadP1 = 10
    var p1Disponible = true

    val producto2 = "shampoo"
    var cantidadP2 = 10
    var p2Disponible = true

    val producto3 = "pachon"
    var cantidadP3 = 10
    var p3Disponible = true

    val producto4 = "calcetines"
    var cantidadP4 = 10
    var p4Disponible = true

    val producto5 = "cepillo"
    var cantidadP5 = 10
    var p5Disponible = true

    var opcion: String

    do {
        println("1. Mostrar inventario Completo")
        println("2. Buscar un producto")
        println("3. Actualizar cantidad de un producto")
        println("4. Mostrar estadisticas basicas")
        println("5. Salir")

        print("Seleccione una opcion: ")
        opcion = readln()

        when (opcion) {
            "1" -> {
                println( """
                  producto 1: $producto1, cantidad: $cantidadP1, disponibilidad: $p1Disponible
                  producto 2: $producto2, cantidad: $cantidadP2, disponibilidad: $p2Disponible
                  producto 3: $producto3, cantidad: $cantidadP3, disponibilidad:$p3Disponible
                  producto 4: $producto4, cantidad: $cantidadP4, disponibilidad:$p4Disponible
                  producto 5: $producto5, cantidad: $cantidadP5, disponibilidad:$p5Disponible
              """.trimIndent())
                println()
            }

            "2" -> {
                println("ingresa el nombre del producto: ")
                var nombreProducto = readln().lowercase()


                if (nombreProducto == producto1) {
                    println("""
                        cantidad: $cantidadP1, disponibilidad: $p1Disponible
                    """.trimIndent())
                } else if (nombreProducto == producto2) {
                    println("""
                        cantidad: $cantidadP2, disponibilidad: $p2Disponible
                    """.trimIndent())
                } else if (nombreProducto == producto3) {
                    println("""
                        cantidad: $cantidadP3, disponibilidad: $p3Disponible
                    """.trimIndent())
                } else if (nombreProducto == producto4) {
                    println("""
                        cantidad: $cantidadP4, disponibilidad: $p4Disponible
                    """.trimIndent())
                } else if (nombreProducto == producto5) {
                    println("""
                        cantidad: $cantidadP5, disponibilidad: $p5Disponible
                    """.trimIndent())
                } else {
                    println("producto invalido")
                }
                println()
            }

            "3" -> {
                println("""
                    1. sueter
                    2. shampoo
                    3. pachon
                    4. calcetines
                    5. cepillo
                    
                    seleccione un producto: 
                """.trimIndent())
                var opcionProducto = readln().lowercase()

                if (opcionProducto == "1") {
                    println("ingrese la nueva cantidad del producto: ")
                    var
                }

            }
        }
    } while (opcion != "5")
    println("gracias por usar el programa")
}