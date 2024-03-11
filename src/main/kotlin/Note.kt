class Note(name: String, val text: String) : Item(name) {
    fun printText() {
        println("Заметка \"$name\":")
        println(text)
    }
}
