
public class CustomExceptionActivity8 {

	static class CustomException extends Exception{
		private String message;
		
		public CustomException(String message) {
			this.message=message;
		}
		
		@Override
		public String getMessage() {
			return message;
		}
	}
	
	public static void exceptionTest(String value) throws CustomException{
		if(value==null) {
			throw new CustomException("Custom Exception: Input string is null");
		}else {
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			exceptionTest("Will print to console");
			exceptionTest(null);
		}catch (CustomException e){
			System.out.println("Caught exception: "+e.getMessage());
		}

	}

}
