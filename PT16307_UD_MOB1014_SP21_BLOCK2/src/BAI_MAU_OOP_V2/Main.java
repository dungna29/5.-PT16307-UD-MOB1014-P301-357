/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_MAU_OOP_V2;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceStudent sv = new ServiceStudent();
        String input;
        do {
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Xuất DS");
            System.out.println("6. Sắp xếp mã sinh viên");
            System.out.println("7. Thoát");
            System.out.print("Mời bạn chọn chức năng: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    sv.addSV();
                    break;
                case "2":
                    sv.editSv();
                    break;
                case "3":
                    sv.removeMsv();
                    break;
                case "4":
                    sv.findMsv();
                    break;
                case "5":
                    sv.getListSV();
                    break;
                case "6":
                    sv.sortLstSv();
                    break;
                case "7":
                    System.out.println("Chào tạm biệt");
                    break;
                default:

            }
        } while (!(input.equals("7")));

    }
}
