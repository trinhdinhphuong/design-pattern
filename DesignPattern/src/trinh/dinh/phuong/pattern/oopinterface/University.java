package trinh.dinh.phuong.pattern.oopinterface;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public interface University {
    // Không có thân hàm
    // Buộc tất cả các client phải implements lại tất cả các phương thức của nó
    // Đa thừa kế chỉ tồn tại với interface, không thể extends từ nhiều class
    public String calculatePoint(int point);
}
