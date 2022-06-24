package EMR;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    Doctor doctor;

    @BeforeEach
    void setUp() {
        doctor = new Doctor("Emeka", "Obi", "Dermatology", true);
    }

    @Test
    void testDoctorFirstName() {
        assertEquals("Emeka", doctor.getFirstName());
    }

    @Test
    void testDoctorLastName() {
        assertEquals("Obi", doctor.getLastName());
    }

    @Test
    void testDoctorFullName() {
        assertEquals("Emeka Obi", doctor.getFullName());
    }

    @Test
    void testDoctorSpecialty() {
        assertEquals("Dermatology", doctor.getSpecialty());
    }

    @Test
    void testThatDoctorHasClinic() {
        assertTrue(doctor.getClinicStatus());
    }

    @Test
    void testThatDoctorHasId() {
        assertEquals("MD001",doctor.getId());
    }

}