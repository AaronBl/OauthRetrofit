package com.example.abautista.retrofitoauth.Model;

import com.google.gson.annotations.SerializedName;



public class ModelLoyalty {
    @SerializedName("card_number")
    private String cardNumber;
    @SerializedName("country_code")
    private String countryCode;
    @SerializedName("transaction_include")
    private Boolean transactionInclude;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Boolean getTransactionInclude() {
        return transactionInclude;
    }

    public void setTransactionInclude(Boolean transactionInclude) {
        this.transactionInclude = transactionInclude;
    }
}
