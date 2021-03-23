/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array_ArrayList_List;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B2_BaiTapVeMang_Phan1 {
        /*
            Bài 1: Viết 1 chương trình cho người dùng nhập vào 1 mảng tên sau đó in ra màn hình          
            
        */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bước 1: Chuẩn bị các biến cần phải lưu trữ
        int[] arrNumber;//Khai báo mảng
        int sizeArr;
        
        //Bước 2: 
        System.out.println("Mời bạn nhập số lượng phần tử:");
        sizeArr = Integer.parseInt(sc.nextLine());//Lấy số lượng phần tử người dùng muốn nhập
        arrNumber = new int[sizeArr];//Khởi tạo mảng dựa vào số lượng do người dùng nhập
        for (int i = 0; i < sizeArr; i++) {
            System.out.println("Mời bạn nhập số thứ " + i);
            arrNumber[i] = Integer.parseInt(sc.nextLine());//Gán giá trị vào mảng theo index do người dùng nhập vào
        }
        
       //Bước 3:
        for (int x : arrNumber) {
            System.out.print(x + " ");
        }
    }
}
