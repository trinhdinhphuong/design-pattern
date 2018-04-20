/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trinh.dinh.phuong.pattern.adapter;

/**
 *
 * @author phuongtrinh
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
