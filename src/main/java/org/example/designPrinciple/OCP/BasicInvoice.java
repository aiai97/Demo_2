package org.example.designPrinciple.OCP;

public class BasicInvoice implements InvoiceGenerator{
    @Override
    public void generateInvoice(double amount) {
        System.out.println("basic invoice");
    }
}
