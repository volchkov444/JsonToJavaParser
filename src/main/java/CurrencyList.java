import com.google.gson.annotations.SerializedName;
import org.apache.commons.math3.util.Precision;

import java.util.HashMap;


public class CurrencyList {
    @SerializedName("Date")
    private String date;
    @SerializedName("PreviousDate")
    private String previousDate;
    @SerializedName("PreviousURL")
    private String previousURL;
    @SerializedName("Timestamp")
    private String timestamp;
    @SerializedName("Valute")
    private HashMap<String, Currency> valute;

    public HashMap<String, Currency> setCourse(HashMap<String, Currency> valute) {
        valute.forEach((key, value) -> value.setValue(Precision.round(value.getValue() / value.getNominal(), 3)));
        return valute;
    }

    @Override
    public String toString() {
        return setCourse(valute).toString() + "   " + date;
    }
}
