/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trinh.dinh.phuong.pattern.adapter;

/**
 *
 * @author Trinh Dinh Phuong
 */
public class User {
    // Client Class
    public void charger(){
        ChargerAdapter c = new ChargerAdapter();
        c.charger();
    }
}
/*
User không cần biết bên trong của ChargerAdapter
User cần sạc thì gọi thằng sạc ra thôi
KISS; Keep it simple service, đầu tiên làm cho nó chạy đúng một cách đơn giản
nhất mặc dù nó ngu ngốc sau đó sẽ refactor và chuyển đổi nó thành 
design pattern như bạn muốn
*/