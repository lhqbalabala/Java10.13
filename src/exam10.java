
import com.sun.beans.editors.DoubleEditor;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

import java.util.*;

public class exam10 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list");
        int size1=input.nextInt();
        int list1[]=new int[size1];
        int list2[]=new int[size1];
        int list3[]=new int[size1];
        for(int i=0;i<size1;i++){
            list1[i]=input.nextInt();
        }
        int l1=0,l2=0;
        for(int i=1;i<size1;i++){
            if(list1[i]<list1[0]){
                list2[l1++]=list1[i];
            }
            else{
                list3[l2++]=list1[i];
            }
        }
        System.out.print("After the partition, the list is ");

        for(int i=0;i<l1;i++){
            System.out.print(list2[i]+" ");
        }
        System.out.print(list1[0]+" ");
        for(int i=0;i<l2;i++){
            System.out.print(list3[i]+" ");
        }




    }
}