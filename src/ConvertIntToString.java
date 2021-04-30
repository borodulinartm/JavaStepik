import java.io.*;
import java.nio.charset.Charset;

public class ConvertIntToString {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String returnValue;
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter writer = new StringWriter();

        int currentByte = 0;
        while ((currentByte = reader.read()) != -1) {
            writer.write(currentByte);
        }

        returnValue = writer.toString();

        return returnValue;
    }

    public static void main(String[] args) {
    }
}
