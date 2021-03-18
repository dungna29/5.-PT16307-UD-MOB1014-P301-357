/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1_Lam_Quen_Voi_Java;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class BaiTap1 {
    static int _a;
    /*
     Bài 1: Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên 
        từ bàn phím và xuất ra định dạng sau: 
	“Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> 
        đến với chương trình java đầu tiên.”
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bước 1: Xác định cần bao nhiêu biến
        String ten, msv;
        int ns;

        //Bước 2: Triển khai nhập thông tin từ bàn phím
        System.out.print("Mời bạn nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Mời bạn nhập năm sinh: ");
        //ns = sc.nextInt();
        //Cách 1: sc.nextLine();
        //sc.nextLine();

        //Cách 2: Sử dụng ép kiểu
        ns = Integer.parseInt(sc.nextLine());
        System.out.print("Mời bạn nhập msv: ");
        msv = sc.nextLine();

        //Bị trôi lệnh khi: sc.next <Kiểu số> mà đằng sau là next<String>
        //Bước 3: In thông tin ra màn hình
        System.out.printf("Tên: %s Năm Sinh: %d Msv: %s", ten, ns, msv);
        
    }
}
