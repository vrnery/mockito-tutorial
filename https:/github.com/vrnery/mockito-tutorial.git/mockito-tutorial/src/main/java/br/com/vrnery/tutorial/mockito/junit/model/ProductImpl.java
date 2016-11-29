package br.com.vrnery.tutorial.mockito.junit.model;

public class ProductImpl implements Product {

	private long id;

    private String name;

    private ProductType type;

    private Amount amount;

    public ProductImpl(long id, String name, ProductType type, Amount amount) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

}
