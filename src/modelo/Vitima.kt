package modelo

data class Vitima(val nome: String) : CheckableModel() {
    override fun toString() = nome
}
