import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reducefunc {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 90, 50));

         Optional<Integer> sum = list.stream().reduce((a,b)-> a+b);
         System.out.println(sum);
    }
}
