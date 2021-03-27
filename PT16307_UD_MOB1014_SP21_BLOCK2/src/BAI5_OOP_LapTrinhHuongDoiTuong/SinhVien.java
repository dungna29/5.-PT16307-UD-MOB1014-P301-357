/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author Dungna29
 */
public class SinhVien {//Đây là 1 Class đối tượng SinhVien
    //Phần 1: Khai báo tất cả các thuộc tính mà đối tượng phải có ở phần này

   private String ten;
   private String msv;
   private int namsinh;
   private String truongHoc = "FPOLY";

    //Phần 2: Contructor - hàm tạo: Tên contructor phải giống với tên class
    // Contructor là thành phần đầu tiên được chạy khi khởi tạo đối tượng
    //Phần 2.1: Contructor không tham số = alt + insert chọn contructor hoặc chuột phải chọn insert code
    public SinhVien() {
//        System.out.println("Đây là text in ra từ contructor không tham số");
    }

    //Phần 2.2: Contructor có tham số = alt + insert chọn contructor -> Select All

    public SinhVien(String ten, String msv, int namsinh) {
        this.ten = ten;
        this.msv = msv;
        this.namsinh = namsinh;
    }
    

    //Phần 3: Getter và Setter = alt + insert -> Getter Setter    
    //Dùng Get và set để gán giá trị cho thuộc tính bởi thuộc tính đã bị private
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getTruongHoc() {
        return truongHoc;
    }
    public void setTruongHoc(String truongHoc) {    
        this.truongHoc = truongHoc;
    }

    //Phần 4: Phương thức của đối tượng
    void inThongTinSinhVien() {
        System.out.printf("Tên: %s + Mã: %s + Năm Sinh: %d \n", ten, msv, namsinh);
    }

}
