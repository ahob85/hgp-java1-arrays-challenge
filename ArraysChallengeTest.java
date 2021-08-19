
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ArraysChallengeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ArraysChallengeTest
{
    /**
     * Default constructor for test class ArraysChallengeTest
     */
    public ArraysChallengeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void firstLast6Test() {
        assertEquals(true, ArraysChallenge.firstLast6(new int[]{1, 2, 6}));
        assertEquals(true, ArraysChallenge.firstLast6(new int[] {6, 1, 2, 3}));
        assertEquals(false, ArraysChallenge.firstLast6(new int[] {13, 6, 1, 2, 3}));
        assertEquals(true, ArraysChallenge.firstLast6(new int[] {13, 6, 1, 2, 6}));
        assertEquals(false, ArraysChallenge.firstLast6(new int[] {3, 2, 1}));
        assertEquals(false, ArraysChallenge.firstLast6(new int[] {3, 6, 1}));
        assertEquals(true, ArraysChallenge.firstLast6(new int[] {3, 6}));
        assertEquals(true, ArraysChallenge.firstLast6(new int[] {6}));
        assertEquals(false, ArraysChallenge.firstLast6(new int[] {3}));
        assertEquals(true, ArraysChallenge.firstLast6(new int[] {5, 6}));
        assertEquals(false, ArraysChallenge.firstLast6(new int[] {5, 5}));
        assertEquals(true, ArraysChallenge.firstLast6(new int[] {1, 2, 3, 4, 6}));
        assertEquals(false, ArraysChallenge.firstLast6(new int[] {1, 2, 3, 4}));
    }
    
    @Test
    public void midThreeTest() {
        assertArrayEquals(new int[] {2, 3, 4}, ArraysChallenge.midThree(new int[] {1, 2, 3, 4, 5}));
        assertArrayEquals(new int[] {7, 5, 3}, ArraysChallenge.midThree(new int[] {8, 6, 7, 5, 3, 0, 9}));
        assertArrayEquals(new int[] {1, 2, 3}, ArraysChallenge.midThree(new int[] {1, 2, 3}));
    }

    @Test
    public void fizzBuzzTest() {
        assertArrayEquals(new String[] {"1", "2", "Fizz", "4", "Buzz"}, ArraysChallenge.fizzBuzz(1, 6));
        assertArrayEquals(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, ArraysChallenge.fizzBuzz(1, 8));
        assertArrayEquals(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}, ArraysChallenge.fizzBuzz(1, 11));
        assertArrayEquals(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, ArraysChallenge.fizzBuzz(1, 16));
        assertArrayEquals(new String[] {"1", "2", "Fizz"}, ArraysChallenge.fizzBuzz(1, 4));
        assertArrayEquals(new String[] {"1"}, ArraysChallenge.fizzBuzz(1, 2));
        assertArrayEquals(new String[] {"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"}, ArraysChallenge.fizzBuzz(50, 56));
        assertArrayEquals(new String[] {"FizzBuzz", "16"}, ArraysChallenge.fizzBuzz(15, 17));
        assertArrayEquals(new String[] {"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"}, ArraysChallenge.fizzBuzz(30, 36));
        assertArrayEquals(new String[] {"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"}, ArraysChallenge.fizzBuzz(1000, 1006));
        assertArrayEquals(new String[] {"Fizz", "Buzz", "101"}, ArraysChallenge.fizzBuzz(99, 102));
        assertArrayEquals(new String[] {"14", "FizzBuzz", "16", "17", "Fizz", "19"}, ArraysChallenge.fizzBuzz(14, 20));
    }
    
    @Test
    public void copyEvensTest() {
        assertArrayEquals(new int[] {2, 4}, ArraysChallenge.copyEvens(new int[] {3, 2, 4, 5, 8}, 2));
        assertArrayEquals(new int[] {2, 4, 8}, ArraysChallenge.copyEvens(new int[] {3, 2, 4, 5, 8}, 3));
        assertArrayEquals(new int[] {6, 2, 4}, ArraysChallenge.copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 3));
        assertArrayEquals(new int[] {6, 2, 4, 8}, ArraysChallenge.copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 4));
        assertArrayEquals(new int[] {4}, ArraysChallenge.copyEvens(new int[] {3, 1, 4, 1, 5}, 1));
        assertArrayEquals(new int[] {2}, ArraysChallenge.copyEvens(new int[] {2}, 1));
        assertArrayEquals(new int[] {6, 2}, ArraysChallenge.copyEvens(new int[] {6, 2, 4, 8}, 2));
        assertArrayEquals(new int[] {6, 2, 4}, ArraysChallenge.copyEvens(new int[] {6, 2, 4, 8}, 3));
        assertArrayEquals(new int[] {6, 2, 4, 8}, ArraysChallenge.copyEvens(new int[] {6, 2, 4, 8}, 4));
        assertArrayEquals(new int[] {8}, ArraysChallenge.copyEvens(new int[] {1, 8, 4}, 1));
        assertArrayEquals(new int[] {8, 4}, ArraysChallenge.copyEvens(new int[] {1, 8, 4}, 2));
        assertArrayEquals(new int[] {2, 8}, ArraysChallenge.copyEvens(new int[] {2, 8, 4}, 2));
    }

    @Test
    public void zeroMaxTest() {
        assertArrayEquals(new int[] {5, 5, 3, 3}, ArraysChallenge.zeroMax(new int[] {0, 5, 0, 3}));
        assertArrayEquals(new int[] {3, 4, 3, 3}, ArraysChallenge.zeroMax(new int[] {0, 4, 0, 3}));
        assertArrayEquals(new int[] {1, 1, 0}, ArraysChallenge.zeroMax(new int[] {0, 1, 0}));
        assertArrayEquals(new int[] {5, 1, 5}, ArraysChallenge.zeroMax(new int[] {0, 1, 5}));
        assertArrayEquals(new int[] {0, 2, 0}, ArraysChallenge.zeroMax(new int[] {0, 2, 0}));
        assertArrayEquals(new int[] {1}, ArraysChallenge.zeroMax(new int[] {1}));
        assertArrayEquals(new int[] {0}, ArraysChallenge.zeroMax(new int[] {0}));
        assertArrayEquals(new int[] {}, ArraysChallenge.zeroMax(new int[] {}));
        assertArrayEquals(new int[] {7, 3, 4, 3, 0, 2}, ArraysChallenge.zeroMax(new int[] {7, 0, 4, 3, 0, 2}));
        assertArrayEquals(new int[] {7, 3, 4, 3, 1, 1}, ArraysChallenge.zeroMax(new int[] {7, 0, 4, 3, 0, 1}));
        assertArrayEquals(new int[] {7, 3, 4, 3, 0, 0}, ArraysChallenge.zeroMax(new int[] {7, 0, 4, 3, 0, 0}));
        assertArrayEquals(new int[] {7, 7, 1, 7, 7, 7}, ArraysChallenge.zeroMax(new int[] {7, 0, 1, 0, 0, 7}));
    }
}
