import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private static String seleccion;
	private String valor;
	private String valorMoneda;
	private String opcionMoneda;
	private String titulo;
	private String dato;
	private double monto;
	private double ingresoMoneda;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public String get0pcion() {
		return seleccion;
	}
	public void set0pcion(String seleccion) {
		Object color = JOptionPane.showInputDialog(null,"Seleccione una opción de conversión",
				   "MENU", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Conversion de Monedas", "Conversion de Temperatura" },"Seleccione");
		//this.seleccion = seleccion;
		
		this.seleccion=(String) color;
	}
	public String getMoneda() {
		return opcionMoneda;
	}

	public void setMoneda(String opcionMoneda) {
		Object moneda = JOptionPane.showInputDialog(null,"Elija una moneda que desea convertir tu dinero",
				   "MONEDAS", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","De Peso a Dolar", "De Peso a Euro", "De Peso a Libras Esterlinas", 
						  "De Peso a Yen Japonés", "De Peso a Won sul-coreano","De Dolar a Peso", "De Euro a Peso", 
						  "De Libras Esterlinas a Peso", "De Yen Japonés a Peso", "De Won sul-coreano a Peso" }
		,"Seleccione");
		
		
		if(moneda!=null)
		{
		switch ((String) moneda) {
		case "Seleccione":
			JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion");
			break;
		case "De Peso a Dolar":
			this.opcionMoneda="2";
			this.titulo="Dolar";
			break;
		case "De Peso a Euro":
			this.opcionMoneda="3";
			this.titulo="Euros";
			break;
		case "De Peso a Libras Esterlinas":
			this.opcionMoneda="4";
			this.titulo="Libras Esterlinas";
			break;
		case "De Peso a Yen Japonés":
			this.opcionMoneda="5";
			this.titulo="Yen Japonés";
			break;
		case "De Peso a Won sul-coreano":
			this.opcionMoneda="6";
			this.titulo="Won sul-coreano";
			break;
		case "De Dolar a Peso":
			this.opcionMoneda="7";
			this.titulo="Pesos";
			break;
		case "De Euro a Peso":
			this.opcionMoneda="8";
			this.titulo="Yen Japonés";
			this.titulo="Pesos";
			break;
		case "De Libras Esterlinas a Peso":
			this.opcionMoneda="9";
			this.titulo="Pesos";
			break;
		case "De Yen Japonés a Peso":
			this.opcionMoneda="10";
			this.titulo="Pesos";
			break;
		case "De Won sul-coreano a Peso":
			this.opcionMoneda="11";
			this.titulo="Pesos";
			break;

		default:
			break;
		}
		}
		
	}

	public double ingresoMoneda(double ingresoMoneda) {
		String dinero = JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que deseas convertir","Monto");
		//ingresoMoneda=Double.parseDouble(dinero);
		if(dinero!=null) {
			try {
				 ingresoMoneda=Double.parseDouble(dinero);
			     // double number = Double.parseDouble(input);
			      return  ingresoMoneda;
			    } catch (NumberFormatException e) {
			    	JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico");
			    	
			    }
		}
		return 0;
		
		
		
	}
	public double getCotizacion() {
		return monto;
	}
	private double cotizacionMoneda(double monto) {
		// aca esta el problema con ingresar monto
		if(opcionMoneda!=null)
		{
		double valor=ingresoMoneda(ingresoMoneda);  
		double resultado;
		double redondeo;
		switch (opcionMoneda) {
		case "2": 
			
			double dolar=201.23;
			resultado=valor/dolar;
			redondeo=Math.round(resultado * 100.0) / 100.0;
			return redondeo;
		case "3":
			double euro=216.91;
			 resultado=valor/euro;
			 redondeo=Math.round(resultado * 100.0) / 100.0;
			return redondeo;
		case "4": 
			double libra=245.14;
			resultado=valor/libra;
			 redondeo=Math.round(resultado * 100.0) / 100.0;
			return redondeo;	
		case "5": 
			double yen=1.53;
			resultado=valor/yen;
			 redondeo=Math.round(resultado * 100.0) / 100.0;
			return redondeo;	
		case "6":
			double won=0.15;
			resultado=valor/won;
			 redondeo=Math.round(resultado * 100.0) / 100.0;
			return redondeo;	
		case "7":
			dolar=201.23;
			resultado=valor*dolar;
			 redondeo=Math.round(resultado * 100.0) / 100.0;
			return redondeo;
		case "8":
			 euro=216.91;
			 resultado=valor*euro;
			 redondeo=Math.round(resultado * 100.0) / 100.0;
			return redondeo;
		case "9":
			 libra=245.14;
			 resultado=valor*libra;
			 redondeo=Math.round(resultado * 100.0) / 100.0;
			return redondeo;	
		case "10":
			yen=1.53;
			resultado=valor*yen;
			 redondeo=Math.round(resultado * 100.0) / 100.0;
			return redondeo;	
		case "11":
			 won=0.15;
			 resultado=valor*won;
			 redondeo=Math.round(resultado * 100.0) / 100.0;
			return redondeo;
		default:
			break;
		}
		}
		
		return 0 ;
		
		
	}
	/**
	 * Create the frame.
	 */
	private void ejecutar() {
		// TODO Auto-generated method stub
		valor=get0pcion();
		if(valor == "Conversion de Monedas"   ) {
			setMoneda(opcionMoneda);
			valorMoneda=getMoneda();
			//JOptionPane.showMessageDialog(null, valorMoneda);
			
			}
			if(valor=="Conversion de Temperatura") {
				 JOptionPane.showMessageDialog(null, "En Construcción");
			}
			if(valor=="Seleccione") {
				 JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion");
				 
			}
	}

	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JButton btnNewButton = new JButton("INICIAR");
		btnNewButton.addActionListener(new ActionListener() {
			 @Override
			    public void actionPerformed(ActionEvent e) {
			        if (e.getSource() == btnNewButton) {
			            //System.out.println("Button clicked");
			        	set0pcion(seleccion);
						  ejecutar() ;	  
						  double resultadoCoti=cotizacionMoneda(monto);
						  if(resultadoCoti!=0)
						  {
						JOptionPane.showMessageDialog(null, "tienes un total de $ :"+ resultadoCoti+" "+ titulo,"Cambio moneda",JOptionPane.PLAIN_MESSAGE);
						/*int dialogResult = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Título del diálogo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

						if (dialogResult == JOptionPane.YES_OPTION) {
						    // Acción cuando se hace clic en el botón "Sí"
							//set0pcion(seleccion);
							  ejecutar() ;	  
							  resultadoCoti=cotizacionMoneda(monto);
							  if(resultadoCoti!=0)
							  {
							JOptionPane.showMessageDialog(null, "tienes un total de $ :"+ resultadoCoti+" "+ titulo,"Cambio moneda",JOptionPane.PLAIN_MESSAGE);
							  }
							} else if (dialogResult == JOptionPane.NO_OPTION) {
						    // Acción cuando se hace clic en el botón "No"
							} else if (dialogResult == JOptionPane.CANCEL_OPTION) {
						    // Acción cuando se hace clic en el botón "Cancelar"
							}*/
						  }
			        }
			    }
			/*public void actionPerformed(ActionEvent e) {
				
				set0pcion(seleccion);
				  ejecutar() ;	  
				  double resultadoCoti=cotizacionMoneda(monto);
				  if(resultadoCoti!=0)
				  {
				JOptionPane.showMessageDialog(null, "tienes un total de $ :"+ resultadoCoti+" "+ titulo,"Cambio moneda",JOptionPane.PLAIN_MESSAGE);
				  //JOptionPane.showMessageDialog(null, "tienes un total de $ :"+ resultadoCoti+" "+getMoneda( titulo),"Cambio moneda",JOptionPane.PLAIN_MESSAGE);
				  }
			}*/
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(161)
					.addComponent(btnNewButton)
					.addContainerGap(184, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addComponent(btnNewButton)
					.addContainerGap(182, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		
	}
}
