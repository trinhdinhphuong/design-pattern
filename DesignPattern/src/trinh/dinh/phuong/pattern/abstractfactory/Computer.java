package trinh.dinh.phuong.pattern.abstractfactory;

import trinh.dinh.phuong.pattern.factory.*;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
    
    @Override
    public String toString(){
        return "RAM: "+ this.getRAM() + ", HDD: " + this.getHDD() + ", CPU: " + this.getCPU();
    }
}
