import java.util.*;

public class TimeDiffBetweenArraylistndLL {
    public static void main(String[] args) {
        List<Integer> ll=new LinkedList<>();
        List<Integer> Al=new ArrayList<>();
        getTimediff(ll);
        getTimediff(Al);
    }
    public static void getTimediff(List<Integer> list) {
        long start=System.currentTimeMillis();
        for (int i = 0; i <100000; i++) {
            list.add(0,i);
        }
        long end=System.currentTimeMillis();
        System.out.println(list.getClass().getName()+"-->"+(end-start));

    }
    
}
