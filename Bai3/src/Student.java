public class Student {
    private int idStudent;
    private String nameStudent;
    private String adressStudent;
    private int priority;

    public Student(int idStudent, String nameStudent, String adressStudent, int priority) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.adressStudent = adressStudent;
        this.priority = priority;
    }

    public Student() {
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getAdressStudent() {
        return adressStudent;
    }

    public void setAdressStudent(String adressStudent) {
        this.adressStudent = adressStudent;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "ID=" + idStudent +
                ", Name='" + nameStudent +
                ", Adress='" + adressStudent +
                ", Priority=" + priority ;
    }
}
