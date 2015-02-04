package learn;
import java.util.*;

public class LambdasLearning {
	private static String separator1 = "balaba";
	
	public static void main(String[] args) {
		Arrays.asList( "a", "b", "c" ).forEach( d -> System.out.println( d ) );
		String separator2 = "didadi";
		
		Arrays.asList( "a", "b", "c" ).forEach( e -> {
			    System.out.println( e + separator1);
			    System.out.println( e + separator2);
			} );
	}
}
