package com.example.abautista.retrofitoauth.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by abautista on 3/23/2018.
 */

public class Level {
    @SerializedName("next_level")
    private String nextLevel;
    @SerializedName("advance_percent")
    private String advancePercent;
    private String key;
    private String name;
    private String message;

    public String getNextLevel() {
        return nextLevel;
    }

    public void setNextLevel(String nextLevel) {
        this.nextLevel = nextLevel;
    }

    public String getAdvancePercent() {
        return advancePercent;
    }

    public void setAdvancePercent(String advancePercent) {
        this.advancePercent = advancePercent;
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
