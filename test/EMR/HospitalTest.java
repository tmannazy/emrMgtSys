package EMR;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HospitalTest {
    Hospital hospital;

    @BeforeEach
    void setUp() {
        hospital = new Hospital("Save The Future", "Yaba");
    }

    @Test
    void testThatHospitalNameIsSet() {
        assertEquals("Save The Future", hospital.getNameOfHospital());
    }

    @Test
    void testThatHospitalLocationIsSet() {
        assertEquals("Yaba", hospital.getLocationOfHospital());
    }

    @Test
    void testThatNewDoctorIsAdded() {
        Doctor newDoctor = new Doctor("Femi", "Odunlana", "Optometrist", true);
        Doctor newDoctor2 = new Doctor("Femi", "Odunlana", "Optometrist", true);
        hospital.addNewDoctor(newDoctor);
        try {
            hospital.addNewDoctor(newDoctor2);
        } catch (IllegalArgumentException err) {
            assertEquals("Doctor with the ID MD001 already exists.", err.getMessage());
        }
        assertEquals(1, hospital.getListOfDoctors().size());
    }

    @Test
    void testThaTestReportIsAdded() {
//        TestEntry test1 = new TestEntry()
    }
}