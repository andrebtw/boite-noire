package com.boitenoire.Model;

import java.math.BigDecimal;

public class PaymentData {
    private BigDecimal amount;

    private String currency;

    private String status;

    private String paymentMethod;

    public PaymentData() {
    }

    public PaymentData(BigDecimal amount, String currency, String status, String paymentMethod) {
        this.amount = amount;
        this.currency = currency;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
