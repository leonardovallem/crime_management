package vista.components.sistema

import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.paint.Color
import javafx.scene.text.Text
import javafx.stage.Screen
import modelo.Criminoso
import vista.Sistema
import vista.State
import vista.components.general.Column
import vista.components.general.Row
import vista.components.screens.renderRegisterScreen
import vista.util.SEARCH_PESSOA
import vista.util.Styles
import vista.util.Topico
import vista.util.update

@Suppress("FunctionName")
fun RegisterCrime(sistema: Sistema) = Column(15.0).apply {
    alignment = Pos.TOP_CENTER
    maxWidth = Screen.getPrimary().visualBounds.width * 0.5
    padding = Insets(10.0)

    children.add(Row(15.0).apply {
        alignment = Pos.TOP_LEFT

        children.add(Text("Data:").apply {
            style = Styles.LABEL
            fill = Color.WHITE
        })

        children.add(TextField().apply {
            minWidth = 100.0
            maxWidth = 100.0

            isFillWidth = true
        })
    })

    children.add(Row(15.0).apply {
        alignment = Pos.TOP_LEFT

        children.add(Text("Horas:").apply {
            style = Styles.LABEL
            fill = Color.WHITE
        })

        children.add(TextField().apply {
            minWidth = 100.0
            maxWidth = 100.0

            isFillWidth = true
        })
    })

    children.add(Row(15.0).apply {
        alignment = Pos.TOP_LEFT

        children.add(Text("Descrição:").apply {
            style = Styles.LABEL
            fill = Color.WHITE
        })

        children.add(TextField().apply {
            alignment = Pos.TOP_LEFT
            minWidth = 450.0
            maxWidth = 450.0
            minHeight = 300.0
            maxHeight = 300.0

            isFillWidth = true
        })
    })

    val criminals = listOf<Criminoso>() // TODO

    children.add(Row(15.0).apply {
        alignment = Pos.TOP_LEFT

        children.add(Text("Criminosos:").apply {
            style = Styles.LABEL
            padding = Insets(15.0)
            fill = Color.WHITE
        })
        children.add(TopicCheckboxList(criminals) {
            sistema.renderRegisterScreen(Topico.CRIMINOSO, SEARCH_PESSOA) {
                State.revert()
                sistema.globalPane.update()
            }
        })
    })

    children.add(Row(15.0).apply {
        alignment = Pos.BOTTOM_RIGHT
        children.add(Button("Cadastrar").apply {
            style = Styles.SUCCESS_BUTTON
            // TODO register crime
        })
    })
}