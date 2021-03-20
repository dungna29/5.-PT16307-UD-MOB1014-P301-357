/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_ToanTu_CauLenhReNhanh;

/**
 *
 * @author Dungna29
 */
public class B7_CauLenhDieuKien_ELSE_IF {

    /*
        ELSE IF sử dụng trong trường hợp bài toán có nhiều điều kiện khác nhau và sẽ 
        thực hiện những hành động cũng khác nhau.
        
        Lưu ý: ELSE IF(TRUE) phải luôn đúng thì mới thỏa mãn vào bên trong nó tương tự như IF
        . Nhưng chỉ vào 1 điều kiện thỏa mãn không vào nhiều IF hoặc ELSE IF khi sử dụng.
        if (true) {
            //Thỏa mãn điều kiện IF(True)
            Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }else{
            Khi tất cả các trường hợp trên không thỏa mãn thì sẽ vào đây.
        }
     */
    public static void main(String[] args) {
        /*
            Viết 1 chương trình cho phép nhập điểm THI JAVA
            9 - 10 = Xuất sắc
            8 - 9 = Giỏi
            7 - 8 = khá
            5 - 7 = trung bình
            0 - 5 = Học lại
         */
        double diem = 8.6;
        if (diem >= 9 && diem <= 10) {
            System.out.println("Xuất sắc");
        }else if (diem >= 8 && diem < 9) {
            
        }else  if (diem >= 7 && diem < 8) {
            
        }else  if (diem >= 5 && diem < 7) {
            
        }else{
            System.out.println("Học lại");
        }
    }
}
