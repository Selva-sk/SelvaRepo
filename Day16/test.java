import javax.swing.*;  
import java.awt.event.*;  
import javax.swing.JFileChooser;
import java.io.*;

public class test extends JFrame implements ActionListener{  

public String fname,a,b,c,d,ee,ff,gg;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;  
JTextArea area;
JTextField f1,f2,f3,f4,f5,f6,f7;
JButton add,delete,edit,sort,first,update;  
public JFrame create,status,f,g,modify,remove;
JMenuBar menu;
JMenu file,quit;
JMenuItem New,open,save,saveAs;


test()
{
    f= new JFrame("Address Book");

	 New=new JMenuItem("New");
	 open=new JMenuItem("Open");
    save=new JMenuItem("Save");
	 saveAs=new JMenuItem("SaveAs");
	 New.addActionListener(this);
	 open.addActionListener(this);
    save.addActionListener(this);
    saveAs.addActionListener(this);
	 menu=new JMenuBar();
	 file=new JMenu("File");
    quit=new JMenu("Quit");
    file.add(New);file.add(open);file.add(save);file.add(saveAs);
    menu.add(file);menu.add(quit);

    l1=new JLabel();
    l1.setBounds(50,50,100,30);
    area=new JTextArea("No Users found...Click to Add");
    area.setBounds(120,50,400,300);
    add=new JButton("ADD");
    add.setBounds(100,500,120,30);
    add.addActionListener(this);
    edit=new JButton("EDIT");
    edit.setBounds(200,500,120,30);
    edit.addActionListener(this);
    delete=new JButton("DELETE");
    delete.setBounds(300,500,120,30);
    delete.addActionListener(this);
    sort=new JButton("SORT");
    sort.setBounds(400,500,120,30);
    sort.addActionListener(this);
    f.add(l1);f.add(area);f.add(add);f.add(edit);f.add(delete);f.add(sort);f.add(menu);
	 f.setJMenuBar(menu);
    f.setSize(700,700);
    f.setLayout(null);
    f.setVisible(true);
}

public void test1(String a,String b,String c,String d,String ee,String ff,String gg)
   {
    g= new JFrame("Updated Book");

    New=new JMenuItem("New");
    open=new JMenuItem("Open");
    save=new JMenuItem("Save");
    saveAs=new JMenuItem("SaveAs");
    New.addActionListener(this);
    open.addActionListener(this);
    save.addActionListener(this);
    saveAs.addActionListener(this);
    menu=new JMenuBar();
    file=new JMenu("File");
    quit=new JMenu("Quit");
    file.add(New);file.add(open);file.add(save);file.add(saveAs);
    menu.add(file);menu.add(quit);
	 g.add(menu);g.setJMenuBar(menu);
    l1=new JLabel();
    l1.setBounds(50,50,100,30);
    area=new JTextArea("                            ------USER DETAILS------");  
	 l3=new JLabel();
    l3.setText("First name :" + a);
    l3.setBounds(140,60,120,30);
    area.add(l3);
	 l4=new JLabel();
    l4.setText("Last name :" + b);
    l4.setBounds(140,80,120,30);
    area.add(l4);
    l5=new JLabel();
    l5.setText("City :" + c);
    l5.setBounds(140,100,120,30);
    area.add(l5);
	 l6=new JLabel();
    l6.setText("State :" + d);
    l6.setBounds(140,120,120,30);
    area.add(l6);
    l7=new JLabel();
    l7.setText("Zip :" + ee);
    l7.setBounds(140,140,120,30);
    area.add(l7);
	 l8=new JLabel();
    l8.setText("Address :" + ff);
    l8.setBounds(140,160,120,30);
    area.add(l8);
    l9=new JLabel();
    l9.setText("Phone :" + gg);
    l9.setBounds(140,180,120,30);
    area.add(l9);

    area.setBounds(120,50,400,300);
    add=new JButton("ADD");  
    add.setBounds(100,500,120,30);  
    add.addActionListener(this);
	 edit=new JButton("EDIT");
    edit.setBounds(200,500,120,30);
    edit.addActionListener(this);
    delete=new JButton("DELETE");
    delete.setBounds(300,500,120,30);
    delete.addActionListener(this);
    sort=new JButton("SORT");
    sort.setBounds(400,500,120,30);
    sort.addActionListener(this);
    g.add(l1);g.add(area);g.add(add);g.add(edit);g.add(delete);g.add(sort);
	 g.setSize(700,700);
    g.setLayout(null);
    g.setVisible(true);
	}

public void actionPerformed(ActionEvent e)
	{
if(e.getSource()==add)
		{
 	 		Create();
		}
if(e.getSource()==edit)
		{
	      Modify(a,b,c,d,ee,ff,gg);
		}

if(e.getSource()==delete)
		{
		g.setVisible(false);
		new test();
      }

if(e.getSource()==first)
      {
     		 create.setVisible(false);
     		 a=f1.getText();
	       b=f2.getText();
			 c=f3.getText();
			 d=f4.getText();
			 ee=f5.getText();
			 ff=f6.getText();
			 gg=f7.getText();
          status=new JFrame("Status");  
          JOptionPane.showMessageDialog(status,"Added Successfully..");
	    	 f.setVisible(false);
		    test1(a,b,c,d,ee,ff,gg);
      }
if(e.getSource()==update)
      {
          modify.setVisible(false);
          a=f1.getText();
          b=f2.getText();
          c=f3.getText();
          d=f4.getText();
          ee=f5.getText();
          ff=f6.getText();
			 gg=f7.getText();
          status=new JFrame("Status");
          JOptionPane.showMessageDialog(status,"Modified Successfully..");
          g.setVisible(false);
          test1(a,b,c,d,ee,ff,gg);
      }
if(e.getSource()==New)
{
			JFrame file=new JFrame("File");
          JOptionPane.showMessageDialog(file,"New File");
}
if(e.getSource()==open)
      {
       JFileChooser fc=new JFileChooser();    
    int i=fc.showOpenDialog(this);    
    if(i==JFileChooser.APPROVE_OPTION){    
        File f=fc.getSelectedFile();    
        String filepath=f.getPath();    
        try{  
        BufferedReader br=new BufferedReader(new FileReader(filepath));    
        String s1="",s2="";                         
        while((s1=br.readLine())!=null){    
        s2+=s1+"\n";    
        }    
        area.setText(s2);    
        br.close();    
        }catch (Exception ex) {ex.printStackTrace();  }                 
    } 
      }

if(e.getSource()==saveAs)
      {
         JFrame parentFrame = new JFrame();
 
JFileChooser fileChooser = new JFileChooser();
fileChooser.setDialogTitle("Specify a file to save");   

int userSelection = fileChooser.showSaveDialog(parentFrame);
 
if (userSelection == JFileChooser.APPROVE_OPTION) {
    File fileToSave = fileChooser.getSelectedFile();
	fileToSave.write(area);
    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
}
      }

}
public void Create()
	{
	 create=new JFrame("ADD USER DETAILS");
	 create.setSize(400,400);
    create.setLayout(null);
    create.setVisible(true);
	 JLabel firstname=new JLabel("First name :");
	 firstname.setBounds(25,20,100,30);
	 f1=new JTextField();
    f1.setBounds(100,25,100,25);
	 JLabel lastname=new JLabel("Last name :");
    lastname.setBounds(25,45,100,30);
    f2=new JTextField();
    f2.setBounds(100,50,100,25);
    JLabel city=new JLabel("City :");
    city.setBounds(25,70,100,30);
    f3=new JTextField();
    f3.setBounds(100,75,100,25);
	 JLabel state=new JLabel("State :");
    state.setBounds(25,95,100,30);
    f4=new JTextField();
    f4.setBounds(100,100,100,25);
	 JLabel zip=new JLabel("Zip :");
    zip.setBounds(25,120,100,30);
    f5=new JTextField();
    f5.setBounds(100,125,100,25);
	 JLabel address=new JLabel("Address :");
    address.setBounds(25,145,100,30);
    f6=new JTextField();
    f6.setBounds(100,150,100,50);
    JLabel phone=new JLabel("Phone :");
    phone.setBounds(25,195,100,30);
    f7=new JTextField();
    f7.setBounds(100,200,100,30);

	 first=new JButton("OK");
	 first.setBounds(100,300,70,30);
	 first.addActionListener(this);
	 create.add(firstname);create.add(f1);create.add(first);create.add(lastname);create.add(f2);create.add(city);create.add(f3);create.add(state);create.add(f4);create.add(zip);create.add(f5);create.add(address);create.add(f6);
    create.add(phone);create.add(f7);
}
public void Modify(String a,String b,String c,String d,String ee,String ff,String gg)
   {
    modify=new JFrame("MODIFY USER DETAILS");
    modify.setSize(400,400);
    modify.setLayout(null);
    modify.setVisible(true);
    JLabel firstname=new JLabel("First name :");
    firstname.setBounds(25,20,100,30);
    f1=new JTextField(a);
    f1.setBounds(100,25,100,25);
    JLabel lastname=new JLabel("Last name :");
    lastname.setBounds(25,45,100,30);
    f2=new JTextField(b);
    f2.setBounds(100,50,100,25);
    JLabel city=new JLabel("City :");
    city.setBounds(25,70,100,30);
    f3=new JTextField(c);
    f3.setBounds(100,75,100,25);
    JLabel state=new JLabel("State :");
    state.setBounds(25,95,100,30);
    f4=new JTextField(d);
    f4.setBounds(100,100,100,25);
    JLabel zip=new JLabel("Zip :");
    zip.setBounds(25,120,100,30);
    f5=new JTextField(ee);
    f5.setBounds(100,125,100,25);
    JLabel address=new JLabel("Address :");
    address.setBounds(25,145,100,30);
    f6=new JTextField(ff);
    f6.setBounds(100,150,100,50);
    JLabel phone=new JLabel("Phone :");
    phone.setBounds(25,195,100,30);
    f7=new JTextField(gg);
    f7.setBounds(100,200,100,30);

    update=new JButton("OK");
    update.setBounds(100,300,70,30);
    update.addActionListener(this);
    modify.add(firstname);modify.add(f1);modify.add(update);modify.add(lastname);modify.add(f2);modify.add(city);modify.add(f3);
    modify.add(state);modify.add(f4);modify.add(zip);modify.add(f5);modify.add(address);modify.add(f6);modify.add(phone);modify.add(f7);

   }

public static void main(String[] args)
	{
    test obj=new test();
	}
}
