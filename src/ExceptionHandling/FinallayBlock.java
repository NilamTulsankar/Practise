package ExceptionHandling;

public class FinallayBlock 
{
	public static void main(String[] args) 
	{
		System.out.println("Progeram is started");
		
		// finally block condition
		//1.exception will not occur and finally block will execute
		int a=100;
		int b= 10;
//		try {
//			System.out.println(a/b);
//			System.out.println("try block");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally 
//		{
//			System.out.println("close database");
//		}
		
		//2. exception will occur but not handled
//		try {
//			System.out.println(a/0);
//		}catch(Exception e){
//			e.printStackTrace();
//			System.out.println("catch block not handling exception");
//		}finally 
//		{
//		System.out.println("close database");
//		}
		
		//3. exception occurred and handled properly
		try {
			System.out.println(a/0);
		}catch(Exception e){
			System.out.println(a/b);
			e.printStackTrace();
			System.out.println("catch block handling exception");
		}finally 
		{
		System.out.println("close database");
		}
		
		
		System.out.println("program is ended");
		
		
	}

}
