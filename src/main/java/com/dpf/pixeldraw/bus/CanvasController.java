package com.dpf.pixeldraw.bus;

import com.dpf.pixeldraw.bus.shape.IShape;
import java.util.List;

/**
 *
 * @author dpf
 */
public interface CanvasController {

          public List<IShape> getShapes();

          public void selectPoint(Point p);

          public void refresh();

}
