package com.geekster.urlhitcounter.Model;

public class UrlHitResponse {

    private String userName;
    private long hitCount;


    public UrlHitResponse(String userName, long hitCount) {
        this.userName = userName;
        this.hitCount = hitCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getHitCount() {
        return hitCount;
    }

    public void setHitCount(long hitCount) {
        this.hitCount = hitCount;
    }
}
