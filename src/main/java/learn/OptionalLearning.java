package learn;

import java.util.Optional;

public class OptionalLearning {

	public static void main(String[] args) {
		Optional< String > optional = Optional.ofNullable( null );
		System.out.println( "Optional is set? " + optional.isPresent() );        
		System.out.println( "Optional: " + optional.orElseGet( () -> "[none]" ) ); 
		optional = Optional.of("Learner");
		System.out.println( "Optional is set? " + optional.isPresent() );  
		System.out.println( optional.map( s -> "Hey " + s + "!" ).orElse( "Hey Novice!" ) );

	}

}
