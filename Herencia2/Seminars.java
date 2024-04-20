import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Seminars {

    static ArrayList<CourseInformation> courses_programacion = new ArrayList<>();
    static ArrayList<CourseInformation> courses_matematica = new ArrayList<>();
    static ArrayList<CourseInformation> courses_fisica = new ArrayList<>();

    public static void leerCursosProg() {
        try (BufferedReader reader = new BufferedReader(new FileReader("ProgSeminar.txt"))) {
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                String[] bloques = linea.split("\t");
                if (bloques.length == 5) {
                    String name = bloques[0];
                    int hours = Integer.parseInt(bloques[1]);
                    String name_professor = bloques[2];
                    String telephone = bloques[3];
                    String correo = bloques[4];
                    Professor professor = new Professor(name_professor, telephone, correo);
                    courses_programacion.add(new CourseInformation(name, hours, professor));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void leerCursosFisica() {
        try (BufferedReader reader = new BufferedReader(new FileReader("PhysicSeminar.txt"))) {
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                String[] bloques = linea.split("\t");
                if (bloques.length == 5) {
                    String name = bloques[0];
                    int hours = Integer.parseInt(bloques[1]);
                    String name_professor = bloques[2];
                    String telephone = bloques[3];
                    String correo = bloques[4];
                    Professor professor = new Professor(name_professor, telephone, correo);
                    courses_programacion.add(new CourseInformation(name, hours, professor));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void leerCursosMat() {
        try (BufferedReader reader = new BufferedReader(new FileReader("MathSeminar.txt"))) {
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                String[] bloques = linea.split("\t");
                if (bloques.length == 5) {
                    String name = bloques[0];
                    int hours = Integer.parseInt(bloques[1]);
                    String name_professor = bloques[2];
                    String telephone = bloques[3];
                    String correo = bloques[4];
                    Professor professor = new Professor(name_professor, telephone, correo);
                    courses_programacion.add(new CourseInformation(name, hours, professor));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void addMathSeminar() {
        leerCursosMat();
    }

    public void addProgramationSeminar() {
        leerCursosProg();
    }

    public void addPhysicSeminar() {
        leerCursosFisica();
    }

    public ArrayList<CourseInformation> getCourses() {
        return courses_programacion;
    }

    public static ArrayList<CourseInformation> getCourses_programacion() {
        return courses_programacion;
    }

    public static ArrayList<CourseInformation> getCourses_matematica() {
        return courses_matematica;
    }

    public static ArrayList<CourseInformation> getCourses_fisica() {
        return courses_fisica;
    }
}