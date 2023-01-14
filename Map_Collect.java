import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Collect{
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = l1.stream().map(x->x*x).collect(Collectors.toList());
        for(Integer i : l2) System.out.println(i);
    }
}