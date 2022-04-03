package vista.components.sistema

import javafx.geometry.Pos
import vista.Sistema
import vista.components.general.Column
import vista.components.general.PrimaryButton
import vista.components.screens.renderListScreen
import vista.components.screens.renderRegisterScreen
import vista.util.Topico

@Suppress("FunctionName")
fun TopicOptionsPane(sistema: Sistema, isRegister: Boolean) = Column(25.0).apply {
    alignment = Pos.CENTER

    children.add(PrimaryButton(Topico.CRIME.toString()) {
        if (isRegister) sistema.renderRegisterScreen(Topico.CRIME) { sistema.renderRegisterScreen() }
        else sistema.renderListScreen(Topico.CRIME) { sistema.renderListScreen() }
    })
    children.add(PrimaryButton(Topico.CRIMINOSO.toString()) {
        if (isRegister) sistema.renderRegisterScreen(Topico.CRIMINOSO) { sistema.renderRegisterScreen() }
        else sistema.renderListScreen(Topico.CRIMINOSO) { sistema.renderListScreen() }
    })
    children.add(PrimaryButton(Topico.VITIMA.toString()) {
        if (isRegister) sistema.renderRegisterScreen(Topico.VITIMA) { sistema.renderRegisterScreen() }
        else sistema.renderListScreen(Topico.VITIMA) { sistema.renderListScreen() }
    })
    children.add(PrimaryButton(Topico.ARMA.toString()) {
        if (isRegister) sistema.renderRegisterScreen(Topico.ARMA) { sistema.renderRegisterScreen() }
        else sistema.renderListScreen(Topico.ARMA) { sistema.renderListScreen() }
    })
}
