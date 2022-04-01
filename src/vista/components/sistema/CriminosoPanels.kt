package vista.components.sistema

import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.paint.Color
import javafx.scene.text.Text
import javafx.stage.Screen
import modelo.Arma
import modelo.Vitima
import vista.Sistema
import vista.State
import vista.components.general.Column
import vista.components.general.Row
import vista.components.screens.renderRegisterScreen
import vista.util.SEARCH_ARMA
import vista.util.SEARCH_PESSOA
import vista.util.Styles
import vista.util.Topico
import vista.util.update

@Suppress("FunctionName")
fun RegisterPessoa(sistema: Sistema, topic: Topico, flag: String = "") = Column(15.0).apply {
    alignment = Pos.TOP_CENTER
    maxWidth = Screen.getPrimary().visualBounds.width * 0.5
    padding = Insets(10.0)

    if (flag.isNotEmpty() && flag.contains(SEARCH_PESSOA)) {
        children.add(Row(15.0).apply {
            alignment = Pos.TOP_LEFT

            children.add(Text("Buscar $topic por CPF:").apply {
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
                // TODO search person
            })
        })
    }

    children.add(Row(15.0).apply {
        alignment = Pos.TOP_LEFT

        children.add(Text("CPF:").apply {
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

        children.add(Text("Nome:").apply {
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

        children.add(Text("Data de nascimento:").apply {
            style = Styles.LABEL
            fill = Color.WHITE
        })

        children.add(TextField().apply {
            minWidth = 100.0
            maxWidth = 100.0

            isFillWidth = true
        })
    })

    if (topic == Topico.CRIMINOSO) {
        val armas = listOf<Arma>() // TODO replace with result from backend
        val vitimas = listOf<Vitima>() // TODO replace with result from backend

        children.add(Row(15.0).apply {
            children.add(Row(15.0).apply {
                alignment = Pos.CENTER

                children.add(Text("Armas:").apply {
                    style = Styles.LABEL
                    padding = Insets(15.0)
                    fill = Color.WHITE
                })
                children.add(TopicCheckboxList(armas) {
                    sistema.renderRegisterScreen(Topico.ARMA, SEARCH_ARMA) {
                        State.revert()
                        sistema.globalPane.update()
                    }
                })
            })

            children.add(Row(15.0).apply {
                alignment = Pos.CENTER

                children.add(Text("Vítimas:").apply {
                    style = Styles.LABEL
                    padding = Insets(15.0)
                    fill = Color.WHITE
                })
                children.add(TopicCheckboxList(vitimas) {
                    sistema.renderRegisterScreen(Topico.VITIMA, SEARCH_PESSOA) {
                        State.revert()
                        sistema.globalPane.update()
                    }
                })
            })
        })
    }

    children.add(Row(15.0).apply {
        alignment = Pos.BOTTOM_RIGHT
        children.add(Button("Cadastrar").apply {
            style = Styles.SUCCESS_BUTTON
            // TODO register criminal
        })
    })
}