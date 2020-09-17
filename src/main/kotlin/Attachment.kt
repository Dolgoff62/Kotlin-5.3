package ru.netology

sealed class Attachment {
    abstract val type: String

    data class Audio(override val type: String = "Audio") : Attachment() {}
    data class Document(override val type: String = "Document") : Attachment() {}
    data class Note(override val type: String = "Note") : Attachment() {}
    data class Photo(override val type: String = "Photo") : Attachment() {}
    data class Video(override val type: String = "Video") : Attachment() {}
}
