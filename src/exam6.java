
import com.sun.beans.editors.DoubleEditor;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

import java.util.*;

public class exam6 {

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
        System.out.println("input ten number :");
        int size=input.nextInt();
        int list[]=new int[size];
        int flag=1;
        for(int i=0;i<size;i++){
            list[i]=input.nextInt();
            if(i>=1&&list[i]<list[i-1])flag=0;
        }
        if(flag==1){
            System.out.println("The list is already sorted");
        }else
        {
            System.out.println("The list is not sorted");
        }





    }
}