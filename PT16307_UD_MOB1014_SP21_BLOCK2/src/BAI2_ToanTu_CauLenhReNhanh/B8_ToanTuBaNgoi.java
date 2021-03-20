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
public class B8_ToanTuBaNgoi {

    /*
       Cách sử dụng:
        <Biểu thức> ? <Giá trị true> : <Giá trị false>;
        <Biểu thức>: Có thể có 1 hoặc nhiều biểu thức
        <Giá trị true>: Luôn nằm sau dấu ? và phụ thuộc vào kiểu dữ liệu của biến.
        <Giá trị false>: Luôn nằm sau dấu :    
     */
    public static void main(String[] args) {
        //Ví dụ 1 mệnh đề toán tử 3 ngôi
        boolean logic = 5 > 9 ? true : false;
        String kq = 5 > 9 ? "Đúng" : "Sai";
        int kq2 = 5 > 9 ? 0 : 1;
        System.out.println(logic);
        System.out.println(kq);
        System.out.println(kq2);

        int nghi = 5;
        double diemThi = 0, gpa = 0;
        String kqSv = nghi <= 4 || diemThi >= 5 || gpa >= 5 ? "Qua môn" : "Toang";
        System.out.printf(kqSv);
        //Trong toán tử 3 ngôi có thể có nhiều mệnh đề
        //Toán tử 3 ngôi so sánh với câu lệnh IF ELSE
        //Ví dụ nhập nam và nữ
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập 1 là NAM - 0 Nữ: ");
        String kqNamNu = sc.nextLine();
//        if (kqNamNu.equals("1")) {
//            System.out.println("Chào bạn NAM");
//        }else if(kqNamNu.equals("0")){
//            System.out.println("Chào bạn NỮ");
//        }else{
//            System.out.println("Chào bạn không xác định giới tính");
//        }
        String result = kqNamNu.equals("1")?"Nam": "Nữ";
        System.out.println("Chào bạn: " + result);
        
    }
}
