public class StudentBlockA extends Student{
    private static final String FIRSTREXAMA="Math";
    private static final String SECONDREXAMA="Physical";
    private static final String THIRDEXAMA="Chemistry";

    public StudentBlockA(int idStudent, String nameStudent, String adressStudent, int priority) {
        super(idStudent, nameStudent, adressStudent, priority);
    }

    @Override
    public String toString() {
        return super.toString()+",ExamBlock A, Exam: "+FIRSTREXAMA+", "+SECONDREXAMA+", "+THIRDEXAMA+" .";
    }
}
