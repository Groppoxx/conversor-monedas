package main.java.com.currency_converter.model;

public class ExchangeRate {
    private Currency baseCurrency;
    private Currency targetCurrency;
    private double rate;
    private String lastUpdated;
    private String nextUpdate;

    public ExchangeRate(Currency baseCurrency,
                        Currency targetCurrency,
                        double rate,
                        String lastUpdated,
                        String nextUpdate) {
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.rate = rate;
        this.lastUpdated = lastUpdated;
        this.nextUpdate = nextUpdate;
    }

    public Currency getBaseCurrency() {
        return baseCurrency;
    }

    public Currency getTargetCurrency() {
        return targetCurrency;
    }

    public double getRate() {
        return rate;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public String getNextUpdate() {
        return nextUpdate;
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "baseCurrency=" + baseCurrency +
                ", targetCurrency=" + targetCurrency +
                ", rate=" + rate +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", nextUpdate='" + nextUpdate + '\'' +
                '}';
    }
}
