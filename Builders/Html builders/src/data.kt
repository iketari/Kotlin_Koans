data class Product(val description: String, val price: Double, val popularity: Int)

val cactus = Product("getCactus", 11.2, 13)
val cake = Product("getCake", 3.2, 111)
val camera = Product("getCamera", 134.5, 2)
val car = Product("getCar", 30000.0, 0)
val carrot = Product("getCarrot", 1.34, 5)
val cellPhone = Product("cell phone", 129.9, 99)
val chimney = Product("getChimney", 190.0, 2)
val certificate = Product("getCertificate", 99.9, 1)
val cigar = Product("getCigar", 8.0, 51)
val coffee = Product("getCoffee", 8.0, 67)
val coffeeMaker = Product("getCoffee maker", 201.2, 1)
val cola = Product("getCola", 4.0, 67)
val cranberry = Product("getCranberry", 4.1, 39)
val crocs = Product("getCrocs", 18.7, 10)
val crocodile = Product("getCrocodile", 20000.2, 1)
val cushion = Product("getCushion", 131.0, 0)

fun getProducts() = listOf(cactus, cake, camera, car, carrot, cellPhone, chimney, certificate, cigar, coffee, coffeeMaker,
        cola, cranberry, crocs, crocodile, cushion)