package trinh.dinh.phuong.pattern.basic.privatemethod;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class Store {
    /*private không được sử dụng ngoài class, che dấu thông tin của phương thức
    client không hề biết Store có phương thức này mà chỉ có bản thân các phương 
    thức bên trong Store sử dụng nó
    */
    
    private int fx(int a, int b){
        return a*b;
    }
    public void show(){
        System.out.println("Value of fx(10,20): " +fx(10,20));
        System.out.println("Value of fx(10,30): " +fx(10,30));
    }
    public static void main(String[] args) {
        Store store = new Store();
        store.show();
    }
}
