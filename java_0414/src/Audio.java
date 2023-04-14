public class Audio implements RemoteControl{
  public int volume;

  @Override
  public void turnOn() {
    System.out.println("Audio 전원을 켭니다");
  }

  @Override
  public void turnOff() {
    System.out.println("Audio 전원을 끕니다");
  }

  @Override
  public void setVolume(int volume) {
    // 사용자 입력 볼륨의 최대값, 최소값 강제 설정
    if (volume > RemoteControl.MAX_VOLUME) {
      this.volume = RemoteControl.MAX_VOLUME;
    } else if (volume < RemoteControl.MIN_VOLUME) {
      this.volume = RemoteControl.MIN_VOLUME;
    } else {
      this.volume = volume;
    }
    System.out.println("Audio 현재 볼륨 : " + this.volume);
  }
}
