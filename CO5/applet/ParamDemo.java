import java.awt.*;
import java.applet.*;
/*
<applet code="ParamDemo" width=300 height=100>
<param name=num1 value=10>
<param name=num2 value=20>
</applet>
*/
public class ParamDemo extends Applet{
String param;
int total;
public void start() 
{
param=getParameter("num1");
int val1=Integer.parseInt(param);
param=getParameter("num2");
int val2=Integer.parseInt(param);
  total=val1+val2;
}
public void paint(Graphics g){
g.drawString("Total"+String.valueOf(total),100,10);
}
}