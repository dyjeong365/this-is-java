package ch11.exercise.Exercise03;

public class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    @Override
    public int hashCode() {
        return studentNum.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
//            Student student = (Student) obj;
//            if (student.studentNum.equals(getStudentNum())) return true;
            if (((Student)obj).studentNum.equals(getStudentNum())) return true;
        }
        return false;
    }
}
