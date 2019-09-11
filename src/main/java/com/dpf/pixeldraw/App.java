package com.dpf.pixeldraw;

import com.dpf.pixeldraw.ui.Gui;
import com.dpf.pixeldraw.bus.drawer.Drawer;
import com.dpf.pixeldraw.bus.transformation.Transformation;

/**
 *
 * @author dpf
 */
public class App {

	public final static int CANVAS_COLS = 120;
	public final static int CANVAS_ROWS = 60;
	public static final int PIXEL_SIZE = 10;

	public static final String APP_NAME = "Pixel Draw";

	public static void main(String[] args) {
		new Gui(CANVAS_COLS, CANVAS_ROWS, PIXEL_SIZE, Drawer.getAll(), Transformation.getAll());
	}

}
