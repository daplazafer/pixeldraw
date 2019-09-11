package com.dpf.pixeldraw.bus.drawer;

import com.dpf.pixeldraw.App;
import com.dpf.pixeldraw.bus.Point;
import com.dpf.pixeldraw.bus.shape.IShape;
import com.dpf.pixeldraw.bus.shape.PointsShape;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para dibujar un punto en el canvas
 */
class DrawPoint extends Drawer {

    private List<Point> points;
    private int state;
    private final int lastState = 1;

    private String pointMsg;

    private final static DrawPoint INSTANCE = new DrawPoint();

    public static DrawPoint getInstance() {
        return INSTANCE;
    }

    private DrawPoint() {
    }

    @Override
    public IShape computeShape(Color color) {
        if (state != lastState) {
            throw new IllegalArgumentException();
        }
        int x = points.get(0).row;
        int y = points.get(0).col;
        Point point = new Point(x, y);

        IShape pointShape = new PointsShape(color, point);
        pointMsg = " " + point.toStringCenter0_0(App.CANVAS_COLS, App.CANVAS_ROWS);

        return pointShape;
    }

    @Override
    public void input(Point arg) {
        if (state < lastState) {
            points.add(arg);
            state++;
        }
    }

    @Override
    public void input(double arg) {
        throw new IllegalArgumentException();
    }

    @Override
    public Arg nextArg() {
        if (state < lastState) {
            return Arg.POINT;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public boolean hasNextArg() {
        return state < lastState;
    }

    @Override
    public String getNextMessage() {
        if (state == 0) {
            return "Set point position";
        } else {
            return "Point drawn" + pointMsg;
        }
    }

    @Override
    public String getName() {
        return "Point";
    }

    @Override
    public void onSelect() {
        points = new ArrayList<>(1);
        state = 0;
        pointMsg = "";
    }
}