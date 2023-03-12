package Baitap4QuanLySinhVien;
import java.util.ArrayList;
import java.util.List;


// Định nghĩa lớp School để quản lý thông tin các học sinh
public class School {
    private String className;
    private List<Student> students;

    public School(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    // Phương thức thêm học sinh mới vào danh sách
    public void addStudent(Student student) {
        students.add(student);
    }

    // Phương thức hiển thị thông tin các học sinh 20 tuổi
    public void display20YearOldStudents() {
        System.out.println("Những học sinh 20 xuân xanh:");
        for (Student student : students) {
            if (student.getAge() == 20) {
                System.out.println(student.getName() + " (" + student.getHometown() + ")");
            }
        }
    }
    // Phương thức đếm số lượng học sinh có tuổi và quê quán nhất định
    public int countStudentsWithAgeAndHometown(int age, String hometown) {
        int count = 0;
        for (Student student : students) {
            if (student.getAge() == age && student.getHometown().equals(hometown)) {
                count++;
            }
        }
        return count;
    }
}


