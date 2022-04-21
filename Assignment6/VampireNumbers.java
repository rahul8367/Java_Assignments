package Assignment6;
import java.util.*;

public class VampireNumbers {
    public static boolean areFangs(int a, int b, int num )
    {
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String s3 = Integer.toString(num);
        if((s1.length()!=s2.length()) || (s1.endsWith("0") && s2.endsWith("0")))
            return false;
        String s = s1+s2;

        char array1[] = s.toCharArray();
        Arrays.sort(array1);
        String s4 = Arrays.toString(array1);

        char array2[] = s3.toCharArray();
        Arrays.sort(array2);
        String s5 = Arrays.toString(array2);

        return s4.equals(s5);
    }
    public static boolean isVampire(int num)
    {
        int a,b ;
        if(Integer.toString(num).length()%2!=0)
            return false;
        for(int k=1;k*k<=num;k++)
        {
            if(num%k==0)
            {
                a = k;
                b = num / a;
                if(areFangs(a,b,num))
                    return true;
            }
        }
        return false;

    }
    public static void main(String args[])
    {
        ArrayList<Integer> vampires = new ArrayList<>();
        for(int num=10; vampires.size()<100;num++)
        {
            if(isVampire(num))
                vampires.add(num);
        }
        for(int x : vampires)
            System.out.println(x);
    }
}