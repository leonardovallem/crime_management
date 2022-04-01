package vista.components.sistema

import javafx.geometry.Pos
import vista.Sistema
import vista.components.general.Column
import vista.components.general.PrimaryButton
import vista.components.screens.renderRegisterScreen
import vista.util.Topico

@Suppress("FunctionName")
fun HomeScreenOptionsPane(sistema: Sistema) = Column(25.0).apply {
    alignment = Pos.CENTER

    children.add(PrimaryButton("Cadastrar") {
        sistema.renderRegisterScreen()
    })
    children.add(PrimaryButton("Listar") {
        sistema.renderRegisterScreen()
    })

}
