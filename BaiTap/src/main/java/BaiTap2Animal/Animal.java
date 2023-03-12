package BaiTap2Animal;

public class Animal {
    private String name;
    private int age;
    private String breed;

    // Hàm tạo lớp Animal để khởi tạo giá trị cho các thuộc tính
    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Phương thức in ra thông tin của đối tượng
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }
}

// Lớp Dog kế thừa từ lớp Animal và có thêm các thuộc tính màu sắc và trọng lượng
 class Dog extends Animal {
    private String color;
    private double weight;

    // Hàm tạo lớp Dog để khởi tạo giá trị cho các thuộc tính
    public Dog(String name, int age, String breed, String color, double weight) {
        // Gọi lại hàm tạo của lớp cha để khởi tạo các thuộc tính của lớp cha
        super(name, age, breed);
        this.color = color;
        this.weight = weight;
    }

    // Ghi đè phương thức in ra thông tin của đối tượng để in thêm các thuộc tính màu sắc và trọng lượng
    public void printInfo() {
        // Gọi lại phương thức in thông tin của lớp cha để in ra các thuộc tính của lớp cha
        super.printInfo();
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}

// Lớp Cat kế thừa từ lớp Animal và có thêm các thuộc tính màu lông và chiều cao
class Cat extends Animal {
    private String furColor;
    private double height;

    // Hàm tạo lớp Cat để khởi tạo giá trị cho các thuộc tính
    public Cat(String name, int age, String breed, String furColor, double height) {
        // Gọi lại hàm tạo của lớp cha để khởi tạo các thuộc tính của lớp cha
        super(name, age, breed);
        this.furColor = furColor;
        this.height = height;
    }

    // Ghi đè phương thức in ra thông tin của đối tượng để in thêm các thuộc tính màu lông và chiều cao
    public void printInfo() {
        // Gọi lại phương thức in thông tin của lớp cha để in ra các thuộc tính của lớp cha
        super.printInfo();
        System.out.println("Fur Color: " + furColor);
        System.out.println("Height: " + height);
    }
}


