/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

/**
 *
 * @author Dungna29
 */
public class ClassA {
    /*
    Private: Chỉ được phép sử dụng bên trong class
    
    */
    private int a;
    int b;//Default chỉ được sử dụng ở package
    public int c;//Bất cứ đâu
    protected int d;//Phải là lớp con và vẫn sử dụng trong package
}
