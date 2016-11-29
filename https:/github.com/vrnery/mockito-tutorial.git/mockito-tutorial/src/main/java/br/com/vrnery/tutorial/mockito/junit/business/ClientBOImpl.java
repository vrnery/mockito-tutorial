package br.com.vrnery.tutorial.mockito.junit.business;

import java.math.BigDecimal;
import java.util.List;

import br.com.vrnery.tutorial.mockito.junit.business.exception.DifferentCurrenciesException;
import br.com.vrnery.tutorial.mockito.junit.model.Amount;
import br.com.vrnery.tutorial.mockito.junit.model.AmountImpl;
import br.com.vrnery.tutorial.mockito.junit.model.Currency;
import br.com.vrnery.tutorial.mockito.junit.model.Product;

public class ClientBOImpl implements ClientBO {

	public Amount getClientProductsSum(List<Product> products) throws DifferentCurrenciesException {

        if (products.size() == 0)
            return new AmountImpl(BigDecimal.ZERO, Currency.EURO);

        if (!isCurrencySameForAllProducts(products)) {
            throw new DifferentCurrenciesException();
        }

        BigDecimal productSum = calculateProductSum(products);

        Currency firstProductCurrency = products.get(0).getAmount()
                .getCurrency();

        return new AmountImpl(productSum, firstProductCurrency);
    }

    private BigDecimal calculateProductSum(List<Product> products) {
        BigDecimal sum = BigDecimal.ZERO;
        // Calculate Sum of Products
        for (Product product : products) {
            sum = sum.add(product.getAmount().getValue());
        }
        return sum;
    }

    private boolean isCurrencySameForAllProducts(List<Product> products) throws DifferentCurrenciesException {

        Currency firstProductCurrency = products.get(0).getAmount().getCurrency();

        for (Product product : products) {
            boolean currencySameAsFirstProduct = product.getAmount().getCurrency().equals(firstProductCurrency);
            if (!currencySameAsFirstProduct) {
                return false;
            }
        }

        return true;
    }

}
