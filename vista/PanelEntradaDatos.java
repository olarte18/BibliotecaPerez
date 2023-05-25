package vista;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbOperador, lbNum, lbValor,lbCant ;
    private JComboBox cbOperador;
    private TextField txNum,txValor, txCant, txOperador; 

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta empleados
        lbOperador = new JLabel("Nombre Autor ", JLabel.RIGHT);
        lbOperador.setBounds(0,70,100,20);
        this.add(lbOperador);
        txOperador = new TextField( JLabel.RIGHT);
        txOperador.setBounds(120,70,100,20);
        this.add(txOperador);  
        //Crear y agregar texto empleados
        lbNum = new JLabel("Nombre libro ", JLabel.RIGHT);
        lbNum.setBounds(10,20,100,20);
        this.add(lbNum);
        txNum = new TextField( JLabel.RIGHT);
        txNum.setBounds(120,20,100,20);
        this.add(txNum);        
        //Crear y agregar etiqueta empleados
        lbValor = new JLabel("año de salida ", JLabel.RIGHT);
        lbValor.setBounds(0,50,100,20);
        this.add(lbValor);
        txValor = new TextField( JLabel.RIGHT);
        txValor.setBounds(120,50,100,20);
        this.add(txValor);
        //Crear y agregar etiqueta empleados

        //Crear y agregar combo lista Empleados
        cbOperador = new JComboBox();
		cbOperador.addItem("de lujo");
		cbOperador.addItem("Normal");
        cbOperador.setBounds(120,110,100,20);
        this.add(cbOperador);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }
    public String getOperador()
    {
        return (String) cbOperador.getSelectedItem();
    }
    public String getNumCelular()
    {
        return (String) txNum.getText();
    }
    public String getValor()
    {
        return (String) txValor.getText();
    }
    public String getCantidad()
    {
        return (String) txCant.getText();
    }
}
