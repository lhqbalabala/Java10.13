
import com.sun.beans.editors.DoubleEditor;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

import java.util.*;

public class exam9 {

    public static double bsort(double[] numbers){for(int i=0;i<numbers.length-1;i++)
    {
        for(int j=0;j<numbers.length-1-i;j++)
        {
            if(numbers[j]>numbers[j+1])
            {
                double temp=numbers[j];
                numbers[j]=numbers[j+1];
                numbers[j+1]=temp;
            }
        }
    }
        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1");
        int size1=input.nextInt();
        int list1[]=new int[size1];
        for(int i=0;i<size1;i++){
            list1[i]=input.nextInt();
        }
        System.out.println("Enter list2");
        int size2=input.nextInt();
        int list2[]=new int[size2];
        for(int i=0;i<size2;i++){
            list2[i]=input.nextInt();
        }
        int size=size1+size2;
        int list[]=new int [size];
        int cot1=0;
        int cot2=0;
        int cot=0;
        while(cot<size){
            if(cot1>=size1) {
                list[cot]=list2[cot2];cot2++;
                cot++;
                continue;
            }
            if(cot2>=size2){
                list[cot]=list1[cot1];cot1++;
                cot++;
                continue;
            }
            if(list1[cot1]>list2[cot2]){
                list[cot]=list2[cot2];
                cot2++;
            }
            else{
                list[cot]=list1[cot1];
                cot1++;
            }
            cot++;
        }
        System.out.println("The merged list is ");
        for(int i=0;i<size;i++){
            System.out.print(list[i]+" ");
        }




    }
}