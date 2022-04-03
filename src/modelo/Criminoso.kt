package modelo

import java.util.Date

data class Criminoso(
    val id: Int? = null,
    val nome: String,
    val cpf: String,
    val dataNascimento: Date,
    val armas: List<Arma>,
    val vitimas: List<Vitima>
) : CheckableModel() {
    override fun toString() = nome
}
