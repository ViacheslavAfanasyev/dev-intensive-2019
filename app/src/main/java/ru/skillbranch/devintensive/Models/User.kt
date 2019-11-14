package ru.skillbranch.devintensive.Models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

data class User (
    val id:String,
    var firstName:String?,
    var lastName:String?,
    var avatar:String?,
    var rating:Int=0,
    var respect:Int=0,
    val lastVisit: Date? = Date(),
    var isOnline:Boolean=false)
{

    constructor(id:String, firstName:String?, lastName:String?):this(id=id,firstName = firstName,lastName = lastName, avatar = null)
    {

    }

    constructor(id:String):this(id=id,firstName = "John",lastName = "Doe $id")
    {

    }

    init {
        println("Init.  User $firstName created and he is ${if(isOnline)" ONLINE " else "OFFLINE"}\n")
    }

  /*  private fun getIntro(): String {
    return """
        id : $id
        firstName : $firstName
        lastName : $lastName
        avatar : $avatar
        rating: $rating
        respect: $respect
        lastVisit: $lastVisit
        isOnline: $isOnline""".trimIndent()
    }*/


/*
    fun printMe():Unit{
        println(""" 
        id : $id
        firstName : $firstName
        lastName : $lastName
        avatar : $avatar
        rating: $rating
        respect: $respect
        lastVisit: $lastVisit
        isOnline: $isOnline
        """.trimIndent())
    }
*/

    companion object Factory
    {
        private var lastId : Int = -1;

        fun makeUser(fullName:String) : User
        {
            lastId++;
            val (firstName, lastName)=Utils.parseFullName(fullName)
            return User(lastId.toString(),firstName,lastName)
        }
    }
}