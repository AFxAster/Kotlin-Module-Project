class NoteMenu(val note: Note) :
    Menu(mutableListOf("0. Просмотреть заметку" to { note.printText() }))