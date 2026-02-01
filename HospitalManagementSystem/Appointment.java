package HospitalManagementSystem;

public class Appointment {
    private Patient patient;
    private Doctor doctor;

    public Appointment(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public void displayAppointment() {
        System.out.println("\n--- Appointment Details ---");
        patient.displayPatient();
        doctor.displayDoctor();
    }
}
