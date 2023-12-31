import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Panel1 extends JPanel
{
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	JTextArea textArea;
	JComboBox comboBox,comboBox_1,comboBox_7,comboBox_8,comboBox_9;
	private JTextField textField_6;
	ButtonGroup bg,bg1;
	JRadioButton rdbtnNonacRoom,rdbtnAcRoom;
	JComboBox comboBox_2;
	JComboBox comboBox_5,comboBox_3,comboBox_4;
	
	public Panel1()
	{
		setLayout(null);
		
		JLabel lblDate = new JLabel("Customer name");
		lblDate.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblDate.setBounds(124, 218, 167, 28);
		add(lblDate);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		textField_1.setBounds(318, 218, 199, 28);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblAddress.setBounds(124, 291, 184, 28);
		add(lblAddress);
		
		textArea = new JTextArea();
		textArea.setBounds(318,267,199,99);
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		add(textArea);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(318,267,199,99);
		add(scrollPane);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number ");
		lblPhoneNumber.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblPhoneNumber.setBounds(124, 387, 184, 28);
		add(lblPhoneNumber);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		textField.setBounds(318, 387, 199, 28);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblRoomRequired = new JLabel("Room Type");
		lblRoomRequired.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblRoomRequired.setBounds(642, 65, 122, 28);
		add(lblRoomRequired);
		
		rdbtnAcRoom = new JRadioButton("AC");
		rdbtnAcRoom.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnAcRoom.setBounds(770, 66, 68, 28);
		add(rdbtnAcRoom);
		
		rdbtnNonacRoom = new JRadioButton("NON AC");
		rdbtnNonacRoom.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnNonacRoom.setBounds(840, 64, 109, 33);
		add(rdbtnNonacRoom);
		
		bg=new ButtonGroup();
		bg.add(rdbtnAcRoom);
		bg.add(rdbtnNonacRoom);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
	//	lblCustomerId.setBounds(x, y, width, height);
		lblCustomerId.setBounds(124, 65, 167, 28);
		add(lblCustomerId);
		
		textField_2 = new JTextField(Info2.math1());
		textField_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		textField_2.setBounds(318, 65, 199, 28);
		textField_2.setEditable(false);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSeater = new JLabel("Bed Type");
		lblSeater.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblSeater.setBounds(642, 170, 122, 28);
		add(lblSeater);
		
		JRadioButton rdbtnSingle = new JRadioButton("Single");
		rdbtnSingle.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnSingle.setBounds(750, 174, 80, 30);
		add(rdbtnSingle);
		
		JRadioButton rdbtnDouble = new JRadioButton("Double");
		rdbtnDouble.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnDouble.setBounds(840, 174, 90, 30);
		add(rdbtnDouble);
		
		JRadioButton rdbtnTriple = new JRadioButton("Triple");
		rdbtnTriple.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		rdbtnTriple.setBounds(940, 174, 80, 30);
		add(rdbtnTriple);
		
		bg1=new ButtonGroup();
		bg1.add(rdbtnSingle);bg1.add(rdbtnDouble);bg1.add(rdbtnTriple);
		
		String a="<html><u>Guest Information</u></html>";
		JLabel lblGuestInformation = new JLabel(a);
		lblGuestInformation.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblGuestInformation.setBounds(215, 11, 282, 33);
		add(lblGuestInformation);
		
		String b="<html><u>Room Information</u></html>";
		JLabel lblRoomInformation = new JLabel(b);
		lblRoomInformation.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
		lblRoomInformation.setBounds(753, 13, 208, 28);
		add(lblRoomInformation);	
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblCity.setBounds(124, 436, 68, 28);
		add(lblCity);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		textField_3.setBounds(318, 436, 199, 28);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblState.setBounds(124, 487, 85, 28);
		add(lblState);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		textField_4.setBounds(318, 487, 199, 28);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID Type");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel.setBounds(124, 540, 136, 28);
		add(lblNewLabel);
		
		String str1[]={"Select","Pancard","Aadhar-card","Voter-id","Passport","DL","Other"};
		comboBox = new JComboBox(str1);
		comboBox.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		comboBox.setBounds(316, 540, 167, 28);
		add(comboBox);
		
		JLabel lblIdNumber = new JLabel("ID Number");
		lblIdNumber.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblIdNumber.setBounds(124, 590, 136, 28);
		add(lblIdNumber);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		textField_5.setBounds(318, 590, 199, 28);
		add(textField_5);	
		textField_5.setColumns(10);
		
		JLabel lblDateIn = new JLabel("Days");
		lblDateIn.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblDateIn.setBounds(642, 119, 124, 28);
		add(lblDateIn);

		String str21[]=new String[11];
		int i1,j1=1;
		str21[0]="Days";
		for(i1=1;i1<11;i1++)
		{
			str21[i1]=Integer.toString(j1);
			j1++;
		}
		 comboBox_1 = new JComboBox(str21);
		comboBox_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		comboBox_1.setBounds(776, 119, 136, 28);
		add(comboBox_1);
		
		JLabel lblDateIn_1 = new JLabel("Check IN");
		lblDateIn_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblDateIn_1.setBounds(124, 119, 109, 28);
		add(lblDateIn_1);
		
		String str11[]=new String[32];
		int i,j=1;
		str11[0]="Day";
		for(i=1;i<32;i++)
		{
			str11[i]=Integer.toString(j);
			j++;
		}
		
		String str12[]={"Month","January","Feburary","March","April","May","June","July","August","September","October","November","December"};
		
		String str13[]={"Year","2016","2017"};
		
		JLabel lblNewLabel_1 = new JLabel("No of Adults");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(642, 268, 122, 28);
		add(lblNewLabel_1);
		
		JLabel lblNoOfMinors = new JLabel("No of Minors");
		lblNoOfMinors.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNoOfMinors.setBounds(642, 324, 130, 28);
		add(lblNoOfMinors);
		
		String str3[]=new String[7];
		int i2,j2=1;
		str3[0]="Select";
		for(i2=1;i2<7;i2++)
		{
			str3[i2]=Integer.toString(j2);
			j2++;
		}
		comboBox_7 = new JComboBox(str3);
		comboBox_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		comboBox_7.setBounds(776, 268, 97, 28);
		add(comboBox_7);
		
		String str31[]=new String[7];
		int i3,j3=0;
		str31[0]="Select";
		for(i3=1;i3<7;i3++)
		{
			str31[i3]=Integer.toString(j3);
			j3++;
		}
		comboBox_8 = new JComboBox(str31);
		comboBox_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		comboBox_8.setBounds(776, 324, 97, 28);
		add(comboBox_8);
		
		
		JLabel lblTotal = new JLabel("Total(Rs)");
		lblTotal.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblTotal.setBounds(642, 487, 109, 28);
		add(lblTotal);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		textField_7.setBounds(776, 487, 160, 28);
		add(textField_7);
		textField_7.setColumns(10);
		textField_7.setEditable(false);
		
		JLabel lblPaidrs = new JLabel("Paid(Rs)");
		lblPaidrs.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblPaidrs.setBounds(642, 540, 109, 28);
		add(lblPaidrs);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		textField_8.setBounds(776, 540, 160, 28);
		add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblDuers = new JLabel("Due(Rs)");
		lblDuers.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblDuers.setBounds(642, 590, 109, 28);
		add(lblDuers);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		textField_9.setBounds(776, 590, 160, 28);
		add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnNewButton.setBounds(465, 647, 128, 45);
		btnNewButton.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				String s1=textField.getText();
				String s2=textField_1.getText();
				String s4=textField_3.getText();
				String s5=textField_4.getText();
				String s6=textField_5.getText();
				String s8=textField_7.getText();
				String s9=textField_8.getText();
				String s10=textField_9.getText();
				String s3=textField_2.getText();
				String s7=textField_6.getText();
				String sc1=(String) comboBox.getSelectedItem();
				String sc2=(String) comboBox_1.getSelectedItem();
				String sc3=(String) comboBox_7.getSelectedItem();
				String sc4=(String) comboBox_8.getSelectedItem();
				String sc5=(String) comboBox_9.getSelectedItem();
				String sa=textArea.getText();
				String sc6=(String)comboBox_2.getSelectedItem();
				String sc7=(String)comboBox_3.getSelectedItem();
				String sc8=(String)comboBox_4.getSelectedItem();
				String sc9=(String)comboBox_5.getSelectedItem();
				int type=0,bed=0;
				String rt,bt;
				if(s1.length()==0 ||s2.length()==0 ||s4.length()==0 ||s5.length()==0 ||s6.length()==0 ||s8.length()==0 ||s9.length()==0 ||s10.length()==0 ||sc1.equalsIgnoreCase("Select") ||sc2.equalsIgnoreCase("Days")||sc3.equalsIgnoreCase("Select")||sc4.equalsIgnoreCase("Select")||sc5.equalsIgnoreCase("Select")||sa.length()==0||!(rdbtnAcRoom.isSelected() || rdbtnNonacRoom.isSelected()) || !(rdbtnSingle.isSelected()||rdbtnDouble.isSelected()||rdbtnTriple.isSelected())||sc6.equalsIgnoreCase("Select")||sc7.equalsIgnoreCase("-")||sc8.equalsIgnoreCase("-")||sc9.equalsIgnoreCase("-"))
				{
					 JOptionPane.showMessageDialog(Panel1.this, "Please fill/select all the fields", "Error", JOptionPane.ERROR_MESSAGE);		
				}
				else
				{
					
					if(rdbtnAcRoom.isSelected())
					{
						type=1;
						rt="Ac";
					}
					else
					{
						type=2;
						rt="Non Ac";
					}
					
					if(rdbtnSingle.isSelected())
					{
						bed=1;
						bt="Single";
					}
					else if(rdbtnDouble.isSelected())
					{
						bed=2;
						bt="Double";
					}
					else
					{
						bed=3;
						bt="Triple";
					}
					
					String query="insert into booking values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					int flag=0;
					Connection con;
					try
					{
						 con=Info2.con();
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1, textField_2.getText());
						ps.setString(2, textField_6.getText());
						ps.setString(3, sc7+'.'+sc8+'.'+sc9);
						ps.setString(4, textField_1.getText());
						ps.setString(5, textArea.getText());
						ps.setString(6, textField.getText());
						ps.setString(7, textField_3.getText());
						ps.setString(8, textField_4.getText());
						ps.setString(9, sc1);
						ps.setString(10, textField_5.getText());
						ps.setString(11, rt);
						ps.setString(12, sc2);
						ps.setString(13, bt);
						ps.setString(14, sc6);
						ps.setString(15, sc3);
						ps.setString(16, sc4);
						ps.setString(17, sc5);
						ps.setString(18, textField_7.getText());
						ps.setString(19, textField_8.getText());
						ps.setString(20, textField_9.getText());
						flag=ps.executeUpdate();
					} 
					catch (Exception e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(flag==1)
					{
						JOptionPane.showMessageDialog(Panel1.this, "Booking is Done", "Added", JOptionPane.INFORMATION_MESSAGE);
						reset1();
					}
					else
					{
						JOptionPane.showMessageDialog(Panel1.this, "Book Not Added", "Error", JOptionPane.ERROR_MESSAGE);
					}
					
					String query1="insert into status_current values(?,?,?,?,?)";
					Connection con1;
					try
					{
						con1=Info2.con();
						PreparedStatement ps1=con1.prepareStatement(query1);
						ps1.setString(1, s3);
						ps1.setString(2, s2);
						ps1.setString(3, sc6);
						ps1.setString(4, s7);
						ps1.setString(5, sc7+'.'+sc8+'.'+sc9);
						ps1.executeUpdate();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
				}
		
			}
		});
		add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnReset.setBounds(627, 647, 122, 45);
		btnReset.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				reset1();
			}
		});
		add(btnReset);
		
		JLabel lblPayBy = new JLabel("Pay By");
		lblPayBy.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblPayBy.setBounds(642, 436, 122, 28);
		add(lblPayBy);
		
		String pay[]={"Select","Cash","CreditCard","DebitCard","Paytm","OnlineTransfer"};
		comboBox_9 = new JComboBox(pay);
		comboBox_9.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		comboBox_9.setBounds(776, 436, 160, 28);
		add(comboBox_9);
		
		JLabel lblRoomAvailable = new JLabel("Room No.");
		lblRoomAvailable.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblRoomAvailable.setBounds(642, 218, 122, 28);
		add(lblRoomAvailable);
		
		Date d=new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
		textField_6 = new JTextField(ft.format(d));
		textField_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		textField_6.setBounds(318, 119, 199, 28);
		textField_6.setEditable(false);
		add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Bill");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		btnNewButton_1.setBounds(712, 374, 148, 35);
		add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				// TODO Auto-generated method stub
				int type=0,bed=0,amount=0,ac=0,non=0;
				String room;
				room=(String)comboBox_1.getSelectedItem();
				int i=0,j=0;
				if(rdbtnAcRoom.isSelected())
				{
					type=1;
					ac=350;
				}
				else
				{
					type=2;
				}
				
				if(rdbtnSingle.isSelected())
				{
					bed=1;
					non=500;
				}
				else if(rdbtnDouble.isSelected())
				{
					bed=2;
					non=650;
				}
				else
				{
					bed=3;
					non=800;
				}
				
				if(room.equalsIgnoreCase("Days")||type==0||bed==0)
				{
					JOptionPane.showMessageDialog(Panel1.this, "Please fill/select all the fields", "Error", JOptionPane.ERROR_MESSAGE);	
				}
				else
				{
				amount=(non+ac)*Integer.parseInt(room);				
				textField_7.setText(Integer.toString(amount));
				}
				
			}
		});
		
		String mj[]=new String[31];
		int rm=0;
		mj[0]="Select";
		for(rm=1;rm<31;rm++)
		{
			mj[rm]=Integer.toString(rm);
		}
		comboBox_2 = new JComboBox(mj);
		comboBox_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		comboBox_2.setBounds(776, 218, 133, 28);
		add(comboBox_2);
		
		JLabel lblCheckOut = new JLabel("Check OUT");
		lblCheckOut.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblCheckOut.setBounds(124, 170, 136, 28);
		add(lblCheckOut);
		
		String d1[]=new String[32];
		int k1=0,l1=1;
		d1[0]="-";
		for(k1=1;k1<32;k1++)
		{
			d1[k1]=Integer.toString(l1);
			l1++;
		}
		comboBox_3 = new JComboBox(d1);
		comboBox_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		comboBox_3.setBounds(318, 170, 55, 28);
		add(comboBox_3);
		
		String d2[]=new String[13];
		int k2=0,l2=1;
		d2[0]="-";
		for(k2=1;k2<13;k2++)
		{
			d2[k2]=Integer.toString(l2);
			l2++;
		}
		comboBox_4 = new JComboBox(d2);
		comboBox_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		comboBox_4.setBounds(383, 170, 63, 28);
		add(comboBox_4);
		
		String d3[]={"-","2016","2017"};
		comboBox_5 = new JComboBox(d3);
		comboBox_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		comboBox_5.setBounds(456, 170, 75, 28);
		add(comboBox_5);
		
	}
	
	void reset1()
	{
		textField_2.setText(Info2.math1());
	      textField_1.setText(null);
	      textField.setText(null);
	      textField_3.setText(null);
	      textField_4.setText(null);
	      textField_5.setText(null);
	      textField_7.setText(null);
	      textField_8.setText(null);
	      textField_9.setText(null);
	      textArea.setText(null);
	      comboBox_1.setSelectedIndex(0);
	      comboBox_7.setSelectedIndex(0);
	      comboBox_8.setSelectedIndex(0);
	      comboBox_9.setSelectedIndex(0);
	      comboBox.setSelectedIndex(0);
	      comboBox_2.setSelectedIndex(0);
	      bg.clearSelection();
	      bg1.clearSelection();
	      comboBox_5.setSelectedIndex(0);
	      comboBox_4.setSelectedIndex(0);
	      comboBox_3.setSelectedIndex(0);
	}
}
