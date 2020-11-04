package com.company.homework.hw07;

public class FractionNumber {

    private int top;
    private int bottom;

    public FractionNumber(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + top;
        result = prime * result + bottom;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FractionNumber h = (FractionNumber) obj;
        if (top != h.getTop())
            return false;
        if (bottom != h.getBottom())
            return false;
        return true;
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
