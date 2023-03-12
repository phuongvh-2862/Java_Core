package Baitap4QuanLySinhVien;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng School để quản lý học sinh
        School school = new School("THPT A");

        // Thêm các học sinh mới vào lớp học
        school.addStudent(new Student("Kakalot", 20, "Hanoi"));
        school.addStudent(new Student("Berus", 23, "DN"));
        school.addStudent(new Student("Broly", 20, "HCM"));
        school.addStudent(new Student("Frezze", 25, "DN"));

        // Hiển thị thông tin của các học sinh 20 tuổi
        school.display20YearOldStudents();

        // Đếm số lượng học sinh có tuổi là 23 và quê ở DN
        int count = school.countStudentsWithAgeAndHometown(23, "Hanoi");
        System.out.println("Số lượng học sinh 23 tuổi, quê ở nghìn năm văn vở =)): " + count);
    }
}