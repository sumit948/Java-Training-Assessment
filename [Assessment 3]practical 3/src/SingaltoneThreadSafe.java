
public class SingaltoneThreadSafe {
	//private instance , so that it can access by getMethod() only
	private static SingaltoneThreadSafe st;
	
	private SingaltoneThreadSafe() {
		//private constructor
	}
	
	synchronized public static SingaltoneThreadSafe getMethod() { //this is synchronized method 
		if(st==null) {
			//if st null, initiialize
			st = new SingaltoneThreadSafe(); //so,this will also get synchronized, so minimum num thread will wait till run
		}
		return st;
	}
	public static void main(String[] args) {
		SingaltoneThreadSafe s1 = new SingaltoneThreadSafe();
		System.out.println(s1.getMethod());
	}

}
