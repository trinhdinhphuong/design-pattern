/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trinh.dinh.phuong.pattern;

/**
 *
 * @author phuongtrinh
 */
public class Main {
    
    private static void testFactory(){
        Computer laptop = Factory.getComputer("Laptop", "32 GB", "2 TB", "4 GHz");
        Computer server = Factory.getComputer("Server", "16 GB", "1 TB", "3 GHz");
        System.out.println("Laptop factory: "+ laptop);
        System.out.println("Server factory: "+ server);
    }
    
    public static void main(String[] args) {
        testFactory();
    }
    
}
