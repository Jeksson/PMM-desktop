/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Acer
 */
public class CurrentIP {
   public static void main(String [] args) {
       Logic.avtoZap();
       НовыйJPanel jPanel = new НовыйJPanel();
       
       
      JFrame frame = new JFrame("Калькулятор v1.5.5");
      frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
      frame.setIconImage(getImage());
      
      
      //Добавление панели к фрейму
      frame.getContentPane().add(jPanel);
      //метод рack(); сообщает Swing о том,
      //что нужно придать компонентам необходимые размеры для
      //правильного помещения их в форму.
      //Другой способ - вызвать setSize(int width, int height).
      frame.pack();
      //Для того, чтобы увидеть окно на экране 
      //вы должны вызвать метод setVisible(true)
      frame.setVisible(true);
   }
   protected static Image getImage(){
        java.net.URL imgUrl = javaapplication1.CurrentIP.class.getResource("3.png");
        if(imgUrl != null){
            
            return new ImageIcon(imgUrl).getImage();
            
        } else {
            return null;
        }
    }
}
