package com.sozain.note.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Notes")
class Notes:Serializable {
    @PrimaryKey(autoGenerate = true)
    var id = Int

    @ColumnInfo(name = "title")
    var title = String

    @ColumnInfo(name = "sub_title")
    var sub_title = String

    @ColumnInfo(name = "date_time")
    var dateTime = String

    @ColumnInfo(name = "note_text")
    var noteText = String

    @ColumnInfo(name = "img_path")
    var imgPath = String

    @ColumnInfo(name = "web_link")
    var webLink = String

    @ColumnInfo(name = "color")
    var color = String

    override fun toString(): String {
        return "$title : $dateTime"
    }
}