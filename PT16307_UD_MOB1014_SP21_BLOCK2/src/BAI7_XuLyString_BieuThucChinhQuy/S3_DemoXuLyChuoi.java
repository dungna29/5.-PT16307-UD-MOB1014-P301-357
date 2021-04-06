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
        //Khi nhập tên viết hoa chữ cái đầu lên pham anh tu --> Pham Anh Tu
        Scanner sc = new Scanner(System.in);
        String ten;
        while (true) {
            System.out.println("Mời bạn nhập đầy đủ họ tên: ");
            ten = sc.nextLine();
            
            //split đưa chuỗi về mảng
            String[] words = ten.split("\\s");//Điều kiện ép chuỗi về mảng dựa trên khoảng trắng
            for (int i = 0; i < words.length; i++) {
                System.out.print(vietHoaChuCaiDau(words[i]) + " ");
            }
            System.out.println("");
        }
    }

    static String vietHoaChuCaiDau(String text) {
        //Bước 1: Xóa bỏ khoảng trắng 2 đầu
        text = text.trim();//  TU
        //Bước 2: Viết thường tất cả string
        text = text.toLowerCase();// tu
        //Bước 3: Viết hoa chữ cái đầu
        return String.valueOf(text.charAt(0)).toUpperCase() + text.substring(1, text.length());
        // String.valueOf là dạng ép kiểu về string
        // text.substring cắt chuỗi từ index bắt đầu đến index cuối
    }

}
