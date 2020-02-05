package br.com.codenation;

import br.com.codenation.paymentmethods.PaymentMethod;

public class Main {

    public static void main ( String[] args) {

        BillingProcessor billingProcessor = new BillingProcessor();
        System.out.println(billingProcessor.calculate(new Order(100.0, PaymentMethod.DEBIT_CARD)));
    }
}
