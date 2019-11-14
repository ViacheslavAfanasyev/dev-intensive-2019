package ru.skillbranch.devintensive

import org.junit.Assert.assertEquals
import org.junit.Test
import ru.skillbranch.devintensive.Extensions.TimeUnits
import ru.skillbranch.devintensive.Extensions.add
import ru.skillbranch.devintensive.Extensions.format
import ru.skillbranch.devintensive.Models.User
import ru.skillbranch.devintensive.utils.Utils

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_instance()
    {
        //var user = User("1");
        //var user2 = User("2","Jonhn","Week");
        //var user3 = User("3","Jimmy","Ozb",rating = 77,avatar = "",isOnline = true,lastVisit = Date(),respect = 77);


       //println("$user $user2 $user3")
    }

    @Test
    fun test_factory()
    {
        User.makeUser("Viacheslav Afanasiev");
        User.makeUser("Viacheslav Ago");
        User.makeUser("Viacheslav Roskliomosss");
        var user = User.makeUser("Z");
    }

    @Test
    fun test_Date()
    {
        var user = User.makeUser("VIacheslav Afanasiev")
        println(user.lastVisit?.add(5,TimeUnits.MINUTE)?.format())
    }

    @Test
    fun test_parseFullName()
    {
        println(Utils.parseFullName(null)) //null null
        println(Utils.parseFullName("")) //null null
        println(Utils.parseFullName(" ")) //null null
        println(Utils.parseFullName("John")) //John null
        println(Utils.parseFullName("Viacheslav Afanasiev")) //John null
    }
}
