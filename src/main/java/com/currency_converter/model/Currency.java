package main.java.com.currency_converter.model;

public class Currency {
    private String code;

    public Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Currency{code='" + code + "'}";
    }
}
