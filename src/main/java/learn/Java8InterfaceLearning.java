package learn;

public class Java8InterfaceLearning {

	public static void main(String[] args) {
		Java8Interface i = new Java8Interface() {			
			@Override
			public void method() {
				System.out.println("I'm an implementation of interface");	
			}
			
			@Override
			public void defaultMethod(){
				System.out.println("I overrided the defaultMethod");	
			}
		};
		i.defaultMethod();
		i.method();
		Java8Interface.methodStatic();
		
		Java8Interface r = ()-> System.out.println("I came from Lambda method");
		r.method();
	}
}
