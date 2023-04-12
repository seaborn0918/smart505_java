// CellPhone 클래스를 상속
public class DmbCellPhone extends CellPhone {
  // 필드 1개
  int channel;

  DmbCellPhone(String model, String color, int channel) {
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
