package br.com.vrnery.tutorial.mockito.junit.model;

public class CollateralImpl implements Collateral {

	private long id;

    private String name;

    private CollateralType type;

    public CollateralImpl(long id, String name, CollateralType type) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
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

    public CollateralType getType() {
        return type;
    }

    public void setType(CollateralType type) {
        this.type = type;
    }

}
