package trinh.dinh.phuong.pattern.adapter;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class ChargerAdapter {
    //Adapter
    private ChargerAdaptee adaptee;
    // Hàm charger giống như một black box đối với user
    public void charger(){
        adaptee = new ChargerAdaptee();
        adaptee.plug();
    }
}
