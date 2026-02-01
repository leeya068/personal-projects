package HospitalManagementSystem;

public class Department {
    private String deptName;
    private Doctor[] doctors; // aggregation

    public Department(String deptName, Doctor[] doctors) {
        this.deptName = deptName;
        this.doctors = doctors;
    }

    // Link patient to available doctor
    public Doctor assignDoctor() {
        for (Doctor d : doctors) {
            if (d.isAvailable()) {
                d.setAvailability(false); // now booked
                return d;
            }
        }
        return null; // no doctor available
    }

    public String getDeptName() {
        return deptName;
    }
}

