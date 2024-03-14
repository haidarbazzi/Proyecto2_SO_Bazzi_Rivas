/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2_so.Interfaces;

import proyecto2_so.Disk.Buffer;
import proyecto2_so.Init;

/**
 *
 * @author andre
 */
public class MainWindow extends javax.swing.JFrame {
    
    Buffer buffer;

    /**
     * Creates new form MainWindow
     */
    public MainWindow(Buffer buffer) {
        initComponents();
        this.buffer=buffer;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        startSim = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tier1Nick = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tier3Nick = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tier2Nick = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        effortNick = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tier1Cartoon = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tier3Cartoon = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tier2Cartoon = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        effortCartoon = new javax.swing.JList<>();
        winnersCartoon = new javax.swing.JLabel();
        winnersNick = new javax.swing.JLabel();
        fighterCartoon = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fighterNick = new javax.swing.JLabel();
        stateAI = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        simSpeed = new javax.swing.JComboBox<>();
        cartoonCharacterImage = new javax.swing.JLabel();
        nickCharacterImage1 = new javax.swing.JLabel();
        nickCharacterCard = new javax.swing.JLabel();
        cartoonCharacterCard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(140, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(230, 225, 197));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startSim.setBackground(new java.awt.Color(201, 124, 93));
        startSim.setFont(new java.awt.Font("Barlow Condensed ExtraBold", 1, 14)); // NOI18N
        startSim.setForeground(new java.awt.Color(225, 229, 197));
        startSim.setText("Iniciar Simulacion");
        startSim.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 124, 93), 5, true));
        startSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startSimActionPerformed(evt);
            }
        });
        jPanel1.add(startSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 150, 50));

        jSeparator1.setForeground(new java.awt.Color(54, 57, 59));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 10, 400));

        jSeparator2.setForeground(new java.awt.Color(54, 57, 59));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 70, 400));

        jLabel3.setFont(new java.awt.Font("Barlow Condensed Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(54, 57, 59));
        jLabel3.setText("Ganadores");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, 30));

        jLabel4.setFont(new java.awt.Font("Barlow Condensed Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(54, 57, 59));
        jLabel4.setText("Nivel 1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 30));

        jScrollPane4.setBorder(null);

        tier1Nick.setBackground(new java.awt.Color(230, 225, 197));
        tier1Nick.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 57, 59), 1, true));
        tier1Nick.setFont(new java.awt.Font("Barlow Condensed", 0, 12)); // NOI18N
        tier1Nick.setForeground(new java.awt.Color(54, 57, 59));
        tier1Nick.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(tier1Nick);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, 100));

        jScrollPane5.setBorder(null);

        tier3Nick.setBackground(new java.awt.Color(230, 225, 197));
        tier3Nick.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 57, 59), 1, true));
        tier3Nick.setFont(new java.awt.Font("Barlow Condensed", 0, 12)); // NOI18N
        tier3Nick.setForeground(new java.awt.Color(54, 57, 59));
        tier3Nick.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(tier3Nick);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 150, 100));

        jLabel5.setFont(new java.awt.Font("Barlow Condensed Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(54, 57, 59));
        jLabel5.setText("Nivel 3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 30));

        jLabel6.setFont(new java.awt.Font("Barlow Condensed Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(54, 57, 59));
        jLabel6.setText("Nivel 2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, 30));

        jScrollPane8.setBorder(null);

        tier2Nick.setBackground(new java.awt.Color(230, 225, 197));
        tier2Nick.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 57, 59), 1, true));
        tier2Nick.setFont(new java.awt.Font("Barlow Condensed", 0, 12)); // NOI18N
        tier2Nick.setForeground(new java.awt.Color(54, 57, 59));
        tier2Nick.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(tier2Nick);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 150, 100));

        jLabel8.setFont(new java.awt.Font("Barlow Condensed Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(54, 57, 59));
        jLabel8.setText("Refuerzo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, 30));

        jScrollPane9.setBorder(null);

        effortNick.setBackground(new java.awt.Color(230, 225, 197));
        effortNick.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 57, 59), 1, true));
        effortNick.setFont(new java.awt.Font("Barlow Condensed", 0, 12)); // NOI18N
        effortNick.setForeground(new java.awt.Color(54, 57, 59));
        effortNick.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(effortNick);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 150, 100));

        jLabel7.setFont(new java.awt.Font("Barlow Condensed Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(54, 57, 59));
        jLabel7.setText("Ganadores");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, -1, 30));

        jLabel9.setFont(new java.awt.Font("Barlow Condensed Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(54, 57, 59));
        jLabel9.setText("Nivel 1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, 30));

        jScrollPane7.setBorder(null);

        tier1Cartoon.setBackground(new java.awt.Color(230, 225, 197));
        tier1Cartoon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 57, 59), 1, true));
        tier1Cartoon.setFont(new java.awt.Font("Barlow Condensed", 0, 12)); // NOI18N
        tier1Cartoon.setForeground(new java.awt.Color(54, 57, 59));
        tier1Cartoon.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(tier1Cartoon);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 150, 100));

        jLabel10.setFont(new java.awt.Font("Barlow Condensed Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(54, 57, 59));
        jLabel10.setText("Nivel 3");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, -1, 30));

        jScrollPane10.setBorder(null);

        tier3Cartoon.setBackground(new java.awt.Color(230, 225, 197));
        tier3Cartoon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 57, 59), 1, true));
        tier3Cartoon.setFont(new java.awt.Font("Barlow Condensed", 0, 12)); // NOI18N
        tier3Cartoon.setForeground(new java.awt.Color(54, 57, 59));
        tier3Cartoon.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane10.setViewportView(tier3Cartoon);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 150, 100));

        jLabel11.setFont(new java.awt.Font("Barlow Condensed Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(54, 57, 59));
        jLabel11.setText("Nivel 2");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 270, -1, 30));

        jScrollPane11.setBorder(null);

        tier2Cartoon.setBackground(new java.awt.Color(230, 225, 197));
        tier2Cartoon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 57, 59), 1, true));
        tier2Cartoon.setFont(new java.awt.Font("Barlow Condensed", 0, 12)); // NOI18N
        tier2Cartoon.setForeground(new java.awt.Color(54, 57, 59));
        tier2Cartoon.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane11.setViewportView(tier2Cartoon);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 300, 150, 100));

        jLabel12.setFont(new java.awt.Font("Barlow Condensed Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(54, 57, 59));
        jLabel12.setText("Refuerzo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, -1, 30));

        jScrollPane12.setBorder(null);

        effortCartoon.setBackground(new java.awt.Color(230, 225, 197));
        effortCartoon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 57, 59), 1, true));
        effortCartoon.setFont(new java.awt.Font("Barlow Condensed", 0, 12)); // NOI18N
        effortCartoon.setForeground(new java.awt.Color(54, 57, 59));
        effortCartoon.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane12.setViewportView(effortCartoon);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 150, 100));

        winnersCartoon.setBackground(new java.awt.Color(145, 178, 228));
        winnersCartoon.setFont(new java.awt.Font("Barlow Condensed ExtraBold", 0, 48)); // NOI18N
        winnersCartoon.setForeground(new java.awt.Color(230, 225, 197));
        winnersCartoon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        winnersCartoon.setText("0");
        winnersCartoon.setOpaque(true);
        jPanel1.add(winnersCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 50, -1));

        winnersNick.setBackground(new java.awt.Color(145, 178, 228));
        winnersNick.setFont(new java.awt.Font("Barlow Condensed ExtraBold", 0, 48)); // NOI18N
        winnersNick.setForeground(new java.awt.Color(230, 225, 197));
        winnersNick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        winnersNick.setText("0");
        winnersNick.setOpaque(true);
        jPanel1.add(winnersNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 50, -1));

        fighterCartoon.setFont(new java.awt.Font("Barlow Condensed", 1, 14)); // NOI18N
        fighterCartoon.setForeground(new java.awt.Color(54, 57, 59));
        fighterCartoon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fighterCartoon.setText("Nombre Cartoon");
        jPanel1.add(fighterCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 359, 130, 30));

        jLabel16.setFont(new java.awt.Font("Barlow Condensed Black", 2, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(201, 124, 93));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("VS");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 40, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_so/CartoonImages/Regular_Show_Logo.svg.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_so/NickImages/Avatar_The_Last_Airbender_logo.svg.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        fighterNick.setFont(new java.awt.Font("Barlow Condensed", 1, 14)); // NOI18N
        fighterNick.setForeground(new java.awt.Color(54, 57, 59));
        fighterNick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fighterNick.setText("Nombre Nick");
        jPanel1.add(fighterNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 100, -1));

        stateAI.setFont(new java.awt.Font("Barlow Condensed Black", 0, 24)); // NOI18N
        stateAI.setForeground(new java.awt.Color(54, 57, 59));
        stateAI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stateAI.setText("Decidiendo");
        jPanel1.add(stateAI, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 220, -1));

        jLabel2.setFont(new java.awt.Font("Barlow Condensed ExtraBold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 57, 59));
        jLabel2.setText("Velocidad de Simulacion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, -1, -1));

        simSpeed.setBackground(new java.awt.Color(225, 229, 197));
        simSpeed.setFont(new java.awt.Font("Barlow Condensed", 0, 12)); // NOI18N
        simSpeed.setForeground(new java.awt.Color(54, 57, 59));
        simSpeed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.25", "0.5", "1", "1.5", "2", "2.5", "3" }));
        simSpeed.setSelectedIndex(2);
        simSpeed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(54, 57, 59)));
        simSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simSpeedActionPerformed(evt);
            }
        });
        jPanel1.add(simSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 110, -1));

        cartoonCharacterImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartoonCharacterImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_so/NickImages/Appa.png"))); // NOI18N
        jPanel1.add(cartoonCharacterImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 110, -1));

        nickCharacterImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nickCharacterImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_so/NickImages/Appa.png"))); // NOI18N
        jPanel1.add(nickCharacterImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 120, -1));

        nickCharacterCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_so/NickImages/AverageCardAvatar.png"))); // NOI18N
        jPanel1.add(nickCharacterCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 140, 220));

        cartoonCharacterCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartoonCharacterCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto2_so/CartoonImages/DeficientCardRegShow.png"))); // NOI18N
        jPanel1.add(cartoonCharacterCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 150, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startSimActionPerformed
        Init init = new Init(this, this.buffer);
        init.init();
        this.startSim.setEnabled(false);
        
    }//GEN-LAST:event_startSimActionPerformed

    private void simSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simSpeedActionPerformed
        double newSimSpeed = Double.parseDouble(this.simSpeed.getSelectedItem().toString());
       
        this.buffer.setSimSpeed(1000/newSimSpeed);
        this.buffer.setNextSim(4000/newSimSpeed);
        this.buffer.setSimLoad(2000/newSimSpeed);
        
    }//GEN-LAST:event_simSpeedActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cartoonCharacterCard;
    private javax.swing.JLabel cartoonCharacterImage;
    private javax.swing.JList<String> effortCartoon;
    private javax.swing.JList<String> effortNick;
    private javax.swing.JLabel fighterCartoon;
    private javax.swing.JLabel fighterNick;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nickCharacterCard;
    private javax.swing.JLabel nickCharacterImage1;
    private javax.swing.JComboBox<String> simSpeed;
    private javax.swing.JButton startSim;
    private javax.swing.JLabel stateAI;
    private javax.swing.JList<String> tier1Cartoon;
    private javax.swing.JList<String> tier1Nick;
    private javax.swing.JList<String> tier2Cartoon;
    private javax.swing.JList<String> tier2Nick;
    private javax.swing.JList<String> tier3Cartoon;
    private javax.swing.JList<String> tier3Nick;
    private javax.swing.JLabel winnersCartoon;
    private javax.swing.JLabel winnersNick;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the IDcartoon
     */
   

    /**
     * @return the cartoonCharacterCard
     */
    public javax.swing.JLabel getCartoonCharacterCard() {
        return cartoonCharacterCard;
    }

    /**
     * @param cartoonCharacterCard the cartoonCharacterCard to set
     */
    public void setCartoonCharacterCard(javax.swing.JLabel cartoonCharacterCard) {
        this.cartoonCharacterCard = cartoonCharacterCard;
    }

    /**
     * @return the cartoonCharacterImage
     */
    public javax.swing.JLabel getCartoonCharacterImage() {
        return cartoonCharacterImage;
    }

    /**
     * @param cartoonCharacterImage the cartoonCharacterImage to set
     */
    public void setCartoonCharacterImage(javax.swing.JLabel cartoonCharacterImage) {
        this.cartoonCharacterImage = cartoonCharacterImage;
    }

    /**
     * @return the effortCartoon
     */
    public javax.swing.JList<String> getEffortCartoon() {
        return effortCartoon;
    }

    /**
     * @param effortCartoon the effortCartoon to set
     */
    public void setEffortCartoon(javax.swing.JList<String> effortCartoon) {
        this.effortCartoon = effortCartoon;
    }

    /**
     * @return the effortNick
     */
    public javax.swing.JList<String> getEffortNick() {
        return effortNick;
    }

    /**
     * @param effortNick the effortNick to set
     */
    public void setEffortNick(javax.swing.JList<String> effortNick) {
        this.effortNick = effortNick;
    }

    /**
     * @return the fighterCartoon
     */
    public javax.swing.JLabel getFighterCartoon() {
        return fighterCartoon;
    }

    /**
     * @param fighterCartoon the fighterCartoon to set
     */
    public void setFighterCartoon(javax.swing.JLabel fighterCartoon) {
        this.fighterCartoon = fighterCartoon;
    }

    /**
     * @return the fighterNick
     */
    public javax.swing.JLabel getFighterNick() {
        return fighterNick;
    }

    /**
     * @param fighterNick the fighterNick to set
     */
    public void setFighterNick(javax.swing.JLabel fighterNick) {
        this.fighterNick = fighterNick;
    }

    /**
     * @return the jComboBox1
     */
    public javax.swing.JComboBox<String> getjComboBox1() {
        return simSpeed;
    }

    /**
     * @return the nickCharacterCard
     */
    public javax.swing.JLabel getNickCharacterCard() {
        return nickCharacterCard;
    }

    /**
     * @param nickCharacterCard the nickCharacterCard to set
     */
    public void setNickCharacterCard(javax.swing.JLabel nickCharacterCard) {
        this.nickCharacterCard = nickCharacterCard;
    }

    /**
     * @return the nickCharacterImage1
     */
    public javax.swing.JLabel getNickCharacterImage1() {
        return nickCharacterImage1;
    }

    /**
     * @param nickCharacterImage1 the nickCharacterImage1 to set
     */
    public void setNickCharacterImage1(javax.swing.JLabel nickCharacterImage1) {
        this.nickCharacterImage1 = nickCharacterImage1;
    }

    /**
     * @return the stateAI
     */
    public javax.swing.JLabel getStateAI() {
        return stateAI;
    }

    /**
     * @param stateAI the stateAI to set
     */
    public void setStateAI(javax.swing.JLabel stateAI) {
        this.stateAI = stateAI;
    }

    /**
     * @return the tier1Cartoon
     */
    public javax.swing.JList<String> getTier1Cartoon() {
        return tier1Cartoon;
    }

    /**
     * @param tier1Cartoon the tier1Cartoon to set
     */
    public void setTier1Cartoon(javax.swing.JList<String> tier1Cartoon) {
        this.tier1Cartoon = tier1Cartoon;
    }

    /**
     * @return the tier1Nick
     */
    public javax.swing.JList<String> getTier1Nick() {
        return tier1Nick;
    }

    /**
     * @param tier1Nick the tier1Nick to set
     */
    public void setTier1Nick(javax.swing.JList<String> tier1Nick) {
        this.tier1Nick = tier1Nick;
    }

    /**
     * @return the tier2Cartoon
     */
    public javax.swing.JList<String> getTier2Cartoon() {
        return tier2Cartoon;
    }

    /**
     * @param tier2Cartoon the tier2Cartoon to set
     */
    public void setTier2Cartoon(javax.swing.JList<String> tier2Cartoon) {
        this.tier2Cartoon = tier2Cartoon;
    }

    /**
     * @return the tier2Nick
     */
    public javax.swing.JList<String> getTier2Nick() {
        return tier2Nick;
    }

    /**
     * @param tier2Nick the tier2Nick to set
     */
    public void setTier2Nick(javax.swing.JList<String> tier2Nick) {
        this.tier2Nick = tier2Nick;
    }

    /**
     * @return the tier3Cartoon
     */
    public javax.swing.JList<String> getTier3Cartoon() {
        return tier3Cartoon;
    }

    /**
     * @param tier3Cartoon the tier3Cartoon to set
     */
    public void setTier3Cartoon(javax.swing.JList<String> tier3Cartoon) {
        this.tier3Cartoon = tier3Cartoon;
    }

    /**
     * @return the tier3Nick
     */
    public javax.swing.JList<String> getTier3Nick() {
        return tier3Nick;
    }

    /**
     * @param tier3Nick the tier3Nick to set
     */
    public void setTier3Nick(javax.swing.JList<String> tier3Nick) {
        this.tier3Nick = tier3Nick;
    }

    /**
     * @return the winnersCartoon
     */
    public javax.swing.JLabel getWinnersCartoon() {
        return winnersCartoon;
    }

    /**
     * @param winnersCartoon the winnersCartoon to set
     */
    public void setWinnersCartoon(javax.swing.JLabel winnersCartoon) {
        this.winnersCartoon = winnersCartoon;
    }

    /**
     * @return the winnersNick
     */
    public javax.swing.JLabel getWinnersNick() {
        return winnersNick;
    }

    /**
     * @param winnersNick the winnersNick to set
     */
    public void setWinnersNick(javax.swing.JLabel winnersNick) {
        this.winnersNick = winnersNick;
    }
}
