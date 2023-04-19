import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx3 {
  public static void main(String[] args) throws Exception{
    InputStream is = new FileInputStream("C:\\smart505\\tokentest.txt");
    int readData;
    byte[] readByte = new byte[8];
    readData = is.read(readByte, 2, 3);

    for (int i = 0; i < readByte.length; i++) {
      System.out.println(readByte[i] + " : " + (char) readByte[i]);
    }

  }
}
