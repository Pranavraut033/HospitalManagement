package hospital.people;

import hospital.data.DoctorList;
import utilities.Utils;

public class Patient {

    public static final String[] sexAvailable = new String[] {
        "Male", "Female", "Unkonwn"
    };

    DoctorList d = new DoctorList();
    Utils utils = new Utils();

    //Patient Primary information
    private String name;
    private String sex;
    private int age;
    private long contactNumber;

    //Patient extra information
    private int code;
    private int appointmentCode;
    private int roomNumber;
    private Doctor doctorAppointed;

    Patient(String name, int sexIndex, int age, long contactNumber, int doctorAppointed, int roomNumber) {
        this.name = name;
        sex = sexAvailable[sexIndex < 3 && sexIndex > 0 ? sexIndex : 2];
        this.age = age;
        this.contactNumber = contactNumber;

        // generate a random number between 1 and 1,00,000.
        this.code = utils.randInt(1, 100000);
        // generate a random number between 1 and 1,000.
        this.appointmentCode = utils.randInt(1, 1000);
        this.doctorAppointed = d.getDoctor(doctorAppointed);
        this.roomNumber = roomNumber;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void updateRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void updateDoctorAppointed(int doctorIndex) {
        this.doctorAppointed = d.getDoctor(doctorIndex);
    }

    public int getCode() {
        return code;
    }

    public int getAppointmentCode() {
        return appointmentCode;
    }

    public int getRoomnNumeber() {
        return roomNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getSex() {
        return sex;
    }

    public long getContactNumber(){
        return contactNumber;
    }

    public Doctor getDoctor() {
        return doctorAppointed;
    }
}
