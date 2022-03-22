package modelo

enum class TipoArma {
    FOGO, BRANCA;

    override fun toString() = if (equals(FOGO)) "de Fogo" else "Branca"
}

data class Arma(
    val id: Int? = null,
    val numeroRegistro: String,
    val descricao: String,
    val tipo: TipoArma
) : CheckableModel() {
    override fun toString() = "Arma $tipo #$id"
}
