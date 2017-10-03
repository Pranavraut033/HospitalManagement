package hospital;

import hospital.people.Patient;
import hospital.people.Doctor;
import hospital.data.DoctorList;
import java.util.Scanner;

public class Hospital {

    private final int maxRoom = 200;
    Patient patients[] = new Patient[maxRoom];
    Scanner scn = new Scanner(System.in);
    DoctorList dl = new DoctorList();

    public void  addPatient() {
        int sex = -1, age, room  = -1, doc = -1;

        System.out.print("Enter Patient Name: ");
        String name = scn.nextLine();

        System.out.print("Enter Patient age: ");
        age = scn.nextInt();

        do {
            if(sex != -1) System.out.println("Enter Valid Sex!");
            System.out.print("Enter Patient's sex (1 => Male  2 => Female  3 => Unkonwn): ");
            sex = scn.nextInt() - 1;
        } while (sex > 2 || sex < 0);

        do {
            if(room != -1) System.out.println("Room Not Avilable!");
            System.out.print("Enter Patient's room number(1 - " + maxRoom + "): ");
            room = scn.nextInt() - 1;
        } while (room > maxRoom || room < 0);

        do {
            if(doc != -1)
                System.out.println("Enter Valid Doctor's index");
            if(doc == -1) dl.display();
            System.out.print("Select Doctor appointed: ");
            doc = scn.nextInt();
        } while (doc > dl.getNumDoctor() || doc < 0);

        System.out.print("Enter Patient's contact number: ");
        long contactNumber = scn.nextLong();

        patients[room] = new Patient(name, sex, age, contactNumber, doc, room);
    }

    public void viewPatient() {
        System.out.print("Enter Patient code of patient to view (0 for all patient): ");
        int c = scn.nextInt();

        if(c == 0)
            for (int i = 0; i < maxRoom; i++)
                if (patients[i] != null)
                    patients[i].display();

    }

    public void displayDocs() {
        dl.display();
    }

    public void updatePatient() {

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Hospital h = new Hospital();
        char c = ' ';
        while(c != '\0') {
            System.out.println("Tasks Avilable: ");
            System.out.println("\t1 => Add Patient\t2 => View Patient\n\t3 => View Doctors\t4 => Update Patent\n\t5 => Exit");
            System.out.print("Enter Choice: ");
            c = scn.nextLine().charAt(0);
            switch (c) {
                case '1':
                    h.addPatient();
                    break;
                case '2':
                    h.viewPatient();
                    break;
                case '3':
                    h.displayDocs();
                    break;
                case '4':
                    h.updatePatient();
                    break;
                case '5':
                    System.out.println("Exiting...");
                    c = '\0';
                    break;
                default:
                    System.out.println("Select A valid Option!");
            }
        }
    }

}
