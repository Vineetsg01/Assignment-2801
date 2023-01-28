//Create a method int[] findSum(int[] arr, int n) that takes an integer array arr and returns an array of the two integer elements that add up to integer n. If there are multiple, return only one. If there is no such pair, return the original array.
import java.util.Scanner;
class question1
{
    
    public static void findSum(int[] arr, int n)
    {
    
        for (int i = 0; i < arr.length - 1; i++)
        {
            
            for (int j = i + 1; j < arr.length; j++)
            {
                
                if (arr[i] + arr[j] == n)
                {
                    System.out.printf("(%d, %d)", arr[i], arr[j]);
                    return;
                }
            }
        }
 
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
 
    public static void main (String[] args)
    {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array.");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the targetted sum");
        int n = sc.nextInt();
 
        findPair(arr, n);
    }
}
