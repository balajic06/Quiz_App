/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rendezvous2k13;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Gowtham
 */
public class questions_panel extends javax.swing.JPanel {

    /**
     * Creates new form questions_panel
     */
    int minutes=1,seconds=60;
     int TIMELIMIT=2;
      int no_of_qns=24; //always no of qns-=1
     String timecounter;
    String qns[]=new String[]{"<html> <p> 1)What will be output if you will compile and execute the following c code? <br> void main(){ <br> float a=5.2; if(a==5.2)<br>" +
"printf(\"Equal\");<br>" +
"else if(a<5.2)<br>" +
"printf(\"Less than\"); <br>" +
"else <br>" +
"printf(\"Greater than\"); <br>" +
"} </p> </html>","<html> 2)What will be output if you will compile and execute the following c code?<br>" +
"<br>" +
"void main(){<br>" +
"char c=125;<br>" +
"    c=c+10;<br>" +
"printf(\"%d\",c); <br>" +
"}</html>","<html>3)What will be output if you will compile and execute the following c code?<br>" +
"<br>" +
"void main(){<br>" +
"int i=4,x;<br>" +
"  x=++i + ++i + ++i;<br>" +
"printf(\"%d\",x); <br>" +
"}</html>","<html>4)What will be output if you will compile and execute the following c code?<br>" +
"<br>" +
"void main(){<br>" +
"int a=10;<br>" +
"printf(\"%d %d %d\",a,a++,++a); <br>" +
"}</html>","<html>5)What will be output if you will compile and execute the following c code?<br>" +
"<br>" +
"void main(){<br>" +
"char *str=\"Hello world\";<br>" +
"printf(\"%d\",printf(\"%s\",str));<br>" +
"}</html>>","<html>6) What will be output if you will compile and execute the following c code?<br>" +
"<br>" +
"#define call(x,y) x##y<br>" +
"void main(){<br>" +
"int x=5,y=10,xy=20;<br>" +
"printf(\"%d\",xy+call(x,y));<br>" +
"}</html>","<html>7) What is error in following declaration?<br>" +
"<br>" +
"struct outer{<br>" +
"int a;<br>" +
"struct inner{<br>" +
"char c;<br>" +
"};<br>" +
"};</html>","<html>8)What will be output if you will compile and execute the following c code?<br>" +
"<br>" +
"void main(){<br>" +
"int array[]={10,20,30,40};<br>" +
"printf(\"%d\",-2[array]); <br>" +
"}<br>" +
"","<html>9) What will be output when you will execute following c code?<br>" +
"<br>" +
"#include<stdio.h><br>" +
"void main(){<br>" +
"chararr[7]=\"Network\";<br>" +
"printf(\"%s\",arr);<br>" +
"}<br>","<html>10) What will be output when you will execute following c code?<br>" +
"<br>" +
"#include<stdio.h><br>" +
"enum power{<br>" +
"    Dalai,<br>" +
"    Vladimir=3,<br>" +
"    Barack,<br>" +
"    Hillary<br>" +
"};<br>" +
"void main(){<br>" +
"float leader[Dalai+Hillary]={1.f,2.f,3.f,4.f,5.f};<br>" +
"enum power p=Barack;<br>" +
"printf(\"%0.f\",leader[p>>1+1]);<br>" +
"}<br>" +
"<br>" ,"<html>11) What will be output when you will execute following c code?<br>" +
"<br>" +
"#include<stdio.h><br>" +
"void main(){<br>" +
"    char data[2][3][2]={0,1,2,3,4,5,6,7,8,9,10,11};<br>" +
"printf(\"%o\",data[0][2][1]);<br>" +
"}","<html>12) What will be output when you will execute following c code?<br>" +
"<br>" +
"#include<stdio.h><br>" +
"void main(){<br>" +
"int array[2][3]={5,10,15,20,25,30};<br>" +
"int (*ptr)[2][3]=&array;<br>" +
"printf(\"%d\\t\",***ptr);<br>" +
"printf(\"%d\\t\",***(ptr+1));<br>" +
"printf(\"%d\\t\",**(*ptr+1));<br>" +
"printf(\"%d\\t\",*(*(*ptr+1)+2));<br>" +
"}","<html>13) What will be output when you will execute following c code?<br>" +
"<br>" +
"#include<stdio.h><br>" +
"void main(){<br>" +
"staticint a=2,b=4,c=8;<br>" +
"staticint *arr1[2]={&a,&b};<br>" +
"staticint *arr2[2]={&b,&c};<br>" +
"int* (*arr[2])[2]={&arr1,&arr2};<br>" +
"printf(\"%d %d\\t\",*(*arr[0])[1],  *(*(**(arr+1)+1)));<br>" +
"}<br>" +
"<br>" ,"<html>14) What will be output when you will execute following c code?<br>" +
"<br>" +
"#include<stdio.h><br>" +
"int main(){<br>" +
"printf(\"%d\\t\",sizeof(6.5));<br>" +
"printf(\"%d\\t\",sizeof(90000));<br>" +
"printf(\"%d\",sizeof('A'));<br>" +
"return 0;<br>" +
"}<br>" +
"<br>" ,"<html>15) #include<stdio.h><br>" +
"int main(){<br>" +
"signed x;<br>" +
"unsigned y;<br>" +
"    x = 10 +- 10u + 10u +- 10;<br>" +
"    y = x;<br>" +
"if(x==y)<br>" +
"printf(\"%d %d\",x,y);<br>" +
"else if(x!=y)<br>" +
"printf(\"%u  %u\",x,y);<br>" +
"return 0;<br>" +
"}<br>" +
"<br>" ,"<html>16) #include<stdio.h><br>" +
"int main(){<br>" +
"doublenum=5.2;<br>" +
"intvar=5;<br>" +
"printf(\"%d\\t\",sizeof(!num));<br>" +
"printf(\"%d\\t\",sizeof(var=15/2));<br>" +
"printf(\"%d\",var);<br>" +
"return 0;<br>" +
"}<br>" +
"<br>" ,"<html>17) What will be output when you will execute following c code?<br>" +
"<br>" +
"#include<stdio.h><br>" +
"int main(){<br>" +
"int a= sizeof(signed) +sizeof(unsigned);<br>" +
"int b=sizeof(const)+sizeof(volatile);<br>" +
"printf(\"%d\",a+++b);<br>" +
"return 0;<br>" +
"}<br>" +
"<br>" ,"<html>18) What will be output when you will execute following c code?<br>" +
"<br>" +
"#include<stdio.h><br>" +
"int main(){<br>" +
"signedx,a;<br>" +
"unsignedy,b;<br>" +
"    a=(signed)10u;<br>" +
"    b=(unsigned)-10;<br>" +
"    y = (signed)10u + (unsigned)-10;<br>" +
"    x = y;<br>" +
"printf(\"%d  %u\\t\",a,b);<br>" +
"if(x==y)<br>" +
"printf(\"%d %d\",x,y);<br>" +
"else if(x!=y)<br>" +
"printf(\"%u  %u\",x,y);<br>" +
"return 0;<br>" +
"}<br>" +
"<br>" ,"<html>19) Which of the following is integral data type?","<html>20) What will be output when you will execute following c code?<br>" +
"<br>" +
"#include<stdio.h><br>" +
"int main(){<br>" +
"volatileint a=11;<br>" +
"printf(\"%d\",a);<br>" +
"return 0;<br>" +
"}<br>" +
"<br>" ,"<html>21) What will be output when you will execute following c code?<br>" +
"#include<stdio.h><br>" +
"void main(){<br>" +
"int movie=1;<br>" +
"switch(movie<<2+movie){<br>" +
"default:printf(\"3 Idiots\");<br>" +
"case 4: printf(\" Ghajini\");<br>" +
"case 5: printf(\" Krrish\");<br>" +
"case 8: printf(\" Race\");<br>" +
"     } <br>" +
"}<br>" +
"<br>" ,"<html>22) What will be output when you will execute following c code?<br>" +
"#include<stdio.h><br>" +
"void main(){<br>" +
"switch(6){<br>" +
"case 6.0f:printf(\"Sangakkara\");<br>" +
"break;<br>" +
"case 6.0: printf(\"Sehwag\");<br>" +
"break;<br>" +
"case 6.0L:printf(\"Steyn\");<br>" +
"break;<br>" +
"default:  printf(\"Smith\");<br>" +
"    } <br>" +
"}<br>" +
"<br>","<html>23) #include<stdio.h><br>" +
"int main(){<br>" +
"int a=-5;<br>" +
"unsignedint b=-5u;<br>" +
"if(a==b)<br>" +
"printf(\"Avatar\");<br>" +
"else<br>" +
"printf(\"Alien\");<br>" +
"return 0;<br>" +
"}<br>" +
"<br>","24) Which of the following is not derived data type in c?","<html>25) What will be output when you will execute following c code?#include<stdio.h><br>" +
"typedefstruct{<br>" +
"char *name;<br>" +
"double salary;<br>" +
"}job;<br>" +
"void main(){<br>" +
"static job a={\"TCS\",15000.0};<br>" +
"static job b={\"IBM\",25000.0};<br>" +
"static job c={\"Google\",35000.0};<br>" +
"int x=5;<br>" +
"job * arr[3]={&a,&b,&c};<br>" +
"printf(\"%s  %f\\t\",(3,x>>5-4)[*arr]);<br>" +
"}<br>" +
"doublemyfun(double d){<br>" +
"d-=1;<br>" +
"return d;<br>" +
"}<br>" +
"<br>" 
};
    String ans1[]=new String[]{"Equal","135","21","12 11 11","11Hello world","35","Nesting of structure is not allowed in c.","-60","Network","1","5","5 Garbage 20 30	","2 4","8 2 1","0 0","4 2 7","10","10 -10   0 0","void","11","3 Idiots GhajiniKrrish Race","Sehwag","Avatar","Function","TCS 15000.000000"};
    String ans2[]=new String[]{"Less than","+INF","18","12 10 10","10Hello world","510","It is necessary to initialize the member variable.","-30","N","2","6","10 15 30 20","2 8","4 4 1","65536 -10 ","4 4 5","9","10 -10   65516 -10 ","char","Garbage","Race","Steyn","Alien","Pointer","IBM 25000.000000"};
    String ans3[]=new String[]{"Greater than","-121","12","11 11 12","Hello world10","15","Inner structure must have name.","60","Garbage value","3","7","5 15 20 30","4 2","8 4 1","0 65536 ","2 2 5","8","10 -10   10 -10","float","-2","Krrish","Smith","Run time error","Enumeration","Google 35000.000000"};
    String ans4[]=new String[]{"Compiler error","-8","Compiler error","10 10 12","Hello world11","40","Outer structure must have name.","garbage value","Compilation error","Compilation error","Compilation error","Compilation error","4 8","8 4 2","65536 0","2 4 7","Error: Cannot find size of modifiers","10 65526      0 0","double","We cannot predict","GhajiniKrrish Race","Compilation error","Error: Illegal assignment","All are derived data type","Compilation error"};
    String actionCommand[] = new String[no_of_qns+1];
    String answers[]=new String[]{"b","c","a","a","d","d","c","b","c","b","a","a","d","d","a","c","c","d","b","d","b","d","a","c","c"};
     ButtonModel buttonModel;
     static int score;

   
    
    
    public questions_panel() {
        
        initComponents();
        finish_button.setVisible(false);
        if(memberdetails_panel.qnno==no_of_qns){
            finish_button.setVisible(true);
            next_button.setVisible(false);
         
        }
        if(memberdetails_panel.qnno==0){
            prev_button.setVisible(false);
            next_button.setVisible(true);
        } 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answers_buttongroup = new javax.swing.ButtonGroup();
        qn_label = new javax.swing.JLabel();
        ans_a_radiobutton = new javax.swing.JRadioButton();
        welcomememname_label = new javax.swing.JLabel();
        timer_label = new javax.swing.JLabel();
        ans_b_radiobutton = new javax.swing.JRadioButton();
        ans_c_radiobutton = new javax.swing.JRadioButton();
        ans_d_radiobutton = new javax.swing.JRadioButton();
        next_button = new javax.swing.JButton();
        prev_button = new javax.swing.JButton();
        finish_button = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Questions"));

        qn_label.setText(qns[memberdetails_panel.qnno]);
        qn_label.setToolTipText("");
        qn_label.setAutoscrolls(true);

        answers_buttongroup.add(ans_a_radiobutton);
        ans_a_radiobutton.setText(ans1[memberdetails_panel.qnno]);
        ans_a_radiobutton.setActionCommand("a");

        welcomememname_label.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        welcomememname_label.setForeground(new java.awt.Color(0, 153, 0));
        welcomememname_label.setText("Welcome, "+memberdetails_panel.members_name);

        timer_label.setForeground(new java.awt.Color(204, 0, 0));

        answers_buttongroup.add(ans_b_radiobutton);
        ans_b_radiobutton.setText(ans2[memberdetails_panel.qnno]);
        ans_b_radiobutton.setActionCommand("b");

        answers_buttongroup.add(ans_c_radiobutton);
        ans_c_radiobutton.setText(ans3[memberdetails_panel.qnno]);
        ans_c_radiobutton.setActionCommand("c");

        answers_buttongroup.add(ans_d_radiobutton);
        ans_d_radiobutton.setText(ans4[memberdetails_panel.qnno]);
        ans_d_radiobutton.setActionCommand("d");

        next_button.setText("Next");
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        prev_button.setText("Prev");
        prev_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prev_buttonActionPerformed(evt);
            }
        });

        finish_button.setText("Finish");
        finish_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finish_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(welcomememname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(timer_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ans_b_radiobutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ans_a_radiobutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ans_d_radiobutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qn_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 324, Short.MAX_VALUE)
                        .addComponent(prev_button)
                        .addGap(77, 77, 77)
                        .addComponent(next_button)
                        .addGap(277, 277, 277)
                        .addComponent(finish_button))
                    .addComponent(ans_c_radiobutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomememname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timer_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qn_label, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ans_a_radiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ans_b_radiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ans_c_radiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ans_d_radiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next_button)
                    .addComponent(prev_button)
                    .addComponent(finish_button))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void calculateScore() {
        score=0;
        for(int i=0;i<no_of_qns+1;i++){
            if(answers[i].equals(actionCommand[i])){
                score++;
            }
        }
       System.out.println(score);

    }
class Timer extends Thread implements Runnable{
	public Timer(){
		new Thread(this).start();
	}

    public void run() {
		while(memberdetails_panel.start_test){
            try {
               Thread.sleep(1000);
               seconds--;
               timer_label.setText("    Time Counter:  "+minutes+" mins : "+seconds+" secs ");
				if(seconds==0){
                                    if(minutes==0){
					memberdetails_panel.start_test=false;
					JOptionPane.showMessageDialog(null,"Sorry, Time Up !!");
                                        result();
                }
                    seconds= 60;
                    minutes--;
				}
				
		    }
            catch(InterruptedException ex)  { System.out.print(ex); }
		}
    }
}
    private void result(){
        getanswers();
        calculateScore();
        Rendezvous2k13.mainframe.getContentPane().removeAll();
        result_panel rp=new result_panel();
        Rendezvous2k13.mainframe.add(rp);
        Rendezvous2k13.mainframe.validate();
        Rendezvous2k13.mainframe.repaint();
        Rendezvous2k13.mainframe.pack();
        
    
    }
    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        // TODO add your handling code here:
        
        getanswers();
        
        if(memberdetails_panel.qnno<no_of_qns){
        ++memberdetails_panel.qnno;
        qn_label.setText(qns[memberdetails_panel.qnno]);
        ans_a_radiobutton.setText(ans1[memberdetails_panel.qnno]);
        ans_b_radiobutton.setText(ans2[memberdetails_panel.qnno]);
        ans_c_radiobutton.setText(ans3[memberdetails_panel.qnno]);
        ans_d_radiobutton.setText(ans4[memberdetails_panel.qnno]);
        prev_button.setVisible(true);
        if(memberdetails_panel.qnno==no_of_qns){
            finish_button.setVisible(true);
            next_button.setVisible(false);
            
            
        }
        }
        answers_buttongroup.clearSelection();
        
    }//GEN-LAST:event_next_buttonActionPerformed
    
    private void getanswers(){
         buttonModel = answers_buttongroup.getSelection();
        if (buttonModel != null) {
            actionCommand[memberdetails_panel.qnno] = buttonModel.getActionCommand();
           
            
        } else {
   // buttonModel is null.
   // this occurs if none of the radio buttons 
   // watched by the ButtonGroup have been selected.
        }
        
    }
    private void prev_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prev_buttonActionPerformed
        // TODO add your handling code here:
        
        
        getanswers();
        
        if(memberdetails_panel.qnno>0){
            --memberdetails_panel.qnno;
            qn_label.setText(qns[memberdetails_panel.qnno]);
            ans_a_radiobutton.setText(ans1[memberdetails_panel.qnno]);
            ans_b_radiobutton.setText(ans2[memberdetails_panel.qnno]);
            ans_c_radiobutton.setText(ans3[memberdetails_panel.qnno]);
            ans_d_radiobutton.setText(ans4[memberdetails_panel.qnno]);
            prev_button.setVisible(true);
            next_button.setVisible(true);
            if(memberdetails_panel.qnno==0){
            prev_button.setVisible(false);
            next_button.setVisible(true);
        } 
             
         }
        
    }//GEN-LAST:event_prev_buttonActionPerformed

    private void finish_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finish_buttonActionPerformed
        // TODO add your handling code here:
        result();
    }//GEN-LAST:event_finish_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ans_a_radiobutton;
    private javax.swing.JRadioButton ans_b_radiobutton;
    private javax.swing.JRadioButton ans_c_radiobutton;
    private javax.swing.JRadioButton ans_d_radiobutton;
    private javax.swing.ButtonGroup answers_buttongroup;
    private javax.swing.JButton finish_button;
    private javax.swing.JButton next_button;
    private javax.swing.JButton prev_button;
    private javax.swing.JLabel qn_label;
    private javax.swing.JLabel timer_label;
    private javax.swing.JLabel welcomememname_label;
    // End of variables declaration//GEN-END:variables
}
