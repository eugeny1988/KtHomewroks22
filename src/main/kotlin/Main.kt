val image1 = Attachment.Image(
    100,
    "https://www.netology.ru",
    130,
    1
)
val image2 = Attachment.Image(
    130,
    "https://www.netology.ru",
    130,
    1
)
val imageArray = arrayOf(image1, image2)
val firstFrame1 = Attachment.firstFrame(
    1000,
    "https://netology.ru",
    750
)
val firstFrame2 = Attachment.firstFrame(
    1678,
    "ya.ru",
    1300
)
val firstFrameArray = arrayOf(firstFrame1, firstFrame2)
val video1 = Attachment.Video(
    12,
    ownerId = 123,
    title = "Видео",
    description = "Описание видео",
    image = imageArray,
    firstFrame = firstFrameArray
)
val video2 = Attachment.Video(
    14,
    ownerId = 123,
    title = "Видео",
    description = "Описание видео",
    image = imageArray,
    firstFrame = firstFrameArray
)
val video3 = Attachment.Video(
    121,
    ownerId = 123,
    title = "Видео",
    description = "Описание видео",
    image = imageArray,
    firstFrame = firstFrameArray
)
val video4 = Attachment.Video(
    186,
    ownerId = 123,
    title = "Видео",
    description = "Описание видео",
    image = imageArray,
    firstFrame = firstFrameArray
)
val video5 = Attachment.Video(
    1256,
    ownerId = 123,
    title = "Видео",
    description = "Описание видео",
    image = imageArray,
    firstFrame = firstFrameArray
)
val photo1 = Attachment.Photo(
    16,
    134,
    167,
    89,
    "Какая-то картинка",
    89467
)
val photo2 = Attachment.Photo(
    367,
    134,
    167,
    89,
    "Какая-то картинка",
    89467
)
val photo3 = Attachment.Photo(
    1657,
    134,
    167,
    89,
    "Какая-то картинка",
    89467
)
val photo4 = Attachment.Photo(
    1689,
    134,
    167,
    89,
    "Какая-то картинка",
    89467
)
val photo5 = Attachment.Photo(
    169,
    134,
    167,
    89,
    "Какая-то картинка",
    89467
)
val audio1 = Attachment.Audio(
    16,
    178,
    "Киркоров",
    "Песня",
    1678
)
val audio2 = Attachment.Audio(
    166,
    178,
    "Неизвестный исполнитель",
    "Песня",
    1678
)
val audio3 = Attachment.Audio(
    890,
    178,
    "Пугачёва",
    "Песня",
    1678
)
val audio4 = Attachment.Audio(
    468,
    178,
    "Киркоров",
    "Песня",
    1678
)
val audio5 = Attachment.Audio(
    1689,
    178,
    "Киркоров",
    "Песня",
    1678
)
val file1 = Attachment.File(
    690,
    589,
    "Какой-то файл",
    589,
    ".kt",
    "vk.com",
    4789567,
    4
)
val file2 = Attachment.File(
    691,
    589,
    "Какой-то файл",
    589,
    ".kt",
    "vk.com",
    4789567,
    4
)
val file3 = Attachment.File(
    692,
    589,
    "Какой-то файл",
    589,
    ".kt",
    "vk.com",
    4789567,
    4
)
val file4 = Attachment.File(
    693,
    589,
    "Какой-то файл",
    589,
    ".kt",
    "vk.com",
    4789567,
    4
)
val file5 = Attachment.File(
    694,
    589,
    "Какой-то файл",
    589,
    ".kt",
    "vk.com",
    4789567,
    4
)
val arrayAttachment1 = arrayOf(video1, photo1, audio1, file1)
val arrayAttachment2 = arrayOf(video2, photo2, audio2, file2)
val arrayAttachment3 = arrayOf(video3, photo3, audio3, file3)
val arrayAttachment4 = arrayOf(video4, photo4, audio4, file4)
val arrayAttachment5 = arrayOf(video5, photo5, audio5, file5)
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
    11,
    arrayAttachment1
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
    11,
    arrayAttachment2
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
    11,
    arrayAttachment3
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
    12,
    arrayAttachment4

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
    12,
    arrayAttachment5

)
var postArray: Array<Post> = arrayOf()
var postArrayIndex: Array<Int> = arrayOf()
val wallService = WallService(post1, post2, post3, postArray, postArrayIndex)
var comment = Comment(
    5,
    178,
    17906,
    "Привет!",
    89
)
fun main() {
    val newPost = wallService.add(post4)
    val isPostChange = wallService.update(post5)
    comment = wallService.createComment(8, comment)

}