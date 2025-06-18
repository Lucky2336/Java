import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class apievenq {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> output = list.stream()
            .filter(n -> n % 2 == 0)    
            .map(n -> n * n)         
            .collect(Collectors.toList());

            System.out.println(output);

    }
}
