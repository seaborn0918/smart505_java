package pack2;
// 다른 패키지에 있는 클래스 E를 import로 가져옴
import pack1.E;

public class G {
  // E(boolean) 생성자는 접근 제한자를 public으로 설정하여 접근에 제한이 없음
  E e1 = new E(true);
  // E(int) 생성자는 접근 제한자가 default 이기 때문에 다른 패키지에서 접근 불가능함
  // E e2 = new E(1);
  // E(String) 생성자는 접근 제한자가 private 이기 때문에 외부에서 해당 생성자에 접근할 수 없음. 객체 생성이 불가능함
  // E e3 = new E("문자열");
}
