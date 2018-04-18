import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
    private final int APPLET_WIDTH = 800;
    private final int APPLET_HEIGHT = 800;
    
    /*
    //x is accross and y is down
    point 1 - Right	A x[0],y[0] (720,600)
    point 2 - Left	B x[1],y[1]
    point 3 - Top	C x[2],y[2]
    point 4 draws back to point 1 to complete triangle
    */
    private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};
    
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
        
        Triangle(xPos,yPos,page);
        
    }//end of paint
    
    public void Triangle(int[] xPos, int[] yPos, Graphics page)
    {
        //Find the distance between 2 points ex. - x,y & x1,y1
        int length = xPos[0] - xPos[1];
        
        //if the segment/distance is 30 or so, good length to stop
        if (length > 30)
        {
            //find the mid points of each line segment
            int xrm = (xPos[0] - xPos[2])/2;
            int xlm = (xPos[2] - xPos[1])/2;
            int xbm = xPos[2];
            int ytm = (yPos[0] - yPos[2])/2;
            int ybm = yPos[0];
            
            //make the x and y array (3 points + first point to finish triangle)
            int[] xnew = {xrm, xlm, xbm, xrm};
            int[] ynew = {ytm, ytm, ybm, ytm};
            
            //draw the Triangle
            page.drawPolyline (xnew, ynew, xnew.length);
            
            //create x,y Array using the midpoints you calculated
            int[] tx = {xrm, xlm, xPos[2], xrm};
            int[] ty = {ytm, ytm, yPos[2], ytm};
            int[] rx = {xPos[0], xbm, xrm, xPos[0]};
            int[] ry = {ybm, ybm, ytm, ybm};
            int[] lx = {xbm, xPos[1], xlm, xbm};
            int[] ly = {ybm, ybm, ytm, ybm};
            
            // Recursive calls for each section of triangle
            
            
            
        }
    }//end of Triangle
}
