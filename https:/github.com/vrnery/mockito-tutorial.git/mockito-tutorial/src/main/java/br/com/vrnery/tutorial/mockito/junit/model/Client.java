package br.com.vrnery.tutorial.mockito.junit.model;

import java.math.BigDecimal;
import java.util.List;

public interface Client {

	long getId();

    String getName();

    Enum<?> getType();

    List<Collateral> getCollaterals();

    List<Product> getProducts();

    void setProductAmount(BigDecimal productAmount);

    BigDecimal getProductAmount();

}
