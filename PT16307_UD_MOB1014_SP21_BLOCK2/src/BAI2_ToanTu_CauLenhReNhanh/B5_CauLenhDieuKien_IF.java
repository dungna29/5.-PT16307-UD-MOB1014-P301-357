/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_ToanTu_CauLenhReNhanh;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B5_CauLenhDieuKien_IF {

    /*
        Câu lệnh điều kiện IF dùng để đưa ra 1 điều kiện nào đó và 
        thực hiện 1 hành động bên trong IF nếu IF(true) 
        
        - Cách dùng: if + tab
        if (true) {
            Thực hiện 1 hành động nào đó với điều kiện if phải true
        }
     */
    public static void main(String[] args) {
        if (false) {
            //Điều kiện if phải luôn đúng
            System.out.println("If đang bị false");
        }

        if (!false) {
            //Điều kiện if phải luôn đúng
            System.out.println("If đang bị false");
        }
        if (5>9) {
            System.out.println("If đang bị false");
        }

        //Bài tập mẫu: Viết 1 chương trình nhập số buổi nghỉ tại 
        //FPOLY đễ xác định mất 700k hay không?
        
        
        //Bước 1: Xác định thư viện dùng và biến cần khai báo
        Scanner sc = new Scanner(System.in);
        byte nghi;
        //Bước 2: Lấy dữ liệu từ bàn phím
        System.out.println("Mời bạn nhập buổi nghỉ: ");
        nghi = Byte.parseByte(sc.nextLine());
        //Bước 3: Xử lý nghiệp vụ
        if (nghi > 4) {
            System.out.println("Chúc mừng bạn học lại");
            return;
        }
        System.out.println("Chúc mừng bạn nên nghỉ tiếp đi");
    }
}
