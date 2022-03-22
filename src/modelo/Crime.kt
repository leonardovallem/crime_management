package modelo

data class Crime(
    val id: Int? = null,
    val descricao: String,
    val criminosos: List<Criminoso>,
    val vitimas: List<Vitima>
)
