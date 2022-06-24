package EMR;

import java.util.ArrayList;

public class Hospital {
    private String hospitalLocation;
    private String name;
    private ArrayList<Doctor> listOfDoctors;


    public Hospital(String nameOfHospital, String location) {
        this.name = nameOfHospital;
        this.hospitalLocation = location;
        listOfDoctors = new ArrayList<>();
    }

    public String getNameOfHospital() {
        return name;
    }

    public String getLocationOfHospital() {
        return hospitalLocation;
    }


    public void addNewDoctor(Doctor newDoctor) {
        for (Doctor doctor : listOfDoctors) {
            if (doctor.getId().equals(newDoctor.getId()))
                throw new IllegalArgumentException("Doctor with the ID " + newDoctor.getId() + " already exists.");
        }
        listOfDoctors.add(newDoctor);
    }

    public ArrayList<Doctor> getListOfDoctors() {
        return listOfDoctors;
    }


}
