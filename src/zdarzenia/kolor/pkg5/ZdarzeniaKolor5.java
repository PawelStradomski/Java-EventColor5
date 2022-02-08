
package zdarzenia.kolor.pkg5;
/**
 * @author pawelstradomski
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ZdarzeniaKolor5 extends JFrame implements ActionListener
{

    public ZdarzeniaKolor5()
    {
        super("Zdarzenia 5 sposob");
        this.setBounds(600, 300, 400, 400);
        initComponent();
        this.setDefaultCloseOperation(3);
    }
    public void initComponent()
    {
        this.getContentPane().add(panel);
        panel.add(czerwony);
        panel.add(niebieski);
        
        czerwony.addActionListener(this);
        niebieski.addActionListener(this);
    }
    JPanel panel = new JPanel();
    JButton czerwony = new JButton("czerwony");
    JButton niebieski = new JButton("niebieski");

    
    public static void main(String[] args) {
        
        new ZdarzeniaKolor5().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==czerwony)
            panel.setBackground(Color.red);
        if(e.getSource()==niebieski)
            panel.setBackground(Color.BLUE);
        
    }
    
}
