// CellPhone 클래스를 상속
public class DmbCellPhone extends CellPhone {
  // 필드 1개
  int channel;

  DmbCellPhone(String model, String color, int channel) {
//    super(); 생성자가 없으면 기본 생성자 타입으로 컴파일러가 자동으로 추가 -> super()도 자동으로 추가
    this.model = model;
    this.color = color;
    this.channel = channel;
  }

  // 메소드 3개
  void turnOnDmb() {
    System.out.println("채널 " + channel + "번 DMB 방송을 수신합니다.");
  }

  void turnOffDmb() {
    System.out.println("DMB 방송 수신을 종료합니다.");
  }

  void changeChannelDmb(int channel) {
    this.channel = channel;
    System.out.println("채널 " + channel + "번 방송으로 바꿉니다.");
  }

}
