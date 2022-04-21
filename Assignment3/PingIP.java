package Assignment3;

import java.io.IOException;
import java.net.InetAddress;

public class PingIP {
    public static void main(String[] args) throws IOException {
        int timeOut = 3000;
        long[] time = new long[5];
        Boolean reachable;
        long medianTime=0;
        for(int i = 0; i < 5; i++)
        {
            long BeforeTime = System.currentTimeMillis();
            reachable = InetAddress.getLocalHost().isReachable(timeOut);
            long AfterTime = System.currentTimeMillis();
            long TimeDifference = AfterTime - BeforeTime;
            time[i] = TimeDifference;

        }
        for(long resTime: time) {
            System.out.println(resTime);
            medianTime+=resTime;
        }
        medianTime/=5;
        System.out.println("THE MEDIAN TIME TO PING IS:" +medianTime );
    }
}


