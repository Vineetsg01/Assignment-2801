import java.util.Scanner;
public class question2{  
    public static int getSmallest(int[] nums, int size){  
    int temp;  
    for (int i = 0; i < size; i++)   
            {  
                for (int j = i + 1; j < size; j++)   
                {  
                    if (nums[i] > nums[j])   
                    {  
                        temp = nums[i];  
                        nums[i] = nums[j];  
                        nums[j] = temp;  
                    }  
                }  
            }  
           return nums[0];  
    }  
    public static void main(String args[]){  
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array.");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Smallest: "+getSmallest(nums, size));  
    }
}  