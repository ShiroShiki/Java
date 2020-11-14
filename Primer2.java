import java.io.*;
import java.net.URL;

public class Primer2 {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
            try {
// С потоком связан файл
                InputStream inFile = new FileInputStream("C:\\Users\\shiro\\IdeaProjects\\lab_5\\MyFile1.txt");
                readAllByByte(inFile);
                System.out.print("\n\n\n");
                inFile.close();
                InputStream inUrl = new URL("http://google.com").openStream();
                readAllByByte(inUrl);
                System.out.print("\n\n\n");
                inUrl.close();
                InputStream inArray = new ByteArrayInputStream(new byte[]{7,9,3});
                readAllByByte(inArray);
                System.out.print("\n\n\n");
                inArray.close();

            } catch (IOException e) {
                System.out.println("Ошибка: " + e);
            }
        }
    }


