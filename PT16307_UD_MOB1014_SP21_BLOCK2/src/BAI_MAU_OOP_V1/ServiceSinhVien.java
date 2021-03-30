/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_MAU_OOP_V1;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class ServiceSinhVien {//Đây là nơi sẽ code các chức năng liên quan của Sinh Viên

    Scanner _sc = new Scanner(System.in);

    public ServiceSinhVien() {
    }

    //Bài 1: Tạo 2 đối tượng sử dụng contructor có và không tham số
    void bai1TaoDoiTuongBangConTructor() {
        //Cách 1: Sử dụng Conctructor có tham số
        SinhVien sv1 = new SinhVien("Tú", "PH00555", 1979, 8.6);
        //Cách 2: Sử dụng contructor không tham số
        SinhVien sv2 = new SinhVien();
        sv2.setTen("Tú 2");
        sv2.setMsv("PH00554");
        sv2.setNs(1999);
        sv2.setDiemJava(8.9);

        //In ra màn hình
        sv1.inRaManHinh();
        sv2.inRaManHinh();
    }

    //Bài 2: Tạo 1 đối tượng do người dùng nhập
    void bai2Tao1DoiTunogDoNguoiDungNhap() {
        SinhVien sv1 = new SinhVien();
        System.out.println("Mời bạn nhập Tên: ");
        sv1.setTen(_sc.nextLine());
        System.out.println("Mời bạn nhập Mã: ");
        sv1.setMsv(_sc.nextLine());
        System.out.println("Mời bạn nhập Năm Sinh: ");
        sv1.setNs(Integer.parseInt(_sc.nextLine()));
        System.out.println("Mời bạn nhập Điểm JAVA: ");
        sv1.setDiemJava(Double.parseDouble(_sc.nextLine()));
        sv1.inRaManHinh();
    }

    //Bài 3: Tạo nhiều đối tượng sử Array
    void bai3Tao1ArrayDoiTuong() {
        int size;
        SinhVien[] arrSinhViens;//Khai báo
        System.out.println("Bạn muốn thêm bao nhiêu SV: ");
        size = Integer.parseInt(_sc.nextLine());//Kích thước mảng là do người dùng nhập
        //Sau khi người dùng nhập thì mới khởi tạo
        arrSinhViens = new SinhVien[size];//Khởi tạo mảng sinh viên với kích thước do người dùng nhập vào
        for (int i = 0; i < arrSinhViens.length; i++) {
            arrSinhViens[i] = new SinhVien();
            System.out.println("Mời bạn nhập Tên: ");
            arrSinhViens[i].setTen(_sc.nextLine());
            System.out.println("Mời bạn nhập Mã: ");
            arrSinhViens[i].setMsv(_sc.nextLine());
            System.out.println("Mời bạn nhập Năm Sinh: ");
            arrSinhViens[i].setNs(Integer.parseInt(_sc.nextLine()));
            System.out.println("Mời bạn nhập Điểm JAVA: ");
            arrSinhViens[i].setDiemJava(Double.parseDouble(_sc.nextLine()));
        }
        //arrSinhViens[i] Đối tượng sinh viên nằm ở index
        for (SinhVien x : arrSinhViens) {
            //x là tên biến đại diện cho đối tượng SinhVien
            x.inRaManHinh();
        }
    }
}
