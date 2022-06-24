package EMR;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestEntryTest {
    TestEntry entry;

    @BeforeEach
    void setUp() {
        entry = new TestEntry("Urinalysis", 2000,"Negative");
    }

    @Test
    void testThatTestNameIsReturned() {
        assertEquals("Urinalysis", entry.getNameOfTest());
    }

    @Test
    void testThatTestPriceIsReturned() {
        assertEquals(2000, entry.getPriceOfTest());
    }

    @Test
    void testThatTestResultIsReturned() {
        assertEquals("Negative", entry.getResultOfTest());
    }

    @Test
    void testDateOfTest() {
        assertEquals("24 June 2022", entry.getDateOfTest());
    }

    @Test
    void testListOfTestAHospitalConduct() {
        assertEquals(9, entry.getListOfTestTypes().size());
    }
}