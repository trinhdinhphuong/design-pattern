package trinh.dinh.phuong.pattern;

/**
 *
 * @author Trinh Dinh Phuong
 * @web: https://trinhdinhphuong.com
 */
public class Singleton {
    // Có hai private : cho hàm khởi tạo và private cho chính instance
    
    // Tạo ra một đối tượng trong chính nó
    /*Note: nếu instance để public, vì instance là static nên nó có thể truy cập thông qua tên của class 
    khi đó Singleton.instance.method() 
    sẽ có lỗi run time là null pointer exception trong lần chạy đầu tiên khi instance null
    Do vậy phải để private để tránh truy cập trực tiếp
    */
    private static Singleton instance;
    
    /* Không để cho class khác có thể gọi được hàm khởi tạo ngoài chính nó
    thông qua toán tử new
    Hàm khởi tạo là private để tránh khởi tạo ở ngoài class đó
    */
    private Singleton(){}
    
    // Tại một thời điểm chỉ có một đối tượng được tạo ra mà thôi, nó sẽ là duy nhất trong toàn bộ hệ thống
    // instance là available cho toàn bộ hệ thống nhưng nó phải truy cập thông qua cái api của nó là getInstance
    private static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
    public void method(){
        
    }
    
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }

    
}
/*
Nó có ý nghĩa khi mà chúng ta muốn chia sẻ tài nguyên
Ví dụ kinh điển là chia sẻ máy in
Có rất nhiều người truy cập đến máy in này, tại một thời điểm
chỉ có duy nhất một người được sử dụng.
Có nghĩa là tài nguyên cần được đồng bộ hóa và nó sẽ public, available cho
toàn bộ hệ thống. Global available, một tài nguyên chia sẻ cho tất cả mọi người
Đặc điểm thứ 2: tại một thời điểm chỉ có duy nhất một đối tượng được sử dụng
Singleton mang ý nghĩa global state, chỉ duy nhất một đối tượng được sinh ra
Trong trường hợp connect tới database, nếu muốn giới hạn số connection được tạo ra thì sẽ tạo một cái pool
để quản lý số lượng instance 
Singleton bản mở rộng có thể hạn chế số lượng instance được tạo ra 
*/