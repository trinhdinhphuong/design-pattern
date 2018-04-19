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
public class Laptop extends Computer{

    private String ram;
    private String hdd;
    private String cpu;
    
    public Laptop(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
    
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.hdd;
    }
    
}
