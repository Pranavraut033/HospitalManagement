package hospital.data;

import hospital.people.Doctor;

public class DoctorList {

    Doctor doctors[] = new Doctor[9];

    //http://www.sask.co.in/doctorlist.html
    public DoctorList() {
        doctors[0]  = new Doctor("Dr. T. K. Banerjee", 1, 34, "MBBS, FRCP (London & Edinburgh)");
        doctors[1]  = new Doctor("Dr. Suniti Kumar Hazra", 1, 38, "MBBS, DGO, MS");
        doctors[2]  = new Doctor("Dr. Anupam Biswas", 0, 45, "MS");
        doctors[3]  = new Doctor("Mr. Rajanikant Pradhan", 0, 37, "BSC (HLS) (Hearing, Language & Speech)");
        doctors[4]  = new Doctor("Dr. Prakash Kr. Hazra", 0, 52, "MBBS, MD, DM");
        doctors[5]  = new Doctor("Dr. Soumitra Roy", 1, 31, "MD, FRCP (London)");
        doctors[6]  = new Doctor("Dr. Sandip Mandal", 0, 28, "MBBS, MD");
        doctors[7]  = new Doctor("Dr. Subrata Kumar Mitra", 0, 36, "MBBS, MS (Sur.), M.Ch. (Uro)");
        doctors[8]  = new Doctor("Dr. S. R. Kamath", 1, 26, "MS, FRCS, MCH (Orth.)");
    }

    public int getNumDoctor() {
        return doctors.length;
    }

    public Doctor getDoctor(int index) {
        return doctors[index];
    }

    public void display() {
        System.out.print(this);
    }

    public String toString() {
        String s = "";
        s += "Doctor Avilable:\n";
        for(int i = 0; i < doctors.length; i++)
            s += (i + 1) + "] " + doctors[i];
        return s;
    }
}
