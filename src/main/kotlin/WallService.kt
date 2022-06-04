
class WallService constructor(
    post1: Post,
    post2: Post,
    post3: Post,
    var postArray: Array<Post>,
    var postArrayIndex: Array<Int>
) {
    init {
        this.postArray = arrayOf(post1, post2, post3)
        this.postArrayIndex = arrayOf(post1.id, post2.id, post3.id)
    }

    fun add(post: Post): Post {
        if (!postArray.contains(post) && !postArrayIndex.contains(post.id)) {
            postArray += post
        }
        return postArray[postArray.size - 1]
    }
    fun update (post:Post): Boolean{
      return if (postArrayIndex.contains(post.id)){
            postArray[postArrayIndex.indexOf(post.id)] = post.copy(post.id)
          true
        } else
            false
    }
}
