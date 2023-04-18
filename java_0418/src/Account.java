public class Account {
  private long balance;

  public Account() {

  }

  public long getBalance() {
    return balance;
  }

  public void deposit(int money) {
    balance += money;
  }

  public void withdraw(int money) throws BlifException {
    if (balance < money) {
      throw new BlifException("잔고 부족 : " + (money - balance) + " 모자람");
      // 예외 발생
      // Exception을 상속받은 BlifException 생성자 매개값으로 사용한 메시지 리턴

    }
    balance -= money;
  }
}
