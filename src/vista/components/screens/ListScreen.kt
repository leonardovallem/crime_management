package vista.components.screens

import javafx.event.ActionEvent
import javafx.event.EventHandler
import vista.Sistema
import vista.State
import vista.components.general.Title
import vista.components.sistema.ListArmas
import vista.components.sistema.ListCrimes
import vista.components.sistema.ListPessoas
import vista.components.sistema.RegisterArma
import vista.components.sistema.RegisterCrime
import vista.components.sistema.RegisterPessoa
import vista.util.Topico
import vista.util.update

fun Sistema.renderListScreen(
    topic: Topico,
    flag: String = "",
    navigateBack: EventHandler<ActionEvent>? = null
) {
    State.update(
        title = Title("Listar ${topic}s", navigateBack),
        center = when (topic) {
            Topico.CRIME -> ListCrimes()
            Topico.CRIMINOSO -> ListPessoas(Topico.CRIMINOSO)
            Topico.VITIMA -> ListPessoas(Topico.VITIMA)
            Topico.ARMA -> ListArmas()
        }
    )
    globalPane.update()
}