val comments1 = Comments(2, true, true, true, true)
val copyright1 = Copyright(123, "www.google.com", "Евгений", "Гугл")
val likes1 = Likes(2, true, true, true)
val reposts1 = Reposts(1, true)
val donut1 = Donut(true, 1000, "Пожалуйста, оформите подписку", true, "All")
val post1 = Post(
    1,
    1,
    2,
    3,
    1234,
    "Hello World!",
    123,
    245,
    false,
    comments1,
    copyright1,
    likes1,
    reposts1,
    1000,
    "post",
    24,
    true,
    true,
    false,
    false,
    false,
    true,
    donut1,
    11
)
val comments2 = Comments(4, true, true, true, true)
val copyright2 = Copyright(456, "www.google.com", "Евгений", "Гугл")
val likes2 = Likes(4, true, true, true)
val donut2 = Donut(false, 10_000, "Пожалуйста, оформите подписку", true, "All")
val reposts2 = Reposts(18, true)
val post2 = Post(
    2,
    1,
    2,
    3,
    1234,
    "Hello World!",
    123,
    245,
    false,
    comments2,
    copyright2,
    likes2,
    reposts2,
    1000,
    "post",
    24,
    true,
    true,
    false,
    false,
    false,
    true,
    donut2,
    11
)
val comments3 = Comments(67, true, true, true, true)
val copyright3 = Copyright(14, "www.ya.ru", "Евгений", "Яндекс")
val likes3 = Likes(4, false, false, false)
val donut3 = Donut(false, 5_000, "Пожалуйста, оформите подписку", true, "All")
val reposts3 = Reposts(18, true)
val post3 = Post(
    3,
    1,
    2,
    3,
    1234,
    "Hello World!",
    123,
    245,
    false,
    comments3,
    copyright3,
    likes3,
    reposts3,
    1000,
    "post",
    24,
    true,
    true,
    false,
    false,
    false,
    true,
    donut3,
    11
)
val comments4 = Comments(67, true, true, true, true)
val copyright4 = Copyright(16, "www.mail.ru", "Евгений", "Яндекс")
val likes4 = Likes(4, false, false, false)
val donut4 = Donut(false, 5_000, "Пожалуйста, оформите подписку", true, "All")
val reposts4 = Reposts(18, true)
val post4 = Post(
    4,
    134,
    15,
    18,
    132_789,
    "Здравствуйте все!",
    89,
    56,
    true,
    comments4,
    copyright4,
    likes4,
    reposts4,
    46,
    "post",
    45,
    true,
    false,
    true,
    false,
    false,
    true,
    donut4,
    12

)
val post5 = Post(
    1,
    134,
    15,
    18,
    132_789,
    "Здравствуйте все!",
    89,
    56,
    true,
    comments4,
    copyright4,
    likes4,
    reposts4,
    46,
    "post",
    45,
    true,
    false,
    true,
    false,
    false,
    true,
    donut4,
    12

)
var postArray: Array<Post> = arrayOf()
var postArrayIndex: Array<Int> = arrayOf()
val wallService = WallService(post1, post2, post3, postArray, postArrayIndex)
fun main() {
    val newPost = wallService.add(post4)
    println(newPost)
    val isPostChange = wallService.update(post5)
    println(isPostChange)
}