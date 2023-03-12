package BaiTap1ChuyenTien;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo 2 tài khoản
        Account accountA = new Account("A001", "Joro", 5000000);
        Account accountB = new Account("B001", "Nami", 1000000);


        // Hiển thị thông tin tài khoản
        System.out.println("Tài khoản " + accountA.name + ": " + accountA.balance);
        System.out.println("Tài khoản " + accountB.name + ": " + accountB.balance);

        // Nạp tiền vào tài khoản A
        accountA.credit(1000000);

        // Thanh toán tiền từ tài khoản A
        accountA.debit(2000000);

        // Chuyển tiền từ tài khoản A sang tài khoản B
        accountA.transferTo(accountB, 3000000);

        // Hiển thị lại thông tin tài khoản
        System.out.println("Tài khoản " + accountA.name + ": " + accountA.balance);
        System.out.println("Tài khoản " + accountB.name + ": " + accountB.balance);
    }
}
