package pl.jaknauczycsieprogramowania;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        ConTempCtoF conTemp = new ConTempCtoF();
        ConTemp.setVisible(true);
    }

    public ConTempCtoF(){
        super(title:"Konwertowanie stopni C -> F");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);
    }
    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object ob1 = e.getSource();
            if(ob1 == konwertujButton || ob1 == textFCelcjusz){
                tempC = Double.parseDouble(textFCelcjusz.getText());
                tempF = 32.00 + (9.0 / 5.0)* tempC;
                textFFarenheit.setText(String.valueOf(tempF));
            }else if (ob1 == wyczyśćButton){
                textFCelcjusz.setText("");
                textFFarenheit.setText("");
                if(wielkieLiteryCheckBox.isSelected() == true) wielkieLiteryCheckBox.setSelected(false);
                else if (czcionkaMałaRadioButton.isSelected() == true ) czcionkaMałaRadioButton.setSelected(false);
                else if (czcionkaŚredniaRadioButton.isSelected() == true) czcionkaŚredniaRadioButton.setSelected(false);
                else if (czcionkaDużaRadioButton.isSelected()==true) czcionkaDużaRadioButton.setSelected(false);

            }else if (ob1 == wyjscieButton){
                dispose();
            }else if (ob1 == wielkieLiteryCheckBox){
                if (wielkieLiteryCheckbox.isSelected()==true){
                    textFFarenheit.setFont(new Font(name:"SansSerif", Font.BOLD, size:18));
                }else{
                    textFFarenheit.setFont(new Font(name: "SansSerif", Font.PLAIN,size:12));
                }
            }else if(ob1 == czcionkaMałaRadioButton){
                textFFarenheit.setFont(new Font (name:"SansSerif",Font.PLAIN,size:8));
            }else if(ob1 == czcionkaŚredniaRadioButton){
                textFFarenheit.setFont(new Font (name:"SansSerif",Font.PLAIN,size:12));
            }else if(ob1 == czcionkaDużaRadioButton){
                textFFarenheit.setFont(new Font(name:"SansSerif",Font.PLAIN,size:20));
            }
        }
    };

    konwertujButton.addActionListener(listener);
    wyczyśćButton.addActionListener(listener);
    wyjscieButton.addActionListener(listener);
    wielkieLitery.AddActionListener(listener);
    czcionkaMałaRadioButton.addActionListener(listener);
    czcionkaŚredniaRadioButton.addActionListener(listener);
    czcionkaDużaRadioButton.addActionListener(listener);
}
