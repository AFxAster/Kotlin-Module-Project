import java.util.Scanner

class UserData {
    val scanner = Scanner(System.`in`)
    fun getNotEmptyString(): String {

        var str = scanner.nextLine()
        while (str.isBlank()) {
            str = scanner.nextLine()
        }
        return str
    }

    fun getValidCommand(lastIndex: Int, printActions: () -> Unit): Int {
        var command: Int
        while (true) {
            while (!scanner.hasNextInt()) {
                scanner.nextLine()
                println("Введите цифру")
                printActions()
            }
            command = scanner.nextInt()
            scanner.nextLine()
            if (command in -1..lastIndex) break

            println("Такого варианта нет")
            printActions()
        }
        return command
    }
}