package trinh.dinh.phuong.pattern.oopabstract;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public abstract class School {
    // Sử dụng khi những thằng con có những cái chung mà không cần thay đổi
    //Thằng cha bảo là chúng mày cứ dùng giống hệt không cần thay đổi gì
    public void displayNote(){
        System.out.println("Please pay tuition fee before starting new semester");
        
    }
    public abstract String calculatePoint(int point);
}
