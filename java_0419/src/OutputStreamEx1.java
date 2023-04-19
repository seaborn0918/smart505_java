import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx1 {
  public static void main(String[] args) throws Exception {
    // 출력 스트림의 취상위 클래스인 OutputStream 클래스 타입의 변수 os에 자식 클래스인 FileOutputStream 객체를 저장
    // 저장될 파일명을 매개변수로 사용함
    OutputStream os = new FileOutputStream("C:\\smart505\\outfile.txt");

    // OutputStream에 byte 타입의 배열로 데이터를 저장해야하기 때문에 문자열을 getBytes() 메소드를 사용하여 바이트 배열로 변경
    byte[] data = "ABC".getBytes();

    // byte[] 배열 크기만큼 데이터를 씀
    for (int i = 0; i < data.length; i++) {
      os.write(data[i]); // 파일에 데이터 쓰기
    }

    os.flush(); // 버퍼 비우기
    os.close(); // 파일 닫기
  }
}
