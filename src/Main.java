import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    private String readFromInputStream() throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(InputStream.nullInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }

        return resultStringBuilder.toString();
    }


}
