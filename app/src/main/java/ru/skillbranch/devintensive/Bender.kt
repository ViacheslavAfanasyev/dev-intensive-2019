package ru.skillbranch.devintensive

class Bender(var status:Status=Status.NORMAL, var question: Question=Question.NAME) {

    fun askQuestion():String = when (question)
    {
        Question.NAME -> Question.NAME.question;
        Question.PROFESSION -> Question.PROFESSION.question;
        Question.MATERIAL -> Question.MATERIAL.question;
        Question.BDAY -> Question.BDAY.question;
        Question.SERIAL -> Question.SERIAL.question;
        Question.IDLE -> Question.IDLE.question;
    }

/*    fun listenAnswer(answer:String):Pair<String, Triple<Int,Int,Int>>
    {

    }*/

    enum class Status(val color : Triple<Int,Int,Int>){
        NORMAL(Triple(255,255,255)),
        WARNING(Triple(255,120,0)),
        DANGER(Triple(255,60,60)),
        CRITICAL(Triple(255,255,0))
    }

    enum class Question(val question:String, val answer:List<String>)
    {
        NAME("What is your name?", listOf("бендер","bender")),
        PROFESSION("Назови мою профессию?", listOf("сгибальщик","bender")),
        MATERIAL("Из чего я сделан?", listOf("метал","дерево","metal","iron","wood")),
        BDAY("Когда меня создали?", listOf("2993")),
        SERIAL("Мой серийный номер?", listOf("2716057")),
        IDLE("На этом и все, вопросов больше нет", listOf())
    }
}