package com.twu.biblioteca;

public class Item {
    protected String title;
    protected String year;
    protected boolean checkedOut;


    public String getTitle() {
        return this.title;
    }

    public String getYear() {
        return this.year;
    }

    public boolean getCheckedOut() {
        return this.checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public boolean checkOut() {
        if(checkedOut) {
            return false;
        } else {
            checkedOut = true;
            return true;
        }
    }

    public boolean checkIn() {
        if(!checkedOut) {
            return false;
        } else {
            checkedOut = false;
            return true;
        }
    }
}
