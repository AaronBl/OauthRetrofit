package com.example.abautista.retrofitoauth.Model;

import java.util.List;

/**
 * Created by abautista on 3/23/2018.
 */

public class Model {
    private String name;
    private String email;
    private Level level;
    private List<Transactions> transactions;
    List<BalanceList> listBalance;
    private String message;
    private  int status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    public List<BalanceList> getListBalance() {
        return listBalance;
    }

    public void setListBalance(List<BalanceList> listBalance) {
        this.listBalance = listBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
