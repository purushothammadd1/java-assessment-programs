package exceptionhandling;

public class Example {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		int a=12567845;
		int b=12567845;
		Example exc =new Example();
		exc.CheckClass();
		try{
			exc.CheckClass();
		}catch(Exception ex) {
			System.err.println("Error:classNotFoundException.");
		}
//		int c=exc.function(a, b);
//		System.out.println(c);
	}
//	
	public void CheckClass() throws ClassNotFoundException{
		try{
			
		}catch(Exception ex) {
			System.err.println("Error:The class example is Not Found.");
		}
	}
	public int function(int p,int q) {
		return division(addition(p,q), 0)/(subtraction(p,q));
	}
	
	public int addition(int x,int y) {
		return x+y;
	}
	public int subtraction(int x,int y) {
		return x-y;
	}
	public int division(int x,int y) {
		int res=0;
		try {
		 res=x/y;
		}catch(Exception ex) {
			System.err.println("Error:division by zero");
			ex.printStackTrace();
		}
		return res;
	}

}
/*handling an exception
 * two keywords:try, catch
 * one try and one catch
   //or one try and one or more catch blocks
  or two keyword:try-finally
  or three keyword:
   
 * syntax for try catch:
 * try{
    any code that rasies an exception
 *  } catch(Exception class ,Variable name){
    code that has to be executed 
    If try block detects any exception
 *  }
 *  finally {
  	finally block gets executed
 	whether there is any exception or not 
 	finaly block usually used to close connections that are created before this block
 	}
 
 * 	
 * */