import com.google.gson.annotations.SerializedName;

public class Currency {
    @SerializedName("ID")
    private String id;
    @SerializedName("NumCode")
    private String numCode;
    @SerializedName("CharCode")
    private String charCode;
    @SerializedName("Nominal")
    private int nominal;
    @SerializedName("Name")
    private String name;
    @SerializedName("Value")
    private double value;
    @SerializedName("Previous")
    private double previous;

    public double getPrevious() {
        return previous;
    }


    public void setPrevious(double previous) {
        this.previous = previous;
    }

    public String getNumCode() {
        return numCode;
    }

    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
                "Имя: " + name + "  " +
                "Курс:" + value +
                "}\n";
    }

}