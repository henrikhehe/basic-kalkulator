import javax.print.attribute.standard.NumberUpSupported;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main implements ActionListener{

    
    
    
    public static void main(String args[]){
        stuff();


    }

    public void actionPerformed(ActionEvent e){
    }
    
    static void stuff(){
        
        JTextField tfval1 = new JTextField();
        JTextField tfval2 = new JTextField();
        JLabel numLabel = new JLabel();
        JFrame frame = new JFrame();
        JButton calcButton = new JButton("=");
        JButton additionButton = new JButton("+");
        JButton multiplyButton = new JButton("*");
        JButton subtractionButton = new JButton("-");
        JButton divisionButton = new JButton("/");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton resetButton = new JButton("C");
        CalculatorClass leftSide = new CalculatorClass();
        CalculatorClass rightSide = new CalculatorClass();
        boolean left = true;
        int val1int;
        int val2int;
        String val1str="";
        String val2str="";
        JTextField result1 = new JTextField();


        button1.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.addString("1");
                    tfval1.setText(leftSide.getVal());
                    numLabel.setText(tfval1.getText());
                }
                else{
                    rightSide.addString("1");
                    tfval2.setText(rightSide.getVal());
                    numLabel.setText(tfval2.getText());
                }
                
                
                
                  
        }  
        });
        button2.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.addString("2");
                    tfval1.setText(leftSide.getVal());
                    numLabel.setText(tfval1.getText());
                }
                else{
                    rightSide.addString("2");
                    tfval2.setText(rightSide.getVal());
                    numLabel.setText(tfval2.getText());
                } 

        }  
        });
        button3.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.addString("3");
                    tfval1.setText(leftSide.getVal());
                    numLabel.setText(tfval1.getText());
                }
                else{
                    rightSide.addString("3");
                    tfval2.setText(rightSide.getVal());
                    numLabel.setText(tfval2.getText());
                } 
   
        }  
        });
        button4.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.addString("4");
                    tfval1.setText(leftSide.getVal());
                    numLabel.setText(tfval1.getText());
                }
                else{
                    rightSide.addString("4");
                    tfval2.setText(rightSide.getVal());
                    numLabel.setText(tfval2.getText());
                }

        }  
        });
        button5.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.addString("5");
                    tfval1.setText(leftSide.getVal());
                    numLabel.setText(tfval1.getText());
                }
                else{
                    rightSide.addString("5");
                    tfval2.setText(rightSide.getVal());
                    numLabel.setText(tfval2.getText());
                } 

        }  
        });
        button6.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.addString("6");
                    tfval1.setText(leftSide.getVal());
                    numLabel.setText(tfval1.getText());
                }
                else{
                    rightSide.addString("6");
                    tfval2.setText(rightSide.getVal());
                    numLabel.setText(tfval2.getText());
                } 

        }  
        });
        button7.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.addString("7");
                    tfval1.setText(leftSide.getVal());
                    numLabel.setText(tfval1.getText());
                }
                else{
                    rightSide.addString("7");
                    tfval2.setText(rightSide.getVal());
                    numLabel.setText(tfval2.getText());
                }

        }  
        });
        button8.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.addString("8");
                    tfval1.setText(leftSide.getVal());
                    numLabel.setText(tfval1.getText());
                }
                else{
                    rightSide.addString("8");
                    tfval2.setText(rightSide.getVal());
                    numLabel.setText(tfval2.getText());
                }
  
        }  
        });
        button9.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.addString("9");
                    tfval1.setText(leftSide.getVal());
                    numLabel.setText(tfval1.getText());
                }
                else{
                    rightSide.addString("9");
                    tfval2.setText(rightSide.getVal());
                    numLabel.setText(tfval2.getText());
                } 

        }  
        });
        button0.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.addString("0");
                    tfval1.setText(leftSide.getVal());
                    numLabel.setText(tfval1.getText());
                }
                else{
                    rightSide.addString("0");
                    tfval2.setText(rightSide.getVal());
                    numLabel.setText(tfval2.getText());
                }

        }  
        });
        

        multiplyButton.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.swapBool();
                }
                leftSide.setOperation("multi");
                numLabel.setText(tfval2.getText());

        }  
        });
        divisionButton.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.swapBool();
                }
                leftSide.setOperation("div");
                numLabel.setText(tfval2.getText());
        }  
        });
        additionButton.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.swapBool();
                }
                leftSide.setOperation("addi");
                numLabel.setText(tfval2.getText());
        }  
        });
        subtractionButton.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(leftSide.getBool()){
                    leftSide.swapBool();
                }
                leftSide.setOperation("subt");
                numLabel.setText(tfval2.getText());
        }  
        });
        calcButton.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(!leftSide.getBool()){
                    leftSide.swapBool();
                }
                String v1 = leftSide.getVal();
                String v2 = rightSide.getVal();
                String op = leftSide.getOp();
                int result;
                if(op=="multi"){
                    result = Integer.parseInt(v1)*Integer.parseInt(v2);

                }
                else if (op=="div"){
                    result = Integer.parseInt(v1)/Integer.parseInt(v2);
                }
                else if(op=="addi"){
                    result = Integer.parseInt(v1)+Integer.parseInt(v2);
                }
                else if(op=="subt"){
                    result = Integer.parseInt(v1)-Integer.parseInt(v2);
                }
                else{
                    result=Integer.parseInt(v1);
                }
                result1.setText(Integer.toString(result));
                numLabel.setText(result1.getText());
                leftSide.setVal(result1.getText());
                rightSide.reset();


        }  
        });
        resetButton.addActionListener(new ActionListener(){            
            public void actionPerformed(ActionEvent e){
                if(!leftSide.getBool()){
                    leftSide.swapBool();
                }
                leftSide.reset();
                rightSide.reset();
                tfval1.setText(leftSide.getVal());
                tfval2.setText(leftSide.getVal());
                numLabel.setText(tfval1.getText());

        }  
        });
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.add(Box.createRigidArea(new Dimension(10, 0)));
        JPanel numberPan = new JPanel();
        JPanel buttonsPanel = new JPanel();
        numberPan.setLayout(new FlowLayout());
        buttonsPanel.setLayout(new FlowLayout());
        numberPan.add(numLabel);
        numberPan.setBounds(1,1,1,1);
        buttonsPanel.add(button0);
        buttonsPanel.add(button1);
        buttonsPanel.add(button2);
        buttonsPanel.add(button3);
        buttonsPanel.add(button4);
        buttonsPanel.add(button5);
        buttonsPanel.add(button6);
        buttonsPanel.add(button7);
        buttonsPanel.add(button8);
        buttonsPanel.add(button9);
        buttonsPanel.add(additionButton);
        buttonsPanel.add(subtractionButton);
        buttonsPanel.add(multiplyButton);
        buttonsPanel.add(divisionButton);
        buttonsPanel.add(resetButton);
        buttonsPanel.add(calcButton);

        frame.add(numberPan);
        frame.add(buttonsPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);  

    }
}

