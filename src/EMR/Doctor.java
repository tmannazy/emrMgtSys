package EMR;

public class Doctor {
    private final String doctorID;
    private String hospital;
    private boolean privateClinic;
    private String speciality;
    private String lastName;
    private String firstName;
    private int uuid = 1;

    public Doctor(String firstName, String lastName, String specialty, boolean privateClinic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = specialty;
        this.doctorID = "MD00" + uuid++;
        this.privateClinic = privateClinic;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }


    public String getSpecialty() {
        return speciality;
    }

    public boolean getClinicStatus() {
        return privateClinic;
    }

    public String getId() {
        return doctorID;
    }
}
