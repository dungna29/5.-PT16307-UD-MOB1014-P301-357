package BAI5_OOP_LapTrinhHuongDoiTuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dungna29
 */
public class B3_Method_HamTraVe {

    /*
         * Method trả về công thức và định nghĩa ở bên B2
         *
         * Định nghĩa: phương thức trả về bắt buộc phải trả về 1 giá trị hoặc 1 tập giá trị, 
           đối tượng.... tương ứng với kiểu dữ liệu của hàm.
     */
  
    //Phần 1: Phương thức trả về không tham số
    public int tinhTong(){//int là vị trí kiểu dữ liệu của hàng
         int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số thứ 1: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập số thứ 2: ");
        b = Integer.parseInt(sc.nextLine());
        return a + b;//Trả về đúng kiểu dữ liệu
    }
    
    public String[] getYears(){
        String[] arrYears = new String[200];
        int temp = 1900;
        for (int i = 0; i < arrYears.length; i++) {
            arrYears[i] = String.valueOf(temp);
            temp++;
        }
        return arrYears;
    }
    
    public SinhVien getSV(){
        SinhVien sv1 = new SinhVien("Tú", "PH000", 0);
        return sv1;
    }
    
    //Phương thức trả vè có tham số tương tự như bên không trả về void
}
