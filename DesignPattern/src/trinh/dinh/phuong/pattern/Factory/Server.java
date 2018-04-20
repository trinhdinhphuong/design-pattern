package trinh.dinh.phuong.pattern.Factory;

import trinh.dinh.phuong.pattern.Factory.Computer;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class Server extends Computer{

    private String ram;
    private String hdd;
    private String cpu;
    
    public Server(String ram, String hdd, String cpu){
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
        return this.cpu;
    }
    
}
