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
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

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
        C0.Begin();
        C1.Begin();
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
        LabelDevelop1 = new javax.swing.JLabel();
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

        LabelDevelop.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelDevelop.setText("Desarrolladores SquareEnix");

        narrativaLabel.setText("Narrativa");

        NivelLabel.setText("Niveles");

        LogicaLabel.setText("Logica");

        IntegradorLabel.setText("Integrator");

        DLCLabel.setText("DLC");

        EntradaNarrativa.setEditable(false);
        EntradaNarrativa.setText("1");
        EntradaNarrativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNarrativaActionPerformed(evt);
            }
        });

        EntradaNiveles.setEditable(false);
        EntradaNiveles.setText("1");
        EntradaNiveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNivelesActionPerformed(evt);
            }
        });

        EntradaLogica.setEditable(false);
        EntradaLogica.setText("1");
        EntradaLogica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaLogicaActionPerformed(evt);
            }
        });

        EntradaDLC.setEditable(false);
        EntradaDLC.setText("1");
        EntradaDLC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaDLCActionPerformed(evt);
            }
        });

        EntradaIntegrador.setEditable(false);
        EntradaIntegrador.setText("1");
        EntradaIntegrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaIntegradorActionPerformed(evt);
            }
        });

        agregarNarrativaBTN.setText("+");
        agregarNarrativaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarNarrativaBTNActionPerformed(evt);
            }
        });

        QuitarNarrativaBTN.setText("-");
        QuitarNarrativaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarNarrativaBTNActionPerformed(evt);
            }
        });

        AgregarNivelesBTN.setText("+");
        AgregarNivelesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNivelesBTNActionPerformed(evt);
            }
        });

        AgregarLogicaBTN.setText("+");
        AgregarLogicaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarLogicaBTNActionPerformed(evt);
            }
        });

        AgregarIntegradorBTN.setText("+");
        AgregarIntegradorBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarIntegradorBTNActionPerformed(evt);
            }
        });

        AgregarDLCBTN.setText("+");
        AgregarDLCBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDLCBTNActionPerformed(evt);
            }
        });

        RestarNivelesBTN.setText("-");
        RestarNivelesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarNivelesBTNActionPerformed(evt);
            }
        });

        RestarLogicaBTN.setText("-");
        RestarLogicaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarLogicaBTNActionPerformed(evt);
            }
        });

        RestarDLCBTN.setText("-");
        RestarDLCBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarDLCBTNActionPerformed(evt);
            }
        });

        CargarDatos.setText("Cargar Datos");
        CargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarDatosActionPerformed(evt);
            }
        });

        LabelDevelop1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelDevelop1.setText("Desarrolladores Capcom");

        narrativaLabel1.setText("Narrativa");

        NivelLabel1.setText("Niveles");

        LogicaLabel1.setText("Logica");

        DLCLabel1.setText("DLC");

        IntegradorLabel1.setText("Integrator");

        EntradaNarrativaSE.setEditable(false);
        EntradaNarrativaSE.setText("1");
        EntradaNarrativaSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNarrativaSEActionPerformed(evt);
            }
        });

        EntradaNivelesSE.setEditable(false);
        EntradaNivelesSE.setText("1");
        EntradaNivelesSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNivelesSEActionPerformed(evt);
            }
        });

        EntradaLogicaSE.setEditable(false);
        EntradaLogicaSE.setText("1");
        EntradaLogicaSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaLogicaSEActionPerformed(evt);
            }
        });

        EntradaDLCSE.setEditable(false);
        EntradaDLCSE.setText("1");
        EntradaDLCSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaDLCSEActionPerformed(evt);
            }
        });

        EntradaIntegradorSE.setEditable(false);
        EntradaIntegradorSE.setText("1");
        EntradaIntegradorSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaIntegradorSEActionPerformed(evt);
            }
        });

        LogicaLabel2.setText("Sprites");

        EntradaSprites.setEditable(false);
        EntradaSprites.setText("1");
        EntradaSprites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaSpritesActionPerformed(evt);
            }
        });

        AgregarSpriteBTN.setText("+");
        AgregarSpriteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarSpriteBTNActionPerformed(evt);
            }
        });

        RestarSpriteBTN.setText("-");
        RestarSpriteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarSpriteBTNActionPerformed(evt);
            }
        });

        LogicaLabel3.setText("Sprites");

        EntradaSpritesSE.setEditable(false);
        EntradaSpritesSE.setText("1");
        EntradaSpritesSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaSpritesSEActionPerformed(evt);
            }
        });

        RestarIntegrador.setText("-");
        RestarIntegrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarIntegradorActionPerformed(evt);
            }
        });

        agregarNarrativaBTNSE.setText("+");
        agregarNarrativaBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarNarrativaBTNSEActionPerformed(evt);
            }
        });

        QuitarNarrativaBTNSE.setText("-");
        QuitarNarrativaBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitarNarrativaBTNSEActionPerformed(evt);
            }
        });

        AgregarNivelesBTNSE.setText("+");
        AgregarNivelesBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNivelesBTNSEActionPerformed(evt);
            }
        });

        RestarNivelesBTNSE.setText("-");
        RestarNivelesBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarNivelesBTNSEActionPerformed(evt);
            }
        });

        AgregarSpriteBTNSE.setText("+");
        AgregarSpriteBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarSpriteBTNSEActionPerformed(evt);
            }
        });

        RestarSpriteBTNSE.setText("-");
        RestarSpriteBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarSpriteBTNSEActionPerformed(evt);
            }
        });

        AgregarLogicaBTNSE.setText("+");
        AgregarLogicaBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarLogicaBTNSEActionPerformed(evt);
            }
        });

        RestarLogicaBTNSE.setText("-");
        RestarLogicaBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarLogicaBTNSEActionPerformed(evt);
            }
        });

        AgregarDLCBTNSE.setText("+");
        AgregarDLCBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarDLCBTNSEActionPerformed(evt);
            }
        });

        RestarDLCBTNSE.setText("-");
        RestarDLCBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarDLCBTNSEActionPerformed(evt);
            }
        });

        AgregarIntegradorBTNSE.setText("+");
        AgregarIntegradorBTNSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarIntegradorBTNSEActionPerformed(evt);
            }
        });

        RestarIntegradorSE.setText("-");
        RestarIntegradorSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarIntegradorSEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(NivelLabel)
                                            .addGap(28, 28, 28)
                                            .addComponent(EntradaNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(AgregarNivelesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(RestarNivelesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(LogicaLabel2)
                                            .addGap(13, 13, 13)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(136, 136, 136)
                                                    .addComponent(AgregarSpriteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(RestarSpriteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(EntradaSprites, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(LogicaLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(EntradaLogica, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(37, 37, 37)
                                            .addComponent(AgregarLogicaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(RestarLogicaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(IntegradorLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(EntradaIntegrador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(AgregarIntegradorBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(RestarIntegrador, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(narrativaLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(EntradaNarrativa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(agregarNarrativaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(QuitarNarrativaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addComponent(LABELE, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(LabelDevelop1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(799, 799, 799)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(narrativaLabel1)
                                    .addGap(25, 25, 25)
                                    .addComponent(EntradaNarrativaSE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(agregarNarrativaBTNSE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(QuitarNarrativaBTNSE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(NivelLabel1)
                                    .addGap(37, 37, 37)
                                    .addComponent(EntradaNivelesSE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(AgregarNivelesBTNSE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(RestarNivelesBTNSE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(LogicaLabel3)
                                    .addGap(46, 46, 46)
                                    .addComponent(EntradaSpritesSE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(AgregarSpriteBTNSE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(RestarSpriteBTNSE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(LogicaLabel1)
                                    .addGap(44, 44, 44)
                                    .addComponent(EntradaLogicaSE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(AgregarLogicaBTNSE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(RestarLogicaBTNSE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(267, 267, 267)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(DLCLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(EntradaDLC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(AgregarDLCBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(RestarDLCBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(326, 326, 326)
                                    .addComponent(DLCLabel1)
                                    .addGap(51, 51, 51)
                                    .addComponent(EntradaDLCSE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(AgregarDLCBTNSE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(RestarDLCBTNSE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(CargarDatos)
                                    .addGap(78, 78, 78)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(IntegradorLabel1)
                                            .addGap(38, 38, 38)
                                            .addComponent(EntradaIntegradorSE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(AgregarIntegradorBTNSE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(RestarIntegradorSE, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(792, 792, 792)
                        .addComponent(LabelDevelop, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDevelop1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDevelop, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(narrativaLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EntradaNarrativaSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(agregarNarrativaBTNSE)
                        .addComponent(QuitarNarrativaBTNSE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EntradaNarrativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(narrativaLabel)
                        .addComponent(agregarNarrativaBTN)
                        .addComponent(QuitarNarrativaBTN)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NivelLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EntradaNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AgregarNivelesBTN)
                        .addComponent(RestarNivelesBTN))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NivelLabel1)
                        .addComponent(EntradaNivelesSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AgregarNivelesBTNSE)
                        .addComponent(RestarNivelesBTNSE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(LogicaLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EntradaSprites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AgregarSpriteBTN)
                                .addComponent(RestarSpriteBTN)))
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LogicaLabel)
                            .addComponent(EntradaLogica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AgregarLogicaBTN)
                            .addComponent(RestarLogicaBTN))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DLCLabel1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EntradaDLCSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AgregarDLCBTNSE)
                                        .addComponent(RestarDLCBTNSE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EntradaDLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgregarDLCBTN)
                                    .addComponent(RestarDLCBTN)
                                    .addComponent(DLCLabel))
                                .addGap(28, 28, 28)
                                .addComponent(LABELE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(IntegradorLabel1)
                                            .addComponent(EntradaIntegradorSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AgregarIntegradorBTNSE)
                                            .addComponent(RestarIntegradorSE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(IntegradorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EntradaIntegrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AgregarIntegradorBTN)
                                            .addComponent(RestarIntegrador)
                                            .addComponent(CargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogicaLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EntradaSpritesSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AgregarSpriteBTNSE)
                                .addComponent(RestarSpriteBTNSE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogicaLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EntradaLogicaSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AgregarLogicaBTNSE)
                                .addComponent(RestarLogicaBTNSE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane3.addTab("Configuraciones iniciales", jPanel1);

        GuionCapcomLabel1.setText("Guiones producidos:");

        jLabel5.setText("Sistemas Logicos Producidos:");

        jLabel12.setText("DLC Producidos:");

        jLabel13.setText("Juegos Con DLC Producidos");

        NivelCapcomLabel1.setText("Niveles producidos:");

        jLabel14.setText("Sprites Producidos:");

        jLabel15.setText("Juegos Producidos");

        SQEGuionTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SQEGuionTexto.setText("jTextField4");
        SQEGuionTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQEGuionTextoActionPerformed(evt);
            }
        });

        JuegosSQE.setText("jTextField4");

        JuegosDLC_SQE.setText("jTextField4");

        SQENivelTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SQENivelTexto.setText("jTextField4");

        SQESpriteTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SQESpriteTexto.setText("jTextField4");

        SQE_DLCTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SQE_DLCTexto.setText("jTextField4");

        SQELogicaTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SQELogicaTexto.setText("jTextField4");

        jLabel16.setText("Dias Para La Entrega:");

        DE_SQE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DE_SQE.setText("jTextField4");

        jLabel17.setText("Proyect Manager Estado:");

        PM_SQE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PM_SQE.setText("jTextField5");

        jLabel18.setText("Director Estado:");

        DirectorSQE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DirectorSQE.setText("jTextField6");

        jLabel19.setText("Utilidad Total:");

        GananaciasSQE.setText("jTextField7");

        jLabel1.setText("Cantidad de faltas y dinero descontado:");

        SQEnumber.setText("jTextField2");

        jLabel20.setText("Ganancias en bruto:");

        jLabel21.setText("Costos operativos:");

        SQEstonks.setText("jTextField5");

        SQEcosts.setText("jTextField6");

        SQEmoney_pm.setText("jTextField7");
        SQEmoney_pm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQEmoney_pmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(SQE_DLCTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(JuegosDLC_SQE, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(142, 142, 142)
                                .addComponent(jLabel19))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(JuegosSQE, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(GananaciasSQE, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(GuionCapcomLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(SQEGuionTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(SQESpriteTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(SQELogicaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(NivelCapcomLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(SQENivelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(PM_SQE, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(35, 35, 35)
                                        .addComponent(DirectorSQE, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(SQEstonks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SQEnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(SQEcosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SQEmoney_pm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(DE_SQE, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(47, 47, 47))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GuionCapcomLabel1)
                            .addComponent(SQEGuionTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DE_SQE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PM_SQE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NivelCapcomLabel1)
                            .addComponent(SQENivelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(SQESpriteTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(SQEnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SQEmoney_pm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(DirectorSQE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SQELogicaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(SQEstonks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(SQE_DLCTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(SQEcosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JuegosDLC_SQE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JuegosSQE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GananaciasSQE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1367, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(272, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(272, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(125, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(109, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("SQUARE ENIX", jPanel7);

        GuionCapcomLabel.setText("Guiones producidos:");

        jLabel2.setText("Sistemas Logicos Producidos:");

        jLabel3.setText("DLC Producidos:");

        jLabel4.setText("Juegos Con DLC Producidos");

        NivelCapcomLabel.setText("Niveles producidos:");

        jLabel6.setText("Sprites Producidos:");

        jLabel7.setText("Juegos Producidos");

        NarrativaTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NarrativaTexto.setText("jTextField4");

        JuegosTexto.setText("jTextField4");

        JuegosDLCTexto.setText("jTextField4");

        NivelesTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NivelesTexto.setText("jTextField4");

        SpriteTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SpriteTexto.setText("jTextField4");

        DLCTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DLCTexto.setText("jTextField4");

        LogicoTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LogicoTexto.setText("jTextField4");
        LogicoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogicoTextoActionPerformed(evt);
            }
        });

        jLabel8.setText("Dias Para La Entrega");

        DE_Texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DE_Texto.setText("jTextField4");

        jLabel9.setText("Proyect Manager Estado:");

        PMTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PMTexto.setText("jTextField5");

        jLabel10.setText("Director Estado:");

        DirectorTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DirectorTexto.setText("jTextField6");

        jLabel11.setText("GANANCIAS:");

        GananciasTexto.setText("jTextField7");

        jLabel22.setText("Cantidad de faltas y dinero descontado:");

        number.setText("jTextField2");
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });

        money_pm.setText("jTextField7");
        money_pm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                money_pmActionPerformed(evt);
            }
        });

        stonks.setText("jTextField5");

        jLabel23.setText("Ganancias en bruto:");

        jLabel24.setText("Costos operativos:");

        costs.setText("jTextField6");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(JuegosDLCTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(208, 208, 208)
                                .addComponent(jLabel11))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(JuegosTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(GananciasTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(GuionCapcomLabel)
                                .addGap(18, 18, 18)
                                .addComponent(NarrativaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(SpriteTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(LogicoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(NivelCapcomLabel)
                                .addGap(18, 18, 18)
                                .addComponent(NivelesTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(DLCTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(money_pm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DE_Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(PMTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(DirectorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(stonks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(costs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(529, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuionCapcomLabel)
                    .addComponent(NarrativaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DE_Texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(PMTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NivelCapcomLabel)
                            .addComponent(NivelesTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(SpriteTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(money_pm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(DirectorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LogicoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(DLCTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(stonks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(costs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JuegosDLCTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JuegosTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GananciasTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("CAPCOM", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
        lectura_data();
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

    private void SQEGuionTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SQEGuionTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SQEGuionTextoActionPerformed

    private void LogicoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogicoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogicoTextoActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void money_pmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_money_pmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_money_pmActionPerformed

    private void SQEmoney_pmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SQEmoney_pmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SQEmoney_pmActionPerformed

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
    private javax.swing.JButton AgregarIntegradorBTN;
    private javax.swing.JButton AgregarIntegradorBTNSE;
    private javax.swing.JButton AgregarLogicaBTN;
    private javax.swing.JButton AgregarLogicaBTNSE;
    private javax.swing.JButton AgregarNivelesBTN;
    private javax.swing.JButton AgregarNivelesBTNSE;
    private javax.swing.JButton AgregarSpriteBTN;
    private javax.swing.JButton AgregarSpriteBTNSE;
    private javax.swing.JButton CargarDatos;
    private javax.swing.JTextField DE_SQE;
    private javax.swing.JTextField DE_Texto;
    private javax.swing.JLabel DLCLabel;
    private javax.swing.JLabel DLCLabel1;
    private javax.swing.JTextField DLCTexto;
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
    private javax.swing.JLabel LabelDevelop1;
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
    private javax.swing.JButton QuitarNarrativaBTN;
    private javax.swing.JButton QuitarNarrativaBTNSE;
    private javax.swing.JButton RestarDLCBTN;
    private javax.swing.JButton RestarDLCBTNSE;
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
