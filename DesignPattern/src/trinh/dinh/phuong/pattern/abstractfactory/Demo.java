package trinh.dinh.phuong.pattern.abstractfactory;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class Demo {
    
    private static void testAbstractFactory(){
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("32 GB", "2 TB", "4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1T", "3 GHz"));
        System.out.println("AbstractFactory laptop config: " + laptop);
        System.out.println("AbstractFactory server config: " + server);
    }
    public static void main(String[] args) {
        testAbstractFactory();
    }
}
