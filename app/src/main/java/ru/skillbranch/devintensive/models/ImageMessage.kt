package ru.skillbranch.devintensive.Models

import ru.skillbranch.devintensive.models.BaseMessage
import java.util.*

class ImageMessage(
    id:String,
    user: User?,
    chat:Chat,
    isIncoming: Boolean=false,
    date: Date = Date(),
    var image:String?
) : BaseMessage(id, user, chat, isIncoming, date)  {

    override fun formatMessage(): String {
        return "id:${id}  ${user?.firstName} ${if (isIncoming) { "получил" } else {"отправил"}} сообщение : ${this.image}";
    }
}
