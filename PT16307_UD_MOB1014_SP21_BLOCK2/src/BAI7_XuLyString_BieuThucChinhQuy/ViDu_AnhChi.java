/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI7_XuLyString_BieuThucChinhQuy;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class ViDu_AnhChi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nsBanThan = 2000, ns;
        String ten, gioitinh;
        /*
            Mời người dùng nhập vào năm sinh và giới tính và Tên hiển thị ra
            Chào Anh/Chị/Em. + Tên
         */
        do {
            System.out.print("Mời bạn nhập tên: ");
            ten = sc.nextLine();
            System.out.print("Mời bạn nhập giới tính: ");
            gioitinh = sc.nextLine();
            System.out.print("Mời bạn nhập năm sinh: ");
            ns = Integer.parseInt(sc.nextLine());
            //Cách 3 dòng
            String kq = (gioitinh.equalsIgnoreCase("nam") && (nsBanThan > ns)) ? "Anh" : null;
            String kq1 = (gioitinh.equalsIgnoreCase("nữ") && (nsBanThan > ns)) ? "Chị" : null;
            System.out.printf("Chào %s %s \n",
                    (kq != null) ? kq : (kq1 != null) ? kq1 : 
                            (kq == null && kq1 == null && nsBanThan < ns) ? "Em" : "Bạn", ten);
            
            //Cách 1 dòng
            System.out.printf("Chào %s %s \n",
                    (gioitinh.equals("nam") && (nsBanThan > ns)) ? "Anh"
                    : (gioitinh.equals("nữ") && (nsBanThan > ns)) ? "Chị"
                    : (nsBanThan < ns) ? "Em" : "Bạn", ten);
        } while (true);

    }
}
