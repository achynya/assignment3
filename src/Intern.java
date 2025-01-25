public class Intern extends Doctor {
    private String internshipHospital;

    public Intern(String name, int age, String gender, String doctorId, String specialization, String internshipHospital) {
        super(name, age, gender, doctorId, specialization);
        this.internshipHospital = internshipHospital;
    }
    public String getInternshipHospital() {
        return internshipHospital;
    }
    public void setInternshipHospital(String internshipHospital) {
        this.internshipHospital = internshipHospital;
    }
    @Override
    public String toString() {
        return "Intern{" + super.toString() + ", internshipHospital='" + internshipHospital + '\'' + '}';
    }
}