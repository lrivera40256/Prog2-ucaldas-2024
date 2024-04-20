public class Main {
    static Seminars seminars = new Seminars();
    static Student student = new Student(null, null, null, null, 0);

    public static void main(String[] args) {
        seminars.addMathSeminar();
        seminars.addPhysicSeminar();
        seminars.addProgramationSeminar();

        student.addSeminarStudent(seminars.getCourses());
        student.showCoursesStudent();

    }
}