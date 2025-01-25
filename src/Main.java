import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital("City Hospital", "New York");

        hospital.addPatient(new Patient("Dilnaz", 30, "Female", "P001", "Flu"));
        hospital.addPatient(new Patient("Dimash", 45, "Male", "P002", "Migraine"));
        hospital.addDoctor(new Doctor("Dr. Zhanibek", 50, "Male", "D001", "Cardiology"));
        hospital.addDoctor(new Doctor("Dr. Aisha", 40, "Female", "D002", "Neurology"));

        System.out.println("-------------------------\nLoading...\n-------------------------");
        while (true) {
            Thread.sleep(5000);
            System.out.println("\n-------------------------");
            System.out.println("Welcome to the Hospital Management System");
            System.out.println("1. View Patients");
            System.out.println("2. View Doctors");
            System.out.println("3. Add Patient");
            System.out.println("4. Add Doctor");
            System.out.println("5. Sort Patients");
            System.out.println("6. Sort Doctors");
            System.out.println("7. Edit Data");
            System.out.println("8. Exit");
            System.out.println("-------------------------");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("\nPatients List:");
                    for (Patient patient : hospital.getPatients()) {
                        System.out.println(patient);
                    }
                }
                case 2 -> {
                    System.out.println("\nDoctors List:");
                    for (Doctor doctor : hospital.getDoctors()) {
                        System.out.println(doctor);
                    }
                }
                case 3 -> {
                    System.out.print("Enter Patient Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter Patient ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Ailment: ");
                    String ailment = scanner.nextLine();

                    hospital.addPatient(new Patient(name, age, gender, id, ailment));
                    System.out.println("Patient added successfully!");
                }
                case 4 -> {
                    System.out.print("Enter Doctor Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter Doctor ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Specialization: ");
                    String specialization = scanner.nextLine();

                    hospital.addDoctor(new Doctor(name, age, gender, id, specialization));
                    System.out.println("Doctor added successfully!");
                }
                case 5 -> {
                    System.out.println("\nSort Patients By:");
                    System.out.println("1. Name");
                    System.out.println("2. Age");
                    System.out.print("Enter your choice: ");
                    int sortChoice = scanner.nextInt();

                    if (sortChoice == 1) {
                        hospital.getPatients().sort(Comparator.comparing(Patient::getName));
                        System.out.println("Patients sorted by Name:");
                        for (Patient patient : hospital.getPatients()) {
                            System.out.println(patient);
                        }

                    } else if (sortChoice == 2) {
                        hospital.getPatients().sort(Comparator.comparingInt(Patient::getAge));
                        System.out.println("Patients sorted by Age:");
                        for (Patient patient : hospital.getPatients()) {
                            System.out.println(patient);
                        }
                    } else {
                        System.out.println("Invalid choice!");
                    }
                }
                case 6 -> {
                    System.out.println("\nSort Doctors By:");
                    System.out.println("1. Name");
                    System.out.println("2. Age");
                    System.out.print("Enter your choice: ");
                    int sortChoice = scanner.nextInt();

                    if (sortChoice == 1) {
                        System.out.println("Doctors sorted by Name: ");
                        hospital.getDoctors().sort(Comparator.comparing(Doctor::getName));
                        for (Doctor doctor : hospital.getDoctors()) {
                            System.out.println(doctor);
                        }                    }
                    else if (sortChoice == 2) {
                        hospital.getDoctors().sort(Comparator.comparingInt(Doctor::getAge));
                        System.out.println("Doctors sorted by Age: ");
                        for (Doctor doctor : hospital.getDoctors()) {
                            System.out.println(doctor);
                        }
                    } else {
                        System.out.println("Invalid choice!");
                    }
                }
                case 7 -> {
                    System.out.println("\nEdit Data:");
                    System.out.println("1. Edit Patient");
                    System.out.println("2. Edit Doctor");
                    System.out.print("Enter your choice: ");
                    int editChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (editChoice == 1) {
                        System.out.print("Enter Patient ID to edit: ");
                        String id = scanner.nextLine();
                        for (Patient patient : hospital.getPatients()) {
                            if (patient.getPatientId().equals(id)) {
                                System.out.print("Enter New Name: ");
                                patient.setName(scanner.nextLine());
                                System.out.print("Enter New Age: ");
                                patient.setAge(scanner.nextInt());
                                scanner.nextLine();
                                System.out.print("Enter New Gender: ");
                                patient.setGender(scanner.nextLine());
                                System.out.print("Enter New Ailment: ");
                                patient.setAilment(scanner.nextLine());
                                System.out.println("Patient data updated successfully!");
                                break;
                            }
                        }
                    } else if (editChoice == 2) {
                        System.out.print("Enter Doctor ID to edit: ");
                        String id = scanner.nextLine();
                        for (Doctor doctor : hospital.getDoctors()) {
                            if (doctor.getDoctorId().equals(id)) {
                                System.out.print("Enter New Name: ");
                                doctor.setName(scanner.nextLine());
                                System.out.print("Enter New Age: ");
                                doctor.setAge(scanner.nextInt());
                                scanner.nextLine();
                                System.out.print("Enter New Gender: ");
                                doctor.setGender(scanner.nextLine());
                                System.out.print("Enter New Specialization: ");
                                doctor.setSpecialization(scanner.nextLine());
                                System.out.println("Doctor data updated successfully!");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Invalid choice!");
                    }
                }
                case 8 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
