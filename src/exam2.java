
import com.sun.beans.editors.DoubleEditor;

import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size=1010;
        System.out.println("Enter the integers between 1 and 100: ");
        int[] list1 =new int[size];
        int[] list2 =new int[size];
        int cot=0;
        for(int i=0;i<10;i++){
            int a=input.nextInt();
            list1[a]++;
            if(list1[a]==1){
                list2[cot]=a;
                cot++;
            }
        }
        System.out.println("The number of distinct number is "+cot);
        for(int i=0;i<cot;i++){
            System.out.print(list2[i]+" ");
        }


    }
}