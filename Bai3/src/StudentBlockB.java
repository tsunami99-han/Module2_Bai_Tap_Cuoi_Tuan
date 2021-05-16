public class StudentBlockB extends Student{
    private static final String FIRSTREXAMB="Math";
    private static final String SECONDREXAMB="Chemistry";
    private static final String THIRDEXAMB="Biology";

    public StudentBlockB(int idStudent, String nameStudent, String adressStudent, int priority) {
        super(idStudent, nameStudent, adressStudent, priority);
    }

    public StudentBlockB() {
    }

    @Override
    public String toString() {
        return super.toString()+",ExamBlock B, Exam: "+FIRSTREXAMB+", "+SECONDREXAMB+", "+THIRDEXAMB+" .";
    }
}
