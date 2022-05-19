package javaapplication92;
public class JavaApplication92 {
 
 public static void main(String[] args) {
 XO xo=new XO();
 
}
 }
package javaapplication92;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class XO extends JFrame {
 actions a=new actions();
 JPanel 
pba,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,
p14,p15;
 JLabel 
l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17
,l18,l19;
 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
 private int countx=0;
 private int counto=0;
 private String player_start="x";
 
 public XO(){
 
 pba=new JPanel();
 
p1=new JPanel();
 p2=new JPanel();
 p3=new JPanel();
 p4=new JPanel();
 p5=new JPanel();
 p6=new JPanel();
 p7=new JPanel();
 p8=new JPanel();
 p9=new JPanel();
REPORT TITLE
6
 p10=new JPanel();
 p11=new JPanel();
 p12=new JPanel();
 p13=new JPanel();
 p14=new JPanel();
 p15=new JPanel();
 
 l1=new JLabel();
 l2=new JLabel();
 l3=new JLabel();
 l4=new JLabel(" Player X: ");
 l5=new JLabel();
 l6=new JLabel();
 l7=new JLabel();
 l8=new JLabel();
 l9=new JLabel(" Player O: ");
 l10=new JLabel();
 l11=new JLabel();
 l12=new JLabel();
 l13=new JLabel();
 l14=new JLabel();
 l15=new JLabel();
 b1=new JButton();
 b2=new JButton();
 b3=new JButton();
 b4=new JButton();
 b5=new JButton();
 b6=new JButton();
 b7=new JButton();
 b8=new JButton();
 b9=new JButton();
 b10=new JButton("Reset");
 b11=new JButton("Exit");
 
 display();
 
}
 private void score(){
 l5.setText(Integer.toString( countx ));
 l10.setText(Integer.toString( counto ));
 
 
}
 private void choose_player(){
 if(player_start=="x"){
 player_start="o";
 
}
 else{
 player_start="x";
 
}
 
}
 private void who_win(){
REPORT TITLE
7
 
if(b1.getText()=="x"&&b2.getText()=="x"&&b3.g
etText()=="x"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player X", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 countx++;
 score();
 
 
 }
 
if(b1.getText()=="o"&&b2.getText()=="o"&&b3.
getText()=="o"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player O", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 counto++;
 score();
 
 
 }
 
if(b4.getText()=="x"&&b5.getText()=="x"&&b6.g
etText()=="x"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player X", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 countx++;
 score();
 
 
 }
 
 
if(b4.getText()=="o"&&b5.getText()=="o"&&b6.
getText()=="o"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player O.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 counto++;
 score();
 
 
 }
 
if(b7.getText()=="x"&&b8.getText()=="x"&&b9.g
etText()=="x"){
REPORT TITLE
8
 JOptionPane.showMessageDialog(this, 
"The Winner is Player X.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 countx++;
 score();
 
 
 
}
 
if(b7.getText()=="o"&&b8.getText()=="o"&&b9.
getText()=="o"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player O.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 counto++;
 score();
 
 
}
 
if(b1.getText()=="x"&&b4.getText()=="x"&&b7.g
etText()=="x"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player X.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 countx++;
 score();
 
 
}
 
if(b1.getText()=="o"&&b4.getText()=="o"&&b7.
getText()=="o"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player O.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 counto++;
 score();
 
 
}
 
if(b2.getText()=="x"&&b5.getText()=="x"&&b8.g
etText()=="x"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player X.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 countx++;
 score();
 
 
 
}
REPORT TITLE
9
 
if(b2.getText()=="o"&&b5.getText()=="o"&&b8.
getText()=="o"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player O.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 counto++;
 score();
 
 
 
}
 
if(b3.getText()=="x"&&b6.getText()=="x"&&b9.g
etText()=="x"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player X.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 countx++;
 score();
 
 
}
 
if(b3.getText()=="o"&&b6.getText()=="o"&&b9.
getText()=="o"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player O.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 counto++;
 score();
 
 
}
 
if(b1.getText()=="x"&&b5.getText()=="x"&&b9.g
etText()=="x"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player X.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 countx++;
 score();
 
 
}
 
if(b1.getText()=="o"&&b5.getText()=="o"&&b9.
getText()=="o"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player O.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 counto++;
 score();
 
REPORT TITLE
10
 
}
 
if(b3.getText()=="x"&&b5.getText()=="x"&&b7.g
etText()=="x"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player X.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 countx++;
 score();
 
 
}
 
if(b3.getText()=="o"&&b5.getText()=="o"&&b7.
getText()=="o"){
 JOptionPane.showMessageDialog(this, 
"The Winner is Player O.", 
"tic",JOptionPane.INFORMATION_MESSAGE);
 counto++;
 score();
 
 
}
 
}
 public void display(){
 this.setTitle("XO GAME");
 this.setSize(1200, 600);
 this.setResizable(false);
 this.setVisible(true);
 
this.setDefaultCloseOperation(JFrame.EXIT_O
N_CLOSE);
 pba.setBackground(Color.GRAY);
 
pba.setBorder(BorderFactory.createLineBorder(
Color.BLACK, 2));
 
 l4.setFont(new 
Font("tim1",Font.BOLD,40));
 l9.setFont(new 
Font("tim1",Font.BOLD,40));
 l5.setFont(new 
Font("tim1",Font.ITALIC,40));
 l10.setFont(new 
Font("tim1",Font.ITALIC,40));
 b10.setFont(new 
Font("tim1",Font.BOLD,40));
 b11.setFont(new 
Font("tim1",Font.BOLD,40));
 b1.setFont(new 
Font("tim1",Font.BOLD,90));
REPORT TITLE
11
 b2.setFont(new 
Font("tim1",Font.BOLD,90));
 b3.setFont(new 
Font("tim1",Font.BOLD,90));
 b4.setFont(new 
Font("tim1",Font.BOLD,90));
 b5.setFont(new 
Font("tim1",Font.BOLD,90));
 b6.setFont(new 
Font("tim1",Font.BOLD,90));
 b7.setFont(new 
Font("tim1",Font.BOLD,90));
 b8.setFont(new 
Font("tim1",Font.BOLD,90));
 b9.setFont(new 
Font("tim1",Font.BOLD,90));
 
 p1.setLayout(new BorderLayout());
 p1.setBackground(Color.WHITE);
 p2.setLayout(new BorderLayout());
 p2.setBackground(Color.WHITE);
 p3.setLayout(new BorderLayout());
 p3.setBackground(Color.WHITE);
 p4.setLayout(new BorderLayout());
 p4.setBackground(Color.WHITE);
 p5.setLayout(null);
 l5.setBounds(100, 85, 30, 20);
 p5.setBackground(Color.WHITE);
 p6.setLayout(new BorderLayout());
 p6.setBackground(Color.WHITE);
 p7.setLayout(new BorderLayout());
 p7.setBackground(Color.WHITE);
 p8.setLayout(new BorderLayout());
 p8.setBackground(Color.WHITE);
 p9.setLayout(new BorderLayout());
 p9.setBackground(Color.WHITE);
 p10.setLayout(null);
 l10.setBounds(100, 85, 30, 20);
 p10.setBackground(Color.WHITE);
 p11.setLayout(new BorderLayout());
 p11.setBackground(Color.WHITE);
 p12.setLayout(new BorderLayout());
 p12.setBackground(Color.WHITE);
 p13.setLayout(new BorderLayout());
 p13.setBackground(Color.WHITE);
 p14.setLayout(new BorderLayout());
 p14.setBackground(Color.WHITE);
 p15.setLayout(new BorderLayout());
 p15.setBackground(Color.WHITE);
 b1.setBackground(Color.LIGHT_GRAY);
REPORT TITLE
12
 b2.setBackground(Color.LIGHT_GRAY);
 b3.setBackground(Color.LIGHT_GRAY);
 b4.setBackground(Color.LIGHT_GRAY);
 b5.setBackground(Color.LIGHT_GRAY);
 b6.setBackground(Color.LIGHT_GRAY);
 b7.setBackground(Color.LIGHT_GRAY);
 b8.setBackground(Color.LIGHT_GRAY);
 b9.setBackground(Color.LIGHT_GRAY);
 pba.setLayout(new GridLayout(3,5,1,1));
 
 p1.add(l1);
 p1.add(b1);
 pba.add(p1);
 p2.add(l2);
 p2.add(b2);
 pba.add(p2);
 p3.add(l3);
 p3.add(b3);
 pba.add(p3);
 p4.add(l4,BorderLayout.CENTER);
 pba.add(p4);
 p5.add(l5,BorderLayout.CENTER);
 pba.add(p5);
 p6.add(l6);
 p6.add(b4);
 pba.add(p6);
 p7.add(l7);
 p7.add(b5);
 pba.add(p7);
 p8.add(l8);
 p8.add(b6);
 pba.add(p8);
 p9.add(l9,BorderLayout.CENTER);
 pba.add(p9);
 p10.add(l10,BorderLayout.CENTER);
 pba.add(p10);
 p11.add(l11);
 p11.add(b7);
 pba.add(p11);
 p12.add(l12)
;
 p12.add(b8);
 pba.add(p12);
 p13.add(l13);
 p13.add(b9);
 pba.add(p13);
 p14.add(l14);
 p14.add(b10);
 pba.add(p14);
 p15.add(l15);
 p15.add(b11);
REPORT TITLE
13
 pba.add(p15);
 this.add(pba);
 b10.addActionListener(a);
 b11.addActionListener(a);
 b1.addActionListener(a);
 b2.addActionListener(a);
 b3.addActionListener(a);
 b4.addActionListener(a);
 b5.addActionListener(a);
 b6.addActionListener(a);
 b7.addActionListener(a);
 b8.addActionListener(a);
 b9.addActionListener(a);
 
}
 private class actions implements 
ActionListener{
 @Override
 
 public void actionPerformed(ActionEvent 
e) {
 JFrame fram;
 
 if(e.getSource()==b11){
 fram=new JFrame();
 if( 
JOptionPane.showConfirmDialog(fram,"Are you 
sure to Exit from Game?","Exit Message", 
JOptionPane.YES_NO_OPTION)== 
JOptionPane.YES_NO_OPTION){
 System.exit(0);
 
}
 
}
 if(e.getSource()==b1){
 b1.setText(player_start);
 if(player_start=="x"){
 b1.setForeground(Color.blue);
 
}
 else{
 b1.setForeground(Color.magenta);
 
}
 choose_player();
 who_win();
 
}
 if(e.getSource()==b2){
 b2.setText(player_start);
 if(player_start=="x"){
 b2.setForeground(Color.BLUE);
 
}
 else{
REPORT TITLE
14
 b2.setForeground(Color.magenta);
 
}
 choose_player();
 who_win();
 
}
 if(e.getSource()==b3){
 b3.setText(player_start);
 if(player_start=="x"){
 b3.setForeground(Color.BLUE);
 
}
 else{
 b3.setForeground(Color.magenta);
 
}
 choose_player();
 who_win();
 
}
 if(e.getSource()==b4){
 b4.setText(player_start);
 if(player_start=="x"){
 b4.setForeground(Color.BLUE);
 
}
 else{
 b4.setForeground(Color.magenta);
 
}
 choose_player();
 who_win();
 
}
 if(e.getSource()==b5){
 b5.setText(player_start);
 if(player_start=="x"){
 b5.setForeground(Color.BLUE);
 
}
 else{
 b5.setForeground(Color.magenta);
 
}
 choose_player();
 who_win();
 
}
 if(e.getSource()==b6){
 b6.setText(player_start);
 if(player_start=="x"){
 b6.setForeground(Color.BLUE);
 
}
 else{
 b6.setForeground(Color.magenta);
 
}
 choose_player();
 who_win();
 
}
 if(e.getSource()==b7){
REPORT TITLE
15
 b7.setText(player_start);
 if(player_start=="x"){
 b7.setForeground(Color.BLUE);
 
}
 else{
 b7.setForeground(Color.magenta);
 
}
 choose_player();
 who_win();
 
}
 if(e.getSource()==b8){
 b8.setText(player_start);
 if(player_start=="x"){
 b8.setForeground(Color.BLUE);
 
}
 else{
 b8.setForeground(Color.magenta);
 
}
 choose_player();
 who_win();
 
}
 if(e.getSource()==b9){
 b9.setText(player_start);
 if(player_start=="x"){
 b9.setForeground(Color.BLUE);
 
}
 else{
 b9.setForeground(Color.magenta);
 
}
 choose_player();
 who_win();
 
}
 if(e.getSource()==b10){
 b1.setText(null);
 b2.setText(null);
 b3.setText(null);
 b4.setText(null);
 b5.setText(null);
 b6.setText(null);
 b7.setText(null);
 b8.setText(null);
 b9.setText(null);
 
 
 
 
}
 
}
 
 
}
 

}