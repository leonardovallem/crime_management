package modelo

data class Arma(val nome: String) : CheckableModel() {
    override fun toString() = nome
}
