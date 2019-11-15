package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String,String>
    {
        var parts = fullName?.split(' ');

        var firstName = parts?.getOrNull(0).SetNullForNullOrEmpty();
        var lastName = parts?.getOrNull(1).SetNullForNullOrEmpty();




        return Pair(firstName, lastName);
    }

    fun String?.SetNullForNullOrEmpty():String
    {
        if (this=="" || this==null)
        {
            return "null"
        }
        else
        {
            return this;
        }
    }
}