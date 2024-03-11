class NotesMenu(val notes: MutableList<Note>) : Menu() {
    init {
        actions.add("0. Создать заметку" to { addNote() })
        notes.forEach {
            actions.add(
                "${actions.lastIndex + 1}. $it" to { NoteMenu(it).selectActions() }
            )
        }
    }

    fun addNote() {
        println("Введите непустое название заметки")
        val name = UserData().getNotEmptyString()
        println("Введите непустое содержание заметки")
        val text = UserData().getNotEmptyString()
        val note = Note(name, text)
        notes.add(note)
        actions.add(
            "${actions.lastIndex + 1}. $note" to { NoteMenu(note).selectActions() }
        )
    }
}