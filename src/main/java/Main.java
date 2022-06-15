import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GsonParser gsonParser = new GsonParser();
        System.out.println(gsonParser.readUrl2().toString());
    }
}
