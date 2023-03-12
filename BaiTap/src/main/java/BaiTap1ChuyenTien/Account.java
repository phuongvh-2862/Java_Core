package BaiTap1ChuyenTien;

public class Account {
    private String id; // Mã tài khoản
    String name; // Tên chủ tài khoản
    int balance; // Số dư tài khoản

    // Constructor với 3 tham số để khởi tạo đối tượng Account
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Phương thức nạp tiền vào tài khoản
    public void credit(int amount) {
        if (amount > 0) { // Kiểm tra số tiền nạp vào phải là số dương
            balance += amount; // Cộng số tiền vào số dư tài khoản
            System.out.println("Nạp tiền thành công. Số dư mới là " + balance);
        } else {
            System.out.println("Số tiền không hợp lệ. Nạp tiền thất bại.");
        }
    }

    // Phương thức thanh toán tiền
    public void debit(int amount) {
        if (amount < 0) { // Kiểm tra số tiền thanh toán phải là số dương
            System.out.println("Số tiền không hợp lệ. Thanh toán thất bại.");
        } else if (amount > balance) { // Kiểm tra số tiền thanh toán không được lớn hơn số dư tài khoản
            System.out.println("Số dư không đủ để thanh toán. Thanh toán thất bại.");
        } else {
            balance -= amount; // Trừ số tiền khỏi số dư tài khoản
            System.out.println("Thanh toán thành công. Số dư mới là " + balance);
        }
    }

    // Phương thức chuyển tiền từ tài khoản này sang tài khoản khác
    public void transferTo(Account account, int amount) {
        if (amount < 0) { // Kiểm tra số tiền chuyển phải là số dương
            System.out.println("Số tiền không hợp lệ. Chuyển tiền thất bại.");
        } else if (amount > balance) { // Kiểm tra số tiền chuyển không được lớn hơn số dư tài khoản
            System.out.println("Số dư không đủ để chuyển tiền. Chuyển tiền thất bại.");
        } else {
            balance -= amount; // Trừ số tiền khỏi số dư tài khoản của tài khoản nguồn
            account.credit(amount); // Nạp số tiền vào số dư tài khoản của tài khoản đích
            System.out.println("Chuyển tiền thành công. Số dư mới của " + name + " là " + balance +
                    ", số dư mới của " + account.name + " là " + account.balance);
        }
    }
}



