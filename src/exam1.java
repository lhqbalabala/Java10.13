import com.sun.beans.editors.DoubleEditor;

import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size=101;
        System.out.println("Enter the integers between 1 and 100: ");
        int[] list1 =new int[size];
        int[] list2 =new int[size];
        int cot=0;
        while(input.nextInt()!=0){
            int a =input.nextInt();
            list1[a]++;
        }
        for(int i=0;i<100;i++){
            if(list1[i]>0){
                System.out.println(i+" occurs "+list1[i]+" times");
            }
        }

    }
}