package BaiTap3VaildateDate;

import java.util.Scanner;

public class DateValidator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        String date = "";

        while (!isValid) {
            System.out.println("Nhập ngày, tháng, năm theo format sau (dd/mm/yyyy): ");
            date = input.nextLine();

            if (isValidDate(date)) {
                System.out.println("Nhập chuẩn đó!");
                isValid = true;
            } else {
                System.out.println("Sai định dạng rồi! Nhập lại đi Bae.");
            }
        }
    }

    public static boolean isValidDate(String date) {
        // Tách chuỗi ngày tháng năm thành các phần riêng biệt
        String[] dateParts = date.split("/");
        int day, month, year;

        // Kiểm tra độ dài của chuỗi ngày, tháng, năm để đảm bảo định dạng hợp lệ
        if (dateParts.length != 3 || dateParts[0].length() != 2 || dateParts[1].length() != 2 || dateParts[2].length() != 4) {
            return false;
        }

        // Kiểm tra các giá trị ngày, tháng, năm có phải là số không
        try {
            day = Integer.parseInt(dateParts[0]);
            month = Integer.parseInt(dateParts[1]);
            year = Integer.parseInt(dateParts[2]);
        } catch (NumberFormatException e) {
            return false;
        }

        // Kiểm tra năm không âm
        if (year < 0) {
            return false;
        }

        // Kiểm tra tháng từ 1 đến 12
        if (month < 1 || month > 12) {
            return false;
        }

        // Kiểm tra số ngày của tháng đó hợp lệ
        if (day < 1 || day > getMaxDays(month, year)) {
            return false;
        }

        return true;
    }

    // Phương thức để lấy số ngày tối đa của tháng đó trong năm đó
    public static int getMaxDays(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    // Phương thức để kiểm tra năm đó có phải là năm nhuận hay không
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