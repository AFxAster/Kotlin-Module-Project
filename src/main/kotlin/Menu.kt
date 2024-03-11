abstract class Menu(
    val actions: MutableList<Pair<String, () -> Unit>> = mutableListOf()
) {
    fun printActions() {
        println("-1. Выход")
        actions.forEach { println(it.first) }
    }

    fun selectActions() {
        var command: Int
        while (true) {
            printActions()
            command = UserData().getValidCommand(actions.lastIndex) { printActions() }
            if (command == -1) break
            actions[command].second()
        }
    }
}