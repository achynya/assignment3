public class Doctor extends Person {
    private String doctorId;
    private String specialization;

    public Doctor(String name, int age, String gender, String doctorId, String specialization) {
        super(name, age, gender);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }
    public String getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    @Override
    public String toString() {
        return "Doctor{" + super.toString() + ", doctorId='" + doctorId + '\'' + ", specialization='" + specialization + '\'' + '}';
    }
}