package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;
    

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public String result1()
    {
        return Integer.toString(this.numerator) +" "+Integer.toString(this.denominator);
    }
    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        this.numerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);       
        this.denominator = (this.denominator * other.denominator);
       
        return this;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        this.numerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);       
        this.denominator = (this.denominator * other.denominator);
        
        return this;
    }

    public Fraction multiply(Fraction other) {
        this.numerator = this.numerator * other.numerator;       
        this.denominator = this.denominator * other.denominator;
        
        return this;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        this.numerator = this.numerator * other.denominator;       
        this.denominator = this.denominator * other.numerator;
        
        return this;
    }
    public boolean equals(Fraction obj)
    {
        int a = (this.numerator * obj.denominator) - (obj.numerator * this.denominator);         
        if(a == 0)
        {
            return true;
        } 
        return false;
    }
}
