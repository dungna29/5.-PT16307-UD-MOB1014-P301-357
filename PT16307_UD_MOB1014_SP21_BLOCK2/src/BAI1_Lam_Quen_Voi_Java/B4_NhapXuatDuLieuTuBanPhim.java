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
public class B4_NhapXuatDuLieuTuBanPhim {

    /*
       Bài 4: Nhập xuất dữ liệu từ bàn phím
    1. Xuất dữ liệu ra màn hình: In giá trị mặc định hoặc giá của biến ra màn hình
        + Công thức: sout + tab
        + System.out.println(<giá trị hoặc tập giá trị>);
        + System.out.print(<giá trị hoặc tập giá trị>);
        + System.out.printf("Chào các %s bạn đến với năm học %d",value,value);
    2. Nhập dữ liệu ra màn hình:
        + Sử dụng 1 Class: Scanner sc = new Scanner(System.in);
        + Để đọc dữ liệu thì cần định nghĩa rõ muốn lưu dữ liệu nào khi người dùng nhập.
        + Để lấy giá trị từ bàn phím: sc.next<Kiểu dữ liệu muốn>();
     */
    public static void main(String[] args) {
        //1. Xuất dữ liệu ra màn hình
         System.out.print("Chào các bạn ");
         System.out.println(" đến với môn java 1");
         System.out.print("năm 2021 " + " Long");

        //Đưa ra 1 template hiển thị ra màn hình 
        // Tìm hiểu thêm: %f, %s, %d.....
        System.out.printf("\nChào bạn: %s học JAVA1 năm: %d \n","Hoàng",2021);
        
        //2. Nhập dữ liệu ra màn bàn phím
        Scanner sc = new Scanner(System.in);
        //Khai báo 1 biến để lưu giá trị do người dùng nhập vào
        System.out.println("Mời bạn nhập tên: ");
        String name = sc.nextLine();
        //Trong sc. có rất nhiều next kiểu dữ liệu thì tùy theo giá trị cần lấy từ người dùng
        
        //input sẽ được gán giá trị do người dùng nhập vào
        
        System.out.println("Chào bạn " + name);
       
        
        //Có rất nhiều các next kiểu dữ liệu khác nhau sẽ tương ứng với kiểu dữ liệu cần gán        
        /*
        Bài 1: Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên 
        từ bàn phím và xuất ra định dạng sau: 
	“Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> 
        đến với chương trình java đầu tiên.”
        
        Bài 2: Viết chương trình máy tính bỏ túi cộng 5 số nguyên sau đó in kết quả
        và những số đó ra màn hình.
        so1 + so2 + so3 + so4 + so5 = kết quả.   
        */
        
    }
}
