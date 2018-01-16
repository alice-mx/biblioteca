package com.twu.biblioteca;

public class Item {
    protected String title;
    protected String year;
    protected User checkedOutTo;


    public String getTitle() {
        return this.title;
    }

    public String getYear() {
        return this.year;
    }

    public boolean getCheckedOut() {
        return this.checkedOutTo !=null;
    }


    public boolean checkOut(User user) {
        if(checkedOutTo != null) {
            return false;
        } else {
            checkedOutTo = user;
            return true;
        }
    }

    public boolean checkIn() {
        if(checkedOutTo == null) {
            return false;
        } else {
            checkedOutTo = null;
            return true;
        }
    }
}
