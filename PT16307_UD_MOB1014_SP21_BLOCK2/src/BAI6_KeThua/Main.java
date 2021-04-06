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
public class Main {
     /*
    TÍNH CHẤT KẾ THỪA TRONG LẬP TRÌNH
    - Định nghĩa: Cho phép định nghĩa một lớp đối tượng dựa trên các thuộc tính có sẵn của một lớp đã có.
    Lớp con có thể kế thừa các thuộc tính và phương thức của lớp cha.
    - Sử dụng: Sử dụng từ khóa extend lớp cha
    - Lưu ý: trong JAVA và C# không có đã kế thừa chỉ có đơn kế thừa. Tức là 1 con chỉ có thể có 1 cha
    - Từ khóa this: tham chiếu đến thuộc tính và phương thức của lớp hiện tại
    - Từ khóa super: tham chiếu đến thuộc tính và phương thức của lớp cha
    + Lợi ích: 
        - Tiết kiệm thời gian lập trình
        - Các thuộc tính chung có thể tái sử dụng thì đưa lên lớp cha còn ở lớp con thì có các thuộc tính
            đặc trưng riêng để miêu tả cho đối tượng đó.
     */
    public static void main(String[] args) {
       /*
        TẠO 4 CLASS ĐỐI TƯỢNG
        1 - SinhVien: ho,tenDem,ten,namSinh,maSv,diemJava
        2 - GiaoVien: ho,tenDem,ten,namSinh,maGv,gioDay
        3 - KeToan: ho,tenDem,ten,namSinh,maNv,ngayCong
        4 - BaoVe: ho,tenDem,ten,namSinh,maBv,caLamViec
         */
//       Student st = new Student();
//       st.setHo("Nguyễn");
//       st.setTenDem("Hoàng");
//       st.setTen("Tú");
//       st.setMsv("PH55555");
//       st.setNamSinh("1999");
//       st.setDiemChsarp(1.5);
//       
//       st.inRaManHinhSinhVien();

        /*
            Ghi đè phương thức Overide
        */
        Person p = new Person();
        p.inRaManHinhLopCha();
        Student st = new Student();
        st.inRaManHinhLopCha();//Lớp con ghi đè phương thức của lớp cha
    }
}
