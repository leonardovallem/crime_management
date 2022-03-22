package vista.components.sistema

import java.util.Date
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.control.ListView
import javafx.scene.control.TextField
import javafx.scene.control.cell.CheckBoxListCell
import javafx.scene.paint.Color
import javafx.scene.text.Text
import modelo.Arma
import modelo.TipoArma
import modelo.Vitima
import vista.Sistema
import vista.components.general.Column
import vista.components.general.Row
import vista.util.Styles
import vista.util.Topico

@Suppress("FunctionName")
fun RegisterFormPane(sistema: Sistema, topic: Topico) = Column(15.0).apply {
    padding = Insets(10.0, 10.0, 10.0, 10.0)

    children.add(Row(15.0).apply {
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
        val vitimaMock = Vitima(nome = "Vitima", cpf = "123.123.123-00", dataNascimento = Date())
        val victims: List<Vitima> = listOf(vitimaMock, vitimaMock, vitimaMock)

        val armaMock = Arma(numeroRegistro = "123.123.123", descricao = "AK-47 skin dourada", tipo = TipoArma.FOGO)
        val weapons: List<Arma> = listOf(armaMock, armaMock, armaMock)

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

    children.add(Row(15.0).apply {
        alignment = Pos.BOTTOM_RIGHT
        children.add(Button("Cadastrar").apply {
            style = Styles.SUCCESS_BUTTON
        })
    })
}