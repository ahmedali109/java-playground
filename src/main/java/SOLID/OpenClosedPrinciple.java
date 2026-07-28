package SOLID;

// Jst For Demo
public class OpenClosedPrinciple {
    StudentDiscount studentDiscount;
    VipDiscount vipDiscount;
    public OpenClosedPrinciple(){
        studentDiscount = new StudentDiscount();
        vipDiscount = new VipDiscount();
        IO.println(studentDiscount.calculate(500));
        IO.println(vipDiscount.calculate(500));
    }
}


// OCP
interface Discount{
    double calculate(double price);
}

class StudentDiscount implements Discount{
    @Override
    public double calculate(double price){
        return price * 0.4;
    }
}

class VipDiscount implements Discount{
    @Override
    public double calculate(double price) {
        return price * 0.9;
    }
}