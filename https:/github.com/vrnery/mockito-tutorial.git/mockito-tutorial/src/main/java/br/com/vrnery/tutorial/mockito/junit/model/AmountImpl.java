package br.com.vrnery.tutorial.mockito.junit.model;

import java.math.BigDecimal;

public class AmountImpl implements Amount {

	BigDecimal value;
    Currency currency;

    public AmountImpl(BigDecimal value, Currency currency) {
        super();
        this.value = value;
        this.currency = currency;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

}
