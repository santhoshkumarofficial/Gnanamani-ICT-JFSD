package foundation;
public class Boundries{
    // non static data member
    int[][] ranges = {
        // {3, 5, 7},
        // {10, 15, 20}
        {4, 6, 8},
        {5, 10, 15}
    };
    public boolean isPrime(int digit){
        for(int number = 2;number<digit;number++){
            if(digit%number==0)
                return false;
        }
        return true;
    }
    // non static member function/method
    public void findPrime(){
        int sizeColumn = ranges[0].length;
        for(int column = 0;column < sizeColumn; column++){
            int value = ranges[1][column] - ranges[0][column];
            if(isPrime(value)&&value>ranges[0][column])
                System.out.print(value+" ");
            else
                System.out.print("-1 ");
        }
    }
}