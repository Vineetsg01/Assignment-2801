import java.util.Scanner;
public class question2{  
    public static int findMinimum(int[] arr, int size){  
    int temp;  
    for (int i = 0; i < size; i++)   
            {  
                for (int j = i + 1; j < size; j++)   
                {  
                    if (arr[i] > arr[j])   
                    {  
                        temp = arr[i];  
                        arr[i] = arr[j];  
                        arr[j] = temp;  
                    }  
                }  
            }  
           return arr[0];  
    }  
    public static void main(String args[]){  
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array.");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Smallest: "+ findMinimum(arr, size));  
    }
}  