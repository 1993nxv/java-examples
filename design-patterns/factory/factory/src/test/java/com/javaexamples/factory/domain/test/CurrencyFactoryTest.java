package com.javaexamples.factory.domain.test;


import com.javaexamples.factory.domain.Country;
import com.javaexamples.factory.domain.Currency;
import com.javaexamples.factory.domain.CurrencyFactory;

public class CurrencyFactoryTest {

    public static void main(String[] args) {
        Currency currency =  CurrencyFactory.newCurrency(Country.USA);
        System.out.println(currency.getSymbol());
    }
}
