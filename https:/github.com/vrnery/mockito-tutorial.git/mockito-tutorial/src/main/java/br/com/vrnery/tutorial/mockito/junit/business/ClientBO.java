package br.com.vrnery.tutorial.mockito.junit.business;

import java.util.List;

import br.com.vrnery.tutorial.mockito.junit.business.exception.DifferentCurrenciesException;
import br.com.vrnery.tutorial.mockito.junit.model.Amount;
import br.com.vrnery.tutorial.mockito.junit.model.Product;

public interface ClientBO {
	
	Amount getClientProductsSum(List<Product> products) throws DifferentCurrenciesException;

}
