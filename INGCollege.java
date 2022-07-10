/**
 * INGCollege class is the class which consists of components required for GUI. Differrent getter methods, a method for GUI and 
   a main method is defined in this class.
 *
 * @author (Aakash Shrestha)
 * @version (11.0.2)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;

public class INGCollege implements ActionListener
{
    //An instance ArrayList and several instance variables of type JFrame, JPanel, JTextField, JButton, JComboBox, JLabel and Font are created.
    private ArrayList<Course> course = new ArrayList();
    private JFrame frame,frame1;
    private JPanel panel;    
    private JTextField Field,field_CourseName,field_Duration,field_Level,field_Credit,field_NumOfAssessments,field_CourseID1,field_CourseLeader,field_LecturerName;     
    private JButton button_AddCourse,button_Register,button_Display,button_Clear,button_Change,button_Remove;
    private JComboBox ComboBox_Year1,ComboBox_Month1,ComboBox_Day1,ComboBox_Year2,ComboBox_Month2,ComboBox_Day2,ComboBox_Year3,ComboBox_Month3,ComboBox_Day3;
    private JLabel labelTitle,label_Level,label_Credit,label_NumOfAssessments,label_LecturerName,label_ExamDate,l2;
    private Font font1,font2,ff1;
    private Border border2;
    /*
     * This method which contains the various components of the Graphical User Interface.
     * Different  JFrame, JPanel, JTextField, JButton, JComboBox, JLabel, Color and Font are created here. 
     */
    public void GUI()
    {
        //JFrame 
        frame = new JFrame("Course Registration");
        frame.setBounds(10,30,770,670);
        frame.setResizable(false);
        
        //JFrame for display
        frame1 = new JFrame("Display");
        frame1.setBounds(790,30,590,670);
        frame1.setResizable(false);
        
        //Color for frame1
        Color color = new Color(167, 228, 232);
        frame1.getContentPane().setBackground(color);
        
        Color color1 = new Color(0, 185, 252);
        Border border1 = BorderFactory.createMatteBorder(5, 5, 6, 5, color1);
        frame1.getRootPane().setBorder(border1);
        frame1.setLayout(null);
        
        
        //Font for Output of Academic Course
        Font ff = new Font("Arial",Font.BOLD,22);
        l2 = new JLabel("Output of Academic Course");
        l2.setBounds(105,15,420,35);
        l2.setFont(ff);
        
        //JPanel
        panel = new JPanel();
        Color cc = new Color(255, 235, 205);
        panel.setBackground(cc);
        panel.setLayout(null);
        
        //Border for Panel
        Border border = BorderFactory.createLineBorder(Color.BLACK,4);
        //Border for TextArea
        border2 = BorderFactory.createLineBorder(Color.BLACK,3);
        panel.setBorder(border);
        
        
        //JLabel for Academic Course
        labelTitle = new JLabel();
        labelTitle.setText("Academic Course");
        labelTitle.setBounds(280,15,380,35);
        labelTitle.setFont(ff);
        panel.add(labelTitle);
        
        //Jlabel for Add Course
        JLabel label_Add = new JLabel("Add Course");
        label_Add.setBounds(35,65,120,25);
        //Font for Add Course
        Font f = new Font("Arial",Font.BOLD,18);
        label_Add.setFont(f);
        panel.add(label_Add);
        
        
        //Font for JButton
        font1 = new Font("",Font.BOLD,12);
        //Font for JButton
        font2 = new Font("",Font.BOLD,13);
        //JButton for Change to Non-Academic Course
        button_Change = new JButton("Change to Non-Academic Course");
        button_Change.setFont(font1);
        button_Change.setBounds(498,64,230,28);
        button_Change.addActionListener(this);
        button_Change.setBackground(Color.white);
        panel.add(button_Change);
        
        //font for JLabel of TextFields
        ff1=new Font("Serif",Font.PLAIN,17);
        //Jlabel for CourseID
        JLabel l1 = new JLabel("CourseID:");
        l1.setBounds(35,115,95,25);
        l1.setFont(ff1);
        panel.add(l1);
        //JTextField for CourseID
        Field = new JTextField();
        Field.setBounds(165,114,180,28);
        panel.add(Field);
       
        //Jlabel for Course Name
        JLabel label_CourseName = new JLabel("Course Name:");
        label_CourseName.setBounds(35,165,105,25);
        label_CourseName.setFont(ff1);
        panel.add(label_CourseName);
        //JTextField for Course Name
        field_CourseName = new JTextField();
        field_CourseName.setBounds(165,165,180,28);
        panel.add(field_CourseName);
        
        //Jlabel for Duration
        JLabel label_Duration = new JLabel("Duration:");
        label_Duration.setBounds(35,215,125,25);
        label_Duration.setFont(ff1);
        panel.add(label_Duration);
        //JTextField for Duration
        field_Duration = new JTextField();
        field_Duration.setBounds(165,215,180,28);
        panel.add(field_Duration);
        
        //Jlabel for Level
        label_Level = new JLabel("Level:");
        label_Level.setBounds(400,115,95,25);
        label_Level.setFont(ff1);
        panel.add(label_Level);
        //JTextField for Level
        field_Level = new JTextField();
        field_Level.setBounds(550,114,180,28);
        panel.add(field_Level);
        
        //Jlabel for Credit
        label_Credit = new JLabel("Credit:");
        label_Credit.setBounds(400,165,95,25);
        label_Credit.setFont(ff1);
        panel.add(label_Credit);
        //JTextField for Credit
        field_Credit = new JTextField();
        field_Credit.setBounds(550,165,180,28);
        panel.add(field_Credit);
        
        //Jlabel for No. of assessments
        label_NumOfAssessments = new JLabel("No. of assessments:");
        label_NumOfAssessments.setBounds(400,215,145,25);
        label_NumOfAssessments.setFont(ff1);
        panel.add(label_NumOfAssessments);
         //JTextField for No. of assessments
        field_NumOfAssessments = new JTextField();
        field_NumOfAssessments.setBounds(550,214,180,28);
        panel.add(field_NumOfAssessments);
        
        //JButton for Add Academic Course
        button_AddCourse = new JButton("Add Academic Course");
        button_AddCourse.setBounds(280,265,200,28);
        button_AddCourse.setFont(font2);
        Color c1 = new Color(255, 244, 227);
        button_AddCourse.setBackground(c1);
        button_AddCourse.addActionListener(this);
        panel.add(button_AddCourse);
        //JLabel for Register Course
        JLabel label_RegisterCourse = new JLabel("Register Course");
        label_RegisterCourse.setBounds(35,315,160,25);
        label_RegisterCourse.setFont(f);
        panel.add(label_RegisterCourse);
        
        //Jlabel for CourseID1
        JLabel label_CourseID1 = new JLabel("CourseID:");
        label_CourseID1.setBounds(35,365,95,25);
        label_CourseID1.setFont(ff1);
        panel.add(label_CourseID1);
        //JTextField for CourseID1
        field_CourseID1 = new JTextField();
        field_CourseID1.setBounds(165,365,180,28);
        panel.add(field_CourseID1);
        
        //Jlabel for Course Leader
        JLabel label_CourseLeader = new JLabel("Course Leader:");
        label_CourseLeader.setBounds(35,415,115,25);
        label_CourseLeader.setFont(ff1);
        panel.add(label_CourseLeader);
        //JTextField for Course Leader
        field_CourseLeader = new JTextField();
        field_CourseLeader.setBounds(165,415,180,28);
        panel.add(field_CourseLeader);
        
        //Jlabel for Lecturer Name
        label_LecturerName = new JLabel("Lecturer Name:");
        label_LecturerName.setBounds(35,465,125,25);
        label_LecturerName.setFont(ff1);
        panel.add(label_LecturerName);
        //JTextField for Lecturer Name
        field_LecturerName = new JTextField();
        field_LecturerName.setBounds(165,465,180,28);
        panel.add(field_LecturerName);
        
        //Jlabel for Start Date
        JLabel label_StartDate = new JLabel("Start Date:");
        label_StartDate.setBounds(400,365,95,25);
        label_StartDate.setFont(ff1);
        panel.add(label_StartDate);
       
        
        Integer year1[]=new Integer[27];
        int bu =1995;
        //loop for adding data in arrayList of year
        for(int i = 0;i < 27;i++)
        {
            year1[i] = bu;
            bu++;
        }
        //JComboBox for Year
        ComboBox_Year1 = new JComboBox(year1);
        ComboBox_Year1.setBounds(530,365,55,25);
        panel.add(ComboBox_Year1);
        
        
        String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        //JComboBox for Month
        ComboBox_Month1 = new JComboBox(months);
        ComboBox_Month1.setBounds(595,365,78,25);
        panel.add(ComboBox_Month1);
        
        
        Integer day[] = new Integer[31];
        //loop for adding data in arrayList of day
        for(int i = 0;i < 31;i++)
        {
            day[i] = i+1;
        }
        //JComboBox for Day
        ComboBox_Day1 = new JComboBox(day);
        ComboBox_Day1.setBounds(683,365,40,25);
        panel.add(ComboBox_Day1);
        
        //Jlabel for Completion Date
        JLabel l12 = new JLabel("Completion Date:");
        l12.setBounds(400,415,135,25);
        l12.setFont(ff1);
        panel.add(l12);
        
        //JComboBox for Year
        ComboBox_Year2 = new JComboBox(year1);
        ComboBox_Year2.setBounds(530,415,55,25);
        panel.add(ComboBox_Year2);
        
        //JComboBox for Month
        ComboBox_Month2 = new JComboBox(months);
        ComboBox_Month2.setBounds(595,415,78,25);
        panel.add(ComboBox_Month2);
        
        //JComboBox for Day
        ComboBox_Day2 = new JComboBox(day);
        ComboBox_Day2.setBounds(683,415,40,25);
        panel.add(ComboBox_Day2);
        
        //Jlabel for Exam Date
        label_ExamDate = new JLabel("Exam Date:");
        label_ExamDate.setBounds(400,465,135,25);
        label_ExamDate.setFont(ff1);
        panel.add(label_ExamDate);
        
        //JComboBox for Year
        ComboBox_Year3 = new JComboBox(year1);
        ComboBox_Year3.setBounds(530,465,55,25);
        panel.add(ComboBox_Year3);
        
        //JComboBox for Month
        ComboBox_Month3 = new JComboBox(months);
        ComboBox_Month3.setBounds(595,465,78,25);
        panel.add(ComboBox_Month3);
        
        //JComboBox for Day
        ComboBox_Day3 = new JComboBox(day);
        ComboBox_Day3.setBounds(683,465,40,25);
        panel.add(ComboBox_Day3);
        label_ExamDate.setVisible(false);
        ComboBox_Year3.setVisible(false);
        ComboBox_Month3.setVisible(false);
        ComboBox_Day3.setVisible(false);
        //JButton for Register Academic Course
        button_Register = new JButton("Register Academic Course");
        button_Register.setBounds(270,515,213,28);
        button_Register.setFont(font2);
        button_Register.setBackground(c1);
        button_Register.addActionListener(this);
        panel.add(button_Register);
        
        //JButton for Remove 
        button_Remove = new JButton("Remove");
        button_Remove.setBounds(408,515,160,28);
        button_Remove.setFont(font2);
        button_Remove.setForeground(Color.white);
        button_Remove.setBackground(new Color(247, 72, 72));
        button_Remove.setVisible(false);
        button_Remove.addActionListener(this);
        panel.add(button_Remove);
        
        //JButton for Display
        button_Display = new JButton("Display");
        button_Display.setBounds(400,565,160,30);
        button_Display.setFont(font2);
        button_Display.setBackground(Color.white);
        button_Display.addActionListener(this);
        panel.add(button_Display);
        
        //JButton for Clear
        button_Clear = new JButton("Clear");
        button_Clear.setBounds(570,565,160,30);
        button_Clear.setFont(font2);
        button_Clear.setBackground(Color.white);
        button_Clear.addActionListener(this);
        panel.add(button_Clear);
        
        frame.setVisible(true);
        frame.add(panel);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    //Accessor/getter method of CourseID
    public String getCourseID()
    {
        return this.Field.getText();
    }
    //Accessor/getter method of Course name
    public String getCourseName()
    {
        return this.field_CourseName.getText();
    }
    //Accessor/getter method of duration
    public int getDuration()
    { 
        return Integer.parseInt(this.field_Duration.getText());
    }
    //Accessor/getter method of level and prerequisite
    public String getLevelPre()
    {
        return this.field_Level.getText();
    }
    //Accessor/getter method of credit
    public String getCredit()
    {
        return this.field_Credit.getText();
    }
    //Accessor/getter method of number of assessments
    public int getNumOfAssessments()
    {
        return Integer.parseInt(this.field_NumOfAssessments.getText());
    }
    //Accessor/getter method of CourseID1
    public String getCourseID1()
    {
        return this.field_CourseID1.getText();
    }
    //Accessor/getter method of Course name
    public String getCourseLeader()
    {
        return this.field_CourseLeader.getText();
    }
    //Accessor/getter method of lecturer name
    public String getLecturerName()
    {
        return this.field_LecturerName.getText();
    }
    //Accessor/getter method of start date
    public String getStartDate()
    {
        String startDate = ComboBox_Month1.getSelectedItem() + " "+ ComboBox_Day1.getSelectedItem() + ", "+ComboBox_Year1.getSelectedItem();
        return startDate;
    }
    //Accessor/getter method of completion date
    public String getCompletionDate()
    {
        String completionDate = ComboBox_Month2.getSelectedItem() + " " + ComboBox_Day2.getSelectedItem() + ", "+ComboBox_Year2.getSelectedItem();
        return completionDate;
    }
    //Accessor/getter method of exam date
    public String getExamDate()
    {
        String examDate = ComboBox_Month3.getSelectedItem() + " " + ComboBox_Day3.getSelectedItem() + ", "+ComboBox_Year3.getSelectedItem();
        return examDate;
    }
    /*
     * This method contains the codes to be executed when buttons are clicked.
     * The text of the buttons are checked according to which codes are executed.
     */
    public void actionPerformed(ActionEvent e)
    {
        String c = e.getActionCommand();
       
        //Change button functions
        if (c.equals("Change to Non-Academic Course"))
        {
            label_Level.setText("Prerequisite:");
            button_Change.setText("Change to Academic Course");
            label_Credit.setVisible(false);
            field_Credit.setVisible(false);
            label_NumOfAssessments.setVisible(false);
            field_NumOfAssessments.setVisible(false);
            button_AddCourse.setText("Add Non-Academic Course");
            button_AddCourse.setFont(font1);
            button_Register.setText("Register Non-Academic Course");
            button_Register.setFont(font1);
            labelTitle.setText("Non-Academic Course");
            label_LecturerName.setText("Instructor Name:");
            label_ExamDate.setVisible(true);
            ComboBox_Year3.setVisible(true);
            ComboBox_Month3.setVisible(true);
            ComboBox_Day3.setVisible(true);
            button_Register.setBounds(182,515,218,28);
            button_Remove.setVisible(true);
            button_Display.setText("Display ");
        }
        else if(c.equals("Change to Academic Course"))
        {
            label_Level.setText("Level:") ;
            button_Change.setText("Change to Non-Academic Course");
            label_Credit.setVisible(true);
            field_Credit.setVisible(true);
            label_NumOfAssessments.setVisible(true);
            field_NumOfAssessments.setVisible(true);
            button_AddCourse.setText("Add Academic Course");
            button_AddCourse.setFont(font2);
            button_Register.setText("Register Academic Course");
            button_Register.setFont(font2);
            labelTitle.setText("Academic Course");
            label_LecturerName.setText("Lecturer Name:");
            label_ExamDate.setVisible(false);
            ComboBox_Year3.setVisible(false);
            ComboBox_Month3.setVisible(false);
            ComboBox_Day3.setVisible(false);
            button_Register.setBounds(270,515,213,28);
            button_Remove.setVisible(false);
            button_Display.setText("Display");
        }
        //Clear button functions
        if(c.equals("Clear") || e.getSource() == button_Change)
        {
            Field.setText("");    
            field_CourseName.setText("");
            field_Duration.setText("");
            field_Level.setText("");
            field_Credit.setText("");
            field_NumOfAssessments.setText("");
            field_CourseID1.setText("");
            field_CourseLeader.setText("");
            field_LecturerName.setText("");
            ComboBox_Year1.setSelectedIndex(0);
            ComboBox_Month1.setSelectedIndex(0);
            ComboBox_Day1.setSelectedIndex(0);
            ComboBox_Year2.setSelectedIndex(0);
            ComboBox_Month2.setSelectedIndex(0);
            ComboBox_Day2.setSelectedIndex(0);
            ComboBox_Year3.setSelectedIndex(0);
            ComboBox_Month3.setSelectedIndex(0);
            ComboBox_Day3.setSelectedIndex(0);
        }
        //Add Academic Course button functions
        else if(c.equals("Add Academic Course"))
        {
            int ct = 0;
            //Form Validation
            if(getCourseID().equals("") || getLevelPre().equals("") ||  getCourseName().equals("") || getCredit().equals("") )
            {
                JOptionPane.showMessageDialog(frame,"Please fill in all the fields","Alert",JOptionPane.ERROR_MESSAGE); 
                ct = 1;
            }
            if(ct == 0)
            {
                //Exception handling
                try
                {
                    getDuration();
                    try
                    {
                        getNumOfAssessments();
                    }
                    catch(NumberFormatException ex)
                    {
                        JOptionPane.showMessageDialog(frame,"Enter a number in the text field of No. of assessments","Alert",JOptionPane.ERROR_MESSAGE);
                        ct = 1;
                    }
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame,"Enter a number in the text field of duration","Alert",JOptionPane.ERROR_MESSAGE);
                    ct = 1;
                }
            }
            
            if(ct == 0)
            {
                for(Course a: course)
                {
                    if (getCourseID().equals(a.getCourseId()))
                    {
                         JOptionPane.showMessageDialog(frame,"The course with CourseID: "+getCourseID()+" has already been added.","Alert",JOptionPane.ERROR_MESSAGE); 
                         ct = 1;
                    }
                }
            }
            if (ct == 0)
            {
                course.add(new AcademicCourse(getCourseID(),getCourseName(),getDuration(),getLevelPre(),getCredit(),getNumOfAssessments()));
                JOptionPane.showMessageDialog(frame ,getCourseName() + " course has been added with following details:\n"+
                                            "Course ID: " + getCourseID() + "\n" +
                                            "Duration: " + getDuration() + "\n" +
                                            "Level: " + getLevelPre() + "\n" +
                                            "Credit: " + getCredit() + "\n" +
                                            "No. of assessments: " + getNumOfAssessments());
            }
        }
        //Register Academic Course button functions
        else if(c.equals("Register Academic Course"))
        {
            int ct = 0;
            //Form Validation
            if(getCourseID1().equals("") || getCourseLeader().equals("") || getLecturerName().equals(""))
            {
                JOptionPane.showMessageDialog(frame,"Please fill in all the fields","Alert",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                String cID = getCourseID1();
                do
                {
                    for(Course a: course)
                    {
                        if(cID != null && a instanceof AcademicCourse)
                        {
                            ct = 1; 
                            if (cID.equals(a.getCourseId()))
                            {
                                AcademicCourse ac = (AcademicCourse) a;   
                                ct = 2;
                                if(ac.getIsRegistered() == true)
                                {
                                    JOptionPane.showMessageDialog(frame,"The course with CourseID: " + cID + " has already been registered.","Alert",JOptionPane.ERROR_MESSAGE);                                  
                                }
                                else if(ac.getIsRegistered() == false)
                                {
                                    ac.register(getCourseLeader(),getLecturerName(),getStartDate(),getCompletionDate());
                                    JOptionPane.showMessageDialog(frame,"Academic course has been registered with following details:\n" +
                                                                "Course ID: " + cID + "\n" + 
                                                                "Course Leader: " + getCourseLeader() + "\n" +
                                                                "Lecturer Name: " + getLecturerName() + "\n" +
                                                                "Start Date: " + getStartDate() + "\n" +
                                                                "Completion Date: " + getCompletionDate());
                                }
                                break;                                                              
                            }
                        }
                    }                                                           
                    if(ct == 1)
                    {
                        cID = JOptionPane.showInputDialog(frame,"You have entered an invalid courseID.\n Please enter a valid courseID.","Alert",JOptionPane.ERROR_MESSAGE);
                    }
                }while(ct == 1);
                if(ct == 0)
                {
                    JOptionPane.showMessageDialog(frame,"No Academic course has been added yet.","Alert",JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
        //Add Non-Academic Course button functions
        else if(c.equals("Add Non-Academic Course"))
        {
            int ct = 0;
            //Form Validation
            if(getCourseID().equals("") || getLevelPre().equals("") || getCourseName().equals(""))
            {
                JOptionPane.showMessageDialog(frame,"Please fill in all the fields","Alert",JOptionPane.ERROR_MESSAGE); 
                ct = 1;
            }
            if(ct == 0)
            {
                //Exception Handling
                try
                {
                    getDuration();
                }
                catch(NumberFormatException ex)
                {
                    JOptionPane.showMessageDialog(frame,"Enter a number in the text field of duration","Alert",JOptionPane.ERROR_MESSAGE);
                    ct = 1;
                }
            }
            if(ct == 0)
            {
                for(Course a: course)
                {
                    if (getCourseID().equals(a.getCourseId()))
                    {
                         JOptionPane.showMessageDialog(frame,"The course with courseID: "+getCourseID()+" has already been added.","Alert",JOptionPane.ERROR_MESSAGE); 
                         ct = 1;
                    }
                }
            }
            if(ct == 0)
            {
                course.add(new NonAcademicCourse(getCourseID(),getCourseName(),getDuration(),getLevelPre()));
                JOptionPane.showMessageDialog(frame , getCourseName() +" course has been added with following details:\n"+
                                            "Course ID: " + getCourseID() + "\n" +
                                            "Duration: " + getDuration() + "\n" +
                                            "Prerequisite: " + getLevelPre());
            }
        }
        //Register Non-Academic Course button functions
        
        else if(c.equals("Register Non-Academic Course"))
        {
            int ct = 0;
            //Form Validation
            if(getCourseID1().equals("") || getCourseLeader().equals("") || getLecturerName().equals(""))
            {
                JOptionPane.showMessageDialog(frame,"Please fill in all the fields","Alert",JOptionPane.ERROR_MESSAGE);    
            }
            else
            {
                String cID = getCourseID1();
                do
                {
                    for(Course a: course)
                    {
                        if(cID != null && a instanceof NonAcademicCourse)
                        {
                            ct = 1; 
                            if (cID.equals(a.getCourseId()))
                            {
                                NonAcademicCourse na = (NonAcademicCourse) a;
                                ct = 2;
                                if(na.getIsRegistered() == true)
                                {
                                    JOptionPane.showMessageDialog(frame,"The course with CourseID: " + cID + " has already been registered.","Alert",JOptionPane.ERROR_MESSAGE);
                                }
                                else if(na.getIsRegistered() == false)
                                {
                                    na.register(getCourseLeader(),getLecturerName(),getStartDate(),getCompletionDate(),getExamDate());
                                    JOptionPane.showMessageDialog(frame,"Non-Academic course has been registered with following details:\n" +
                                                                "Course ID: " + cID + "\n" + 
                                                                "Course Leader: " + getCourseLeader() + "\n" +
                                                                "Instructor Name: " + getLecturerName() + "\n" +
                                                                "Start Date: " + getStartDate() + "\n" +
                                                                "Completion Date: " + getCompletionDate() + "\n" +
                                                                "Exam Date: " + getExamDate());  
                                }
                                break;
                            }
                        }
                    }
                    if(ct == 1)
                    {
                        cID = JOptionPane.showInputDialog(frame,"The courseID you have entered isn't valid.\n Please enter a valid courseID.","Alert",JOptionPane.ERROR_MESSAGE); 
                    }
                }while(ct == 1);
                if(ct == 0)
                {
                    JOptionPane.showMessageDialog(frame,"No Non-Academic course has been added yet.","Alert",JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
        //Display button funtions
        else if(c.equals("Display"))
        {
            int ct = 0;
            int ct1 = 0;
            int x = 20;
            int y = 65;
            String data = "";
            frame1.getContentPane().removeAll();
            frame1.repaint();
            l2.setText("Academic Courses");
            l2.setBounds(185,15,420,35);
            frame1.add(l2);
            for(Course a: course)
            {
                if(a instanceof AcademicCourse)
                {
                    AcademicCourse ac = (AcademicCourse) a;
                    JTextArea area = new JTextArea();
                    area.setEditable(false);
                    area.setBackground(new Color(196, 239, 242));                 
                    area.setFont(ff1);
                    area.setBorder(border2);
                    if(ac.getIsRegistered() == true)
                    {
                        data = " Registered Academic Course" + "\n" +
                                " Course ID: " + ac.getCourseId() + "\n" +
                                " Course Name: " + ac.getCourseName() + "\n" +
                                " Duration: " + ac.getDuration() + "\n" + 
                                " Course Leader: " + ac.getCourseLeader() + "\n" +
                                " Lecturer Name: " + ac.getLecturerName() + "\n" +
                                " Start Date: " + ac.getStartDate() + "\n" +
                                " Completion Date: " + ac.getCompletionDate() + "\n" +
                                " No. of assessments: " + ac.getNumofAssessments();                                        
                        area.setBounds(x,y,255,220);                        
                        ct1 += 1;
                    }
                    else if(ac.getIsRegistered() == false)
                    {
                        data = " Added Academic Course" + "\n" +
                                " Course ID: " + ac.getCourseId() + "\n" +
                                " Course Name: " + ac.getCourseName() + "\n" +
                                " Duration: " + ac.getDuration();
                        area.setBounds(x,y,245,100);
                        ct1 += 1;
                    }
                    area.setText(data);
                    frame1.add(area);                        
                    frame1.setVisible(true);
                    if(ct1 % 2 != 0)
                    {
                        x += 280;
                    }
                    else
                    {
                        x = 20;
                        y += 240; 
                    }
                    ct = 1;
                }
            }
            if(ct == 0)
            {
                JOptionPane.showMessageDialog(frame,"No Academic course has been added yet.","Alert",JOptionPane.ERROR_MESSAGE); 
            }
        }
        else if(c.equals("Display "))
        {
            int ct = 0;
            int ct1 = 0;
            int x = 20;
            int y = 65;
            String data = "";
            frame1.getContentPane().removeAll();
            frame1.repaint();
            frame1.setSize(595,670);
            l2.setText("Non-Academic Courses");
            l2.setBounds(160,15,420,35);
            frame1.add(l2);
            for(Course a: course)
            {
                if (a instanceof NonAcademicCourse)
                {
                    NonAcademicCourse na = (NonAcademicCourse) a;
                    JTextArea area = new JTextArea();
                    area.setEditable(false);
                    area.setBackground(new Color(213, 243, 245));                       
                    area.setFont(ff1);
                    area.setBorder(border2);
                    if(na.getIsRegistered() == true)
                    {
                        data = " Registered Non-Academic Course" + "\n" +
                                " Course ID: " + na.getCourseId() + "\n" +
                                " Course Name: " + na.getCourseName() + "\n" +
                                " Duration: " + na.getDuration() + "\n" +
                                " Prerequisite: " + na.getPrerequisite() + "\n" +
                                " Course Leader: " + na.getCourseLeader() + "\n" +
                                " Instructor Name: " + na.getInstructorName() + "\n" +
                                " Start Date: " + na.getStartDate() + "\n" +
                                " Completion Date: " + na.getCompletionDate() + "\n" +
                                " Exam Date: " + na.getExamDate();                        
                        area.setBounds(x,y,255,240);
                        ct1 += 1;
                    }
                    else if(na.getIsRegistered() == false)
                    {
                        data = " Added Non-Academic Course" + "\n" +
                                " Course ID: " + na.getCourseId() + "\n" +
                                " Course Name: " + na.getCourseName() + "\n" +
                                " Duration: " + na.getDuration();
                        area.setBounds(x,y,245,100);
                        ct1 += 1;
                    }
                    area.setText(data);
                    frame1.add(area);                        
                    frame1.setVisible(true);
                    if(ct1 % 2 != 0)
                    {
                        x += 285;
                    }
                    else
                    {
                        x = 20;
                        y += 255; 
                    }
                    ct += 1;
                }
            }
            if(ct == 0)
            {
                JOptionPane.showMessageDialog(frame,"No Non-Academic course has been added yet.","Alert",JOptionPane.ERROR_MESSAGE); 
            }
        }
        //Remove button functions
        else if(c.equals("Remove"))
        {
            int ct = 0;
            if(getCourseID1().equals(""))
            {
                JOptionPane.showMessageDialog(frame,"Enter CourseID to be removed.","Alert",JOptionPane.ERROR_MESSAGE);    
            }
            else
            {
                String cID = getCourseID1();
                do
                {
                    for(Course a: course)
                    {
                        if(cID != null && a instanceof NonAcademicCourse)
                        {
                            ct = 1;
                            if (cID.equals(a.getCourseId()))
                            {
                                NonAcademicCourse na = (NonAcademicCourse) a;
                                ct = 2;
                                if(na.getisRemoved() == true)
                                {
                                    JOptionPane.showMessageDialog(frame,"The course with CourseID: "+ cID +" has not been registered.","Alert",JOptionPane.ERROR_MESSAGE);    
                                    break;
                                }
                                else if(na.getisRemoved() == false)
                                {
                                    na.remove();
                                    JOptionPane.showMessageDialog(frame,"Non-Academic course with CourseID: "+ cID +" has been successfully removed.");
                                    break;
                                }
                            }
                        }   
                    }
                    if(ct == 1)
                    {
                        cID = JOptionPane.showInputDialog(frame,"The courseID you have entered isn't valid.\n Please enter a valid courseID.","Alert",JOptionPane.ERROR_MESSAGE);
                    }
                }while(ct == 1);
                if(ct == 0)
                {
                    JOptionPane.showMessageDialog(frame,"No Non-Academic course has been added yet.","Alert",JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
    }
    //This method calls the method containing Graphical User Interface.
    public static void main(String[] args)
    {
        new INGCollege().GUI();
    }
}
