/**
 *
 * @author dhika
 */
public class Student extends Person {
    private int numCourses;
    private final String[] courses;
    private final int[] grades;

    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[10]; // Initial capacity for 10 courses
        grades = new int[10];
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    public double getAverageGrade() {
        if (numCourses == 0)
            return 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / numCourses;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}



