package vista.components.sistema

import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.paint.Color
import javafx.scene.text.Text
import javafx.stage.Screen
import vista.components.general.Column
import vista.components.general.Row
import vista.util.SEARCH_ARMA
import vista.util.Styles

@Suppress("FunctionName")
fun RegisterArma(flag: String = "") = Column(15.0).apply {
    alignment = Pos.TOP_CENTER
    maxWidth = Screen.getPrimary().visualBounds.width * 0.5
    padding = Insets(10.0)

    if (flag.isNotEmpty() && flag.contains(SEARCH_ARMA)) {
        children.add(Row(15.0).apply {
            alignment = Pos.TOP_LEFT

            children.add(Text("Buscar arma por número de registro:").apply {
                style = Styles.LABEL
                fill = Color.WHITE
            })

            children.add(TextField().apply {
                minWidth = 175.0
                maxWidth = 175.0

                isFillWidth = true
            })

            children.add(Button("Pesquisar").apply {
                alignment = Pos.CENTER_RIGHT
                style = Styles.SUCCESS_BUTTON
                // TODO search weapon
            })
        })
    }

    children.add(Row(15.0).apply {
        alignment = Pos.TOP_LEFT

        children.add(Text("Número de registro:").apply {
            style = Styles.LABEL
            fill = Color.WHITE
        })

        children.add(TextField().apply {
            minWidth = 175.0
            maxWidth = 175.0

            isFillWidth = true
        })
    })

    children.add(Row(15.0).apply {
        alignment = Pos.TOP_LEFT

        children.add(Text("Tipo:").apply {
            style = Styles.LABEL
            fill = Color.WHITE
        })

        children.add(TextField().apply {
            minWidth = 500.0
            maxWidth = 500.0

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
            minHeight = 250.0
            maxHeight = 250.0

            isFillWidth = true
        })
    })

    children.add(Row(15.0).apply {
        alignment = Pos.BOTTOM_RIGHT
        children.add(Button("Cadastrar").apply {
            style = Styles.SUCCESS_BUTTON
            // TODO register criminal
        })
    })
}