package hospital;

import hospital.people.Patient;
import hospital.people.Doctor;
import hospital.data.DoctorList;

public class Hospital {
    private final int maxRoom = 200;

    Patient patients[] = new Patient[maxRoom];


    public static void main(String[] args) {
        Hospital h = new Hospital();

    }

}
