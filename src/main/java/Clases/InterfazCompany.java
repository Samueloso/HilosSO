/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author samue
 */
public class InterfazCompany extends javax.swing.JFrame {
    
  

    /**
     * @param LogicoTexto the LogicoTexto to set
     */
    public void setLogicoTexto(String t) {
        this.LogicoTexto.setText(t);
    }

    /**
     * @param DE_Texto the DE_Texto to set
     */
    public void setDE_Texto(String t) {
        this.DE_Texto.setText(t);
    }

    /**
     * @param DLCTexto the DLCTexto to set
     */
    public void setDLCTexto(String t) {
        this.DLCTexto.setText(t);
    }

    /**
     * @param DirectorTexto the DirectorTexto to set
     */
    public void setDirectorTexto(String t) {
        this.DirectorTexto.setText(t);
    }

    /**
     * @param GananciasTexto the GananciasTexto to set
     */
    public void setGananciasTexto(String t) {
        this.GananciasTexto.setText(t);
    }

    /**
     * @param JuegosDLCTexto the JuegosDLCTexto to set
     */
    public void setJuegosDLCTexto(String t) {
        this.JuegosDLCTexto.setText(t);
    }

    /**
     * @param JuegosTexto the JuegosTexto to set
     */
    public void setJuegosTexto(String t) {
        this.JuegosTexto.setText(t);
    }

    /**
     * @param NarrativaTexto the NarrativaTexto to set
     */
    public void setNarrativaTexto(String t) {
        this.NarrativaTexto.setText(t);
    }

    /**
     * @param NivelesTexto the NivelesTexto to set
     */
    public void setNivelesTexto(String t) {
        this.NivelesTexto.setText(t);
    }

    /**
     * @param PMTexto the PMTexto to set
     */
    public void setPMTexto(String t) {
        this.PMTexto.setText(t);
    }

    /**
     * @param SQEcosts the SQEcosts to set
     */
    public void setSQEcosts(String t) {
        this.SQEcosts.setText(t);
    }

    /**
     * @param SQEmoney_pm the SQEmoney_pm to set
     */
    public void setSQEmoney_pm(String t) {
        this.SQEmoney_pm.setText(t);
    }

    /**
     * @param SQEnumber the SQEnumber to set
     */
    public void setSQEnumber(String t) {
        this.SQEnumber.setText(t);
    }

    /**
     * @param SQEstonks the SQEstonks to set
     */
    public void setSQEstonks(String t) {
        this.SQEstonks.setText(t);
    }

    /**
     * @param SpriteTexto the SpriteTexto to set
     */
    public void setSpriteTexto(String t) {
        this.SpriteTexto.setText(t);
    }

    /**
     * @param costs the costs to set
     */
    public void setCosts(String t) {
        this.costs.setText(t);
    }

    /**
     * @param money_pm the money_pm to set
     */
    public void setMoney_pm(String t) {
        this.money_pm.setText(t);
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String t) {
        this.number.setText(t);
    }

    /**
     * @param stonks the stonks to set
     */
    public void setStonks(String t) {
        this.stonks.setText(t);
    }

    /**
     * @param DE_SQE the DE_SQE to set
     */
    public void setDE_SQE(String t) {
        this.DE_SQE.setText(t);
    }

    /**
     * @param DirectorSQE the DirectorSQE to set
     */
    public void setDirectorSQE(String t) {
        this.DirectorSQE.setText(t);
    }

    /**
     * @param GananaciasSQE the GananaciasSQE to set
     */
    public void setGananaciasSQE(String t) {
        this.GananaciasSQE.setText(t);
    }

    /**
     * @param JuegosDLC_SQE the JuegosDLC_SQE to set
     */
    public void setJuegosDLC_SQE(String t) {
        this.JuegosDLC_SQE.setText(t);
    }

    /**
     * @param JuegosSQE the JuegosSQE to set
     */
    public void setJuegosSQE(String t) {
        this.JuegosSQE.setText(t);
    }

    /**
     * @param PM_SQE the PM_SQE to set
     */
    public void setPM_SQE(String t) {
        this.PM_SQE.setText(t);
    }

    /**
     * @param SQEGuionTexto the SQEGuionTexto to set
     */
    public void setSQEGuionTexto(String t) {
        this.SQEGuionTexto.setText(t);
    }

    /**
     * @param SQELogicaTexto the SQELogicaTexto to set
     */
    public void setSQELogicaTexto(String t) {
        this.SQELogicaTexto.setText(t);
    }

    /**
     * @param SQENivelTexto the SQENivelTexto to set
     */
    public void setSQENivelTexto(String t) {
        this.SQENivelTexto.setText(t);
    }

    /**
     * @param SQE_DLCTexto the SQE_DLCTexto to set
     */
    public void setSQE_DLCTexto(String t) {
        this.SQE_DLCTexto.setText(t);
    }
    
    public void setDay(int d){
        this.DayCorre.setText(Integer.toString(d));
        
        
    }

    /**
     * @param SQESpriteTexto the SQESpriteTexto to set
     */
    public void setSQESpriteTexto(String t) {
        this.SQESpriteTexto.setText(t);
    }

    JFileChooser jfc = new JFileChooser();
    File archivo;
    int[] Capcom = {1, 2, 6, 5, 3, 1};
    int Nwork1 = 18;
    float[] ppCapcom = {0.25f, 1f, 5f, 0.50f};
    int[] StonksCapcom = {400, 750};
    int[] SquareEnix = {1, 1, 2, 4, 2, 3};
    int Nwork2 = 13;
    float[] ppSquareEnix = {0.34f, 2f, 3f, 0.34f};
    int[] StonksSquareEnix = {350, 700};
    int dd1 = 1;
    int dl = 14;
    int[] init_developer1 = {1, 1, 1, 1, 1, 1};
    int[] init_developer2 = {1, 1, 1, 1, 1, 1};
    int dd2 = dd1 * 1000;
    Drive drive1 = new Drive("Capcom", 0, 0, 0, 0, 0, 0, 0, Capcom, this);
    Company C0 = new Company(dd2, dl, "Capcom", Nwork1, ppCapcom[0], ppCapcom[1], ppCapcom[2], ppCapcom[3], drive1, init_developer1, StonksCapcom, this);
    Drive drive2 = new Drive("SquareEnix", 0, 0, 0, 0, 0, 0, 0, SquareEnix, this);
    Company C1 = new Company(dd2, dl, "SquareEnix", Nwork2, ppSquareEnix[0], ppSquareEnix[1], ppSquareEnix[2], ppSquareEnix[3], drive2, init_developer2, StonksSquareEnix, this);

    /**
     * Creates new form InterfazCompany
     */
    public InterfazCompany() {

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        LabelDevelop = new javax.swing.JLabel();
        narrativaLabel = new javax.swing.JLabel();
        NivelLabel = new javax.swing.JLabel();
        LogicaLabel = new javax.swing.JLabel();
        IntegradorLabel = new javax.swing.JLabel();
        DLCLabel = new javax.swing.JLabel();
        EntradaNarrativa = new javax.swing.JTextField();
        EntradaNiveles = new javax.swing.JTextField();
        EntradaLogica = new javax.swing.JTextField();
        EntradaDLC = new javax.swing.JTextField();
        EntradaIntegrador = new javax.swing.JTextField();
        agregarNarrativaBTN = new javax.swing.JButton();
        QuitarNarrativaBTN = new javax.swing.JButton();
        AgregarNivelesBTN = new javax.swing.JButton();
        AgregarLogicaBTN = new javax.swing.JButton();
        AgregarIntegradorBTN = new javax.swing.JButton();
        AgregarDLCBTN = new javax.swing.JButton();
        RestarNivelesBTN = new javax.swing.JButton();
        RestarLogicaBTN = new javax.swing.JButton();
        RestarDLCBTN = new javax.swing.JButton();
        CargarDatos = new javax.swing.JButton();
        LABELE = new javax.swing.JLabel();
        narrativaLabel1 = new javax.swing.JLabel();
        NivelLabel1 = new javax.swing.JLabel();
        LogicaLabel1 = new javax.swing.JLabel();
        DLCLabel1 = new javax.swing.JLabel();
        IntegradorLabel1 = new javax.swing.JLabel();
        EntradaNarrativaSE = new javax.swing.JTextField();
        EntradaNivelesSE = new javax.swing.JTextField();
        EntradaLogicaSE = new javax.swing.JTextField();
        EntradaDLCSE = new javax.swing.JTextField();
        EntradaIntegradorSE = new javax.swing.JTextField();
        LogicaLabel2 = new javax.swing.JLabel();
        EntradaSprites = new javax.swing.JTextField();
        AgregarSpriteBTN = new javax.swing.JButton();
        RestarSpriteBTN = new javax.swing.JButton();
        LogicaLabel3 = new javax.swing.JLabel();
        EntradaSpritesSE = new javax.swing.JTextField();
        RestarIntegrador = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        agregarNarrativaBTNSE = new javax.swing.JButton();
        QuitarNarrativaBTNSE = new javax.swing.JButton();
        AgregarNivelesBTNSE = new javax.swing.JButton();
        RestarNivelesBTNSE = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        AgregarSpriteBTNSE = new javax.swing.JButton();
        RestarSpriteBTNSE = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        AgregarLogicaBTNSE = new javax.swing.JButton();
        RestarLogicaBTNSE = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        AgregarDLCBTNSE = new javax.swing.JButton();
        RestarDLCBTNSE = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        AgregarIntegradorBTNSE = new javax.swing.JButton();
        RestarIntegradorSE = new javax.swing.JButton();
        LecturaDeDatos = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        Dayduration = new javax.swing.JTextField();
        AnadirDias = new javax.swing.JButton();
        RestarDias = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        RestarDeadline = new javax.swing.JButton();
        AgregarDeadline = new javax.swing.JButton();
        Deadday = new javax.swing.JTextField();
        LabelDevelop3 = new javax.swing.JLabel();
        PastelButton = new javax.swing.JButton();
        DayCorre = new javax.swing.JTextField();
        LineaGrafica = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        GuionCapcomLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NivelCapcomLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        SQEGuionTexto = new javax.swing.JTextField();
        JuegosSQE = new javax.swing.JTextField();
        JuegosDLC_SQE = new javax.swing.JTextField();
        SQENivelTexto = new javax.swing.JTextField();
        SQESpriteTexto = new javax.swing.JTextField();
        SQE_DLCTexto = new javax.swing.JTextField();
        SQELogicaTexto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        DE_SQE = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        PM_SQE = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        DirectorSQE = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        GananaciasSQE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SQEnumber = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        SQEstonks = new javax.swing.JTextField();
        SQEcosts = new javax.swing.JTextField();
        SQEmoney_pm = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        GuionCapcomLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NivelCapcomLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NarrativaTexto = new javax.swing.JTextField();
        JuegosTexto = new javax.swing.JTextField();
        JuegosDLCTexto = new javax.swing.JTextField();
        NivelesTexto = new javax.swing.JTextField();
        SpriteTexto = new javax.swing.JTextField();
        DLCTexto = new javax.swing.JTextField();
        LogicoTexto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        DE_Texto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PMTexto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        DirectorTexto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        GananciasTexto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        money_pm = new javax.swing.JTextField();
        stonks = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        costs = new javax.swing.JTextField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField3.setText("jTextField3");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Acceder");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane3.setBackground(new java.awt.Color(153, 255, 255));
        jTabbedPane3.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelDevelop.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelDevelop.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Downloads\\Logoescuare.jpg")); // NOI18N
        jPanel1.add(LabelDevelop, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, -1, 82));

        narrativaLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        narrativaLabel.setText("Narrativa");
        jPanel1.add(narrativaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 120, 40));

        NivelLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        NivelLabel.setText("Niveles");
        jPanel1.add(NivelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 80, -1));

        LogicaLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        LogicaLabel.setText("Logica");
        jPanel1.add(LogicaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        IntegradorLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        IntegradorLabel.setText("Integrator");
        jPanel1.add(IntegradorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, -1, 32));

        DLCLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        DLCLabel.setText("DLC");
        jPanel1.add(DLCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, -1, -1));

        EntradaNarrativa.setEditable(false);
        EntradaNarrativa.setBackground(java.awt.Color.white);
        EntradaNarrativa.setText("1");
        EntradaNarrativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNarrativaActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaNarrativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 100, -1));

        EntradaNiveles.setEditable(false);
        EntradaNiveles.setBackground(java.awt.Color.white);
        EntradaNiveles.setText("1");
        EntradaNiveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNivelesActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaNiveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 100, -1));

        EntradaLogica.setEditable(false);
        EntradaLogica.setBackground(java.awt.Color.white);
        EntradaLogica.setText("1");
        EntradaLogica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaLogicaActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaLogica, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 100, -1));

        EntradaDLC.setEditable(false);
        EntradaDLC.setBackground(java.awt.Color.white);
        EntradaDLC.setText("1");
        EntradaDLC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaDLCActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaDLC, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 100, -1));

        EntradaIntegrador.setEditable(false);
        EntradaIntegrador.setBackground(java.awt.Color.white);
        EntradaIntegrador.setText("1");
        EntradaIntegrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaIntegradorActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaIntegrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 100, -1));

        agregarNarrativaBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        agregarNarrativaBTN.setText("+");
        agregarNarrativaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarNarrativaBTNActionPerformed(evt);
            }
        });
        jPanel1.add(agregarNarrativaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 40, 40));

        QuitarNarrativaBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QuitarNarrativaBTN.setText("-");
        QuitarNarrativaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarNarrativaBTNActionPerformed(evt);
            }
        });
        jPanel1.add(QuitarNarrativaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 40, 40));

        AgregarNivelesBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarNivelesBTN.setText("+");
        AgregarNivelesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNivelesBTNActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarNivelesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 40, 40));

        AgregarLogicaBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarLogicaBTN.setText("+");
        AgregarLogicaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarLogicaBTNActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarLogicaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 40, 40));

        AgregarIntegradorBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarIntegradorBTN.setText("+");
        AgregarIntegradorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarIntegradorBTNActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarIntegradorBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 40, 40));

        AgregarDLCBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarDLCBTN.setText("+");
        AgregarDLCBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDLCBTNActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarDLCBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 40, 40));

        RestarNivelesBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RestarNivelesBTN.setText("-");
        RestarNivelesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarNivelesBTNActionPerformed(evt);
            }
        });
        jPanel1.add(RestarNivelesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 40, 40));

        RestarLogicaBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RestarLogicaBTN.setText("-");
        RestarLogicaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarLogicaBTNActionPerformed(evt);
            }
        });
        jPanel1.add(RestarLogicaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 40, 40));

        RestarDLCBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RestarDLCBTN.setText("-");
        RestarDLCBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarDLCBTNActionPerformed(evt);
            }
        });
        jPanel1.add(RestarDLCBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 40, 40));

        CargarDatos.setBackground(new java.awt.Color(255, 0, 0));
        CargarDatos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CargarDatos.setForeground(new java.awt.Color(0, 0, 0));
        CargarDatos.setText("Cargar Datos");
        CargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(CargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, 170, 59));
        jPanel1.add(LABELE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1173, 656, 101, -1));

        narrativaLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        narrativaLabel1.setText("Narrativa");
        jPanel1.add(narrativaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, -1));

        NivelLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        NivelLabel1.setText("Niveles");
        jPanel1.add(NivelLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, -1, -1));

        LogicaLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        LogicaLabel1.setText("Logica");
        jPanel1.add(LogicaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, -1, -1));

        DLCLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        DLCLabel1.setText("DLC");
        jPanel1.add(DLCLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, -1, -1));

        IntegradorLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        IntegradorLabel1.setText("Integrator");
        jPanel1.add(IntegradorLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, -1, -1));

        EntradaNarrativaSE.setEditable(false);
        EntradaNarrativaSE.setBackground(java.awt.Color.white);
        EntradaNarrativaSE.setText("1");
        EntradaNarrativaSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNarrativaSEActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaNarrativaSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 100, -1));

        EntradaNivelesSE.setEditable(false);
        EntradaNivelesSE.setBackground(java.awt.Color.white);
        EntradaNivelesSE.setText("1");
        EntradaNivelesSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNivelesSEActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaNivelesSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 300, 100, -1));

        EntradaLogicaSE.setEditable(false);
        EntradaLogicaSE.setBackground(java.awt.Color.white);
        EntradaLogicaSE.setText("1");
        EntradaLogicaSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaLogicaSEActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaLogicaSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 470, 100, -1));

        EntradaDLCSE.setEditable(false);
        EntradaDLCSE.setBackground(java.awt.Color.white);
        EntradaDLCSE.setText("1");
        EntradaDLCSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaDLCSEActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaDLCSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 560, 100, -1));

        EntradaIntegradorSE.setEditable(false);
        EntradaIntegradorSE.setBackground(java.awt.Color.white);
        EntradaIntegradorSE.setText("1");
        EntradaIntegradorSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaIntegradorSEActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaIntegradorSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 640, 100, -1));

        LogicaLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        LogicaLabel2.setText("Sprites");
        jPanel1.add(LogicaLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        EntradaSprites.setEditable(false);
        EntradaSprites.setBackground(java.awt.Color.white);
        EntradaSprites.setText("1");
        EntradaSprites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaSpritesActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaSprites, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 100, -1));

        AgregarSpriteBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarSpriteBTN.setText("+");
        AgregarSpriteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarSpriteBTNActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarSpriteBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 40, 40));

        RestarSpriteBTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RestarSpriteBTN.setText("-");
        RestarSpriteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarSpriteBTNActionPerformed(evt);
            }
        });
        jPanel1.add(RestarSpriteBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 40, 40));

        LogicaLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        LogicaLabel3.setText("Sprites");
        jPanel1.add(LogicaLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, -1, -1));

        EntradaSpritesSE.setEditable(false);
        EntradaSpritesSE.setBackground(java.awt.Color.white);
        EntradaSpritesSE.setText("1");
        EntradaSpritesSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaSpritesSEActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaSpritesSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, 100, -1));

        RestarIntegrador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RestarIntegrador.setText("-");
        RestarIntegrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarIntegradorActionPerformed(evt);
            }
        });
        jPanel1.add(RestarIntegrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, 40, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 300, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 254, 22));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 254, 22));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 254, 22));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 254, 22));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 254, 22));

        agregarNarrativaBTNSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        agregarNarrativaBTNSE.setText("+");
        agregarNarrativaBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarNarrativaBTNSEActionPerformed(evt);
            }
        });
        jPanel1.add(agregarNarrativaBTNSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 40, 40));

        QuitarNarrativaBTNSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QuitarNarrativaBTNSE.setText("-");
        QuitarNarrativaBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarNarrativaBTNSEActionPerformed(evt);
            }
        });
        jPanel1.add(QuitarNarrativaBTNSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 220, 40, 40));

        AgregarNivelesBTNSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarNivelesBTNSE.setText("+");
        AgregarNivelesBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNivelesBTNSEActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarNivelesBTNSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 300, 40, 40));

        RestarNivelesBTNSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RestarNivelesBTNSE.setText("-");
        RestarNivelesBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarNivelesBTNSEActionPerformed(evt);
            }
        });
        jPanel1.add(RestarNivelesBTNSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 300, 40, 40));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 330, 10));

        AgregarSpriteBTNSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarSpriteBTNSE.setText("+");
        AgregarSpriteBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarSpriteBTNSEActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarSpriteBTNSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 370, 40, 40));

        RestarSpriteBTNSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RestarSpriteBTNSE.setText("-");
        RestarSpriteBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarSpriteBTNSEActionPerformed(evt);
            }
        });
        jPanel1.add(RestarSpriteBTNSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 370, 40, 40));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 330, 10));

        AgregarLogicaBTNSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarLogicaBTNSE.setText("+");
        AgregarLogicaBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarLogicaBTNSEActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarLogicaBTNSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 460, 40, 40));

        RestarLogicaBTNSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RestarLogicaBTNSE.setText("-");
        RestarLogicaBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarLogicaBTNSEActionPerformed(evt);
            }
        });
        jPanel1.add(RestarLogicaBTNSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 460, 40, 40));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 320, 10));

        AgregarDLCBTNSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarDLCBTNSE.setText("+");
        AgregarDLCBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDLCBTNSEActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarDLCBTNSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 560, 40, 40));

        RestarDLCBTNSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RestarDLCBTNSE.setText("-");
        RestarDLCBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarDLCBTNSEActionPerformed(evt);
            }
        });
        jPanel1.add(RestarDLCBTNSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 560, 40, 40));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 310, 10));

        AgregarIntegradorBTNSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarIntegradorBTNSE.setText("+");
        AgregarIntegradorBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarIntegradorBTNSEActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarIntegradorBTNSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 640, 40, 40));

        RestarIntegradorSE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RestarIntegradorSE.setText("-");
        RestarIntegradorSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarIntegradorSEActionPerformed(evt);
            }
        });
        jPanel1.add(RestarIntegradorSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 640, 40, 40));

        LecturaDeDatos.setBackground(new java.awt.Color(51, 255, 51));
        LecturaDeDatos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LecturaDeDatos.setForeground(new java.awt.Color(0, 0, 0));
        LecturaDeDatos.setText("Lectura de Datos");
        LecturaDeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LecturaDeDatosActionPerformed(evt);
            }
        });
        jPanel1.add(LecturaDeDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, -1, 59));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel25.setText("Day Duration");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        Dayduration.setBackground(java.awt.Color.white);
        Dayduration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaydurationActionPerformed(evt);
            }
        });
        jPanel1.add(Dayduration, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 140, -1));

        AnadirDias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AnadirDias.setText("+");
        AnadirDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirDiasActionPerformed(evt);
            }
        });
        jPanel1.add(AnadirDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 70, 30));

        RestarDias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RestarDias.setText("-");
        RestarDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarDiasActionPerformed(evt);
            }
        });
        jPanel1.add(RestarDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 70, 30));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("DeadLine");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 110, 20));

        RestarDeadline.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RestarDeadline.setText("-");
        RestarDeadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarDeadlineActionPerformed(evt);
            }
        });
        jPanel1.add(RestarDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 70, 30));

        AgregarDeadline.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarDeadline.setText("+");
        AgregarDeadline.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AgregarDeadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDeadlineActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 70, 30));

        Deadday.setBackground(new java.awt.Color(255, 255, 255));
        Deadday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeaddayActionPerformed(evt);
            }
        });
        jPanel1.add(Deadday, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 140, -1));

        LabelDevelop3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelDevelop3.setIcon(new javax.swing.ImageIcon("C:\\Users\\samue\\Downloads\\Capcom-logo.png")); // NOI18N
        jPanel1.add(LabelDevelop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 296, 63));

        PastelButton.setBackground(new java.awt.Color(255, 51, 153));
        PastelButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PastelButton.setForeground(new java.awt.Color(0, 0, 0));
        PastelButton.setText("Pastel");
        PastelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PastelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 90, 40));

        DayCorre.setBackground(new java.awt.Color(255, 255, 255));
        DayCorre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayCorreActionPerformed(evt);
            }
        });
        jPanel1.add(DayCorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 140, -1));

        LineaGrafica.setText("Linea");
        LineaGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineaGraficaActionPerformed(evt);
            }
        });
        jPanel1.add(LineaGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, -1, -1));

        jTabbedPane3.addTab("Configuraciones iniciales", jPanel1);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GuionCapcomLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        GuionCapcomLabel1.setText("Guiones producidos:");
        jPanel8.add(GuionCapcomLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Sistemas Logicos Producidos:");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setText("DLC Producidos:");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 120, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setText("Juegos Con DLC Producidos");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, 20));

        NivelCapcomLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        NivelCapcomLabel1.setText("Niveles producidos:");
        jPanel8.add(NivelCapcomLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 30));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setText("Sprites Producidos:");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 30));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setText("Juegos Producidos");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 140, 30));

        SQEGuionTexto.setEditable(false);
        SQEGuionTexto.setBackground(new java.awt.Color(255, 255, 255));
        SQEGuionTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SQEGuionTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQEGuionTextoActionPerformed(evt);
            }
        });
        jPanel8.add(SQEGuionTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 146, -1));

        JuegosSQE.setEditable(false);
        JuegosSQE.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(JuegosSQE, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 449, 187, -1));

        JuegosDLC_SQE.setEditable(false);
        JuegosDLC_SQE.setBackground(new java.awt.Color(255, 255, 255));
        JuegosDLC_SQE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JuegosDLC_SQEActionPerformed(evt);
            }
        });
        jPanel8.add(JuegosDLC_SQE, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 449, 195, -1));

        SQENivelTexto.setEditable(false);
        SQENivelTexto.setBackground(new java.awt.Color(255, 255, 255));
        SQENivelTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(SQENivelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 146, -1));

        SQESpriteTexto.setEditable(false);
        SQESpriteTexto.setBackground(new java.awt.Color(255, 255, 255));
        SQESpriteTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(SQESpriteTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 146, -1));

        SQE_DLCTexto.setEditable(false);
        SQE_DLCTexto.setBackground(new java.awt.Color(255, 255, 255));
        SQE_DLCTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(SQE_DLCTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 146, -1));

        SQELogicaTexto.setEditable(false);
        SQELogicaTexto.setBackground(new java.awt.Color(255, 255, 255));
        SQELogicaTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(SQELogicaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 264, 146, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setText("Dias Para La Entrega:");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 190, 30));

        DE_SQE.setEditable(false);
        DE_SQE.setBackground(new java.awt.Color(255, 255, 255));
        DE_SQE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DE_SQE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DE_SQEActionPerformed(evt);
            }
        });
        jPanel8.add(DE_SQE, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 183, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setText("Proyect Manager Estado:");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, 30));

        PM_SQE.setEditable(false);
        PM_SQE.setBackground(new java.awt.Color(255, 255, 255));
        PM_SQE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(PM_SQE, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 159, -1));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setText("Director Estado:");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, 30));

        DirectorSQE.setEditable(false);
        DirectorSQE.setBackground(new java.awt.Color(255, 255, 255));
        DirectorSQE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(DirectorSQE, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 219, 39));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setText("Utilidad Total:");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 110, 20));

        GananaciasSQE.setEditable(false);
        GananaciasSQE.setBackground(new java.awt.Color(255, 255, 255));
        GananaciasSQE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GananaciasSQEActionPerformed(evt);
            }
        });
        jPanel8.add(GananaciasSQE, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 444, 210, 32));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Cantidad de faltas y dinero descontado:");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        SQEnumber.setEditable(false);
        SQEnumber.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(SQEnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, -1, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel20.setText("Ganancias en bruto:");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 200, 30));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setText("Costos operativos:");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 150, 30));

        SQEstonks.setEditable(false);
        SQEstonks.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(SQEstonks, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        SQEcosts.setEditable(false);
        SQEcosts.setBackground(new java.awt.Color(255, 255, 255));
        SQEcosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQEcostsActionPerformed(evt);
            }
        });
        jPanel8.add(SQEcosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, -1));

        SQEmoney_pm.setEditable(false);
        SQEmoney_pm.setBackground(new java.awt.Color(255, 255, 255));
        SQEmoney_pm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQEmoney_pmActionPerformed(evt);
            }
        });
        jPanel8.add(SQEmoney_pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 90, -1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("SQUARE ENIX", jPanel7);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GuionCapcomLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        GuionCapcomLabel.setText("Guiones producidos:");
        jPanel6.add(GuionCapcomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 170, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Sistemas Logicos Producidos:");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 240, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("DLC Producidos:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 150, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Juegos Con DLC Producidos");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 220, -1));

        NivelCapcomLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        NivelCapcomLabel.setText("Niveles producidos:");
        jPanel6.add(NivelCapcomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 170, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Sprites Producidos:");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 170, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Juegos Producidos");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 160, -1));

        NarrativaTexto.setEditable(false);
        NarrativaTexto.setBackground(new java.awt.Color(255, 255, 255));
        NarrativaTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(NarrativaTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 146, -1));

        JuegosTexto.setEditable(false);
        JuegosTexto.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.add(JuegosTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 457, 187, -1));

        JuegosDLCTexto.setEditable(false);
        JuegosDLCTexto.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.add(JuegosDLCTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 457, 195, -1));

        NivelesTexto.setEditable(false);
        NivelesTexto.setBackground(new java.awt.Color(255, 255, 255));
        NivelesTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(NivelesTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 146, -1));

        SpriteTexto.setEditable(false);
        SpriteTexto.setBackground(new java.awt.Color(255, 255, 255));
        SpriteTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SpriteTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpriteTextoActionPerformed(evt);
            }
        });
        jPanel6.add(SpriteTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 146, -1));

        DLCTexto.setEditable(false);
        DLCTexto.setBackground(new java.awt.Color(255, 255, 255));
        DLCTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(DLCTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 146, -1));

        LogicoTexto.setEditable(false);
        LogicoTexto.setBackground(new java.awt.Color(255, 255, 255));
        LogicoTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LogicoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogicoTextoActionPerformed(evt);
            }
        });
        jPanel6.add(LogicoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 146, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Dias Para La Entrega");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 160, 22));

        DE_Texto.setEditable(false);
        DE_Texto.setBackground(new java.awt.Color(255, 255, 255));
        DE_Texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(DE_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 183, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Proyect Manager Estado:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 210, -1));

        PMTexto.setEditable(false);
        PMTexto.setBackground(new java.awt.Color(255, 255, 255));
        PMTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(PMTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 109, 180, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("Director Estado:");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 150, -1));

        DirectorTexto.setEditable(false);
        DirectorTexto.setBackground(new java.awt.Color(255, 255, 255));
        DirectorTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(DirectorTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 186, 219, 39));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("Utilidad Total");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 130, -1));

        GananciasTexto.setEditable(false);
        GananciasTexto.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.add(GananciasTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 446, 210, 45));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel22.setText("Cantidad de faltas y dinero descontado:");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 310, -1));

        number.setEditable(false);
        number.setBackground(new java.awt.Color(255, 255, 255));
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        jPanel6.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        money_pm.setEditable(false);
        money_pm.setBackground(new java.awt.Color(255, 255, 255));
        money_pm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                money_pmActionPerformed(evt);
            }
        });
        jPanel6.add(money_pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 90, -1));

        stonks.setEditable(false);
        stonks.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.add(stonks, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, -1, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel23.setText("Ganancias en bruto:");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 160, -1));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel24.setText("Costos operativos:");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 140, -1));

        costs.setEditable(false);
        costs.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.add(costs, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, -1, -1));

        jTabbedPane3.addTab("CAPCOM", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void SQEmoney_pmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SQEmoney_pmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SQEmoney_pmActionPerformed

    private void SQEcostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SQEcostsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SQEcostsActionPerformed

    private void DE_SQEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DE_SQEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DE_SQEActionPerformed

    private void JuegosDLC_SQEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuegosDLC_SQEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JuegosDLC_SQEActionPerformed

    private void SQEGuionTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SQEGuionTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SQEGuionTextoActionPerformed

    private void DaydurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaydurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DaydurationActionPerformed

    private void LecturaDeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LecturaDeDatosActionPerformed
        // TODO add your handling code here:
        lectura_data();
        C0.Begin();
        C1.Begin();
;
  
    }//GEN-LAST:event_LecturaDeDatosActionPerformed

    private void RestarIntegradorSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarIntegradorSEActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer2[0] + init_developer2[1] + init_developer2[2] + init_developer2[3] + init_developer2[4] + init_developer2[5];
        if (init_developer2[5] > 1 && totalsuma <= Nwork2) {
            init_developer2[5]--;
            EntradaIntegradorSE.setText(String.valueOf(init_developer2[5]));
            C1.setInits(5, init_developer2[5]);

        } else {

        }
    }//GEN-LAST:event_RestarIntegradorSEActionPerformed

    private void AgregarIntegradorBTNSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarIntegradorBTNSEActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer2[0] + init_developer2[1] + init_developer2[2] + init_developer2[3] + init_developer2[4] + init_developer2[5];
        if (init_developer2[5] >= 1 && totalsuma < Nwork2) {
            init_developer2[5]++;
            EntradaIntegradorSE.setText(String.valueOf(init_developer2[5]));
            C1.setInits(5, init_developer2[5]);

        } else {

        }
    }//GEN-LAST:event_AgregarIntegradorBTNSEActionPerformed

    private void RestarDLCBTNSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarDLCBTNSEActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer2[0] + init_developer2[1] + init_developer2[2] + init_developer2[3] + init_developer2[4] + init_developer2[5];
        if (init_developer2[4] > 1 && totalsuma <= Nwork2) {
            init_developer2[4]--;
            EntradaDLCSE.setText(String.valueOf(init_developer2[4]));
            C1.setInits(4, init_developer2[4]);

        } else {

        }
    }//GEN-LAST:event_RestarDLCBTNSEActionPerformed

    private void AgregarDLCBTNSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarDLCBTNSEActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer2[0] + init_developer2[1] + init_developer2[2] + init_developer2[3] + init_developer2[4] + init_developer2[5];
        if (init_developer2[4] >= 1 && totalsuma < Nwork2) {
            init_developer2[4]++;
            EntradaDLCSE.setText(String.valueOf(init_developer2[4]));
            C1.setInits(4, init_developer2[4]);

        } else {

        }
    }//GEN-LAST:event_AgregarDLCBTNSEActionPerformed

    private void RestarLogicaBTNSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarLogicaBTNSEActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer2[0] + init_developer2[1] + init_developer2[2] + init_developer2[3] + init_developer2[4] + init_developer2[5];
        if (init_developer2[3] > 1 && totalsuma <= Nwork2) {
            init_developer2[3]--;
            EntradaLogicaSE.setText(String.valueOf(init_developer2[3]));
            C1.setInits(3, init_developer2[3]);

        } else {

        }
    }//GEN-LAST:event_RestarLogicaBTNSEActionPerformed

    private void AgregarLogicaBTNSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarLogicaBTNSEActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer2[0] + init_developer2[1] + init_developer2[2] + init_developer2[3] + init_developer2[4] + init_developer2[5];
        if (init_developer2[3] >= 1 && totalsuma < Nwork2) {
            init_developer2[3]++;
            EntradaLogicaSE.setText(String.valueOf(init_developer2[3]));
            C1.setInits(3, init_developer2[3]);

        } else {

        }
    }//GEN-LAST:event_AgregarLogicaBTNSEActionPerformed

    private void RestarSpriteBTNSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarSpriteBTNSEActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer2[0] + init_developer2[1] + init_developer2[2] + init_developer2[3] + init_developer2[4] + init_developer2[5];
        if (init_developer2[2] > 1 && totalsuma <= Nwork2) {
            init_developer2[2]--;
            EntradaSpritesSE.setText(String.valueOf(init_developer2[2]));
            C1.setInits(2, init_developer2[2]);

        } else {

        }
    }//GEN-LAST:event_RestarSpriteBTNSEActionPerformed

    private void AgregarSpriteBTNSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarSpriteBTNSEActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer2[0] + init_developer2[1] + init_developer2[2] + init_developer2[3] + init_developer2[4] + init_developer2[5];
        if (init_developer2[2] >= 1 && totalsuma < Nwork2) {
            init_developer2[2]++;
            EntradaSpritesSE.setText(String.valueOf(init_developer2[2]));
            C1.setInits(2, init_developer2[2]);
        } else {

        }
    }//GEN-LAST:event_AgregarSpriteBTNSEActionPerformed

    private void RestarNivelesBTNSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarNivelesBTNSEActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer2[0] + init_developer2[1] + init_developer2[2] + init_developer2[3] + init_developer2[4] + init_developer2[5];
        if (init_developer2[1] > 1 && totalsuma <= Nwork2) {
            init_developer2[1]--;
            EntradaNivelesSE.setText(String.valueOf(init_developer2[1]));
            C1.setInits(1, init_developer2[1]);

        } else {

        }
    }//GEN-LAST:event_RestarNivelesBTNSEActionPerformed

    private void AgregarNivelesBTNSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarNivelesBTNSEActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer2[0] + init_developer2[1] + init_developer2[2] + init_developer2[3] + init_developer2[4] + init_developer2[5];
        if (init_developer2[1] >= 1 && totalsuma < Nwork2) {
            init_developer2[1]++;
            EntradaNivelesSE.setText(String.valueOf(init_developer2[1]));
            C1.setInits(1, init_developer2[1]);

        } else {

        }
    }//GEN-LAST:event_AgregarNivelesBTNSEActionPerformed

    private void QuitarNarrativaBTNSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarNarrativaBTNSEActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer2[0] + init_developer2[1] + init_developer2[2] + init_developer2[3] + init_developer2[4] + init_developer2[5];
        if (init_developer2[0] > 1 && totalsuma <= Nwork2) {
            init_developer2[0]--;
            EntradaNarrativaSE.setText(String.valueOf(init_developer2[0]));
            C1.setInits(0, init_developer2[0]);

        } else {

        }
    }//GEN-LAST:event_QuitarNarrativaBTNSEActionPerformed

    private void agregarNarrativaBTNSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarNarrativaBTNSEActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer2[0] + init_developer2[1] + init_developer2[2] + init_developer2[3] + init_developer2[4] + init_developer2[5];
        if (init_developer2[0] >= 1 && totalsuma < Nwork2) {
            init_developer2[0]++;
            EntradaNarrativaSE.setText(String.valueOf(init_developer2[0]));
            C1.setInits(0, init_developer2[0]);

        } else {

        }
    }//GEN-LAST:event_agregarNarrativaBTNSEActionPerformed

    private void RestarIntegradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarIntegradorActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer1[0] + init_developer1[1] + init_developer1[2] + init_developer1[3] + init_developer1[4] + init_developer1[5];
        if (totalsuma <= Nwork1 && init_developer1[5] > 1) {
            init_developer1[5]--;
            EntradaIntegrador.setText(String.valueOf(init_developer1[5]));
            C0.setInits(5, init_developer1[5]);

        } else {

        }
    }//GEN-LAST:event_RestarIntegradorActionPerformed

    private void EntradaSpritesSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaSpritesSEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaSpritesSEActionPerformed

    private void RestarSpriteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarSpriteBTNActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer1[0] + init_developer1[1] + init_developer1[2] + init_developer1[3] + init_developer1[4] + init_developer1[5];
        if (totalsuma <= Nwork1 && init_developer1[2] > 1) {
            init_developer1[2]--;
            EntradaSprites.setText(String.valueOf(init_developer1[2]));
            C0.setInits(2, init_developer1[2]);
        } else {

        }
    }//GEN-LAST:event_RestarSpriteBTNActionPerformed

    private void AgregarSpriteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarSpriteBTNActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer1[0] + init_developer1[1] + init_developer1[2] + init_developer1[3] + init_developer1[4] + init_developer1[5];
        if (totalsuma < Nwork1 && init_developer1[2] >= 1) {
            init_developer1[2]++;
            EntradaSprites.setText(String.valueOf(init_developer1[2]));
            C0.setInits(2, init_developer1[2]);
        } else {

        }
    }//GEN-LAST:event_AgregarSpriteBTNActionPerformed

    private void EntradaSpritesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaSpritesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaSpritesActionPerformed

    private void EntradaIntegradorSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaIntegradorSEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaIntegradorSEActionPerformed

    private void EntradaDLCSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaDLCSEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaDLCSEActionPerformed

    private void EntradaLogicaSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaLogicaSEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaLogicaSEActionPerformed

    private void EntradaNivelesSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNivelesSEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNivelesSEActionPerformed

    private void EntradaNarrativaSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNarrativaSEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNarrativaSEActionPerformed

    private void CargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarDatosActionPerformed
        // TODO add your handling code here:
        Escritura();
        System.out.println(dd1 + "-" + dl);
        System.out.println(init_developer1[0] + "-" + init_developer1[1] + "-" + init_developer1[2] + "-" + init_developer1[3] + "-" + init_developer1[4] + "-" + init_developer1[5]);
        System.out.println(init_developer2[0] + "-" + init_developer2[1] + "-" + init_developer2[2] + "-" + init_developer2[3] + "-" + init_developer2[4] + "-" + init_developer2[5]);
        System.out.println(dd1 + "-" + dl);
        System.out.println(init_developer1[0] + "-" + init_developer1[1] + "-" + init_developer1[2] + "-" + init_developer1[3] + "-" + init_developer1[4] + "-" + init_developer1[5]);
        System.out.println(init_developer2[0] + "-" + init_developer2[1] + "-" + init_developer2[2] + "-" + init_developer2[3] + "-" + init_developer2[4] + "-" + init_developer2[5]);
        //        int[] cutom1 = {contadorNarrativa, contadorNiveles, contadorSprites, contadorLogica, contadorDLC, contadorIntegrador};
        //        int[] cutom2 = {contadorNarrativaSE, contadorNivelesSE, contadorSpritesSE, contadorLogicaSE, contadorDLCSE, contadorIntegradorSE};
        //        CargarTXT(cutom1, "CapcomCompany.txt");
        //        CargarTXT(cutom2, "SquareEnixCompany.txt");
    }//GEN-LAST:event_CargarDatosActionPerformed

    private void RestarDLCBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarDLCBTNActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer1[0] + init_developer1[1] + init_developer1[2] + init_developer1[3] + init_developer1[4] + init_developer1[5];
        if (totalsuma <= Nwork1 && init_developer1[4] > 1) {
            init_developer1[4]--;
            EntradaDLC.setText(String.valueOf(init_developer1[4]));
            C0.setInits(4, init_developer1[4]);

        } else {

        }
    }//GEN-LAST:event_RestarDLCBTNActionPerformed

    private void RestarLogicaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarLogicaBTNActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer1[0] + init_developer1[1] + init_developer1[2] + init_developer1[3] + init_developer1[4] + init_developer1[5];
        if (totalsuma <= Nwork1 && init_developer1[3] > 1) {
            init_developer1[3]--;
            EntradaLogica.setText(String.valueOf(init_developer1[3]));
            C0.setInits(3, init_developer1[3]);

        } else {

        }
    }//GEN-LAST:event_RestarLogicaBTNActionPerformed

    private void RestarNivelesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarNivelesBTNActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer1[0] + init_developer1[1] + init_developer1[2] + init_developer1[3] + init_developer1[4] + init_developer1[5];
        if (totalsuma <= Nwork1 && init_developer1[1] > 1) {
            init_developer1[1]--;
            EntradaNiveles.setText(String.valueOf(init_developer1[1]));
            C0.setInits(1, init_developer1[1]);
        } else {

        }
    }//GEN-LAST:event_RestarNivelesBTNActionPerformed

    private void AgregarDLCBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarDLCBTNActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer1[0] + init_developer1[1] + init_developer1[2] + init_developer1[3] + init_developer1[4] + init_developer1[5];
        if (totalsuma < Nwork1 && init_developer1[4] >= 1) {
            init_developer1[4]++;
            EntradaDLC.setText(String.valueOf(init_developer1[4]));
            C0.setInits(4, init_developer1[4]);
        }
    }//GEN-LAST:event_AgregarDLCBTNActionPerformed

    private void AgregarIntegradorBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarIntegradorBTNActionPerformed
        // TODO add your handling code here:
        int totalsuma = init_developer1[0] + init_developer1[1] + init_developer1[2] + init_developer1[3] + init_developer1[4] + init_developer1[5];
        if (totalsuma < Nwork1 && init_developer1[5] >= 1) {
            init_developer1[5]++;
            EntradaIntegrador.setText(String.valueOf(init_developer1[5]));
            C0.setInits(5, init_developer1[5]);
        }
    }//GEN-LAST:event_AgregarIntegradorBTNActionPerformed

    private void AgregarLogicaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarLogicaBTNActionPerformed
        // TODO add your handling code here:

        int totalsuma = init_developer1[0] + init_developer1[1] + init_developer1[2] + init_developer1[3] + init_developer1[4] + init_developer1[5];
        if (totalsuma < Nwork1 && init_developer1[3] >= 1) {
            init_developer1[3]++;
            EntradaLogica.setText(String.valueOf(init_developer1[3]));
            C0.setInits(3, init_developer1[3]);
        }
    }//GEN-LAST:event_AgregarLogicaBTNActionPerformed

    private void AgregarNivelesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarNivelesBTNActionPerformed
        // TODO add your handling code here:

        int totalsuma = init_developer1[0] + init_developer1[1] + init_developer1[2] + init_developer1[3] + init_developer1[4] + init_developer1[5];
        if (totalsuma < Nwork1 && init_developer1[1] >= 1) {
            init_developer1[1]++;
            EntradaNiveles.setText(String.valueOf(init_developer1[1]));
            C0.setInits(1, init_developer1[1]);
        }
    }//GEN-LAST:event_AgregarNivelesBTNActionPerformed

    private void QuitarNarrativaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitarNarrativaBTNActionPerformed
        // TODO add your handling code here:
        //contadorNarrativa--;
        int totalsuma = init_developer1[0] + init_developer1[1] + init_developer1[2] + init_developer1[3] + init_developer1[4] + init_developer1[5];
        if (totalsuma <= Nwork1 && init_developer1[0] > 1) {
            init_developer1[0]--;
            EntradaNarrativa.setText(String.valueOf(init_developer1[0]));
            C0.setInits(0, init_developer1[0]);

        } else {

        }
    }//GEN-LAST:event_QuitarNarrativaBTNActionPerformed

    private void agregarNarrativaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarNarrativaBTNActionPerformed
        // TODO add your handling code here:

        int totalsuma = init_developer1[0] + init_developer1[1] + init_developer1[2] + init_developer1[3] + init_developer1[4] + init_developer1[5];
        if (totalsuma < Nwork1 && init_developer1[0] >= 1) {
            init_developer1[0]++;
            EntradaNarrativa.setText(String.valueOf(init_developer1[0]));
            C0.setInits(0, init_developer1[0]);

        } else {

        }
    }//GEN-LAST:event_agregarNarrativaBTNActionPerformed

    private void EntradaIntegradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaIntegradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaIntegradorActionPerformed

    private void EntradaDLCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaDLCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaDLCActionPerformed

    private void EntradaLogicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaLogicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaLogicaActionPerformed

    private void EntradaNivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNivelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNivelesActionPerformed

    private void EntradaNarrativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNarrativaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNarrativaActionPerformed

    private void money_pmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_money_pmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_money_pmActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void LogicoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogicoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogicoTextoActionPerformed

    private void SpriteTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpriteTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpriteTextoActionPerformed
int con=0;
    private void AnadirDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirDiasActionPerformed
        // TODO add your handling code here:
       
        if (con>=0){
            
            con++;
            System.out.println(con);
            Dayduration.setText(Integer.toString(con));
            this.dd1=con
                
                ;}
        
        
    }//GEN-LAST:event_AnadirDiasActionPerformed

    private void RestarDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarDiasActionPerformed
        // TODO add your handling code here:
             if (con>0){
            
            con--;
            System.out.println(con);
            Dayduration.setText(Integer.toString(con));
            this.dd1=con;
                
                
                ;}
    }//GEN-LAST:event_RestarDiasActionPerformed
int dcon=0;
    private void AgregarDeadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarDeadlineActionPerformed
        // TODO add your handling code here:
        if (dcon>=0){
            
            dcon++;
            Deadday.setText(Integer.toString(dcon));
            this.dl=dcon
                
                ;}
                
        
    }//GEN-LAST:event_AgregarDeadlineActionPerformed

    private void RestarDeadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarDeadlineActionPerformed
        // TODO add your handling code here:
        if (dcon>0){
            
            dcon--;
            Deadday.setText(Integer.toString(dcon));
            this.dl=dcon
                
                ;}
    }//GEN-LAST:event_RestarDeadlineActionPerformed

    private void DeaddayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeaddayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeaddayActionPerformed

    private void GananaciasSQEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GananaciasSQEActionPerformed
        // TODO add your handling code here:
        while(this.dd1<30){

        int ganancia =Integer.parseInt(GananaciasSQE.getText());
        XYSeries series= new XYSeries("utilidad vs tiempo");
        series.add(ganancia,this.dd1);
        XYSeriesCollection dataset =new XYSeriesCollection();
        dataset.addSeries(series);
                JFreeChart chart = ChartFactory.createXYLineChart(
                "Utilidad vs Tiempo",
                "Tiempo",
                "Utilidad",
                dataset
        );
        }
        
    }//GEN-LAST:event_GananaciasSQEActionPerformed


    private void PastelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastelButtonActionPerformed
        // TODO add your handling code here:
        
        JFreeChart grafico =null;
        //DefaultCategoryDataset datos = new DefaultCategoryDataset();

       // datos.addValue(ganancia,"Grafico","ganacia");
        //datos.addValue(ganaciaCamcom,"Grafico","ganacia2");
        //*****************Se crea Pie
       DefaultPieDataset datos = new DefaultPieDataset();
       int ganancia =Integer.parseInt(GananaciasSQE.getText());
       int ganaciaCamcom= Integer.parseInt(GananciasTexto.getText());
        datos.setValue("Capcom", ganaciaCamcom);
        datos.setValue("SQ", ganancia);
        grafico = ChartFactory.createPieChart("Grafica para numero de dias:" + DayCorre.getText() ,datos,true,true,false);
        ChartFrame frame = new ChartFrame("Ejemplo",grafico);
        frame.pack();
        frame.setVisible(true);

       

        
        //grafico = ChartFactory.createLineChart("Grafico","Eje x", "Eje y", series ,PlotOrientation.VERTICAL,true,true,false);
         //XYSeries series= new XYSeries("utilidad vs tiempo");        
        //int ganancia =Integer.parseInt(this.GananaciasSQE.getText());
        //int gananciaC =Integer.parseInt(this.GananciasTexto.getText());
        //series.add(1,dd1);
       // series.add(gananciaC,dd1);

        
                
    //XYSeriesCollection dataset =new XYSeriesCollection();
   ///dataset.addSeries(series);

                
  
               //JFreeChart chart = ChartFactory.createXYLineChart(
                //"Utilidad vs Tiempo",
                //"Tiempo",
                //"Utilidad",
                //dataset
        //);

      
        

        

        
    }//GEN-LAST:event_PastelButtonActionPerformed

    private void DayCorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayCorreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DayCorreActionPerformed

    private void LineaGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineaGraficaActionPerformed
        // TODO add your handling code here:
        
        
        //XYSeries series= new XYSeries("utilidad vs tiempo");
        //int ganancia =Integer.parseInt(this.GananaciasSQE.getText());
        //int gananciaC =Integer.parseInt(this.GananciasTexto.getText());
        //int dia= Integer.parseInt(DayCorre.getText());
        //series.add(ganancia,dia);
        //series.add(gananciaC,dia);
        
        //XYSeriesCollection dataset = new XYSeriesCollection();
       // dataset.addSeries(series);
        
       //  JFreeChart chart = ChartFactory.createXYLineChart(
                //"Utilidad vs Tiempo",
                //"Tiempo",
                //"Utilidad",
                //dataset
        //);
        
        //ChartFrame frame = new ChartFrame("Pueba",chart);
        //frame.pack();
       // frame.setVisible(true);
       
       JFreeChart grafico = null;
       DefaultCategoryDataset datos= new  DefaultCategoryDataset();
       int dato1 = Integer.parseInt(this.GananaciasSQE.getText());
       int dato2 = Integer.parseInt(this.GananciasTexto.getText());
       
       grafico= ChartFactory.createLineChart("Hola", "X", "y", datos, PlotOrientation.VERTICAL, true, true, false);
       
       ChartPanel cPanel = new ChartPanel(grafico);
       JFrame information = new JFrame("Grafica");
       information.getContentPane().add(cPanel);
       information.setVisible(true);
       
        
        
        
        
        
        
    }//GEN-LAST:event_LineaGraficaActionPerformed

    public String Seleccionador_lectura() {
        String texto = "";
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        jfc.setFileFilter(filtro);
        int selec = jfc.showOpenDialog(null);

        if (selec == JFileChooser.APPROVE_OPTION) {
            this.archivo = jfc.getSelectedFile();
            try {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                JOptionPane.showMessageDialog(null, "Carga exitosa.");
                // Lectura del fichero
                String linea;
                while ((linea = br.readLine()) != null) {
                    texto += linea + "\n";
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en la carga de datos.");
            }
        }
        return texto;
    }

    public void Escritura() {
        String info = "";
        info += dd1;
        info += " % ";
        info += dl;
        info += "\n";
        for (int i = 0; i < init_developer1.length; i++) {
            if (i == init_developer1.length - 1) {
                info += init_developer1[i];
                info += "\n";
            } else {
                info += init_developer1[i];
                info += ", ";
            }
        }
        for (int i = 0; i < init_developer2.length; i++) {
            if (i == init_developer2.length - 1) {
                info += init_developer2[i];
                info += "\n";
            } else {
                info += init_developer2[i];
                info += ", ";
            }
        }
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("TEXT FILES", "txt", "text");

        jfc.setFileFilter(filtro);
        int selec = jfc.showOpenDialog(null);
        if (selec == JFileChooser.APPROVE_OPTION) {
            this.archivo = jfc.getSelectedFile();
            try {
                PrintWriter pw = new PrintWriter(archivo);
                pw.print(info);
                pw.close();
                JOptionPane.showMessageDialog(null, "Guardado exitoso.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en el guardado de datos.");
            }
        }
    }

    public void lectura_data() {
        String data = this.Seleccionador_lectura();
        if (!"".equals(data)) {
            String pt1 = "\n";
            String pt2 = " % ";
            String pt3 = ", ";

            String[] datos = data.split(pt1);
            String[] datos1 = datos[0].split(pt2);
            dd1 = Integer.parseInt(datos1[0]);
            dl = Integer.parseInt(datos1[1]);

            String[] iniciales = datos[1].split(pt3);
            init_developer1 = Arrays.stream(iniciales).mapToInt(Integer::parseInt).toArray();
            iniciales = datos[2].split(pt3);
            init_developer2 = Arrays.stream(iniciales).mapToInt(Integer::parseInt).toArray();

            JOptionPane.showMessageDialog(null, "Carga Completada");

        } else {
            JOptionPane.showMessageDialog(null, "El archivo está vacío");
        }

    }

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
            java.util.logging.Logger.getLogger(InterfazCompany.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCompany.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCompany.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCompany.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazCompany().setVisible(true);
                
                
                
            }
        }
        );
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarDLCBTN;
    private javax.swing.JButton AgregarDLCBTNSE;
    private javax.swing.JButton AgregarDeadline;
    private javax.swing.JButton AgregarIntegradorBTN;
    private javax.swing.JButton AgregarIntegradorBTNSE;
    private javax.swing.JButton AgregarLogicaBTN;
    private javax.swing.JButton AgregarLogicaBTNSE;
    private javax.swing.JButton AgregarNivelesBTN;
    private javax.swing.JButton AgregarNivelesBTNSE;
    private javax.swing.JButton AgregarSpriteBTN;
    private javax.swing.JButton AgregarSpriteBTNSE;
    private javax.swing.JButton AnadirDias;
    private javax.swing.JButton CargarDatos;
    private javax.swing.JTextField DE_SQE;
    private javax.swing.JTextField DE_Texto;
    private javax.swing.JLabel DLCLabel;
    private javax.swing.JLabel DLCLabel1;
    private javax.swing.JTextField DLCTexto;
    private javax.swing.JTextField DayCorre;
    private javax.swing.JTextField Dayduration;
    private javax.swing.JTextField Deadday;
    private javax.swing.JTextField DirectorSQE;
    private javax.swing.JTextField DirectorTexto;
    private javax.swing.JTextField EntradaDLC;
    private javax.swing.JTextField EntradaDLCSE;
    private javax.swing.JTextField EntradaIntegrador;
    private javax.swing.JTextField EntradaIntegradorSE;
    private javax.swing.JTextField EntradaLogica;
    private javax.swing.JTextField EntradaLogicaSE;
    private javax.swing.JTextField EntradaNarrativa;
    private javax.swing.JTextField EntradaNarrativaSE;
    private javax.swing.JTextField EntradaNiveles;
    private javax.swing.JTextField EntradaNivelesSE;
    private javax.swing.JTextField EntradaSprites;
    private javax.swing.JTextField EntradaSpritesSE;
    private javax.swing.JTextField GananaciasSQE;
    private javax.swing.JTextField GananciasTexto;
    private javax.swing.JLabel GuionCapcomLabel;
    private javax.swing.JLabel GuionCapcomLabel1;
    private javax.swing.JLabel IntegradorLabel;
    private javax.swing.JLabel IntegradorLabel1;
    private javax.swing.JTextField JuegosDLCTexto;
    private javax.swing.JTextField JuegosDLC_SQE;
    private javax.swing.JTextField JuegosSQE;
    private javax.swing.JTextField JuegosTexto;
    private javax.swing.JLabel LABELE;
    private javax.swing.JLabel LabelDevelop;
    private javax.swing.JLabel LabelDevelop3;
    private javax.swing.JButton LecturaDeDatos;
    private javax.swing.JButton LineaGrafica;
    private javax.swing.JLabel LogicaLabel;
    private javax.swing.JLabel LogicaLabel1;
    private javax.swing.JLabel LogicaLabel2;
    private javax.swing.JLabel LogicaLabel3;
    private javax.swing.JTextField LogicoTexto;
    private javax.swing.JTextField NarrativaTexto;
    private javax.swing.JLabel NivelCapcomLabel;
    private javax.swing.JLabel NivelCapcomLabel1;
    private javax.swing.JLabel NivelLabel;
    private javax.swing.JLabel NivelLabel1;
    private javax.swing.JTextField NivelesTexto;
    private javax.swing.JTextField PMTexto;
    private javax.swing.JTextField PM_SQE;
    private javax.swing.JButton PastelButton;
    private javax.swing.JButton QuitarNarrativaBTN;
    private javax.swing.JButton QuitarNarrativaBTNSE;
    private javax.swing.JButton RestarDLCBTN;
    private javax.swing.JButton RestarDLCBTNSE;
    private javax.swing.JButton RestarDeadline;
    private javax.swing.JButton RestarDias;
    private javax.swing.JButton RestarIntegrador;
    private javax.swing.JButton RestarIntegradorSE;
    private javax.swing.JButton RestarLogicaBTN;
    private javax.swing.JButton RestarLogicaBTNSE;
    private javax.swing.JButton RestarNivelesBTN;
    private javax.swing.JButton RestarNivelesBTNSE;
    private javax.swing.JButton RestarSpriteBTN;
    private javax.swing.JButton RestarSpriteBTNSE;
    private javax.swing.JTextField SQEGuionTexto;
    private javax.swing.JTextField SQELogicaTexto;
    private javax.swing.JTextField SQENivelTexto;
    private javax.swing.JTextField SQESpriteTexto;
    private javax.swing.JTextField SQE_DLCTexto;
    private javax.swing.JTextField SQEcosts;
    private javax.swing.JTextField SQEmoney_pm;
    private javax.swing.JTextField SQEnumber;
    private javax.swing.JTextField SQEstonks;
    private javax.swing.JTextField SpriteTexto;
    private javax.swing.JButton agregarNarrativaBTN;
    private javax.swing.JButton agregarNarrativaBTNSE;
    private javax.swing.JTextField costs;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField money_pm;
    private javax.swing.JLabel narrativaLabel;
    private javax.swing.JLabel narrativaLabel1;
    private javax.swing.JTextField number;
    private javax.swing.JTextField stonks;
    // End of variables declaration//GEN-END:variables

}
