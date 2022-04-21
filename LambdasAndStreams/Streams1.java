package LambdasAndStreams;
import java.util.stream.Stream;

public class Streams1 {
    private void testStreams1()
    {
        Stream<Integer> numbers= Stream.of(1,2,3,4,5,6,7,8,9);
        //System.out.println(numbers.count());
        numbers.forEach(System.out::println);
    }
    private void testStreams2()
    {
        String a[]={"Hello","Mahesh"};
        Stream<String> sentence=Stream.of(a);
        System.out.println("Count is "+sentence.count());
    }
    private void testStreams3()
    {
        //Infinite numbers generated
        Stream<Double> randomNumbers=Stream.generate(Math::random);
        randomNumbers.forEach(System.out::println);
    }
    private void testStreams4()
    {
        Stream<Integer> wholeNumbers= Stream.iterate(0,i->i+1);
        wholeNumbers.forEach(System.out::println);
    }
    public static void main(String[] args) {
        new Streams1().testStreams1();
        new Streams1().testStreams2();
        //new Streams1().testStreams3();//Infinite output
        //new Streams1().testStreams4();//Infinite output

    }
}
