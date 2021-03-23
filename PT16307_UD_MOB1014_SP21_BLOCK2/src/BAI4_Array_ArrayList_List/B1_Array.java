/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array_ArrayList_List;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B1_Array {

    /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
     */
    public static void main(String[] args) {
        //1. Khởi tạo mảng
        int[] arrNumber1;//Khai báo mảng
        int arrNumber2[];
        arrNumber2 = new int[5];//Khởi tạo mảng có kích thước là 5

        String arrName[] = new String[]{"Java1", "Java2"};
        String arrName1[] = {"Java1", "Java2"};

        var arrYear = new int[5];
        var arrYear1 = new String[5];

        //2. Gán giá trị cho mảng
        //arrNumber2 = 5;//Sai vì không xác định lưu giá trị 5 vào vị trí nào
        arrNumber2[0] = 5;//Gán giá trị phải biết index cần gán
        arrNumber2[1] = 7;
        arrNumber2[0] = 15;//Ghi đè và index đã có giá trị

        //4. Lấy 1 giá trị ra
        System.out.println(arrNumber2[0]);
        
        //3. Sử dụng vòng lặp để in giá trị ra màn hình
        // a) For
        for (int i = 0; i < arrNumber2.length; i++) {
            System.out.print(arrNumber2[i] + " ");
        }
        System.out.println("");
        // b) Foreach
        for (var x : arrNumber2) {
            System.out.print(x + " ");
        }
        // c) while
    }
}
