package Calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    // Use this annotation( ) when you're expecting a RunTimeException, not any kind
    // of returned value
    // @Test(expected = RuntimeException.class)
    // public final void whenMoreThan2NumbersAreUsedThenAnExceptionIsThrown() {
    // Calculator.add("1,2,3");
    // }

    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {

        Assert.assertEquals(1 + 2 + 3 + 4 + 5 + 6 + 7, Calculator.add("1,2,3,4,5,6,7"));
    }

    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        Calculator.add("1,2");
        Assert.assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsusedThenExceptionIsThrown() {
        Calculator.add("1,X");
    }

    @Test
    public final void whenEmptyStringIsUsedThenReturnValue() {
        Assert.assertEquals(0, Calculator.add(""));
    }

    @Test
    public final void whenOneNumberIsUsedThenReturnValueIsSameNumber() {
        Assert.assertEquals(10, Calculator.add("10"));
    }

    @Test
    public final void whenTwoNumbersAreUsedReturnValueIsTheirSum() {
        Assert.assertEquals(3 + 6, Calculator.add("3,6"));
    }
}