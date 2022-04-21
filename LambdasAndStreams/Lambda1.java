package LambdasAndStreams;

public class Lambda1 {
    interface Doctor
    {
        public String addDr(String s);
    }
    public void testDoctor(String s, Doctor d)
    {
        System.out.println("Result : "+ d.addDr(s));
    }
    public static void main(String[] args)
    {
        /*input -> body
        (String s) -> "Dr."+s
         */
        new Lambda1().testDoctor("Mahesh",(String s)->"Dr."+s);

        new Lambda1().testDoctor("Mahesh",(String s)->s.toUpperCase());
    }
}
