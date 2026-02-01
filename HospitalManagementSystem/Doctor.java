package HospitalManagementSystem;

public class Doctor extends Person {
    private String department;
    private boolean available;

    public Doctor(String name, int age, String department, boolean available) {
        super(name, age);
        this.department = department;
        this.available = available; 
    }

    public String getDepartment(){
        return department;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean status) {
        available = status;
    }

    public void displayDoctor() {
        super.displayInfo();
        System.out.println("Department: " + department + ", Available: " + available);
    }
}
