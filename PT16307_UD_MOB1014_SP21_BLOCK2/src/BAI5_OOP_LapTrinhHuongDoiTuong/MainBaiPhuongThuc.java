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
public class MainBaiPhuongThuc {
    public static void main(String[] args) {
        /*
        Phần 1: Để sử dụng phương thức
            - Cần biết tên phương thức và vị trí phương đang nằm trong class nào
            - Kết thúc phương thức luôn là dấu ();
        */
        //B2_Method_PhuongThucKhongTraVe b2 = new B2_Method_PhuongThucKhongTraVe();
        //b2.tinhTong();
        
        /*
        Phần 2: Để sử dụng phương thức có tham số
            - Phải truyền đủ tham số và đúng vị trí
            - Phải truyền đúng kiểu dữ liệu cho tham số
            - Muốn truy cập vào phương thức nào thì truyền đúng số lượng tham số
        */
        //b2.tinhTong();Nếu gọi như này đang gọi vào phương thức giống tên nhưng không tham số
        //b2.tinhTong(5);Lỗi thiếu tham số
        //b2.tinhTong(5, 5);
        
        
        /*
        Phần 3: Sử dụng phương trả về
            - PHẢI COI PHƯƠNG TRẢ VỀ LÀ 1 GIÁ HOẶC TẬP GIÁ TRỊ....
        */
        B3_Method_HamTraVe b3 = new B3_Method_HamTraVe();
        //b3.tinhTong();//Không thể in ra màn hình vì phương thức là 1 giá trị
        //System.out.println(b3.tinhTong());
        
        //Sử dụng phương thức có kiểu là 1 mảng
        for (String x : b3.getYears()) {
            System.out.println(x);
        }
        
        //Sử dụng phương thức có kiểu là 1 đối tượng
        b3.getSV().inThongTinSinhVien();
    }
}
