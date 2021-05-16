public class StudentBlockC extends Student{
    private static final String FIRSTREXAM="Literature";
    private static final String SECONDREXAM="History";
    private static final String THIRDEXAM="Geography";

    public StudentBlockC(int idStudent, String nameStudent, String adressStudent, int priority) {
        super(idStudent, nameStudent, adressStudent, priority);
    }

    public StudentBlockC() {
    }

    @Override
    public String toString() {
        return super.toString()+",ExamBlock C, Exam: "+FIRSTREXAM+", "+SECONDREXAM+", "+THIRDEXAM+" .";
    }
}
