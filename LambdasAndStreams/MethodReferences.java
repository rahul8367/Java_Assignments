package LambdasAndStreams;

interface Movie {
    public boolean isGood(int id);
}

public class MethodReferences {
    public void testMovieStaticMethodRef()
    {
        Movie m1=(i)->i<100?true:false;
        Movie m2=MethodReferences::isClassic;
    }
    private void testMovieInstanceMethodRef()
    {
        MethodReferences obj=new MethodReferences();
        Movie m3=obj::isRetro;
    }
    public static boolean isClassic(int movieId)
    {
        return true;
    }
    public boolean isRetro(int movieId)
    {
        return true;
    }
    public static void main(String[] args) {
        MethodReferences client=new MethodReferences();
    }
}