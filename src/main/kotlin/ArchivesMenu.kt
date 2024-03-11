class ArchivesMenu(val archives: MutableList<Archive> = mutableListOf()) : Menu() {
    init {
        actions.add("0. Создать архив" to { addArchive() })
        archives.forEach {
            actions.add(
                "${actions.lastIndex + 1}. $it" to { NotesMenu(it.notes).selectActions() }
            )
        }
    }

    fun addArchive() {
        println("Введите непустое название архива")
        val name = UserData().getNotEmptyString()
        val archive = Archive(name)
        archives.add(archive)
        actions.add(
            "${actions.lastIndex + 1}. $archive" to { NotesMenu(archive.notes).selectActions() }
        )
    }
}