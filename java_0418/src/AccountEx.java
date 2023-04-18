public class AccountEx {
  public static void main(String[] args) {
    Account account = new Account();

    account.deposit(10000);
    System.out.println("예금액 : " + account.getBalance());

    try {
      account.withdraw(30000); // 예외 떠넘기기가 포함된 메소드 호출
    } catch (BlifException e) { // 사용자 정의 예외 처리
      String message = e.getMessage(); // getMessage()는 상속받은 메소드
      System.out.println(message);
      System.out.println();
      e.printStackTrace();
    }


  }
}
