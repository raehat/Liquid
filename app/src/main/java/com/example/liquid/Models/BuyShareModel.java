package com.example.liquid.Models;

public class BuyShareModel {
    String corpName, companyName;
    int sharePrice, changeInPrice;

    public BuyShareModel(String corpName, String companyName, int sharePrice, int changeInPrice) {
        this.corpName = corpName;
        this.companyName = companyName;
        this.sharePrice = sharePrice;
        this.changeInPrice = changeInPrice;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getChangeInPrice() {
        return changeInPrice;
    }

    public void setChangeInPrice(int changeInPrice) {
        this.changeInPrice = changeInPrice;
    }
}
