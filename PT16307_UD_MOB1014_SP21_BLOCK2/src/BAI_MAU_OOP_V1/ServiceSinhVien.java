/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_MAU_OOP_V1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class ServiceSinhVien {//Đây là nơi sẽ code các chức năng liên quan của Sinh Viên

    Scanner _sc = new Scanner(System.in);
    SinhVien[] _arrSinhViens;
    List<SinhVien> _lstSinhVien;
    SinhVien _sv;

    public ServiceSinhVien() {
        _lstSinhVien = new ArrayList<>();
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

        System.out.println("Bạn muốn thêm bao nhiêu SV: ");
        size = Integer.parseInt(_sc.nextLine());//Kích thước mảng là do người dùng nhập
        //Sau khi người dùng nhập thì mới khởi tạo
        _arrSinhViens = new SinhVien[size];//Khởi tạo mảng sinh viên với kích thước do người dùng nhập vào
        for (int i = 0; i < _arrSinhViens.length; i++) {
            _arrSinhViens[i] = new SinhVien();
            System.out.println("Mời bạn nhập Tên: ");
            _arrSinhViens[i].setTen(_sc.nextLine());
            System.out.println("Mời bạn nhập Mã: ");
            _arrSinhViens[i].setMsv(_sc.nextLine());
            System.out.println("Mời bạn nhập Năm Sinh: ");
            _arrSinhViens[i].setNs(Integer.parseInt(_sc.nextLine()));
            System.out.println("Mời bạn nhập Điểm JAVA: ");
            _arrSinhViens[i].setDiemJava(Double.parseDouble(_sc.nextLine()));
        }
        //arrSinhViens[i] Đối tượng sinh viên nằm ở index
    }

    void inMangSV() {
        if (_arrSinhViens.length < 0) {
            return;
        }
        for (SinhVien x : _arrSinhViens) {
            //x là tên biến đại diện cho đối tượng SinhVien
            x.inRaManHinh();
        }
    }

    //Bài 4: List đối tượng
    void bai4ListSinhVien() {
        /*
        _lstSinhVien: Biến toàn cục được khai báo trên đầu dùng chung
        _sv: Biến toàn cục được khai báo trên đầu để dùng chung
        */
        int size;
        System.out.println("Bạn muốn thêm bao nhiêu SV: ");
        size = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < size; i++) {
            _sv = new SinhVien();
            System.out.println("Mời bạn nhập Tên: ");
            _sv.setTen(_sc.nextLine());
            System.out.println("Mời bạn nhập Mã: ");
            _sv.setMsv(_sc.nextLine());
            System.out.println("Mời bạn nhập Năm Sinh: ");
            _sv.setNs(Integer.parseInt(_sc.nextLine()));
            System.out.println("Mời bạn nhập Điểm JAVA: ");
            _sv.setDiemJava(Double.parseDouble(_sc.nextLine()));
            _lstSinhVien.add(_sv);//Sau khi nhập xong 1 đối tượng tiến hành add vào danh sách
        }
    }
     void bai4ListSinhVien1() {        
        int size;        
        size = Integer.parseInt(getValueInput("thêm bao nhiêu SV:"));
        for (int i = 0; i < size; i++) {
            _sv = new SinhVien();            
            _sv.setTen(getValueInput("tên Sinh Viên:"));          
            _sv.setMsv(getValueInput("tên Sinh mã:"));            
            _sv.setNs(Integer.parseInt(getValueInput("năm sinh:")));           
            _sv.setDiemJava(Double.parseDouble(getValueInput("điểm:")));
            _lstSinhVien.add(_sv);//Sau khi nhập xong 1 đối tượng tiến hành add vào danh sách
        }
    }
    String getValueInput(String text){
         System.out.println("Mời bạn " + text);
         return _sc.nextLine();
    }
    
    void getListSV() {      
        for (SinhVien x : _lstSinhVien) {
            //x là tên biến đại diện cho đối tượng SinhVien
            x.inRaManHinh();
        }
    }

}
