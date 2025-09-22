package sep22;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm student " + getName() + " with ID " + studentId);
    }
}
