package week11;



public class Task2<T extends Comparable<T>> {
    public T rMax(T list[]) {
        T max = list[0];
        for(int i = 1; i < list.length; ++i)
        {
            if (list[i].compareTo(max) >= 0)
            {
                max = list[i];
            }
        }
              return max;
    }
    
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        
        
        Integer intArr[] = {5, 4, 3, 2};        
        System.out.println("Max: " + task2.rMax(intArr));
        Double doubleArr[] = {3.5, 7.5, 4.3, 5.35};     
        System.out.println("Max: " + task2.rMax(doubleArr));        
        Character charArr[] = {'x', 'c', 'n', 'a'};     
        System.out.println("Max: " + task2.rMax(charArr));        
        String strArr[] = {"acd", "dxd", "hoa", "avb"};     
        System.out.println("Max: " + task2.rMax(strArr));
    }
}