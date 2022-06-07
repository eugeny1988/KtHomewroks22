import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val post = Post(
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
            arrayAttachment5
        )
        val realValue = wallService.add(post).id
        val unexpectedValue = 0
        assertNotEquals(unexpectedValue, realValue)
    }

    @Test
    fun update() {
        val post = Post(
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
        val expectedValue = true
        val realValue = wallService.update(post)
        assertEquals(expectedValue, realValue)
    }
}