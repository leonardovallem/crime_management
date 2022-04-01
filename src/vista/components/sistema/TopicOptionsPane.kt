package vista.components.sistema

import javafx.geometry.Pos
import vista.Sistema
import vista.components.general.Column
import vista.components.general.PrimaryButton
import vista.components.screens.renderRegisterScreen
import vista.util.Topico

@Suppress("FunctionName")
fun TopicOptionsPane(sistema: Sistema) = Column(25.0).apply {
    alignment = Pos.CENTER

    children.add(PrimaryButton(Topico.CRIME.toString()) {
        sistema.renderRegisterScreen(Topico.CRIME) { sistema.renderRegisterScreen() }
    })
    children.add(PrimaryButton(Topico.CRIMINOSO.toString()) {
        sistema.renderRegisterScreen(Topico.CRIMINOSO) { sistema.renderRegisterScreen() }
    })
    children.add(PrimaryButton(Topico.VITIMA.toString()) {
        sistema.renderRegisterScreen(Topico.VITIMA) { sistema.renderRegisterScreen() }
    })
    children.add(PrimaryButton(Topico.ARMA.toString()) {
        sistema.renderRegisterScreen(Topico.ARMA) { sistema.renderRegisterScreen() }
    })
}
