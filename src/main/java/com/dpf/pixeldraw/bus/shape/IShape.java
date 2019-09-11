
package com.dpf.pixeldraw.bus.shape;

import com.dpf.pixeldraw.bus.Point;
import java.awt.Color;
import java.util.List;

/**
 *
 * @author dpf
 */
public interface IShape
{
    public List<Point> compute();
    public List<Point> getPoints();
    public Color getColor();
}
