package PacMan.pacman;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class WallRectangle extends Parent {

    public WallRectangle(float x1, float y1, float x2, float y2) {

        Rectangle rectangle = new Rectangle();
        rectangle.setX(MazeData.calcGridXFloat(x1));
        rectangle.setY(MazeData.calcGridYFloat(y1));
        rectangle.setWidth(MazeData.calcGridXFloat(x2) - MazeData.calcGridXFloat(x1));
        rectangle.setHeight(MazeData.calcGridYFloat(y2) - MazeData.calcGridYFloat(y1));
        rectangle.setStrokeWidth(MazeData.GRID_STROKE);
        rectangle.setStroke(Color.BLUE);
        rectangle.setArcWidth(12);
        rectangle.setArcHeight(12);
        rectangle.setCache(true);

        getChildren().add(rectangle);

        MazeData.setBlockMazeData(Math.round(x1), Math.round(y1), Math.round(x2), Math.round(y2));
    }

}
