public class CourseInformation {
    private String course_name = "";
    private int week_hours = 0;
    private Professor professor_info;

    public CourseInformation(String course_name, int week_hours, Professor professor_info) {
        this.course_name = course_name;
        this.week_hours = week_hours;
        this.professor_info = professor_info;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getWeek_hours() {
        return week_hours;
    }

    public void setWeek_hours(int week_hours) {
        this.week_hours = week_hours;
    }

    public Professor getProffesor_info() {
        return professor_info;
    }

    public void setProfessor_info(Professor proffesor_info) {
        this.professor_info = proffesor_info;
    }

    @Override
    public String toString() {
        return "course_name=" + course_name + ", week_hours=" + week_hours + ", proffesor_info="
                + professor_info;
    }
}