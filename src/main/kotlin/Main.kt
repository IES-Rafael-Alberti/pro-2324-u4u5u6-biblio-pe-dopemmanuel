package org.pebiblioteca
fun main() {
   val registro = RegistroPrestamos()

  	val usuario1 = Usuario("Juan", 1573)
  	val usuario2 = Usuario("María", 4358)

  	val libro1 = Libro("El Caballero de la armadura Oxidada", "Robert Fisher")
  	val libro2 = Libro("Cien años de soledad", "Gabriel García Márquez")
    val libro3 = Libro("Cybersecurity++", "Andrew Martinez")
    val libro4 = Libro("Clean code", "Robert C. Martin")
    val libro5 = Libro("The Art of Computer Programming","Donald Knuth")
    val libro6 = Libro("Sombra sobre Innsmouth","Hijo-Tomas")
    val libro7 = Libro("Cuando las luces se apagan","James hopkins")
    val libro8 = Libro("Hidden in darkenss","unknow")
    val libro9 = Libro("Eletronica Vol 1","Tobias Mathew")
    val libro10 = Libro("Eletronica Vol 2","Tobias Mathew")

  	registro.registrarPrestamo(usuario1, libro1)
  	registro.registrarPrestamo(usuario2, libro2)

  	println(registro.consultarHistorialPorLibro(libro1))
}