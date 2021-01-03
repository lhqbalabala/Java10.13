
import com.sun.beans.editors.DoubleEditor;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

import java.util.*;

class S implements Comparable<S>
{   String x;
    int y;
    public S(String x ,int y) {
        this.x = x;
        this.y = y;
    }
    public int compareTo(S a)
    {
        return a.y-this.y;
    }
}
public class exam11 {

    public static String bsort(String number){
        char []numbers=number.toCharArray();
        for(int i=0;i<numbers.length-1;i++)
        {
            for(int j=0;j<numbers.length-1-i;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    char temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        return String.valueOf(numbers);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.next();
        System.out.println(bsort(s));
    }

}