import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class BasicTest {

    private val basic = Basic()

    @Test
    fun add_2_numbers_Test_1() {
        assertEquals(
            "Error in your addition",
            15,
            basic.add_2_numbers(-30, 45)
        )

    }

    @Test
    fun add_2_numbers_Test_2() {
        assertEquals(
            "Error in your addition",
            75,
            basic.add_2_numbers(30, 45)
        )

    }

    @Test
    fun add_2_numbers_Test_3() {
        assertNotEquals(
            "Error in your addition",
            75,
            basic.add_2_numbers(-3, 45)
        )

    }

    @Test
    fun add_many_numbers_Test_double_output() {
        assertEquals(
            "Error in your process",
            10.0,
            basic.add_many_numbers(listOf(3, 5, 4.0, -2))
        )
    }

    @Test
    fun add_many_numbers_Test_integer_output() {
        assertEquals(
            "Error in your process",
            15,
            basic.add_many_numbers(listOf(3, 5, 4.0, -2, 3.0, 2))
        )
    }

    @Test
    fun add_many_numbers_Test_integer_negative_output() {
        assertEquals(
            "Error in your process",
            -12,
            basic.add_many_numbers(listOf(7.0, 5.0, -24.5, -0.5))
        )
    }

    @Test
    fun add_many_numbers_Test2_double_output() {
        assertEquals(
            "Error in your process",
            14.3,
            basic.add_many_numbers(listOf(3.5, 6.3, 9.2, 3.7, -1))
        )
    }

    @Test
    fun substract_2_numbers_positive_output() {

        assertEquals(
            "Error in the calculation",
            19,
            basic.substract_2_numbers(21, 2)
        )
    }

    @Test
    fun substract_2_numbers_negative_output() {

        assertEquals(
            "Error in the calculation",
            -19,
            basic.substract_2_numbers(-21, -2)
        )
    }

    @Test
    fun substract_2_numbers_negative_bad_output() {

        assertNotEquals(
            "Error in the calculation",
            -23,
            basic.substract_2_numbers(-21, -2)
        )
    }

    @Test
    fun multiply_2_numbers_negative_output() {
        assertEquals(
            "Error in output",
            -30,
            basic.multiply_2_numbers(-15, 2)
        )
    }

    @Test
    fun multiply_2_numbers_positive_output() {
        assertEquals(
            "Error in output",
            49.83,
            basic.multiply_2_numbers(15.1, 3.3)
        )
    }

    @Test
    fun multiply_2_numbers_badoutput() {
        assertNotEquals(
            "Error in output",
            3.3,
            basic.multiply_2_numbers(1.1, 3.3)
        )
    }

    @Test
    fun multiply_2_numbers_goodoutput() {
        assertNotEquals(
            "Error in output",
            3.63,
            basic.multiply_2_numbers(1.1, 3.3)
        )
    }

    @Test
    fun multiply_many_numbers_test_1() {
        assertEquals(
            "Error in your output",
            135.0,
            basic.multiply_many_numbers(listOf(3, 3.0, 2.5, 1.5, 4))
        )
    }

    @Test
    fun multiply_many_numbers_test_output_0() {
        assertEquals(
            "Error in your output",
            0.0,
            basic.multiply_many_numbers(listOf(3, 3.0, 2.5, 1.5, 4, 10, 4.0, 0.0))
        )
    }

    @Test
    fun multiply_many_numbers_test_output_bad() {
        assertNotEquals(
            "Error in your output",
            0.0,
            basic.multiply_many_numbers(listOf(3, 3.0, 2.5, 1.5, 4))
        )
    }

    @Test
    fun multiply_many_numbers_test_output_3() {
        assertEquals(
            "Error in your output",
            64,
            basic.multiply_many_numbers(listOf(2, 2, 2, 2, 2, 2))
        )
    }

    @Test
    fun divide_test_1() {
        assertEquals(
            "Error",
            1,
            basic.divide(3,2)
        )

    }

    @Test
    fun divide_test_2() {
        assertEquals(
            "Error",
            1.5,
            basic.divide(3.0,2.0)
        )

    }

    @Test
    fun divide_test_error() {
        assertEquals(
            "Bad Calculation",
            "Error",
            basic.divide(3.0,0.0)
        )

    }
}