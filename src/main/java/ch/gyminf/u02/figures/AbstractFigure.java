package ch.gyminf.u02.figures;

public abstract class AbstractFigure implements Figure {

    private int x, y;

    public AbstractFigure (int x, int y){
        this.x=x;
        this.y =y;

    }

    @Override
    public int getX() {
        return x;

    }
    @Override
    public int getY() {
        
        return y;
    }
    @Override
    public void move(int dx, int dy) {
        x += dx;
        y+=dy;
    }
    
}
