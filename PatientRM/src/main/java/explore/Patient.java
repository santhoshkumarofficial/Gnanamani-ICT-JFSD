package explore;

public class Patient {
    private String patientId;
    private String patientName;
    private double height;
    private double weight;
    private int age;
    private long contactNo;
    public Patient() {
    }

    public Patient(String patientId, String patientName, double height, double weight, int age, long contactNo) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.contactNo = contactNo;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
}
