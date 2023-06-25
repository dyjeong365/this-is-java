package ch15.exercise.exercise08;

public class Student {
    int studentNum;
    String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Student ? ((Student) obj).studentNum == studentNum : false;
    }
}
