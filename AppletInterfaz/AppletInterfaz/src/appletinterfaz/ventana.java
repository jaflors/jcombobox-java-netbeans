
package appletinterfaz;


import java.awt.Choice;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class ventana extends JFrame implements ItemListener {

    Choice selector;
    Panel cuadro;

    public ventana() {
        setLayout(null);
        setTitle("AppletInterfaz");
        setSize(400, 400);
        setLocationRelativeTo(this);
        setResizable(false);

        cuadro = new Panel();
        cuadro.setBounds(100, 130, 200, 200);

        selector = new Choice();
        selector.addItem("Seleccionar");
        selector.addItem("yellow");
        selector.addItem("blue");
        selector.addItem("cyan");
        selector.addItem("green");
        selector.addItem("red");
        selector.setBounds(30, 50, 100, 30);

        add(selector);
        add(cuadro);

        selector.addItemListener(this);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == selector) {
            if (selector.getSelectedItem().equals("yellow")) {
                cuadro.setBackground(Color.yellow);
            }
            if (selector.getSelectedItem().equals("blue")) {
                cuadro.setBackground(Color.BLUE);
            }
            if (selector.getSelectedItem().equals("cyan")) {
                cuadro.setBackground(Color.CYAN);
            }
            if (selector.getSelectedItem().equals("green")) {
                cuadro.setBackground(Color.GREEN);
            }
            if (selector.getSelectedItem().equals("red")) {
                cuadro.setBackground(Color.RED);
            }
        }

    }

}
