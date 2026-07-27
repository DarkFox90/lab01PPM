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
        opcion = readln().trim()

        when (opcion) {
            "1" -> {
                println(
                    """
                  producto 1: $producto1, cantidad: $cantidadP1, disponibilidad: $p1Disponible
                  producto 2: $producto2, cantidad: $cantidadP2, disponibilidad: $p2Disponible
                  producto 3: $producto3, cantidad: $cantidadP3, disponibilidad:$p3Disponible
                  producto 4: $producto4, cantidad: $cantidadP4, disponibilidad:$p4Disponible
                  producto 5: $producto5, cantidad: $cantidadP5, disponibilidad:$p5Disponible
              """.trimIndent()
                )
                println()
            }

            "2" -> {
                println("ingresa el nombre del producto: ")
                var nombreProducto = readln().lowercase().trim()


                if (nombreProducto == producto1) {
                    println(
                        """
                        cantidad: $cantidadP1, disponibilidad: $p1Disponible
                    """.trimIndent()
                    )
                } else if (nombreProducto == producto2) {
                    println(
                        """
                        cantidad: $cantidadP2, disponibilidad: $p2Disponible
                    """.trimIndent()
                    )
                } else if (nombreProducto == producto3) {
                    println(
                        """
                        cantidad: $cantidadP3, disponibilidad: $p3Disponible
                    """.trimIndent()
                    )
                } else if (nombreProducto == producto4) {
                    println(
                        """
                        cantidad: $cantidadP4, disponibilidad: $p4Disponible
                    """.trimIndent()
                    )
                } else if (nombreProducto == producto5) {
                    println(
                        """
                        cantidad: $cantidadP5, disponibilidad: $p5Disponible
                    """.trimIndent()
                    )
                } else {
                    println("producto invalido")
                }
                println()
            }

            "3" -> {
                println(
                    """
                    1. sueter
                    2. shampoo
                    3. pachon
                    4. calcetines
                    5. cepillo
                    
                    seleccione un producto: 
                """.trimIndent()
                )
                var opcionProducto = readln().lowercase().trim()

                if (opcionProducto == "1") {
                    println("ingrese la nueva cantidad del producto: ")
                    var cantidadProducto1 = readln().toIntOrNull()

                    if (cantidadProducto1 == null || cantidadProducto1 < 0 || cantidadProducto1 > 100) {
                        println("cantidad invalida")
                    } else {
                        cantidadP1 = cantidadProducto1
                        println("cantidad disponible: $cantidadP1")

                        if (cantidadProducto1 == 0) {
                            p1Disponible = false
                        } else {
                            p1Disponible = true
                        }
                    }
                } else if (opcionProducto == "2") {
                    println("ingrese la nueva cantidad del producto: ")
                    var cantidadProducto2 = readln().toIntOrNull()

                    if (cantidadProducto2 == null || cantidadProducto2 < 0 || cantidadProducto2 > 100) {
                        println("cantidad invalida")
                    } else {
                        cantidadP2 = cantidadProducto2
                        println("cantidad disponible: $cantidadP2")

                        if (cantidadProducto2 == 0) {
                            p2Disponible = false
                        } else {
                            p2Disponible = true
                        }
                    }
                } else if (opcionProducto == "3") {
                    println("ingrese la nueva cantidad del producto: ")
                    var cantidadProducto3 = readln().toIntOrNull()

                    if (cantidadProducto3 == null || cantidadProducto3 < 0 || cantidadProducto3 > 100) {
                        println("cantidad invalida")
                    } else {
                        cantidadP3 = cantidadProducto3
                        println("cantidad disponible: $cantidadP3")

                        if (cantidadProducto3 == 0) {
                            p3Disponible = false
                        } else {
                            p3Disponible = true
                        }
                    }
                } else if (opcionProducto == "4") {
                    println("ingrese la nueva cantidad del producto: ")
                    var cantidadProducto4 = readln().toIntOrNull()

                    if (cantidadProducto4 == null || cantidadProducto4 < 0 || cantidadProducto4 > 100) {
                        println("cantidad invalida")
                    } else {
                        cantidadP4 = cantidadProducto4
                        println("cantidad disponible: $cantidadP4")

                        if (cantidadProducto4 == 0) {
                            p4Disponible = false
                        } else {
                            p4Disponible = true
                        }
                    }
                } else if (opcionProducto == "5") {
                    println("ingrese la nueva cantidad del producto: ")
                    var cantidadProducto5 = readln().toIntOrNull()

                    if (cantidadProducto5 == null || cantidadProducto5 < 0 || cantidadProducto5 > 100) {
                        println("cantidad invalida")
                    } else {
                        cantidadP5 = cantidadProducto5
                        println("cantidad disponible: $cantidadP5")

                        if (cantidadProducto5 == 0) {
                            p5Disponible = false
                        } else {
                            p5Disponible = true
                        }
                    }
                } else {
                    println("no ingreso un producto valido")
                }
                println()
            }

            "4" -> {
                var contador = 0
                if (p1Disponible) {
                    contador++
                }
                if (p2Disponible) {
                    contador++
                }
                if (p3Disponible) {
                    contador++
                }
                if (p4Disponible) {
                    contador++
                }
                if (p5Disponible) {
                    contador++
                }
                println("hay: $contador productos disponibles")

                var sumaProductos = cantidadP1 + cantidadP2 + cantidadP3 + cantidadP4 + cantidadP5
                println("hay un total de $sumaProductos productos")
                println()
            }
        }
    } while (opcion != "5")
    println("gracias por usar el programa")
}