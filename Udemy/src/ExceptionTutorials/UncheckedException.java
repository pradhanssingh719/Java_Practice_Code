package ExceptionTutorials;

public class UncheckedException {

	public static void main(String[] args){
		
		int a = 10, b = 0;
		try {
			int res = a/b;
		}catch(ArithmeticException excp) {
			System.out.println("ArithmeticException...You can not devide an interger value by 0!!!");
		}catch(NullPointerException excp) {
			System.out.println("NullPointerException...You can not devide an interger value by 0!!!");
		}catch(ArrayIndexOutOfBoundsException excp) {
			System.out.println("ArrayIndexOutOfBoundsException...You can not devide an interger value by 0!!!");
		}catch(NoClassDefFoundError excp) {
			System.out.println("You can not devide an interger value by 0!!!");
		}catch(Exception excp) {
			//System.out.println(excp.getMessage());
			//System.out.println(excp.getCause());
			System.out.println("If exception is not handled by previous" +
										"catch then only I will be execute");
		}
		
		
		
	}

}
