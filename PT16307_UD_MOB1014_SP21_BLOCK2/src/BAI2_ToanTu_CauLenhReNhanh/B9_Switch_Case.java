/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_ToanTu_CauLenhReNhanh;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B9_Switch_Case {

    /*
       Switch Case là 1 câu lệnh rẽ nhánh
        
       Công thức: sw + tab
    
        switch (<Biểu thức>) {
            case <Giá trị 1>:  
                Thực hiện 1 hành động nào đó
                break; - Sau khi thực hiện 1 hành động xong thì sẽ thoát khỏi Switch
            case <Giá trị 2>:                
                break;
            ..........
            case <Giá trị n>:                
                break;
            default:
                Khi chọn các case không thỏa mãn thì sẽ chạy vào đây                
        }
     */
    public static void main(String[] args) {
        //Ví dụ 1:
        switch ("1") {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            default:
                System.out.println("Chức năng không tại");
        }
        switch ('a') {
            case 'a':
                break;
            case 'b':
                break;
            case 'c':
                break;
            default:
                System.out.println("Chức năng không tại");
        }

        switch (1) {
            case 1:
                System.out.println("Case 1");
            // break;
            case 2:
                System.out.println("Case 2");
            // break;
            case 3:
                System.out.println("Case 3");
            // break;
            default:
                System.out.println("Chức năng không tại");
        }

        /*
        Bài 1: Xây dựng 1 chương trình máy tính bỏ túi cho phép toán với 3 số gồm các
        chức năng sau: (Phải sử dụng IF ELSE)
            a. Phép cộng
            b. Phép trừ
            c. Phép nhân
            d. Phép chia
         */
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        String input;//Hứng giá trị do người dùng nhập vào
        System.out.println("Menu");
        System.out.println("a. Phép cộng");
        System.out.println("b. Phép trừ");
        System.out.println("c. Phép nhân");
        System.out.println("d. Phép chia");
        System.out.print("Mời bạn chọn chức năng: ");
        input = sc.nextLine();//Gán giá trị do người dùng nhập vào
        //Cách 1:
        switch (input) {
            case "a":
                break;
            case "b":
                break;
            case "c":
                break;
            case "d":
                break;
            default:
                System.out.println("Chức năng không tồn tại");
        }
        //Cách 2: 
        if (input.equals("a")) {
            System.out.println("Chức năng a");
        } else if (input.equals("b")) {
            System.out.println("Chức năng b");
        } else if (input.equals("c")) {
            System.out.println("Chức năng c");
        } else if (input.equals("d")) {
            System.out.println("Chức năng d");
        } else {
            System.out.println("Chức năng không tồn tại");
        }
    }
}
