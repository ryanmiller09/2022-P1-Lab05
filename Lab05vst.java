// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet {
    public void paint(Graphics g) {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10, 10, width, height);

        for (int p = 0; p < 965; p += 14){
            g.drawLine(x1 + p, y1, x2, y2 - p);

            y2 += 5;
        }

        for (int p = 0; p < 965; p += 14)
        {
            g.drawLine(x2-p,y2,x1,y1-p);

            y2 = 640;
            y1 += 5;
        }



        }



        }


















