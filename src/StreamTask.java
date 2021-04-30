import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamTask {
    public static InputStream getStream(byte [] data)  {
        return new ByteArrayInputStream(data);
    }

    public static int getResult(InputStream inputStream) throws IOException {
        int result = 0;
        int n = inputStream.read();

        while(n > -1) {
            result = Integer.rotateLeft(result, 1) ^ n;
            n = inputStream.read();
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        InputStream stream;
        int result;
        stream = getStream( new byte[] { 0x33, 0x45, 0x01});

        result = getResult(stream);
        System.out.print(result);
    }
}
