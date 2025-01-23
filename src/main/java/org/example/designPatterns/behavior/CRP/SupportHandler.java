package org.example.designPatterns.behavior.CRP;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(QueryType queryType,String message);
}



class TechnicalSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(QueryType queryType, String message) {
        if (queryType == QueryType.TECHNICAL) {
            System.out.println("Technical Support: Handling query - " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(queryType, message);
        }
    }

}

class BillingSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(QueryType queryType, String message) {
        if (queryType == QueryType.BILLING) {
            System.out.println("Billing Support: Handling query - " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(queryType, message);
        }
    }
}

class GeneralSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(QueryType queryType, String message) {
        if (queryType == QueryType.GENERAL) {
            System.out.println("General Support: Handling query - " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(queryType, message);
        }
    }
}