package learn;
import java.util.*;

public class TypeInference {

	public static void main(String[] args) {
		// fail in Java 7
		List<String> list = new ArrayList<>();
		list.add("A");// addAll requires Collection<? extends String>
		list.addAll(new ArrayList<>());

	}

}
