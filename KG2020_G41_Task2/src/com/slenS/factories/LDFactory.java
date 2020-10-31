package com.Bukas.factories;


import com.Bukas.line_drawers.*;
import com.Bukas.pixel_drawers.GraphicsPixelDrawer;

import java.awt.*;

public class LDFactory implements LineDrawerFactory {
    private LineDrawer.Type t;

    @Override
    public LineDrawer createLineDrawer(Graphics g) {
        switch (t) {
            case Briesenham -> {
                return new BresenhaimLineDrawer(new GraphicsPixelDrawer(g));
            }
            case DDA -> {
                return new DDALineDrawer(new GraphicsPixelDrawer(g));
            }
            case Wu -> {
                return new WuLineDrawer(new GraphicsPixelDrawer(g));
            }
        }
        return null;
    }

    @Override
    public LineDrawer.Type getType() {
        return t;
    }

    @Override
    public void setType(LineDrawer.Type t) {
        this.t = t;
    }
}
