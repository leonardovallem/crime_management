package modelo

import java.util.Date

data class Vitima(
    val id: Int? = null,
    val nome: String,
    val cpf: String,
    val dataNascimento: Date
) : CheckableModel() {
    override fun toString() = nome
}
