@file:Suppress("FunctionName")

package vista

import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.control.ListView
import javafx.scene.control.TextField
import javafx.scene.control.cell.CheckBoxListCell
import javafx.scene.layout.Region
import javafx.scene.paint.Color
import javafx.scene.text.Text
import modelo.Arma
import modelo.Vitima
import vista.SistemaComponents.RegisterFieldPane
import vista.SistemaComponents.RegisterOptionsPane
import vista.SistemaComponents.SearchFieldPane
import vista.SistemaComponents.SearchOptionsPane
import vista.components.General

object SistemaComponents {
    fun RegisterOptionsPane(sistema: Sistema) = General.Column(15.0).apply {
        alignment = Pos.TOP_CENTER

        val title = Text("Cadastrar").apply {
            style = Styles.SUBTITLE
            fill = Color.WHITE
        }

        children.add(title)

        children.add(General.Row(15.0).apply {
            alignment = Pos.CENTER

            children.add(General.PrimaryButton("Criminoso") {
                sistema.renderRegisterScreen(Topico.CRIMINOSO)
            })
            children.add(General.PrimaryButton("Vítima") {
                sistema.renderRegisterScreen(Topico.VITIMA)
            })
            children.add(General.PrimaryButton("Arma") {
                sistema.renderRegisterScreen(Topico.ARMA)
            })
        })
    }

    fun SearchOptionsPane(sistema: Sistema) = General.Column(15.0).apply {
        alignment = Pos.TOP_CENTER

        val title = Text("Pesquisar").apply {
            style = Styles.SUBTITLE
            fill = Color.WHITE
        }

        children.add(title)

        children.add(General.Row(15.0).apply {
            alignment = Pos.CENTER

            children.add(General.SecondaryButton("Criminoso") {
                sistema.renderSearchScreen(Topico.CRIMINOSO)
            })
            children.add(General.SecondaryButton("Vítima") {
                sistema.renderSearchScreen(Topico.VITIMA)
            })
            children.add(General.SecondaryButton("Arma") {
                sistema.renderSearchScreen(Topico.ARMA)
            })
        })
    }

    fun RegisterFieldPane(sistema: Sistema, topic: Topico) = General.Column(15.0).apply {
        padding = Insets(10.0, 10.0, 10.0, 10.0)

        children.add(General.Row(15.0).apply {
            children.add(Text("Nome:").apply {
                style = Styles.LABEL
                fill = Color.WHITE
            })

            children.add(TextField().apply {
                prefWidth = 400.0
            })
        })

        if (topic == Topico.CRIMINOSO) {
            // TODO replace with data from database
            val victims: List<Vitima> = listOf(Vitima("Vitima 1"), Vitima("Outra vitima"))
            val weapons: List<Arma> = listOf(Arma("Arma 1"), Arma("Outra arma"))

            children.add(Text("Vítimas").apply {
                style = Styles.LABEL
                padding = Insets(15.0)
                fill = Color.WHITE
            })
            children.add(ListView<Vitima>().apply {
                victims.forEach { items.add(it) }
                padding = Insets(15.0)

                cellFactory = CheckBoxListCell.forListView {
                    return@forListView it.checked
                }
            })

            children.add(Text("Armas").apply {
                style = Styles.LABEL
                padding = Insets(15.0)
                fill = Color.WHITE
            })
            children.add(ListView<Arma>().apply {
                weapons.forEach { items.add(it) }
                padding = Insets(15.0)

                cellFactory = CheckBoxListCell.forListView {
                    return@forListView it.checked
                }
            })
        }

        children.add(General.Row(15.0).apply {
            alignment = Pos.BOTTOM_RIGHT
            children.add(Button("Cadastrar").apply {
                style = Styles.SUCCESS_BUTTON
            })
        })
    }

    fun SearchFieldPane(sistema: Sistema, topic: Topico) = General.Column(15.0).apply {
        padding = Insets(10.0, 10.0, 10.0, 10.0)

        children.add(General.Row(15.0).apply {
            children.add(Text("Nome:").apply {
                style = Styles.LABEL
                fill = Color.WHITE
            })

            children.add(TextField().apply {
                prefWidth = 400.0
            })
        })

        children.add(General.Row(15.0).apply {
            alignment = Pos.BOTTOM_RIGHT
            children.add(Button("Pesquisar").apply {
                style = Styles.SEARCH_BUTTON
            })
        })
    }
}

fun Sistema.renderHomeScreen() {
    globalPane.children.clear()
    globalPane.center = Region().apply {
        padding = Insets(15.0)
    }

    globalPane.top = General.Title("Sistema da Polícia")
    globalPane.left = RegisterOptionsPane(this)
    globalPane.right = SearchOptionsPane(this)
}

fun Sistema.renderRegisterScreen(topic: Topico) {
    globalPane.children.clear()

    globalPane.top = General.Title("Cadastrar $topic") {
        renderHomeScreen()
    }
    globalPane.center = RegisterFieldPane(this, topic)
}

fun Sistema.renderSearchScreen(topic: Topico) {
    globalPane.children.clear()

    globalPane.top = General.Title("Pesquisar $topic") {
        renderHomeScreen()
    }
    globalPane.center = SearchFieldPane(this, topic)
}