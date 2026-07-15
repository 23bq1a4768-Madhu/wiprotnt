package OptionalClass;
import java.util.Optional;
public class Program3 {
	 public static void main(String[] args) {

		 Employee emp = null;

	        try {
	            Employee employee = Optional.ofNullable(emp)
	                    .orElseThrow(() ->
	                            new InvalidEmployeeException("Employee object is null"));

	            employee.display();

	        } catch (InvalidEmployeeException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
}
