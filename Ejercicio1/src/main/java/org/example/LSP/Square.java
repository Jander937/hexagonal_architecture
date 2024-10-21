package org.example.LSP;

public class Square implements Shape{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setHeight(int height) {
       this.side = side;
    }

    public int getSide(){
        return side;
    }

    @Override
    public int computeArea() {
        return 0;
    }
}
