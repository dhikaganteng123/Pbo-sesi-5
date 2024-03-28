/**
 *
 * @author dhika
 */
public class Main {
    public static void main(String[] args) {
       
        Student student;
        student = new Student("Dhika Dwi Nugraha", "Cibolang Kaler");
        student.addCourseGrade("Dasar Pemrograman", 85);
        student.addCourseGrade("Pemrograman Berorientasi Objek", 90);
        student.addCourseGrade("Cloud Computing", 70);

        Teacher teacher;
        teacher = new Teacher("BPK.Alun Sujjada,S.Kom,MT", "Sukabumi");
        teacher.addCourse("Pemrograman Beroientasi Objek");

        // Output informasi tentang student dan teacher
        System.out.println(student);
        System.out.println(student.getAverageGrade() + "Nilai Rata-Rata: ");
        System.out.println("===========================================");
        System.out.println("MATAKULIAH:");
        student.printGrades();

        System.out.println("===========================================");

        System.out.println(teacher);
        System.out.println("DOSEN PENGAMPU MATAKULIAH:");
        
        for (int i = 0; i < teacher.getNumCourses(); i++) {
            System.out.println(teacher.getCourses()[i]);
            System.out.println("-------------------------------------------");
        }
    }
}
