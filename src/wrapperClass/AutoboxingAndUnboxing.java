package wrapperClass;

public class AutoboxingAndUnboxing {
	
	public static void main(String[] args) {
		
		//Autoboxing
		
		int i = 145;
		System.out.println("value of primitive int i: "+i);
		Integer intobj = i;
		System.out.println("value of intobj: "+intobj);
		
		
		//Unboxing
		
		Long l = 123L;
		System.out.println("value of l: "+ l);
		
		long longVar = l;
		System.out.println("Value of longVar: "+longVar);
		
		
		
		
	}

}
