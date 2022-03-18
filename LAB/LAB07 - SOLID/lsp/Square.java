package lsp;
public class Square extends Rectangle {
    private int side; 
    Square(int side) {
        this.setSide(side);
    }
    public void setSide(int side) {
    	this.side = side; 
    }
    @Override 
    public int getArea(){ 
        return side * side;
    }
}