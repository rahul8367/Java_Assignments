package LambdasAndStreams;

public class ConstructorReferences {
    class Movie {
        public Movie(int a){
            System.out.println(a);
        }
        public Movie(int a, int b){
            System.out.println(a+" and "+b);
        }
    }
    interface MovieStudio {
        public Movie create(int id);
    }
    MovieStudio m1= i->new Movie(i);
    MovieStudio m2= Movie::new;

    interface MovieStudio2 {
        public Movie create(int id,String s);
    }

    public static void main(String[] args) {
        ConstructorReferences obj1=new ConstructorReferences();
    }
}
