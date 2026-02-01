package HospitalManagementSystem;

public class Main {
    public static void main(String[] args) {

        // Create Doctors
        Doctor d1 = new Doctor("Dr. Smith", 45, "Cardiology", true);
        Doctor d2 = new Doctor("Dr. John", 50, "Cardiology", true);

        Doctor[] cardioDoctors = {d1, d2};

        // Create Department
        Department cardiology = new Department("Cardiology", cardioDoctors);

        // Create Patient
        Patient p1 = new Patient("Alice", 30, "Heart Pain");

        // Assign doctor
        Doctor assignedDoctor = cardiology.assignDoctor();

        if (assignedDoctor != null) {
            Appointment appt = new Appointment(p1, assignedDoctor);
            appt.displayAppointment();
        } else {
            System.out.println("No doctors available!");
        }
    }
}
