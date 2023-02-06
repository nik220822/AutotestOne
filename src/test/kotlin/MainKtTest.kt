import junit.framework.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun calculateFeeOne() {
        val amount1 = 5000.0
        val amount2 = 10000.0
        val amount3 = 200.0
        val amount4 = 100_000.0
        val result = calculateFee("MasterCard", amount1, amount3)
        assertEquals(0.0,result)
    }

    @Test
    fun calculateFeeTwo() {
        val amount1 = 5000.0
        val amount2 = 10000.0
        val amount3 = 200.0
        val amount4 = 100_000.0
        val result=calculateFee("Maestro", amount2, amount3)
        assertEquals(0.0,result)
    }

    @Test
    fun calculateFeeThree() {
        val amount1 = 5000.0
        val amount2 = 10000.0
        val amount3 = 200.0
        val amount4 = 100_000.0
        val result=calculateFee("VK Pay", amount2, amount3)
        assertEquals(0.0,result)
    }

    @Test
    fun calculateFeeFour() {
        val amount1 = 5000.0
        val amount2 = 10000.0
        val amount3 = 200.0
        val amount4 = 100_000.0
        val result=calculateFee("MasterCard", amount4, amount3)
        assertEquals(21.2,result)
    }

    @Test
    fun calculateFeeFive() {
        val amount1 = 5000.0
        val amount2 = 10000.0
        val amount3 = 200.0
        val amount4 = 100_000.0
        val result=calculateFee("Мир", amount4, 200_000.0)
        assertEquals(1500.0,result)
    }
}
