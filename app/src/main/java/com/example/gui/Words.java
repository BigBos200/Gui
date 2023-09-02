package com.example.gui;

public class Words {
    private String leftText;
    private String rightText;


    public Words(String leftText, String rightText) {
        this.leftText = leftText;
        this.rightText = rightText;
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText;
    }

    public String getLeftText() {
        return leftText;
    }

    public void setLeftText(String leftText) {
        this.leftText = leftText;
    }
}
