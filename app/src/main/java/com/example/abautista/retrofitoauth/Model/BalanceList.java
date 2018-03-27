package com.example.abautista.retrofitoauth.Model;

/**
 * Created by abautista on 3/23/2018.
 */

public class BalanceList {
   private float balance;
    private String key;
    private String name;
    private String message;


    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
