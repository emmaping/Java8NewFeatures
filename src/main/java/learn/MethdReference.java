package learn;

public class MethdReference {

	public static void main(String[] args) {
		// Lambda
		MethodReferenceInterface<String, Integer> convertByLambda = (e)->Integer.valueOf(e);
		Integer integer = convertByLambda.convert("123");
		System.out.println(integer + " converted by lambda");
		
		// Method Reference
		MethodReferenceInterface<String, Integer> converterByMethodReference = Integer::valueOf;
		Integer converted = convertByLambda.convert("123");
		System.out.println(converted + " converted by method reference"); 

	}

}
