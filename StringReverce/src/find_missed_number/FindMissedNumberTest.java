package find_missed_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMissedNumberTest {

    FindMissedNumber findMissedNumber = new FindMissedNumber();

    @Test
    void testFindMissedNumber_1() {
        int[] numbers = {5, 2, 7, 3, 9, 6, 8, 4, 10};
        int exp = 1;
        int akt = findMissedNumber.findMissedNumber(numbers);

        assertEquals(exp, akt);
    }

    @Test
    void testFindMissedNumber_2() {
        int[] numbers = {5, 2, 7, 1, 3, 9, 6, 8, 4};
        int exp = 10;
        int akt = findMissedNumber.findMissedNumber(numbers);

        assertEquals(exp, akt);
    }

    @Test
    void testFindMissedNumber_3() {
        int[] numbers = {1, 2, 7, 3, 9, 6, 8, 4, 10};
        int exp = 5;
        int akt = findMissedNumber.findMissedNumber(numbers);

        assertEquals(exp, akt);
    }

    @Test
    void testFindMissedNumber_4() {
        int[] numbers = {5, 1, 7, 3, 9, 6, 8, 4, 10};
        int exp = 2;
        int akt = findMissedNumber.findMissedNumber(numbers);

        assertEquals(exp, akt);
    }

    @Test
    void testFindMissedNumber_5() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
                29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54,
                55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        int exp = 90;
        int akt = findMissedNumber.findMissedNumber(numbers);

        assertEquals(exp, akt);
    }
}
