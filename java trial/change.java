import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class Change implements ActionListener
{  
Frame f=new Frame();

Label l1=new Label("Enter Text");
Label l2=new Label("Result");
TextField t1=new TextField();
TextField t2=new TextField();
Button b1=new Button("Uppper To Lower");
Button b2=new Button("Lower To Upper");

Change()
{
l1.setBounds(50,100,100,20);
l2.setBounds(50,200,100,20);    
t1.setBounds(200,100,100,20);
t2.setBounds(200,200,100,20);  
b1.setBounds(50,250,100,20);
b2.setBounds(170,250,100,20);
f.add(l1);
f.add(l2);
f.add(t1);
f.add(t2);
f.add(b1);
f.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(400,400);
//f.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
  
public void actionPerformed(ActionEvent e)
{
String s=(t1.getText());

if(e.getSource()==b1)
{
	   String ch;
	   ch=s.toLowerCase();
        
	t2.setText(ch);
   	JOptionPane.showMessageDialog(null,"Upper Case Is :"+ch);
}
if(e.getSource()==b2)
{
	   String ch1;
	   ch1=s.toUpperCase();
        
	t2.setText(ch1);
   	JOptionPane.showMessageDialog(null,"Upper Case Is :"+ch1);  
}
}
public static void main(String args[])
{
new Change();
}
}