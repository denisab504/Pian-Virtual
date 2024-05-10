/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pianvirtualbd;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


/**
 *
 * @author badea
 */
public class PianVirtualBD extends javax.swing.JFrame {

    /**
     * Creates new form PianVirtualBD
     */
    public PianVirtualBD() {
        initComponents();
    }
    
    private void notePianoCD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-pian\\Pian-Cdiez.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void notePianoC() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-pian\\Pian-C.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void notePianoD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-pian\\Pian-D.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void notePianoDD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-pian\\Pian-Ddiez.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void notePianoE() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-pian\\Pian-E.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void notePianoF() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-pian\\Pian-F.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void notePianoFD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-pian\\Pian-Fdiez.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void notePianoG() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-pian\\Pian-G.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void notePianoGD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-pian\\Pian-Gdiez.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void notePianoA() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-pian\\Pian-A.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void notePianoAD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-pian\\Pian-Adiez.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void notePianoB() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-pian\\Pian-B.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void noteViolinCD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-vioara\\Vioara-Cdiez.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void noteViolinC() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-vioara\\Vioara-C.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void noteViolinD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-vioara\\Vioara-D.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void noteViolinDD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-vioara\\Vioara-Ddiez.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void noteViolinE() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-vioara\\Vioara-E.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void noteViolinF() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-vioara\\Vioara-F.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void noteViolinFD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-vioara\\Vioara-Fdiez.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void noteViolinG() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-vioara\\Vioara-G.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void noteViolinGD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-vioara\\Vioara-Gdiez.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void noteViolinA() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-vioara\\Vioara-A.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void noteViolinAD() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-vioara\\Vioara-Adiez.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    
    private void noteViolinB() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:\\Users\\badea\\Downloads\\Downloads\\Note-vioara\\Vioara-B.wav"); 
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jbtnCD = new javax.swing.JButton();
        jbtnDD = new javax.swing.JButton();
        jbtnFD = new javax.swing.JButton();
        jbtnGD = new javax.swing.JButton();
        jbtnAD = new javax.swing.JButton();
        jbtnCD1 = new javax.swing.JButton();
        jbtnDD1 = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnD = new javax.swing.JButton();
        jbtnE = new javax.swing.JButton();
        jbtnF = new javax.swing.JButton();
        jbtnG = new javax.swing.JButton();
        jbtnA = new javax.swing.JButton();
        jbtnB = new javax.swing.JButton();
        jbtnC1 = new javax.swing.JButton();
        jbtnD1 = new javax.swing.JButton();
        jbtnE1 = new javax.swing.JButton();
        jbtnF1 = new javax.swing.JButton();
        jckbPian = new javax.swing.JCheckBox();
        jckbVioara = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 350));
        setPreferredSize(new java.awt.Dimension(900, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnCD.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnCD.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCD.setText("C#");
        jbtnCD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCDActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 75, 150));

        jbtnDD.setBackground(new java.awt.Color(0, 0, 0));
        jbtnDD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnDD.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDD.setText("D#");
        jbtnDD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDDActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 75, 150));

        jbtnFD.setBackground(new java.awt.Color(0, 0, 0));
        jbtnFD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnFD.setForeground(new java.awt.Color(255, 255, 255));
        jbtnFD.setText("F#");
        jbtnFD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFDActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 75, 150));

        jbtnGD.setBackground(new java.awt.Color(0, 0, 0));
        jbtnGD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnGD.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGD.setText("G#");
        jbtnGD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGDActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 75, 150));

        jbtnAD.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnAD.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAD.setText("A#");
        jbtnAD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnADActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 75, 150));

        jbtnCD1.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCD1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnCD1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCD1.setText("C#1");
        jbtnCD1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jbtnCD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 75, 150));

        jbtnDD1.setBackground(new java.awt.Color(0, 0, 0));
        jbtnDD1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnDD1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDD1.setText("D#1");
        jbtnDD1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jbtnDD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 75, 150));

        jbtnC.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnC.setText("C");
        jbtnC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 75, 250));

        jbtnD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnD.setText("D");
        jbtnD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 75, 250));

        jbtnE.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnE.setText("E");
        jbtnE.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 75, 250));

        jbtnF.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnF.setText("F");
        jbtnF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 75, 250));

        jbtnG.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnG.setText("G");
        jbtnG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnG, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 75, 250));

        jbtnA.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnA.setText("A");
        jbtnA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 75, 250));

        jbtnB.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnB.setText("B");
        jbtnB.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 75, 250));

        jbtnC1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnC1.setText("C1");
        jbtnC1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnC1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 75, 250));

        jbtnD1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnD1.setText("D1");
        jbtnD1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 75, 250));

        jbtnE1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnE1.setText("E1");
        jbtnE1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnE1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 75, 250));

        jbtnF1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnF1.setText("F1");
        jbtnF1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnF1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 75, 250));

        buttonGroup1.add(jckbPian);
        jckbPian.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jckbPian.setForeground(new java.awt.Color(0, 0, 255));
        jckbPian.setText("TON PIAN");
        getContentPane().add(jckbPian, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        buttonGroup1.add(jckbVioara);
        jckbVioara.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jckbVioara.setForeground(new java.awt.Color(255, 0, 0));
        jckbVioara.setText("TON VIOARA");
        getContentPane().add(jckbVioara, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFActionPerformed
        // TODO add your handling code here:
        try {
            if(jckbPian.isSelected()) notePianoF();
            else noteViolinF();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);  //1
             //se alege una din cele doua instructiuni 1 sau 2
            //daca nu se gaseste fisierul audio, fie se afiseaza mesajul SEVERE null si detalierea exceptiei, 
            //fie se afiseaza o casuta de dialog de avertizare ca nu s-a gasit fisierul necesar
            //JOptionPane.showMessageDialog(null, ex); //2
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnFActionPerformed

    private void jbtnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGActionPerformed
        // TODO add your handling code here:
        try {
            if(jckbPian.isSelected()) notePianoG();
            else noteViolinG();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);  //1
             //se alege una din cele doua instructiuni 1 sau 2
            //daca nu se gaseste fisierul audio, fie se afiseaza mesajul SEVERE null si detalierea exceptiei, 
            //fie se afiseaza o casuta de dialog de avertizare ca nu s-a gasit fisierul necesar
            //JOptionPane.showMessageDialog(null, ex); //2
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnGActionPerformed

    private void jbtnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAActionPerformed
        // TODO add your handling code here:
        try {
            if(jckbPian.isSelected()) notePianoA();
            else noteViolinA();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);  //1
             //se alege una din cele doua instructiuni 1 sau 2
            //daca nu se gaseste fisierul audio, fie se afiseaza mesajul SEVERE null si detalierea exceptiei, 
            //fie se afiseaza o casuta de dialog de avertizare ca nu s-a gasit fisierul necesar
            //JOptionPane.showMessageDialog(null, ex); //2
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnAActionPerformed

    private void jbtnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBActionPerformed
        // TODO add your handling code here:
        try {
            if(jckbPian.isSelected()) notePianoB();
            else noteViolinB();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);  //1
             //se alege una din cele doua instructiuni 1 sau 2
            //daca nu se gaseste fisierul audio, fie se afiseaza mesajul SEVERE null si detalierea exceptiei, 
            //fie se afiseaza o casuta de dialog de avertizare ca nu s-a gasit fisierul necesar
            //JOptionPane.showMessageDialog(null, ex); //2
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnBActionPerformed

    private void jbtnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnC1ActionPerformed

    private void jbtnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnD1ActionPerformed

    private void jbtnE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnE1ActionPerformed

    private void jbtnF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnF1ActionPerformed

    private void jbtnCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCDActionPerformed
        // TODO add your handling code here:
        try {
            if(jckbPian.isSelected()) notePianoCD();
            else noteViolinCD();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);  //1
             //se alege una din cele doua instructiuni 1 sau 2
            //daca nu se gaseste fisierul audio, fie se afiseaza mesajul SEVERE null si detalierea exceptiei, 
            //fie se afiseaza o casuta de dialog de avertizare ca nu s-a gasit fisierul necesar
            //JOptionPane.showMessageDialog(null, ex); //2
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCDActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        // TODO add your handling code here:
        try {
            if(jckbPian.isSelected()) notePianoC();
            else noteViolinC();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);  //1
             //se alege una din cele doua instructiuni 1 sau 2
            //daca nu se gaseste fisierul audio, fie se afiseaza mesajul SEVERE null si detalierea exceptiei, 
            //fie se afiseaza o casuta de dialog de avertizare ca nu s-a gasit fisierul necesar
            //JOptionPane.showMessageDialog(null, ex); //2
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDActionPerformed
        // TODO add your handling code here:
        try {
            if(jckbPian.isSelected()) notePianoD();
            else noteViolinD();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);  //1
             //se alege una din cele doua instructiuni 1 sau 2
            //daca nu se gaseste fisierul audio, fie se afiseaza mesajul SEVERE null si detalierea exceptiei, 
            //fie se afiseaza o casuta de dialog de avertizare ca nu s-a gasit fisierul necesar
            //JOptionPane.showMessageDialog(null, ex); //2
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnDActionPerformed

    private void jbtnDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDDActionPerformed
        // TODO add your handling code here:
        try {
            if(jckbPian.isSelected()) notePianoDD();
            else noteViolinDD();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);  //1
             //se alege una din cele doua instructiuni 1 sau 2
            //daca nu se gaseste fisierul audio, fie se afiseaza mesajul SEVERE null si detalierea exceptiei, 
            //fie se afiseaza o casuta de dialog de avertizare ca nu s-a gasit fisierul necesar
            //JOptionPane.showMessageDialog(null, ex); //2
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnDDActionPerformed

    private void jbtnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEActionPerformed
        // TODO add your handling code here:
        try {
            if(jckbPian.isSelected()) notePianoE();
            else noteViolinE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);  //1
             //se alege una din cele doua instructiuni 1 sau 2
            //daca nu se gaseste fisierul audio, fie se afiseaza mesajul SEVERE null si detalierea exceptiei, 
            //fie se afiseaza o casuta de dialog de avertizare ca nu s-a gasit fisierul necesar
            //JOptionPane.showMessageDialog(null, ex); //2
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnEActionPerformed

    private void jbtnFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFDActionPerformed
        // TODO add your handling code here:
        try {
            if(jckbPian.isSelected()) notePianoFD();
            else noteViolinFD();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);  //1
             //se alege una din cele doua instructiuni 1 sau 2
            //daca nu se gaseste fisierul audio, fie se afiseaza mesajul SEVERE null si detalierea exceptiei, 
            //fie se afiseaza o casuta de dialog de avertizare ca nu s-a gasit fisierul necesar
            //JOptionPane.showMessageDialog(null, ex); //2
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnFDActionPerformed

    private void jbtnGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGDActionPerformed
        // TODO add your handling code here:
        try {
            if(jckbPian.isSelected()) notePianoGD();
            else noteViolinGD();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);  //1
             //se alege una din cele doua instructiuni 1 sau 2
            //daca nu se gaseste fisierul audio, fie se afiseaza mesajul SEVERE null si detalierea exceptiei, 
            //fie se afiseaza o casuta de dialog de avertizare ca nu s-a gasit fisierul necesar
            //JOptionPane.showMessageDialog(null, ex); //2
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnGDActionPerformed

    private void jbtnADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnADActionPerformed
        // TODO add your handling code here:
        try {
            if(jckbPian.isSelected()) notePianoAD();
            else noteViolinAD();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);  //1
             //se alege una din cele doua instructiuni 1 sau 2
            //daca nu se gaseste fisierul audio, fie se afiseaza mesajul SEVERE null si detalierea exceptiei, 
            //fie se afiseaza o casuta de dialog de avertizare ca nu s-a gasit fisierul necesar
            //JOptionPane.showMessageDialog(null, ex); //2
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnADActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PianVirtualBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PianVirtualBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PianVirtualBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PianVirtualBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PianVirtualBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jbtnA;
    private javax.swing.JButton jbtnAD;
    private javax.swing.JButton jbtnB;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnC1;
    private javax.swing.JButton jbtnCD;
    private javax.swing.JButton jbtnCD1;
    private javax.swing.JButton jbtnD;
    private javax.swing.JButton jbtnD1;
    private javax.swing.JButton jbtnDD;
    private javax.swing.JButton jbtnDD1;
    private javax.swing.JButton jbtnE;
    private javax.swing.JButton jbtnE1;
    private javax.swing.JButton jbtnF;
    private javax.swing.JButton jbtnF1;
    private javax.swing.JButton jbtnFD;
    private javax.swing.JButton jbtnG;
    private javax.swing.JButton jbtnGD;
    private javax.swing.JCheckBox jckbPian;
    private javax.swing.JCheckBox jckbVioara;
    // End of variables declaration//GEN-END:variables
}
