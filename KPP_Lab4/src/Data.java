import java.io.*;

public class Data {
    private final String fileName = "src\\Data.txt";
    private String strings = "";
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void writeString() throws IOException {
        System.out.print("Input string: ");
        String string = bufferedReader.readLine();

        FileWorker.update(fileName, string);
    }

    public String getStrings() throws FileNotFoundException {
        strings = FileWorker.read(fileName);

        return strings;
    }
}
