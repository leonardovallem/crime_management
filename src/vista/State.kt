package vista

import java.util.Stack
import javafx.scene.Node

data class PreviousState(var title: Node, var center: Node)

object State {
    lateinit var title: Node
    lateinit var center: Node
    private var previousStates: Stack<PreviousState> = Stack()

    fun update(title: Node? = null, center: Node? = null) {
        if (isValid()) {
            previousStates.add(PreviousState(this.title, this.center))
        }

        title?.let { this.title = it }
        center?.let { this.center = it }
    }

    fun revert() {
        if (!isValid()) return

        if (previousStates.isNotEmpty()) {
            val lastState = previousStates.pop()
            title = lastState.title
            center = lastState.center
        }
    }

    private fun isValid() = this::title.isInitialized && this::center.isInitialized
}