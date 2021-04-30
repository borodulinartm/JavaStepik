import java.io.*;

public class ConvertSymbols {
    private static void convert(InputStream inputStream,OutputStream outputStream) throws IOException {
        int buf1 = inputStream.read();
        int buf2 = 0;

        while(buf1 != -1){
            buf2 = inputStream.read();
            if (!(buf2 == 10 && buf1 == 13)){
                outputStream.write(buf1);
            }
            buf1 = buf2;
        }
        outputStream.flush();
    }

    public static void main(String[] args) throws IOException {
        convert(System.in,System.out);
    }
}