package com.company.homework.hw07;

public class FractionNumber {

    private int top;
    private int bottom;

    public FractionNumber(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public FractionNumber plus(FractionNumber h){
        int top2 = h.getTop();
        int bottom2 = h.getBottom();
        FractionNumber d = new FractionNumber(this.top*bottom2+top2*this.bottom, this.bottom*bottom2);
        return d;
    }

    public FractionNumber minus(FractionNumber h){
        int top2 = h.getTop();
        int bottom2 = h.getBottom();
        return new FractionNumber(this.top*bottom2-top2*this.bottom, this.bottom*bottom2);
    }
    public FractionNumber multiply(FractionNumber h){
        int top2 = h.getTop();
        int bottom2 = h.getBottom();
        return new FractionNumber(this.top*top2, this.bottom*bottom2);
    }

    public FractionNumber divide(FractionNumber h){
        int top2 = h.getTop();
        int bottom2 = h.getBottom();
        return new FractionNumber(this.top*bottom2, this.bottom*top2);
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }
}
