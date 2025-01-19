package org.example.designPrinciple.OCP;

public class Invoice {
    private double amount;
    private InvoiceGenerator invoiceGenerator;

    public Invoice(double amount, InternationalInvoice internationalInvoice) {
        this.amount = amount;
        this.invoiceGenerator = internationalInvoice;
    }

    public void generateInvoice(){
        invoiceGenerator.generateInvoice(amount);
    }

    public void applyDiscount(){
        System.out.println("applying discount");
    }
}
