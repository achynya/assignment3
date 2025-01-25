public class Patient extends Person {
    private String patientId;
    private String ailment;

    public Patient(String name, int age, String gender, String patientId, String ailment) {
        super(name, age, gender);
        this.patientId = patientId;
        this.ailment = ailment;
    }
    public String getPatientId() {
        return patientId;
    }
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    public String getAilment() {
        return ailment;
    }
    public void setAilment(String ailment) {
        this.ailment = ailment;
    }
    @Override
    public String toString() {
        return "Patient{" + super.toString() + ", patientId='" + patientId + '\'' + ", ailment='" + ailment + '\'' + '}';
    }
}