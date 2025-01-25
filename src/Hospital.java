import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String location;
    private List<Patient> patients;
    private List<Doctor> doctors;

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public List<Patient> getPatients() {
        return patients;
    }
    public List<Doctor> getDoctors() {
        return doctors;
    }
    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }
    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }
    @Override
    public String toString() {
        return "Hospital{name='" + name + '\'' + ", location='" + location + '\'' + '}';
    }
}
