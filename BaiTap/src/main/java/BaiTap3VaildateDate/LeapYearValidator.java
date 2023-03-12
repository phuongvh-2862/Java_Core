package BaiTap3VaildateDate;

import java.util.Scanner;

public class LeapYearValidator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập năm vào đây: ");
        int year = input.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Năm nhuận đó!");
        } else {
            System.out.println("Năm này không phải năm nhuận nha Bae!");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

}
