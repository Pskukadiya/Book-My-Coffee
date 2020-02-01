package com.example.bookmycoffee;

public class Model {
    String title,dec;
    int image;

    public Model(String title, String dec, int image) {
        this.title = title;
        this.dec = dec;
        this.image = image;

    }

    public String getTitle() {
        return title;
    }

    /*public void setTitle(String title) {
        this.title = title;
    }*/

    public String getDec() {
        return dec;
    }

   /* public void setDec(String dec) {
        this.dec = dec;
    }*/

    public int getImage() { return image;}

   // public void setImage(int image) { this.image = image;}
}
