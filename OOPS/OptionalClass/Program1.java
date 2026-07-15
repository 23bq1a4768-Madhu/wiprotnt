package OptionalClass;
import java.util.Optional;
public class Program1 {
	public static void main(String[] args) {

        String names[] = new String[5];

        Optional<String> optionalName = Optional.ofNullable(names[0]);

        if (optionalName.isPresent()) {
            System.out.println(optionalName.get().length());
        } else {
            System.out.println("Name is null");
        }
    }
}
