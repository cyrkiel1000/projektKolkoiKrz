package kolkokrzyzyk;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import baza.baza;

public class kolkogra  {

	private JFrame frame;
	private JTable table;
	String user = "X";
	int i=0;
	int a=2;
	int b=2;
	int c=2;
	int d=2;
	int e1=2;
        int f=2;
	int g=2;
	int j=2;
	int h=2;
	
	// zmienne niezbędne do ustalenia wyniku gry
	 String nazwako ="";
	 String nazwakrz="";
	 String wygrany="";
	 private JTextField txtPodajImieKrzyyk;
	 private JTextField txtPodajImieKko;
	 private JTextField textField_grz;
	 private JTextField textField_gk;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public kolkogra() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	
		
		baza baza = new baza();
		String [][] wyniki = new String [5][];
        wyniki=baza.rekordy();
        
        // zanicjowanie tablicy 2 wymiarowej niezbędnej do dodania wartości do tabeli
    
		
		System.out.println("i= " + i);
		frame = new JFrame();
		frame.setBounds(100, 100, 644, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 25, 97, 87);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton buton11 = new JButton("");
		buton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//ustawienie odpowiedniego znaku 
				
			if (buton11.getText()=="")
			{
				if(i%2==0)
				{
					buton11.setText("x");
					a=1;
				}
				else 
					{
					a=0;
					buton11.setText("o");
					}
			i++;
			
			//sprawdzanie kto wygrał
			
			if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==0)
			{wygrany= nazwako;
			baza.inserttabela(nazwako, nazwakrz, wygrany);
				JOptionPane.showMessageDialog(null, "wygrana kolko");
			}
			
			if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==1)
			{wygrany= nazwakrz;
			baza.inserttabela(nazwako, nazwakrz, wygrany);
				JOptionPane.showMessageDialog(null, "wygrana krzyzyk");
			}
			if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==3)
			{baza.inserttabela(nazwako, nazwakrz, "remis");
				JOptionPane.showMessageDialog(null, "remis");
			}
			
			
			}
			
			}
		});
		panel.add(buton11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(127, 25, 97, 87);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton buton12 = new JButton("");
		buton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (buton12.getText()=="")
				{
					if(i%2==0)
					{
						buton12.setText("x"); 
						b=1;
					}
					else
						{
						buton12.setText("o");
						b=0 ;
						}
				i++;
				System.out.println("i= " + i);
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==0)
				{wygrany= nazwako;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana kolko");
				}
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==1)
				{wygrany= nazwakrz;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana krzyzyk");
				}
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==3)
				{baza.inserttabela(nazwako, nazwakrz, "remis");
					JOptionPane.showMessageDialog(null, "remis");
				}
				}
			}
			
		});
		panel_1.add(buton12);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(224, 25, 97, 87);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton button_13 = new JButton("");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (button_13.getText()=="")
				{
					if(i%2==0)
					{
						button_13.setText("x");
						c=1;
					}
					else {
					c=0;
						button_13.setText("o"
                                                        + "");
					}
					
				
				i++;
				
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==0)
				{wygrany= nazwako;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana kolko");
				}
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==1)
				{wygrany= nazwakrz;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana krzyzyk");
				}
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==3)
				{baza.inserttabela(nazwako, nazwakrz, "remis");
					JOptionPane.showMessageDialog(null, "remis");
				}
				}
				
			}
		});
		panel_2.add(button_13);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(30, 108, 97, 87);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton Button_21 = new JButton("");
		Button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (Button_21.getText()=="")
				{
					if(i%2==0)
					{
						Button_21.setText("x");
						d=1;
					}
					else 
						{
						d=0;
						Button_21.setText("o");
						}
				i++;
				
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==0)
				{wygrany= nazwako;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana kolko");
				}
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==1)
				{wygrany= nazwakrz;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana krzyzyk");
				}
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==3)
				{baza.inserttabela(nazwako, nazwakrz, "remis");
					JOptionPane.showMessageDialog(null, "remis");
				}
				}
			}
		});
		panel_3.add(Button_21);
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(127, 108, 97, 87);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton button_22 = new JButton("");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
				if (button_22.getText()=="")
				{
					if(i%2==0)
					{ e1=1;
						button_22.setText("x");
					}
					else {
						button_22.setText("o");
					e1=0;
					}
				
				
				i++;
				
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==0)
				{wygrany= nazwako;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana kolko");
				}
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==1)
				{wygrany= nazwakrz;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana krzyzyk");
				}
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==3)
				{baza.inserttabela(nazwako, nazwakrz, "remis");
					JOptionPane.showMessageDialog(null, "remis");
				}
				}
				
				
			}
		});
		panel_4.add(button_22);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(224, 108, 97, 87);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton button23 = new JButton("");
		button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (button23.getText()=="")
				{
					if(i%2==0)
					{
						button23.setText("x");
						f=1;
					}
					else 
						{
						button23.setText("o");
						f=0;
						}
				i++;
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==0)
				{wygrany= nazwako;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana kolko");
				}
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==1)
				{wygrany= nazwakrz;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana krzyzyk");
				}
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==3)
				{baza.inserttabela(nazwako, nazwakrz, "remis");
					JOptionPane.showMessageDialog(null, "remis");
				}
				}
				
			}
		});
		panel_5.add(button23);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(30, 193, 97, 87);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton button31 = new JButton("");
		button31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				if (button31.getText()=="")
				{
					if(i%2==0)
					{ g=1;
						button31.setText("x");
					}
					else {
						g=0;
						button31.setText("o");
					}
				i++;
				
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==0)
				{wygrany= nazwako;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana kolko");
				}
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==1)
				{wygrany= nazwakrz;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana krzyzyk");
				}
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==3)
				{baza.inserttabela(nazwako, nazwakrz, "remis");
					JOptionPane.showMessageDialog(null, "remis");
				}
				}
			}
		});
		panel_6.add(button31);
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(127, 193, 97, 87);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton button32 = new JButton("");
		button32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (button32.getText()=="")
				{
					if(i%2==0)
					{ h=1;
						button32.setText("x");
					}
					else {
						h=0;
						button32.setText("o");
					}
				i++;
				System.out.println("i= " + i);
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==0)
				{wygrany= nazwako;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana kolko");
				}
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==1)
				{wygrany= nazwakrz;
				baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana krzyzyk");
				}
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==3)
				{baza.inserttabela(nazwako, nazwakrz, "remis");
					JOptionPane.showMessageDialog(null, "remis");
				}
				}
			}
		});
		panel_7.add(button32);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(224, 193, 97, 87);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton button33 = new JButton("");
		button33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				if (button33.getText()=="")
				{
					if(i%2==0)
					{j=1;
						button33.setText("x");
						
					}
					else 
						{ j=0;
						button33.setText("o");
						}
				i++;
				
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==0)
				{
					wygrany= nazwako;
					baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana kolko");
				}
				
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==1)
					
				{	wygrany= nazwakrz;
					baza.inserttabela(nazwako, nazwakrz, wygrany);
					JOptionPane.showMessageDialog(null, "wygrana krzyzyk");
				}
				if  (wygrana(a,b,c,d,e1,f,g,h,j,i)==3)
				{  baza.inserttabela(nazwako, nazwakrz, "remis");
					JOptionPane.showMessageDialog(null, "remis");
				}
				
				}
			}
		});
		panel_8.add(button33);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 325, 567, 107);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		//ustawienie modelu dla jtable
		
		DefaultTableModel model = new DefaultTableModel();
		
		// dodanie rekordów oraz nazw kolumn dla tabeli
Object[] columns = {"gracz kolko","gracz krzyzyk","wygrany","Data"};
		
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		
		Object[] row = new Object[wyniki.length];
		for (int j=0 ; j<wyniki[0].length ;j++) {
		
		row[0]=wyniki[0][j];
		row[1]=wyniki[1][j];
		row[2]=wyniki[2][j];
		row[3]=wyniki[3][j];
		
		model.addRow(row); 
		
	} 
		
	
		//zrestartowanie gry
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			
				
			buton11.setText("");
			buton12.setText("");
			
			button_13.setText("");
			Button_21.setText("");
			button_22.setText("");
			button23.setText("");
			button31.setText("");
			button32.setText("");
			button33.setText("");
			i=0;
		   a=2;
		   b=2;
		   c=2;
		   d=2;
		   e1=2;
		   f=2;
		   g=2;
		   h=2;
		   j=2;
			}
		});
		btnReset.setBounds(127, 291, 97, 23);
		frame.getContentPane().add(btnReset);
		
		txtPodajImieKrzyyk = new JTextField();
		txtPodajImieKrzyyk.setEditable(false);
		txtPodajImieKrzyyk.setText("podaj nazwe krzyżyka:");
		txtPodajImieKrzyyk.setBounds(480, 112, 153, 20);
		frame.getContentPane().add(txtPodajImieKrzyyk);
		txtPodajImieKrzyyk.setColumns(10);
		
		txtPodajImieKko = new JTextField();
		txtPodajImieKko.setEditable(false);
		txtPodajImieKko.setText("podaj nazwe kółka:");
		txtPodajImieKko.setBounds(340, 112, 133, 20);
		frame.getContentPane().add(txtPodajImieKko);
		txtPodajImieKko.setColumns(10);
		
		textField_grz = new JTextField();
		textField_grz.setBounds(510, 138, 87, 20);
		frame.getContentPane().add(textField_grz);
		textField_grz.setColumns(10);
		
		textField_gk = new JTextField();
		textField_gk.setBounds(364, 138, 86, 20);
		frame.getContentPane().add(textField_gk);
		textField_gk.setColumns(10);
		
		// przycisk do zatwierdzenia wpisania imion
		
		JButton btnNewButton = new JButton("Wprowadź");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
                        nazwako	= textField_gk.getText();
			nazwakrz = textField_grz.getText();
				
			}
		});
		btnNewButton.setBounds(432, 173, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kolkogra window = new kolkogra();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	// metoda ze  schematem wygranej
	
	
	int wygrana ( int a , int b , int c , int d , int e , int f , int g , int h , int j , int i) {
		
		if ( (a==0 && b==0 && c==0) || (d==0 && e==0 && f==0) || (g==0 && h==0 && j==0) || (a==0 && d==0 && g==0)  ||
				(b==0 && e==0 && h==0) || (c==0 && f==0 && j==0) || (a==0 && e==0 && j==0) || (c==0 && e==0 && g==0)  )
		{
			return 0;
		}
		
		if (i==9) {
			return 3;
		}
		
		if ( (a==1 && b==1 && c==1) || (d==1 && e==1 && f==1) || (g==1 && h==1 && j==1) || (a==1 && d==1 && g==1)  ||
				(b==1 && e==1 && h==1) || (c==1 && f==1 && j==1) || (a==1 && e==1 && j==1) || (c==1 && e==1 && g==1)  )
		{
			return 1;
		}
		
		
		return 2;
	}
	
}
