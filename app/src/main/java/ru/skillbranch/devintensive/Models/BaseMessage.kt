package ru.skillbranch.devintensive.Models

import java.util.*

abstract class BaseMessage(
    val id:String,
    val user:User?,
    val chat:Chat,
    val isIncoming : Boolean=false,
    val date: Date =Date()

) {

    abstract fun formatMessage():String;

    companion object AbstractFactory{
        var lastId = -1;
        fun makeMessage(from:User?, chat:Chat, date: Date=Date(), type:MessageType=MessageType.Text, payload:Any?, isIncoming:Boolean = false): BaseMessage{
            lastId++;
            return when(type)
            {
                MessageType.Image-> ImageMessage("$lastId",from, chat, isIncoming = isIncoming, date=date,image = payload as String)
                MessageType.Text-> TextMessage("$lastId",from, chat, isIncoming = isIncoming, date=date,text = payload as String)
            }
        }
    }
}

enum class MessageType
{
    Text, Image
}
