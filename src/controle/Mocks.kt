package controle

import java.time.LocalDate
import java.time.ZoneId
import java.util.Date
import modelo.Arma
import modelo.Crime
import modelo.Criminoso
import modelo.TipoArma
import modelo.Vitima

val armas = listOf<Arma>(
    Arma(
        numeroRegistro = "29734",
        descricao = "Rifle de assalto AK-47",
        tipo = TipoArma.FOGO
    )
)

val vitimas = listOf<Vitima>(
    Vitima(
        cpf = "987.654.321-00",
        nome = "Camarada Inocente",
        dataNascimento = Date(
            LocalDate.of(2001, 7, 9)
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant()
                .epochSecond
        ),
    )
)

val criminosos = listOf<Criminoso>(
    Criminoso(
        cpf = "123.123.123-00",
        nome = "Criminoso Zé Ruela",
        dataNascimento = Date(
            LocalDate.of(1997, 4, 8)
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant()
                .epochSecond
        ),
        armas = armas,
        vitimas = vitimas
    ),
)

val crimes = listOf<Crime>(
    Crime(
        data = "22/10/21 14h33",
        descricao = "Crime ocorrido em tal lugar",
        criminosos = criminosos
    )
)