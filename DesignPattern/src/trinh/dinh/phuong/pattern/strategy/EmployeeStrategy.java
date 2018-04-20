package trinh.dinh.phuong.pattern.strategy;

/**
 *
 * @author Trinh Dinh Phuong
 * @website: https://trinhdinhphuong.com
 */
public class EmployeeStrategy implements MarketingStrategy{

    @Override
    public void sale() {
        System.out.println("Employee");
    }
    
}
