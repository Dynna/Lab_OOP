package lab_6;

public class Patient extends Person {
    public String id;
    public FullName patient_name;
    public Gender patient_gender;
    public Date patient_birthDate;
    public Integer patient_age;
    public Date accepted;
    public History sickness;
    public String[] prescriptions;
    public String[] allergies;
    public String[] specialReqs;
    public OperationsStaff[] operationsStaffs;
}
