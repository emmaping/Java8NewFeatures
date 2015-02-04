package learn;
@FunctionalInterface
public interface Java8Interface {
	void method();
	default void defaultMethod(){
		System.out.println( "Hello, I came from an interface default method");
	}
	static void methodStatic(){
		System.out.println( "Hello, I came from an interface static method");
	}
}
