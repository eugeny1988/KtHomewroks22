import kotlin.math.max

class WallService constructor(
    post1: Post,
    post2: Post,
    post3: Post,
    var postArray: Array<Post>,
    var postArrayIndex: Array<Int>,
    private var newId: Int = 0,
//    private var newPostArray: Array<Post>
) {
    init {
        postArray = arrayOf(post1, post2, post3)
        postArrayIndex = arrayOf(post1.id, post2.id, post3.id)
    }

    fun add(post: Post): Post {
        if (!postArray.contains(post) && !postArrayIndex.contains(post.id)) {
            val newId = postArrayIndex.maxOrNull()?.plus(1)
           postArray+=post
//            postArray.set((newId!!),post)
        }
        return postArray[newId]
    }
}
