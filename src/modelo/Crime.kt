package modelo

data class Crime(
    val id: Int? = null,
    val data: String,
    val descricao: String,
    val criminosos: List<Criminoso>
)
