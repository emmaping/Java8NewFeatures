package learn;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterNames {
	public void testParameterNames(String parameters, String name, String easy){
		System.out.println("Did you get it");
	}
    public static void main(String[] cocoIsCute) throws Exception {
        Method method = ParameterNames.class.getMethod( "main", String[].class );
        for( final Parameter parameter: method.getParameters() ) {
            System.out.println( "Parameter: " + parameter.getName() );
        }
        
        ParameterNames p = new ParameterNames();
        Method method2 = p.getClass().getMethod("testParameterNames", String.class , String.class , String.class);
        for( final Parameter parameter: method2.getParameters() ) {
            System.out.println( "Parameter: " + parameter.getName() );
        }
    }
}