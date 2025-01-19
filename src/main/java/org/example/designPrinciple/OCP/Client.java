package org.example.designPrinciple.OCP;

public class Client {
    public static void main(String[] args) {
        InternationalInvoice internationalInvoice = new InternationalInvoice();
        Invoice invoice = new Invoice(500,internationalInvoice);
        invoice.generateInvoice();
        invoice.applyDiscount();
    }
}
