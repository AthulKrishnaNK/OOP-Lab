import java.awt.*;
import java.applet.*;
/*
<applet code="AppletSkel" width=300 height=200>
</applet>
*/
public class AppletSkel extends Applet{
public void init() 
{
setBackground(Color.yellow);
setForeground(Color.red);
}
public void start(){}
public void stop(){}
public void destroy(){}
public void paint(Graphics g){
g.drawString("Hello Athul",100,200);
}
}