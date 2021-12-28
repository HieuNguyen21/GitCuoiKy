package com.hieunn2008110163.BaiCuoiKy;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
    int choiceNumber;
        Scanner scanner = new Scanner(System.in);
        for(;;){
        System.out.println("============MENU===============");
        System.out.println(":1. Thêm Hàng Hóa:   ");
        System.out.println(":2. Xóa Hàng Hóa: ");
        System.out.println(":3. Sửa Hàng Hóa : ");
        System.out.println("============Tìm Kiếm============");
        System.out.println(":4. Tìm kiếm theo giá:  ");
        System.out.println(":5. Tìm kiếm theo loại: ");
        System.out.println(":6. Tìm kiếm theo ngày nhập: ");
        System.out.println("=============Sắp Xếp============");
        System.out.println(":7. Sắp xếp theo giá: ");
        System.out.println(":8. Sắp xếp theo ngày nhập: ");
        System.out.println("=============Thống Kê============");
        System.out.println(":9.Tổng Số Lượng Hàng Hóa: ");
        System.out.println("10.Tổng Giá Trị Nhập Kho:");
        System.out.println("11.Tổng Từng Loại Hàng:");
        System.out.println("===================================");
        System.out.println(":12.Kết thúc chương trinh!!!!: ");
        System.out.println("==========END MENU=============");
        System.out.println("Hãy chọn 1 chức năng:");
        do {
            System.out.println("Bấm số để chọn: ");
            choiceNumber = scanner.nextInt();
        }while ((choiceNumber < 1) || (choiceNumber > 10 ));
        switch(choiceNumber){
            case 1: 
            System.out.println("1. Thêm Hàng Hóa:   ");
              break;
            case 2:
             System.out.println("2.Xóa Hàng Hóa:   ");
             break;
            case 3: 
            System.out.println("3.Tìm Hàng Hóa:   ");
            break;
            case 4: 
            System.out.println("4. Sắp Xếp Danh Sách :   ");
            break;
            case 5: 
            System.out.println("5. Sắp Xếp Danh Sách :   ");
            break;
            case 6: 
            System.out.println("6. Sắp Xếp Danh Sách :   ");
            break;
            case 7: 
            System.out.println("7. Sắp Xếp Danh Sách :   ");
            break;
            case 8: 
            System.out.println("8. Sắp Xếp Danh Sách :   ");
            break;
            case 9: 
            System.out.println("9. Sắp Xếp Danh Sách :   ");
            break;
            default: System.out.println("Chọn chức năng khác:");
        }
    }
    }
}

