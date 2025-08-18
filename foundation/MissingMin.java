package foundation;

public class MissingMin {
    public int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int each:arr){
            if(each<min)
                min = each;
        }
        return min;
    }
    public boolean isAvailbale(int[] arr,int search){
        for(int each:arr){
            if(each == search)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // int[] bills = {9,4,5,12,90,7};
        // int[] bills = {1,4,5,12,90,7};
        // int[] bills = {45,49,50,90,47,46};
        int[] bills = {0,1,2,3,4,5,6};
        MissingMin missing = new MissingMin();
        int found = missing.findMin(bills);
        found++;
        while(true){
            if(missing.isAvailbale(bills, found)){
                missing.isAvailbale(bills, found++);
            }
            else{
                System.out.println(found);
                break;
            }
        }
    }
}
