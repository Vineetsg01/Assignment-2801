//Create a method int[] findSum(int[] arr, int n) that takes an integer array arr and returns an array of the two integer elements that add up to integer n. If there are multiple, return only one. If there is no such pair, return the original array.
import java.util.Scanner;
class question1
{
    
    public static void findPair(int[] nums, int n)
    {
    
        for (int i = 0; i < nums.length - 1; i++)
        {
            
            for (int j = i + 1; j < nums.length; j++)
            {
                
                if (nums[i] + nums[j] == n)
                {
                    System.out.printf("(%d, %d)", nums[i], nums[j]);
                    return;
                }
            }
        }
 
        
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
 
    public static void main (String[] args)
    {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array.");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the targetted sum");
        int n = sc.nextInt();
 
        findPair(nums, n);
    }
}