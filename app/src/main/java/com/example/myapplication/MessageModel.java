package com.example.myapplication;



import java.util.Date;

public class MessageModel {
    private int pid;
    private String message;
    private int userid;
    private float xcoord;
    private float ycoord;
    private Date date;
    private int upvotes;
    private String emoji;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public float getXcoord() {
        return xcoord;
    }

    public void setXcoord(float xcoord) {
        this.xcoord = xcoord;
    }

    public float getYcoord() {
        return ycoord;
    }

    public void setYcoord(float ycoord) {
        this.ycoord = ycoord;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }
}
