package trinh.dinh.phuong.pattern.Factory;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class Factory {
    //Cần giữ Factory class là Singleton hoặc method trả về subclass là static
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("Laptop".equalsIgnoreCase(type)) {
            return new Laptop(ram, hdd, cpu);
        }
        else if("Server".equalsIgnoreCase(type)){
                return new Server(ram, hdd, cpu);
            }
        return null;
    }
}
