import java.util.Scanner;
class ContactDetails
{
    String mob;
    String email;

    ContactDetails(String mob, String email) 
    {
        this.mob = mob;
        this.email = email;
    }
}

class Patient {
    String id;
    String name;
    int age;
    String disease;
    ContactDetails contactDetails; 
    String type;
    static int totalPatients = 0;

    public Patient(String id, String name, int age, String disease, ContactDetails contactDetails) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.contactDetails = contactDetails;
        totalPatients++;
    }

    boolean isSeniorCitizen() {
        return this.age >= 60;
    }
    void display() {
        type = isSeniorCitizen() ? "Senior Citizen" : "Regular";
        System.out.println("Patient Id: "+ id);
        System.out.println("Patient Name: "+ name);
        System.out.println("Patient Age: "+ age);
        System.out.println("Patient Type: "+ type);
        System.out.println("Patient Diesease: "+ disease);
        System.out.println("Patient Mobile No.: "+ contactDetails.mob);
        System.out.println("Patient Mobile Email Id: "+ contactDetails.email);
    }

    static int getTotalCount() {
        return totalPatients;
    }
}

class HospitalManagementSystem
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total No. of Patient: "); 
        int n = sc.nextInt();

        Patient P[] = new Patient[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter Patient Record (ID, Name, Age, Disease, Mobile No, Email ID) : ");
            String id = sc.next();
            String name=sc.next();
            int age = sc.nextInt(); 
            sc.nextLine();
            String disease = sc.nextLine();
            String mob = sc.next();
            String email = sc.next();
            ContactDetails cd = new ContactDetails(mob, email);
            P[i] =  new Patient(id, name, age, disease, cd);
        }
        for(int i=0; i<n; i++)
        {
            System.err.println("============Patrient Record=============");
            P[i].display();
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Total Patients Admitted: " + Patient.getTotalCount());


/*         Patient[] patients = new Patient[5];

        patients[0] = new Patient("P101", "John Doe", 45, "Fever", 
                        new ContactDetails("9876543210", "john@mail.com"));
        
        patients[1] = new Patient("P102", "Robert Smith", 72, "Diabetes", 
                        new ContactDetails("9123456789", "rob@mail.com"));
        
        patients[2] = new Patient("P103", "Alice Ward", 65, "Asthma", 
                        new ContactDetails("9988776655", "alice@mail.com"));

        System.out.println("--- HOSPITAL PATIENT RECORDS ---");
        System.out.printf("%-8s %-12s %-5s %-10s %-15s %-25s\n", 
                          "ID", "Name", "Age", "Type", "Disease", "Contact Info");
        System.out.println("-----------------------------------------------------------------------------------------");

        // Loop through array based on the actual count of patients added
        for (int i = 0; i < Patient.getTotalCount(); i++) {
            patients[i].displayPatient();
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Total Patients Admitted: " + Patient.getTotalCount());*/
    }
}
