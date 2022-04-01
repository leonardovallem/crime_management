package vista.components.screens

import javafx.event.ActionEvent
import javafx.event.EventHandler
import vista.Sistema
import vista.State
import vista.components.general.Column
import vista.components.general.Title
import vista.components.sistema.RegisterArma
import vista.components.sistema.RegisterCrime
import vista.components.sistema.RegisterPessoa
import vista.util.Topico
import vista.util.update

fun Sistema.renderRegisterScreen(
    topic: Topico,
    flag: String = "",
    navigateBack: EventHandler<ActionEvent>? = null
) {
    State.update(
        title = Title("Cadastrar $topic", navigateBack),
        center = when (topic) {
            Topico.CRIME -> RegisterCrime(this)
            Topico.CRIMINOSO -> RegisterPessoa(this, Topico.CRIMINOSO, flag)
            Topico.VITIMA -> RegisterPessoa(this, Topico.VITIMA, flag)
            Topico.ARMA -> RegisterArma(this, flag)
            else -> Column(0.0)
        },
        payload = flag
    )
    globalPane.update()
}