import javax.swing.JApplet;
import java.awt.*;

public class recursiveSomething extends JApplet
{
    private final int APPLET_WIDTH = 800;
    private final int APPLET_HEIGHT = 800;
    
    /*
    x is across and y is down
    point 1 - Right	A x[0],y[0] (720,600)
    point 2 - Left	B x[1],y[1]
    point 3 - Top	C x[2],y[2]
    point 4 draws back to point 1 to complete triangle
    */
    private int[] xPos = {720, 80, 80, 720, 720};
    private int[] yPos = {680, 680, 40, 40, 680};
    
    //-----------------------------------------------------------------
    //  Sets up the basic applet environment.
    //-----------------------------------------------------------------
    public void init()
    {
        setBackground (Color.white);
        setSize (APPLET_WIDTH, APPLET_HEIGHT);
    }
    
    //-----------------------------------------------------------------
    //  Draws a rocket using polygons and polylines.
    //-----------------------------------------------------------------
    public void paint (Graphics page)
    {
        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);
        Square(xPos,yPos,page);
    }//end of paint
    
    public void Square(int[] xPos, int[] yPos, Graphics page)
    {
        //Find the distance between 2 points ex. - x,y & x1,y1
        int length = xPos[0] - xPos[1];
        
        //if the segment/distance is 30 or so, good length to stop
        if (length > 30)
        {
            //find the mid points of each line segment
            int xrm = xPos[0];
            int xbm = xPos[1] + length / 2;
            int xlm = xPos[1];
            int xtm = xPos[1] + length / 2;
            int ytop = yPos[2];
            int ym = yPos[2] + length / 2;
            int ybot = yPos[0];
            int l4 = length / 4;
            
            //make the x and y array (3 points + first point to finish triangle)
            int[] xnew = {xrm, xbm, xlm, xtm, xrm};
            int[] ynew = {ym, ybot, ym, ytop, ym};
            
            //draw the Triangle
            page.drawPolyline (xnew, ynew, xnew.length);
            
            //create x,y Array using the midpoints you calculated
            int[] xr = {xPos[0], xPos[0] - l4, xPos[0] - l4, xPos[0], xPos[0]};
            int[] xl = {xPos[1] + l4, xPos[1], xPos[1], xPos[1] + l4, xPos[1] + l4};
            int[] yt = {yPos[2] + l4, yPos[2] + l4, yPos[2], yPos[2], yPos[2] + l4};
            int[] yb = {yPos[0], yPos[0], yPos[0] - l4, yPos[0] - l4, yPos[0]};
            
            // Recursive calls for each section of triangle
            Square(xr, yt, page);
            Square(xr, yb, page);
            Square(xl, yt, page);
            Square(xl, yb, page);
        }
    }//end of Triangle
}