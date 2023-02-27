import org.junit.Test

import org.junit.Assert.*

class ZodiacTest {

    val sign = Zodiac()

    @Test
    fun signIsSagittariusTest() {
        assertEquals("Wrong Signs", "Sagittarius", sign.Sign(28,11) )
    }
@Test
    fun signIsNotSagittariusTest() {
        assertNotEquals("Wrong Signs", "Sagittarius", sign.Sign(20,11) )
    }
@Test
    fun signIsLeoTest() {
        assertEquals("Wrong Signs", "Leo", sign.Sign(23,7) )
    }
    @Test
    fun signIsNotLeoTest() {
        assertNotEquals("Wrong Signs", "Leo", sign.Sign(20,7) )
    }

    @Test
    fun signIsNotPiscesTest() {
        assertNotEquals("Wrong Signs", "Pisces", sign.Sign(30,2) )
    }
    @Test
    fun signIsPiscesTest()
    {
        assertEquals("Wrong Sign","Pisces",sign.Sign(25,2) )
    }


    @Test
    fun wrongDateTest()
    {
        assertEquals("Wrong Calculus", "Wrong Date", sign.Sign(30,2))
        assertEquals("Wrong Calculus", "Wrong Date", sign.Sign(31,4))
        assertEquals("Wrong Calculus", "Wrong Date", sign.Sign(31,6))
        assertEquals("Wrong Calculus", "Wrong Date", sign.Sign(31,9))
        assertEquals("Wrong Calculus", "Wrong Date", sign.Sign(31,11))
    }


}