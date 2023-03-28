import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioConvertor extends JFrame {

	private JPanel contentPane;
	private String valor;
	private String valorMoneda;
	private double monto;
	private double moneda;
	
	private static String seleccion;
	private static String opcionMoneda;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioConvertor frame = new InicioConvertor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	
	public static String set0pcion(String seleccion) {
		Object color = JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
				   "MENU", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Conversion de Monedas", "Conversion de Temperatura" },"Seleccione");
		//this.seleccion = seleccion;
		
		return seleccion=(String) color;
	}
	public static String getOpcion(String seleccion) {
		return seleccion ;
	}
	
	
	public static String opcionMoneda() {
		return opcionMoneda ;
	}
	public static String setopcionMoneda(String opcionMoneda) {
		Object moneda = JOptionPane.showInputDialog(null,"Elija una moneda que desea convertir tu dinero",
				   "MONEDAS", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","De Peso a Dolar", "De Peso a Euro", "De Peso a Libras Esterlinas", 
						  "De Peso a Yen Japonés", "De Peso a Won sul-coreano","De Dolar a Peso", "De Euro a Peso", 
						  "De Libras Esterlinas a Peso", "De Yen Japonés a Peso", "De Won sul-coreano a Peso" }
		,"Seleccione");
		
		return opcionMoneda=(String) moneda;
		
	}
	public double pesoaDolar(double monto) {
		double dolar=201.23;
		return dolar;	
	}
	public double pesoaEuro(double monto) {
		double euro=216.91;
		return euro;	
	}
	public double pesoaYen(double monto) {
		double yen=1.53;
		return yen;	
	}
	public double pesoaWon(double monto) {
		double won=0.15;
		return won;	
	}
	public double pesoaLibra(double monto) {
		double libra=245.14;
		return libra;	
	}
	public double ingresoMoneda(double moneda) {
		String dinero = JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que deseas convertir","Monto");
		moneda=Double.parseDouble(dinero);
		return  moneda;
	}
	
	public  InicioConvertor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				set0pcion(seleccion);
				
				
			}
		});
		contentPane.add(btnIniciar);
		
		
		
		
		
		valor = getOpcion(seleccion);
		if(valor!=null)
		{
			//JOptionPane.showMessageDialog(null, valor);
			if(valor == "Conversion de Monedas"   ) {
			valorMoneda=setopcionMoneda(valorMoneda);
			
			}
			if(valor=="Conversion de Temperatura") {
				 JOptionPane.showMessageDialog(null, "En Construcción");
			}
			if(valor=="Seleccione") {
				 JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion");
				 
			}
		}
		

		
		if(valorMoneda=="De Peso a Dolar")
		{
			double monto = pesoaDolar(this.monto);
			double moneda = ingresoMoneda(this.moneda);
			double resultado=moneda/monto;
			double redondeo=Math.round(resultado * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, "Tienes $ " + redondeo + " Dolares");
			
			/*
			 * para ver los datos en una label
			 * JLabel lblNewLabel = new JLabel(Double.toString(monto));
			 * JLabel lblNewLabel1 = new JLabel(Double.toString(moneda));
			 * contentPane.add(lblNewLabel);
			 * contentPane.add(lblNewLabel1);
			 */	
			
		}
		if(valorMoneda=="De Dolar a Peso")
		{
			double monto = pesoaDolar(this.monto);
			double moneda = ingresoMoneda(this.moneda);
			double resultado=moneda*monto;
			double redondeo=Math.round(resultado * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, "Tienes $ " + redondeo + " Pesos");

		}
		if(valorMoneda=="De Peso a Euro")
		{
			double monto = pesoaEuro(this.monto);
			double moneda = ingresoMoneda(this.moneda);
			double resultado=moneda/monto;
			double redondeo=Math.round(resultado * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, "Tienes $ " + redondeo + " Euros");

		}
		if(valorMoneda=="De Euro a Peso")
		{
			double monto = pesoaEuro(this.monto);
			double moneda = ingresoMoneda(this.moneda);
			double resultado=moneda*monto;
			double redondeo=Math.round(resultado * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, "Tienes $ " + redondeo + " Pesos");

		}
		
		if(valorMoneda=="De Peso a Libras Esterlinas")
		{
			double monto = pesoaLibra(this.monto);
			double moneda = ingresoMoneda(this.moneda);
			double resultado=moneda/monto;
			double redondeo=Math.round(resultado * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, "Tienes $ " + redondeo + " Libras Esterlinas");

		}
		if(valorMoneda=="De Libras Esterlinas a Peso")
		{
			double monto = pesoaLibra(this.monto);
			double moneda = ingresoMoneda(this.moneda);
			double resultado=moneda*monto;
			double redondeo=Math.round(resultado * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, "Tienes $ " + redondeo + " Pesos");

		}
		if(valorMoneda=="De Peso a Yen Japonés")
		{
			double monto = pesoaYen(this.monto);
			double moneda = ingresoMoneda(this.moneda);
			double resultado=moneda*monto;
			double redondeo=Math.round(resultado * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, "Tienes $ " + redondeo + " Yen Japonés");

		}
		
		if(valorMoneda=="De Yen Japonés a Peso")
		{
			double monto = pesoaYen(this.monto);
			double moneda = ingresoMoneda(this.moneda);
			double resultado=moneda/monto;
			double redondeo=Math.round(resultado * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, "Tienes $ " + redondeo + " Pesos");

		}
		if(valorMoneda=="De Peso a Won sul-coreano")
		{
			double monto = pesoaWon(this.monto);
			double moneda = ingresoMoneda(this.moneda);
			double resultado=moneda*monto;
			double redondeo=Math.round(resultado * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, "Tienes $ " + redondeo + " Won sul-coreano");

		}
		if(valorMoneda=="De Won sul-coreano a Peso")
		{
			double monto = pesoaWon(this.monto);
			double moneda = ingresoMoneda(this.moneda);
			double resultado=moneda/monto;
			double redondeo=Math.round(resultado * 100.0) / 100.0;
			JOptionPane.showMessageDialog(null, "Tienes $ " + redondeo + " Pesos");

		}

		
		
	}
}
