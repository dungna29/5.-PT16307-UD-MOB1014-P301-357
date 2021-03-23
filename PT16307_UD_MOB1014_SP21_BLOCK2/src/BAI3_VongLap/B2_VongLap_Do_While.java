/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI3_VongLap;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B2_VongLap_Do_While {

    /*
     Vòng lặp Do..While: Thực hiện hành động ít nhất là 1 lần. Điều kiện đề vòng lặp chạy giống như While(True).
    
    Cách gõ: do + tab
    Công thức: 
    do {
            //Thực hiện hành động ít nhất là 1 lần.
        } while (true);
     */
    public static void main(String[] args) {

        //Viết 1 chương trình in ra 5 lần
        int flag = 0;
        do {
            System.out.println(flag);
            flag++;
        } while (flag <= 5);

        System.out.println("-------");
        int flag1 = 0;
        while (flag1 <= 5) {
            System.out.println(flag1);
            flag1++;
        }

        //Viết 1 chương trình nhập giá trị từ 50 đến 100 thì thỏa mãn.
        Scanner sc = new Scanner(System.in);
        int input;
        do {            
            System.out.println("Mời bạn nhập 50 đến 100 nhé: ");
            input = sc.nextInt();
        } while (!(input >= 50 && input <=100));
        System.out.println("Chúc bạn điền đúng theo yêu cầu");
    }
}
