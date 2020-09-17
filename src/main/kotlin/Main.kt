package ru.netology

fun main() {

    val post = Post(
        ownerId = 555,
        fromId = 12,
        createdBy = 567,
        date = 2020_09_01,
        text = "Hello, its my first post.",
        replyOwnerId = 0,
        replyPostId = 0,
        friendsOnly = false,
        comments = "",
        copyright = "",
        likes = 10,
        repost = null,
        views = 15,
        postType = "",
        attachments = listOf(Attachment.Photo()),
        signerId = 0,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = true,
        postponedId = 0
    )

    val updatedPost = Post(
        id = 1,
        ownerId = 555,
        fromId = 12,
        createdBy = 567,
        date = 2020_09_01,
        text = "This is a Edited Post",
        replyOwnerId = 0,
        replyPostId = 0,
        friendsOnly = false,
        comments = "",
        copyright = "",
        likes = 55,
        repost = null,
        views = 154,
        postType = "",
        attachments = listOf(Attachment.Photo(), Attachment.Audio()),
        signerId = 0,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = true,
        postponedId = 0)

    WallService.add(post)

    WallService.update(updatedPost)

    WallService.printPosts()
}