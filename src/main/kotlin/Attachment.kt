interface Attachment {
    abstract val type: String
}

data class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val image: Array<Image>,
    val firstFrame: Array<firstFrame>,


) : Attachment {
    override val type = "video"


}
data class Image(
    val height: Int,
    val url: String,
    val width: Int,
    val withPadding: Int
)
data class firstFrame(
    val height: Int,
    val url: String,
    val width: Int
)