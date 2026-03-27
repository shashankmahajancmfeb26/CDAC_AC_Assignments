class Patient 
{
    int patientid;
    String name;
    int age;
    String disease;
    String seniorCitizen;

    // Constructor 
    Patient(int id, String name, int age, String disease) {
        this.patientid = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    void seniorCitizen() {
        if(age>=60)
            seniorCitizen = "Patient is Senior Citizen"; 
        else
            seniorCitizen = "Patient is Not Senior Citizen";
    }

    void displayDetails() {
        System.out.println("ID: " + patientid);
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease); 
        System.out.println("Senior Citizen: " + seniorCitizen);
    }
}

class HospitalPatientRecordSystem {
    public static void main(String[] args)
    {
        Patient p1 = new Patient(101, "Rohit Sharma", 38, "Fever");
        Patient p2 = new Patient(102, "Virat Kohli", 68, "Cold");
        Patient p3 = new Patient(103, "MS Dhoni", 43, "Nimonia");

        System.out.println("==========Patient Records==========");
        p1.seniorCitizen();
        p1.displayDetails();
        p2.seniorCitizen();
        p2.displayDetails();
        p3.seniorCitizen();
        p3.displayDetails();
    }
}
