package week3;

public class Week3 {

    public static int max(int m, int n) {
        if(m > n)
       {
           return m;
       }
       else
       {
           return n;
       }
    }

    public static int minOfArray(int[] array) {
       int min = array[0];
        for(int i = 1 ; i < array.length ; i++)
        {
            if(min > array[i])
            {
                min = array[i];
            }
            
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        double BMI;
        BMI = weight/(Math.pow(height, 2));
        if(BMI < 18.5)
        {
            return "Thiếu Cân";
        }
        else if(BMI >=18.5  && BMI <= 22.99)
        {
            return "Bình Thường";
        }
        else if(BMI >=23  && BMI <= 24.99)
        {
            return "Thừa Cân";
        }
        else
        {
            return "Béo Phì";
        }
    }
}
