/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI7_XuLyString_BieuThucChinhQuy;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class S3_DemoXuLyChuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập tên: ");
            String name = sc.nextLine();
            String[] words = name.split("\\s");
            for (String x : words) {
                System.out.print(vietHoaChuCaiDau(x) + " ");
            }
            System.out.println("");
        } while (true);

    }

    static String vietHoaChuCaiDau(String text) {//   "   HOANG  "
        //Bước 1 tiền xử lý
        //Bỏ khoảng trắng và viết thường tên
        text = text.trim().toLowerCase(); // = "hoang"
        //Bước 2 H + oang
        return String.valueOf(text.charAt(0)).toUpperCase() + text.substring(1, text.length());
        //String.valueOf(text.charAt(0)).toUpperCase() = chữ cái đầu viết hoa lên 
    }

}
