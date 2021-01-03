
import com.sun.beans.editors.DoubleEditor;

import java.util.Scanner;

import java.util.*;


public class exam5 {

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
        int size=10;
        double list[]=new double[size];
        for(int i=0;i<10;i++){
            list[i]=input.nextDouble();
        }
        bsort(list);
        for(int i=0;i<10;i++){
            System.out.println(list[i]);
        }




    }
}