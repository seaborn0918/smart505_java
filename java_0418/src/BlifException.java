// 사용자 정의 예외
// Exception extends Throwable
// Throwable 안에 getMessage() 메소드

public class BlifException extends Exception{
  public BlifException() {
  }

  public BlifException(String message) {
    super(message);
  }
}
