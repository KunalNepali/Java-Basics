import java.awt.Graphics;

class HelloWorldApplet extends java.applet.Applet {
    public void point(Graphics g)
    {
        g.drawString("Hellow World!", 5, 25);
    }
}
