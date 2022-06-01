class WallService constructor(
    post1: Post,
    post2: Post,
    post3: Post,
    var postArray: Array<Post>
) {
    init {
        postArray = arrayOf(post1, post2, post3)
    }
}
