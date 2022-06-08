package br.com.kualit.printrect;

import java.util.List;
import br.com.kualit.printrect.core.Math;
import br.com.kualit.printrect.core.Rectangle;

public class Application {

    private static final int MULTIPLE_BASE = 3;

    public static void main(String[] args) {
        process();
    }

    private static void process() {
        Math math = new Math();
        List<Integer> dimensions = math.getDimensions(MULTIPLE_BASE);
        drawRect(dimensions.get(1), dimensions.get(0));
    }

    private static void drawRect(Integer width, Integer height) {
        Rectangle rects = new Rectangle(width, height);
        rects.setSize(800, 600);
        rects.setVisible(true);
    }
}
