package com.example.abautista.retrofitoauth.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by abautista on 3/26/2018.
 */

public class ModelOauth {
   @SerializedName("access_token")
   private String accessToken;
   @SerializedName("token_type")
   private String tokenType;
   @SerializedName("expires_in")
    private String expiresIn;
   @SerializedName("refresh_token")
    private String refreshToken;
   @SerializedName("as:client_id")
    private  String clientId;
    private  String username;
    @SerializedName("countryCode")
    private  String country_code;
    @SerializedName(".issued")
    private  String issued;
    @SerializedName(".expires")
    private  String expires;
    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getIssued() {
        return issued;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }
}
