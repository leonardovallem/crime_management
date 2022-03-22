package vista.components.sistema

import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.Text
import vista.Sistema
import vista.components.general.Column
import vista.components.general.DangerButton
import vista.components.general.PrimaryButton
import vista.components.general.Row
import vista.util.Styles
import vista.util.Topico
import vista.components.renderRegisterScreen

@Suppress("FunctionName")
fun RegisterOptionsPane(sistema: Sistema) = Column(15.0).apply {
    alignment = Pos.TOP_CENTER

    val title = Text("Cadastrar").apply {
        style = Styles.SUBTITLE
        fill = Color.WHITE
    }

    children.add(title)

    children.add(Row(15.0).apply {
        alignment = Pos.CENTER

        children.add(DangerButton("Crime") {
            sistema.renderRegisterScreen(Topico.CRIME)
        })
        children.add(PrimaryButton("Criminoso") {
            sistema.renderRegisterScreen(Topico.CRIMINOSO)
        })
    })

    children.add(Row(15.0).apply {
        alignment = Pos.CENTER

        children.add(PrimaryButton("Vítima") {
            sistema.renderRegisterScreen(Topico.VITIMA)
        })
        children.add(PrimaryButton("Arma") {
            sistema.renderRegisterScreen(Topico.ARMA)
        })
    })
}