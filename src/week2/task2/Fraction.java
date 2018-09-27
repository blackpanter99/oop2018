package week2.task2;

public class Fraction {

       private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void displayFraction(){
        System.out.println(this.numerator + "/" + this.denominator);
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
    public boolean equals(Object obj)
    {
        Fraction b = (Fraction)obj;
        if(this.numerator*b.denominator == b.numerator*this.denominator) return true;
        return false;

    }
}
