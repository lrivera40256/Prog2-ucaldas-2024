public class Professor extends Person {
    private float salary;

    public Professor(String name, String phone_number, String email, float salary) {
        super(name, phone_number, email);
        this.salary = salary;

    }

    public Professor(String name, String phone_number, String email) {
        super(name, phone_number, email);

    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}