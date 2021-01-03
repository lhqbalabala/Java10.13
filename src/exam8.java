
import com.sun.beans.editors.DoubleEditor;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

import java.util.*;

public class exam8 {

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
        int size=101;
        String list[]={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String list1[]={"Spades","Hearts","Diamonds","Club"};
        int list2[]=new int [55];
        int sum=0;
        int cot=0;
        while(sum<4){
            cot++;
            int a=(int)(Math.random()*51)+2;
            list2[a/13]++;
            if(list2[a/13]==1){sum++;System.out.println(list[a%13]+" of "+list1[a/13]);}
        }
        System.out.println("Number of picks: "+cot);




    }
}