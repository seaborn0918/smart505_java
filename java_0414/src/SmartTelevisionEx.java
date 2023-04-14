public class SmartTelevisionEx {
  public static void main(String[] args) {
    // 인터페이스 RemoteControl, Searchable 를 다중 상속 받은 클래스 SmartTelevision 타입의 변수 stv
    SmartTelevision stv = new SmartTelevision();

    // 인터페이스 RemoteControl, Searchable 멤버를 모두 사용할 수 있음
    stv.turnOn();
    stv.setVolume(50);
    stv.setVolume(5);
    stv.setMute(true);
    stv.setMute(false);
    stv.search("동글이");
    stv.turnOff();

    RemoteControl i_rc = null;
    Searchable i_search = null;

    i_rc = stv;
    i_rc.turnOn();
    i_rc.setVolume(-100);
    i_rc.setMute(true);
    // i_rc는 RemoteControl 인터페이스 타입의 변수이므로 인터페이스 RemoteControl의 멤버만 사용할 수 있음
    // i_rc.search("동글이"); // 오류 발생
    i_rc.turnOff();

    i_search = stv;
    i_search.search("동글이");
    // i_search는 Searchable 인터페이스 타입의 변수이므로 인터페이스 Searchable의 멤버만 사용할 수 있음
    // i_search.turnOn(); // 오류 발생
    // i_search.turnOff(); // 오류 발생
  }
}
