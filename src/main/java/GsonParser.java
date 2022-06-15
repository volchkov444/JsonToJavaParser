import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class GsonParser {
    CurrencyList readUrl2() throws IOException {
        URL url = new URL("https://www.cbr-xml-daily.ru/daily_json.js");
        URLConnection con = url.openConnection();
        InputStream in = con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        byte[] bytes = in.readAllBytes();
        String str = new String(bytes, StandardCharsets.UTF_8);
        Gson gson = new Gson();
        CurrencyList currencyList = gson.fromJson(str, CurrencyList.class);
        return currencyList;
    }
}
