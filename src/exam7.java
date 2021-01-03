
import com.sun.beans.editors.DoubleEditor;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

import java.util.*;

public class exam7 {

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
        int size=101;
        int list[]=new int[size];
        for(int i=1;i<=100;i++){
            for(int j=i;j<=100;j+=i){
                list[i]=1-list[i];
            }
        }
        for(int i=1;i<=100;i++){
            if(list[i]==1)
                System.out.print(i+" ");
        }
        System.out.println("");





    }
}