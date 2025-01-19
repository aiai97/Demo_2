package org.example.designPrinciple.OCP;

public class InternationalInvoice implements InvoiceGenerator{
    @Override
    public void generateInvoice(double amount) {
        System.out.println("international invoice");
    }
}
