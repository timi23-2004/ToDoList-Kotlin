import java.util.Scanner

val todoList = mutableListOf<String>()

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\n--- TO-DO LIST ---")
        println("1. Uj feladat hozzaadasa")
        println("2. Feladatok listazasa")
        println("3. Feladat torlese")
        println("4. Kilepes")
        print("Valassz egy lehetoseget: ")

        when (scanner.nextInt()) {
            1 -> addTask(scanner)
            2 -> listTasks()
            3 -> removeTask(scanner)
            4 -> {
                println("Kilepes... Viszlat!")
                return
            }
            else -> println("Hibas valasztas, probald ujra!")
        }
    }
}

fun addTask(scanner: Scanner) {
    print("Ird be az uj feladatot: ")
    scanner.nextLine() // Input tisztitas
    val task = scanner.nextLine()
    todoList.add(task)
    println("Feladat hozzaadva: \"$task\"")
}

fun listTasks() {
    if (todoList.isEmpty()) {
        println("Nincsenek feladatok.")
    } else {
        println("\nFeladatok:")
        todoList.forEachIndexed { index, task -> println("${index + 1}. $task") }
    }
}

fun removeTask(scanner: Scanner) {
    if (todoList.isEmpty()) {
        println("Nincs mit torolni!")
        return
    }
    listTasks()
    print("Add meg a torlendo feladat szamat: ")

    val index = scanner.nextInt() - 1
    if (index in todoList.indices) {
        val removedTask = todoList.removeAt(index)
        println("Torolve: \"$removedTask\"")
    } else {
        println("Hibas szam, probald ujra!")
    }
}
