package Classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class contribution extends JFrame implements ActionListener 
{
	private ImageIcon img;
	private JLabel sadmanLabel,showravLabel,arafatLabel,hasibLabel,imgLabel,tanvirNameLabel,
	        tanvirIdLabel,sadmanNameLabel,sadmanIdLabel,arafatNameLabel,arafatIdLabel,
	        showravNameLabel,showravIdLabel;
	private JButton backbtn;
	private JPanel panel;
	private Font myFont,font;

	public contribution()
	{
		super("Our contribution");
		this.setSize(1366,768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFont = new Font("Agency FB", Font.BOLD, 29);
		font = new Font("Arial", Font.BOLD, 12);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		hasibLabel = new JLabel("Tanvir's details");
		hasibLabel.setBounds(150, 265, 406, 30);
		hasibLabel.setForeground(Color.BLACK);
		hasibLabel.setFont(myFont);
		panel.add(hasibLabel);
		
		sadmanLabel = new JLabel("Sadman's details");
        sadmanLabel.setBounds(600, 265, 406, 30);
        sadmanLabel.setForeground(Color.BLACK);
        sadmanLabel.setFont(myFont);
        panel.add(sadmanLabel);
		
		
	    arafatLabel = new JLabel("Arafat's details");
		arafatLabel.setBounds(150,495, 406, 30);
		arafatLabel.setForeground(Color.BLACK);
		arafatLabel.setFont(myFont);
		panel.add(arafatLabel);
		
		showravLabel = new JLabel("Showrav's details");
        showravLabel.setBounds(600, 495, 406, 30); 
        showravLabel.setForeground(Color.BLACK);
        showravLabel.setFont(myFont);
        panel.add(showravLabel);
		
		//Name and id Tanvir
		tanvirNameLabel = new JLabel("Name: Md.TANVIR HASIB FAHIM");
        tanvirNameLabel.setBounds(150, 295, 406, 20);
        tanvirNameLabel.setFont(font);
        panel.add(tanvirNameLabel);
    
        tanvirIdLabel = new JLabel("ID: 23-51140-1");
        tanvirIdLabel.setBounds(150, 315, 406, 20);
        tanvirIdLabel.setFont(font);
        panel.add(tanvirIdLabel);
		
		//Name and id Sadman
        sadmanNameLabel = new JLabel("Name: ASIF,SADMAN SAHAT MAJUMDAR");
        sadmanNameLabel.setBounds(600, 295, 406, 20);
        sadmanNameLabel.setFont(font);
        panel.add(sadmanNameLabel);
    
        sadmanIdLabel = new JLabel("ID: 22-48401-3");
        sadmanIdLabel.setBounds(600, 315, 406, 20);
        sadmanIdLabel.setFont(font);
        panel.add(sadmanIdLabel);
    
	    //Name and id Arafat
        arafatNameLabel = new JLabel("Name: Md.ARAFAT RAHMAN");
        arafatNameLabel.setBounds(150, 525, 406, 20);
        arafatNameLabel.setFont(font);
        panel.add(arafatNameLabel);
    
        arafatIdLabel = new JLabel("ID: 23-51459-1");
        arafatIdLabel.setBounds(150, 545, 406, 20);
        arafatIdLabel.setFont(font);
        panel.add(arafatIdLabel);
    
	   //Name and id Showrav
       showravNameLabel = new JLabel("Name: SHOWRAV GHOSH");
       showravNameLabel.setBounds(600, 525, 406, 20);
       showravNameLabel.setFont(font);
       panel.add(showravNameLabel);
    
       showravIdLabel = new JLabel("ID: 23-50666-1");
       showravIdLabel.setBounds(600, 545, 406, 20);
       showravIdLabel.setFont(font);
       panel.add(showravIdLabel);
	   
	   backbtn=new JButton();
		backbtn.setBounds(30,70,50,40);
		backbtn.setContentAreaFilled(false);
		backbtn.setBorderPainted(false);
		backbtn.setIcon(new ImageIcon("Image/return.png"));
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		
		img = new ImageIcon("Image/Tanvir.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(150, 100, 150, 150);
		panel.add(imgLabel);
		this.add(panel);
		
		img = new ImageIcon("Image/arafat.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(150, 335, 150, 150);
		panel.add(imgLabel);
		this.add(panel);
		
		img = new ImageIcon("Image/sadman.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(600, 100, 150, 150);
		panel.add(imgLabel);
		this.add(panel);
		
		img = new ImageIcon("Image/showrab.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(600, 335, 150, 150);
		panel.add(imgLabel);
		this.add(panel);
		
		
		img = new ImageIcon("Image/forContribution1370x770.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,1370,770);
		panel.add(imgLabel);
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==backbtn)
		{
			Login l1=new Login();
			l1.setVisible(true);
			this.setVisible(false);
		}
		
	}
	
}