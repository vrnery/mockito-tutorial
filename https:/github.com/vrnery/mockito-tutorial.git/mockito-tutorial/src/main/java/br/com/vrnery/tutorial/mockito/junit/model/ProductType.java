package br.com.vrnery.tutorial.mockito.junit.model;

public enum ProductType {

	LOAN("LN"), KREDIT("KRD"), BANK_GUARANTEE("BG");

    private final String textValue;

    ProductType(final String textValue) {
        this.textValue = textValue;
    }

    @Override
    public String toString() {
        return textValue;
    }

}
