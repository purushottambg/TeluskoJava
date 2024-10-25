import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> colors = List.of("red","green","blue");
        Stream<String> stream = colors.stream();
        stream
            .filter(color -> color.length()<4)
            .sorted()
            .map(color -> color.length())
            .map(colorLen -> 2*colorLen)
            .forEach(color -> System.out.println(colors));
        
        //);
    }
}
