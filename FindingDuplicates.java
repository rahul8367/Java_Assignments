import java.util.*;
public class FindingDuplicates {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the elements of list ");
        for(int i=0;i<10;i++)
        list.add(keyboard.nextInt());
        System.out.print(list);
        Map<Integer, Integer> dict = new Hashtable<Integer, Integer>();
        for(int temp: list){
            if(dict.get(temp)==null)
                dict.put(temp,1);
            else
                dict.put(temp,dict.get(temp)+1);
        }
        System.out.println(dict);
        System.out.print("duplicate values are:   ");
        for(int i: dict.keySet()){
            if(dict.get(i)>1)
                System.out.print(i+"   ");
        }
        }
}
