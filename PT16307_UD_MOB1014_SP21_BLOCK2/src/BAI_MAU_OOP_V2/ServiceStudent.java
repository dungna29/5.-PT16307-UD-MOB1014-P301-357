/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_MAU_OOP_V2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class ServiceStudent {

    Scanner _sc = new Scanner(System.in);
    List<Student> _lstStudent = new ArrayList<>();
    Student _Student;
    String _input;

    public ServiceStudent() {
        Student st1 = new Student("PH1", 5.6, "Z", "0123", "tu@gmail");
        Student st2 = new Student("PH2", 8.6, "A", "0123", "hung@gmail");
        _lstStudent.add(st1);
        _lstStudent.add(st2);
        //Khi sử dụng class ServiceStudent thì ListSinhVien luôn có sẵn 2 đối tượng ảo
    }

    public void addSV() {
        System.out.println("Mời bạn nhập số lượng SV: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _Student = new Student();
            System.out.println("Mời bạn nhập tên: ");
            _Student.setTen(_sc.nextLine());
            System.out.println("Mời bạn nhập sdt: ");
            _Student.setSdt(_sc.nextLine());
            System.out.println("Mời bạn nhập email: ");
            _Student.setEmail(_sc.nextLine());
            System.out.println("Mời bạn nhập msv: ");
            _Student.setMsv(_sc.nextLine());
            System.out.println("Mời bạn nhập diem: ");
            _Student.setDiemJava(Double.parseDouble(_sc.nextLine()));
            _lstStudent.add(_Student);
        }
    }

    public void getListSV() {
        inds(_lstStudent);//Gọi phương thức lên để in danh sách sinh viên
    }

    public void findMsv() {
        System.out.println("Mời bạn nhập mã sinh viên: ");
        _input = _sc.nextLine();
        int index = getIndex(_input);
        if (index == -1) {
            System.out.println("Mã sinh viên không tồn tại");
            return;
        }
        _lstStudent.get(index).inRaManHinh();
    }

    public void removeMsv() {
        System.out.println("Mời bạn nhập mã sinh viên: ");
        _input = _sc.nextLine();
        int index = getIndex(_input);
        if (index == -1) {
            System.out.println("Mã sinh viên không tồn tại");
            return;
        }
        _lstStudent.remove(index);
        System.out.println("Xóa thành công");
    }

    public void editSv() {
        System.out.println("Mời bạn nhập mã sinh viên: ");
        _input = _sc.nextLine();
        int index = getIndex(_input);
        if (index == -1) {
            System.out.println("Mã sinh viên không tồn tại");
            return;
        }
        do {
            System.out.println("Bạn muốn sửa thuộc tính ");
            System.out.println("1. Tên");
            System.out.println("2. Sdt");
            System.out.println("3. Email");
            System.out.println("4. Thoát");
            System.out.println("Mời bạn chọn thuộc tính cần sửa: ");
            _input = _sc.nextLine();
            switch (_input) {
                case "1":
                    System.out.println("Tên cũ: " + _lstStudent.get(index).getTen());
                    System.out.println("Mời bạn nhập tên mới: ");
                    _lstStudent.get(index).setTen(_sc.nextLine());
                    break;
                case "2":
                    System.out.println("Sdt cũ: " + _lstStudent.get(index).getSdt());
                    System.out.println("Mời bạn nhập Sdt mới: ");
                    _lstStudent.get(index).setSdt(_sc.nextLine());
                    break;
                case "3":
                    System.out.println("Email cũ: " + _lstStudent.get(index).getEmail());
                    System.out.println("Mời bạn nhập Email mới: ");
                    _lstStudent.get(index).setEmail(_sc.nextLine());
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không tồn tại");
            }
        } while (!(_input.equals("4")));

    }

    public void sortLstSv() {
        //Cách 1:
//        Collections.sort(_lstStudent, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //return o1.getTen().compareTo(o2.getTen());//Sắp xếp xuôi của chuỗi
//                //return -o1.getMsv().compareTo(o2.getMsv());//Sắp xếp ngược của chuỗi
////                if (o1.getDiemJava() > o2.getDiemJava()) {//Sử dụng sắp xếp số thì dùng if else
////                    return 1;
////                }else{
////                    return -1;
////                }               
//            }
//        });
        //Cashc 2: Dùng lamda để sắp xếp
        _lstStudent.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));

        //Lambda expression for sorting theo điểm
        //_lstStudent.sort((Student s1, Student s2)->s1.getDiemJava()-s2.getDiemJava()); 
    }

    //Phương thức Xuất danh sách sinh viên
    private void inds(List<Student> lstStudents) {
        //        for (Student x : lstStudents) {
        //            x.inRaManHinh();
        //        }
        //Cách 2:
        //java 8 forEach for printing the list
        lstStudents.forEach((s) -> System.out.println(s));
    }

    //Phương thức lấy index của đối tượng trong danh sách
    private int getIndex(String msv) {
        for (int i = 0; i < _lstStudent.size(); i++) {
            if (_lstStudent.get(i).getMsv().equalsIgnoreCase(msv)) {
                return i;//Trả về vị trí của đối tượng trong List
            }
        }
        return -1;//Không tìm thấy thì sẽ là -1
    }

}
