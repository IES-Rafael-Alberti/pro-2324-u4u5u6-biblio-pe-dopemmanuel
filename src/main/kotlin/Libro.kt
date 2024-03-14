/** La data clas de usuario para identificar quien toma el libro prestado */
data class Usuario(val nombre: String, val id: Int)

/**La data class libro que esla que tiene la info de los libros publicados */
data class Libro(val id: UUID, val titulo: String, val autor: String, val anioPublicacion: Int, val tematica: String, val estado: String)
class Catalogo {
    private val elementos = mutableListOf<Libro>()

    fun agregarLibro(libro: Libro) {
        elementos.add(libro)
    }
    fun buscarLibrosPorAutor(autor: String): List<Libro> {
        return elementos.filter { it.autor == autor }
    }
}

/** */
data class Prestamo(val libroId: UUID, val usuarioId: UUID, val fechaPrestamo: Long)

class RegistroPrestamos {
    private val prestamosActuales = mutableListOf<Prestamo>()
    private val historialPrestamos = mutableListOf<Prestamo>()

    fun registrarDevolucion(usuario: Usuario, libro: Libro) {
        prestamosActuales.removeIf { it.first == usuario && it.second == libro }
    }

    fun registrarPrestamo(prestamo:Prestamo) {
        prestamosActuales.add(prestamo)
        historialPrestamos.add(prestamo)
    }

    fun consultarHistorialPorLibro(libro: Libro): List<Pair<Usuario, Libro>> {
        return historialPrestamos.filter { it.second == libro }
    }

    fun consultarHistorialPorUsuario(usuario: Usuario): List<Pair<Usuario, Libro>> {
        return historialPrestamos.filter { it.first == usuario }
    }
}