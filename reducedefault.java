import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class reducedefault {
    public static void main(String[] args) {
                 ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 90, 50));

        int  sum = list.stream().reduce(10,(a,b)-> a+b);
         System.out.println(sum);
    }
}
