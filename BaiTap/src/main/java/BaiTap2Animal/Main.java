package BaiTap2Animal;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Dog với các giá trị khác nhau
        Dog dog1 = new Dog("Buddy", 2, "Golden Retriever", "Yellow", 25.5);
        Dog dog2 = new Dog("Max", 4, "German Shepherd", "Black", 30.0);

        // In ra thông tin của đối tượng Dog
        System.out.println("Dog 1:");
        dog1.printInfo();
        System.out.println();
        System.out.println("Dog 2:");
        dog2.printInfo();
        System.out.println();

        // Tạo đối tượng Cat với các giá trị khác nhau
        Cat cat1 = new Cat("Whiskers", 3, "Siamese", "White", 10.5);
        Cat cat2 = new Cat("Socks", 1, "Tabby", "Orange", 8.0);

        // In ra thông tin của đối tượng Cat
        System.out.println("Cat 1:");
        cat1.printInfo();
        System.out.println();
        System.out.println("Cat 2:");
        cat2.printInfo();
    }
}