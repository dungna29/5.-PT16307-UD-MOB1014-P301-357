/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_MAU_OOP_V1;

/**
 *
 * @author Dungna29
 */
public class SinhVien {
    private String ten;
    private String msv;
    private int ns;
    private double diemJava;

    public SinhVien() {
    }

    public SinhVien(String ten, String msv, int ns, double diemJava) {
        this.ten = ten;
        this.msv = msv;
        this.ns = ns;
        this.diemJava = diemJava;
    }

  

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

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }
    
    void inRaManHinh(){
        System.out.printf("Tên: %s Mã: %s Năm Sinh: %d Điểm: %f \n",ten,msv,ns,diemJava);
    }
}
