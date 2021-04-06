/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI7_XuLyString_BieuThucChinhQuy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Nguyen Anh Dung
 */
public class S2_BieuThucChinhQuy {

    public static void main(String[] args) {

        //Viết chương trình bắt nhập số nguyên
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println("Mời bạn nhập chữ: ");
            input = sc.nextLine();
        } while (!checkChu(input));
        //System.out.println("Bạn thông minh quá nhập đúng chữ rồi");
    }
    //Chỉ sử dụng với kiểu dữ liệu truyền vào là String.
    static boolean checkChu(String text){
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher =  pattern.matcher(text);
        return  matcher.matches();//Trả về true khi đúng là chữ cái
    }
     static boolean checkSo(String text){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher =  pattern.matcher(text);
        return  matcher.matches();//Trả về true khi đúng là chữ cái
    }

  

}
