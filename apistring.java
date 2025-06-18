import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class apistring {
        public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Om", "Sita");

        List<String> result = names.stream()
            .filter(string -> string.length() > 3)   
            .map(String::toUpperCase)           
            .collect(Collectors.toList());

        System.out.println(result); 
    }
}
