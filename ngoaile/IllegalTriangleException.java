package ngoaile;

public class IllegalTriangleException extends IllegalArgumentException  {

	@Override
	public String getMessage() {
		String message = "3 canh khong thoa man";
		return message;
	}
}
