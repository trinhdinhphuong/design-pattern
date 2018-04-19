package trinh.dinh.phuong.pattern.strategy;

/**
 *
 * @author phuongtrinh
 * @website: https://trinhdinhphuong.com
 */
public class Customer {
    private MarketingStrategy strategy;
    public Customer(MarketingStrategy strategy){
        this.strategy = strategy;
    }
    
    public void sale(){
        strategy.sale();
    }
    
    public static void main(String[] args) {
        Customer c1 = new Customer(new EmployeeStrategy());
        c1.sale();
        Customer c2 = new Customer(new StudentStrategy());
        c2.sale();
    }
}
/*
Thông số truyền vào khác nhau sẽ ra kết quả khác nhau
Không thể áp dụng cùng một chiến lược cho các khu vực khác nhau: 
nông thôn, thành thị,
lớp người giàu, người nghèo, người đi làm, sinh viên, học sinh

Các dịch vụ gửi tiết kiệm khác nhau thì lãi suất khác nhau: 10 triệu, trăm triệu,
3 tháng hay 1 năm 

Context: người, khu vực được marketing, hoặc khác hàng được gửi tiết kiệm
Strategy: là ngân hàng, đội ngũ marketing
ConcreteStrategy: vùng, loại người được marketing, dạng khách hàng khác nhau 
với các loại tiền gửi khác nhau, thời gian gửi khác nhau
*/