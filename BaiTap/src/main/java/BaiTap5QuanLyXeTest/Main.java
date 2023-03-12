package BaiTap5QuanLyXeTest;
public class Main {
    public static void main(String[] args) {
        XeDap xeDap = new XeDap("Naruto", "99999", 1000000);
        double thueXeDap = xeDap.tinhThue(); // = 0

        XeMay xeMay = new XeMay("Luffy", "888888", 50000000);
        double thueXeMay = xeMay.tinhThue(); // = 2750000 (thuế VAT = 10% * 50000000 = 5000000, thuế trước bạ = 5% * 50000000 = 2500000)

        XeOToTai xeOToTai = new XeOToTai("Sanji", "24680", 200000000);
        double thueXeOToTai = xeOToTai.tinhThue(); // = 22000000 (thuế VAT = 10% * 200000000 = 20000000, thuế trước bạ = 2% * 200000000 = 4000000

        // in ra màn hình để kiểm tra
        System.out.println("Thue Xe Dap: " + thueXeDap);
        System.out.println("Thue Xe May: " + thueXeMay);
        System.out.printf("Thue Xe OTo Tai:" + thueXeOToTai);
    }
}