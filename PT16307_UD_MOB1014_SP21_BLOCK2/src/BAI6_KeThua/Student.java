/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_KeThua;

/**
 *
 * @author Dungna29
 */
public class Student extends Person {

    /*
    Sử dụng từ khóa extends để khế thừa lớp cha
    Chỉ được phép có 1 cha
    Bên lớp con chỉ cần khai báo các thuộc tính riêng đại diện cho nó
     */
    
    private String msv;
    private double diemChsarp;

    public Student() {
    }

    public Student(String msv1, double diemChsarp, String ho, String tenDem, String ten, String namSinh) {
        super(ho, tenDem, ten, namSinh);
        msv = msv1;
        this.diemChsarp = diemChsarp;
        //Từ khóa this dùng để tham chiếu đến thuộc tính và phương thức của lớp hiện tại
        //Từ khóa super dùng để tham chiếu đến thuộc tính và phương thức của lớp cha        
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public double getDiemChsarp() {
        return diemChsarp;
    }

    public void setDiemChsarp(double diemChsarp) {
        this.diemChsarp = diemChsarp;
    }

    void inRaManHinhSinhVien() {
        System.out.printf("Họ và Tên:  %s | Mã Sv: %s | Năm Sinh: %s | Điểm: %f",
                (getHo() + getTenDem() + getTen()),msv,getNamSinh(),diemChsarp);
        //Khi in ra những thuộc tính của lớp cha bên lớp con muốn gọi ra thì phải sử dụng get hoặc set
    }
    
    //Để kế thừa phương thức của lớp cha
    //Alt + insert --> Overide Method --> Chọn phương thức muốn kế thừa
    
    //Ghi đè phương thức là khi lớp con kế thừa phương thức lớp cha thì phương thức ở lớp con
    //có thể được code lại theo luồng mới.
    @Override
    void inRaManHinhLopCha() {
        //super.inRaManHinhLopCha(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Đây là text từ lớp SinhVien của inRaManHinhLopCha()");
    }
    

}
