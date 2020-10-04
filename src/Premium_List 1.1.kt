
//Project: Final List
//Author: Jonathan Gonzalez
//Title: Premium_List.kt

open class Task(){
    var new_task:String
    var new_time:Int
    init {
        println("Write your task: ")
        new_task = readLine().toString()
        println("Time: ")
        new_time = Integer.valueOf(readLine())
        //return Pair(new_task,new_time)
    }
}

class School():Task(){
    private var scope:String = "School"
    fun schoolTask(): Triple<String, Int, String> {
        return Triple(new_task,new_time,scope)
    }
}

class Work():Task(){
    private var scope:String = "Work"
}

class Personal():Task(){
    private var scope:String = "Personal"
}

fun main() {
    var option:Int = -1
    val schedule = mutableListOf<String>()
    val time = mutableListOf<Int>()
    val scope = mutableListOf<String>()

    while(option != 0) {

        println()
        println("Welcome to your daily schedule: ")
        println("0. Quit.")
        println("1. Add task")
        println("2. View Tasks")
        println("3. Remove Tasks")
        println()

        option = Integer.valueOf(readLine())

        if (option == 1) {
            val t1 = School()
            val (new_task,new_time,scope_element) = t1.schoolTask()
            schedule.add(new_task!!)
            time.add(new_time!!)
            scope.add(scope_element!!)
        }

        if (option == 2) {
            secondOption(schedule,time)

        }

        if (option == 3) {
            secondOption(schedule,time)
            thirdOption(schedule,time)
            secondOption(schedule,time)
        }
    }

    if(option ==0 ){
        println("Good bye!")
    }
}
