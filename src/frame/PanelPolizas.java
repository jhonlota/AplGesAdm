/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelPolizas.java
 *
 * Created on 16/01/2012, 05:14:48 PM
 */
package frame;

import clases.ClaseGeneral;
import clases.ClaseInformacion;
import entidades.Polizas;
import entidades.PolizasPK;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Jhon Lopez
 */
public class PanelPolizas extends javax.swing.JPanel {

    private List lista = new ArrayList();
    private ClaseInformacion informacion = new ClaseInformacion();

    /**
     * Creates new form PanelPolizas
     */
    public PanelPolizas() {
        initComponents();

        tipopoliza.setEditable(true);
        AutoCompleteDecorator.decorate(tipopoliza);

        fechaexpedicionpoliza.setFormats(new SimpleDateFormat("yyyy-MM-dd"));
        fechaaprobacionpoliza.setFormats(new SimpleDateFormat("yyyy-MM-dd"));
        fechainicialamparo.setFormats(new SimpleDateFormat("yyyy-MM-dd"));
        fechafinalamparo.setFormats(new SimpleDateFormat("yyyy-MM-dd"));

        fechaexpedicionpoliza.setDate(new Date(ClaseInformacion.calendario.getTimeInMillis()));
        fechaaprobacionpoliza.setDate(new Date(ClaseInformacion.calendario.getTimeInMillis()));
        fechainicialamparo.setDate(new Date(ClaseInformacion.calendario.getTimeInMillis()));
        fechafinalamparo.setDate(new Date(ClaseInformacion.calendario.getTimeInMillis()));

        fkcontrato.setText(ClaseGeneral.contratos.getContrato());
        metodoMostrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fkcontrato = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        aseguradora = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        numeropoliza = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        fechaexpedicionpoliza = new org.jdesktop.swingx.JXDatePicker();
        jTextField22 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        resolucionpoliza = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        fechaaprobacionpoliza = new org.jdesktop.swingx.JXDatePicker();
        jTextField24 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tipopoliza = new javax.swing.JComboBox();
        jLabel42 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        valorasegurado = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        fechainicialamparo = new org.jdesktop.swingx.JXDatePicker();
        jLabel43 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        fechafinalamparo = new org.jdesktop.swingx.JXDatePicker();
        jTextField26 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setName("panelPolizas"); // NOI18N
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("NÚMERO DEL CONTRATO : ");
        jLabel1.setPreferredSize(new java.awt.Dimension(160, 25));
        add(jLabel1);

        fkcontrato.setBackground(ClaseGeneral.verde);
        fkcontrato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fkcontrato.setForeground(ClaseGeneral.rojo);
        fkcontrato.setFocusable(false);
        fkcontrato.setMargin(new java.awt.Insets(2, 4, 2, 4));
        fkcontrato.setPreferredSize(new java.awt.Dimension(300, 25));
        add(fkcontrato);

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField15.setEnabled(false);
        jTextField15.setFocusable(false);
        jTextField15.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField15.setOpaque(false);
        jTextField15.setPreferredSize(new java.awt.Dimension(340, 25));
        add(jTextField15);

        jLabel25.setText("ASEGURADORA : ");
        jLabel25.setPreferredSize(new java.awt.Dimension(105, 25));
        add(jLabel25);

        aseguradora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aseguradora.setMargin(new java.awt.Insets(2, 4, 2, 4));
        aseguradora.setPreferredSize(new java.awt.Dimension(380, 25));
        add(aseguradora);

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField18.setEnabled(false);
        jTextField18.setFocusable(false);
        jTextField18.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField18.setOpaque(false);
        jTextField18.setPreferredSize(new java.awt.Dimension(315, 25));
        add(jTextField18);

        jLabel26.setText("NUMERO DE LA PÓLIZA : ");
        jLabel26.setPreferredSize(new java.awt.Dimension(145, 25));
        add(jLabel26);

        numeropoliza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numeropoliza.setMargin(new java.awt.Insets(2, 4, 2, 4));
        numeropoliza.setPreferredSize(new java.awt.Dimension(150, 25));
        add(numeropoliza);

        jLabel67.setPreferredSize(new java.awt.Dimension(20, 25));
        add(jLabel67);

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator14.setPreferredSize(new java.awt.Dimension(20, 25));
        add(jSeparator14);

        jLabel27.setText("FECHA DE EXPEDICIÓN DE LA PÓLIZA : ");
        jLabel27.setPreferredSize(new java.awt.Dimension(230, 25));
        add(jLabel27);

        fechaexpedicionpoliza.setFocusable(false);
        fechaexpedicionpoliza.setMaximumSize(new java.awt.Dimension(120, 25));
        fechaexpedicionpoliza.setMinimumSize(new java.awt.Dimension(120, 25));
        fechaexpedicionpoliza.setPreferredSize(new java.awt.Dimension(120, 25));
        add(fechaexpedicionpoliza);

        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField22.setEnabled(false);
        jTextField22.setFocusable(false);
        jTextField22.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField22.setOpaque(false);
        jTextField22.setPreferredSize(new java.awt.Dimension(95, 25));
        add(jTextField22);

        jLabel28.setText("RESOLUCIÓN DE APROBACIÓN DE LA PÓLIZA : ");
        jLabel28.setPreferredSize(new java.awt.Dimension(270, 25));
        add(jLabel28);

        resolucionpoliza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resolucionpoliza.setText("999999");
        resolucionpoliza.setMargin(new java.awt.Insets(2, 4, 2, 4));
        resolucionpoliza.setPreferredSize(new java.awt.Dimension(150, 25));
        add(resolucionpoliza);

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField23.setEnabled(false);
        jTextField23.setFocusable(false);
        jTextField23.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField23.setOpaque(false);
        jTextField23.setPreferredSize(new java.awt.Dimension(380, 25));
        add(jTextField23);

        jLabel29.setText("FECHA DE APROBACIÓN DE LA PÓLIZA : ");
        jLabel29.setPreferredSize(new java.awt.Dimension(235, 25));
        add(jLabel29);

        fechaaprobacionpoliza.setFocusable(false);
        fechaaprobacionpoliza.setMaximumSize(new java.awt.Dimension(120, 25));
        fechaaprobacionpoliza.setMinimumSize(new java.awt.Dimension(120, 25));
        fechaaprobacionpoliza.setPreferredSize(new java.awt.Dimension(120, 25));
        add(fechaaprobacionpoliza);

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField24.setEnabled(false);
        jTextField24.setFocusable(false);
        jTextField24.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField24.setOpaque(false);
        jTextField24.setPreferredSize(new java.awt.Dimension(445, 25));
        add(jTextField24);

        jLabel30.setText("TIPO DE PÓLIZA : ");
        jLabel30.setPreferredSize(new java.awt.Dimension(105, 25));
        add(jLabel30);

        tipopoliza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipopoliza.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "0: Única", "1: Buen manejo de anticipo", "2: Cumplimiento de contrato", "3: Salarios y prestaciones", "4: Responsabilidad civil Extracontractual", "5: Estabilidad y Calidad", "6: Otra" }));
        tipopoliza.setPreferredSize(new java.awt.Dimension(260, 25));
        add(tipopoliza);

        jLabel42.setPreferredSize(new java.awt.Dimension(20, 25));
        add(jLabel42);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setPreferredSize(new java.awt.Dimension(20, 25));
        add(jSeparator8);

        jLabel31.setText("VALOR ASEGURADO : ");
        jLabel31.setPreferredSize(new java.awt.Dimension(130, 25));
        add(jLabel31);

        valorasegurado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valorasegurado.setText("0");
        valorasegurado.setMargin(new java.awt.Insets(2, 4, 2, 4));
        valorasegurado.setPreferredSize(new java.awt.Dimension(150, 25));
        valorasegurado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldFocusGained(evt);
            }
        });
        valorasegurado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TexyFieldKeyReleased(evt);
            }
        });
        add(valorasegurado);

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField25.setEnabled(false);
        jTextField25.setFocusable(false);
        jTextField25.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField25.setOpaque(false);
        jTextField25.setPreferredSize(new java.awt.Dimension(95, 25));
        add(jTextField25);

        jLabel32.setText("FECHA INICIAL AMPARO : ");
        jLabel32.setPreferredSize(new java.awt.Dimension(155, 25));
        add(jLabel32);

        fechainicialamparo.setFocusable(false);
        fechainicialamparo.setMaximumSize(new java.awt.Dimension(120, 25));
        fechainicialamparo.setMinimumSize(new java.awt.Dimension(120, 25));
        fechainicialamparo.setPreferredSize(new java.awt.Dimension(120, 25));
        add(fechainicialamparo);

        jLabel43.setPreferredSize(new java.awt.Dimension(20, 25));
        add(jLabel43);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setPreferredSize(new java.awt.Dimension(25, 25));
        add(jSeparator9);

        jLabel33.setText("FECHA FINAL AMPARO : ");
        jLabel33.setPreferredSize(new java.awt.Dimension(145, 25));
        add(jLabel33);

        fechafinalamparo.setFocusable(false);
        fechafinalamparo.setMaximumSize(new java.awt.Dimension(120, 25));
        fechafinalamparo.setMinimumSize(new java.awt.Dimension(120, 25));
        fechafinalamparo.setPreferredSize(new java.awt.Dimension(120, 25));
        add(fechafinalamparo);

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField26.setEnabled(false);
        jTextField26.setFocusable(false);
        jTextField26.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField26.setOpaque(false);
        jTextField26.setPreferredSize(new java.awt.Dimension(195, 25));
        add(jTextField26);

        jLabel71.setPreferredSize(new java.awt.Dimension(810, 25));
        add(jLabel71);

        jScrollPane.setPreferredSize(new java.awt.Dimension(810, 325));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ASEGURADORA", "NUMERO DE LA PÓLIZA", "TIPO DE PÓLIZA", "VALOR ASEGURADO"
            }
        ));
        jTable.setEnabled(false);
        jTable.setFocusable(false);
        jTable.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable.setRowHeight(20);
        jTable.setSelectionBackground(ClaseGeneral.campo);
        jScrollPane.setViewportView(jTable);

        add(jScrollPane);
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldFocusGained
        javax.swing.JTextField componente = (javax.swing.JTextField) evt.getComponent();
        componente.selectAll();
        componente.requestFocus();
    }//GEN-LAST:event_TextFieldFocusGained

    private void TexyFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TexyFieldKeyReleased
        try {
            valorasegurado.setText(ClaseInformacion.formatoDecimal.format(Long.parseLong(valorasegurado.getText().trim().replace(".", ""))));
        } catch (Exception ex) {
            Logger.getLogger(PanelPolizas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TexyFieldKeyReleased

    public void metodoInsertar() {
        ClaseGeneral.polizas = new Polizas();
        ClaseGeneral.polizasPK = new PolizasPK();
        ClaseGeneral.polizasPK.setFkcontrato(fkcontrato.getText());
        ClaseGeneral.polizasPK.setNumeropoliza(numeropoliza.getText());
        ClaseGeneral.polizasPK.setTipopoliza("" + tipopoliza.getSelectedItem());
        ClaseGeneral.polizas.setPolizasPK(ClaseGeneral.polizasPK);
        ClaseGeneral.polizas.setAseguradora(aseguradora.getText().toUpperCase());
        ClaseGeneral.polizas.setFechaexpedicionpoliza(fechaexpedicionpoliza.getDate());
        ClaseGeneral.polizas.setResolucionpoliza(resolucionpoliza.getText());
        ClaseGeneral.polizas.setFechaaprobacionpoliza(fechaaprobacionpoliza.getDate());
        ClaseGeneral.polizas.setValorasegurado(BigDecimal.valueOf(Long.parseLong("" + valorasegurado.getText().trim().replace(".", ""))));
        ClaseGeneral.polizas.setFechainicialamparo(fechainicialamparo.getDate());
        ClaseGeneral.polizas.setFechafinalamparo(fechafinalamparo.getDate());

        try {
            ClaseGeneral.controlPolizas.create(ClaseGeneral.polizas);
        } catch (Exception ex) {
            Logger.getLogger(PanelPolizas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void metodoConsultar() {
        try {
            fkcontrato.setText(ClaseGeneral.polizas.getPolizasPK().getFkcontrato());
            aseguradora.setText(ClaseGeneral.polizas.getAseguradora());
            numeropoliza.setText(ClaseGeneral.polizas.getPolizasPK().getNumeropoliza());
            fechaexpedicionpoliza.setDate(ClaseGeneral.polizas.getFechaexpedicionpoliza());
            resolucionpoliza.setText(ClaseGeneral.polizas.getResolucionpoliza());
            fechaaprobacionpoliza.setDate(ClaseGeneral.polizas.getFechaaprobacionpoliza());
            tipopoliza.setSelectedItem(ClaseGeneral.polizas.getPolizasPK().getTipopoliza());
            valorasegurado.setText("" + ClaseInformacion.formatoDecimal.format(ClaseGeneral.polizas.getValorasegurado()));
            fechainicialamparo.setDate(ClaseGeneral.polizas.getFechainicialamparo());
            fechafinalamparo.setDate(ClaseGeneral.polizas.getFechafinalamparo());

            fkcontrato.setFocusable(false);
            numeropoliza.setFocusable(false);
        } catch (Exception ex) {
            Logger.getLogger(PanelResoluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void metodoActualizar() {
        Polizas polizasId = ClaseGeneral.polizas;
        polizasId.setPolizasPK(ClaseGeneral.polizas.getPolizasPK());

        ClaseGeneral.polizas = new Polizas();
        ClaseGeneral.polizasPK = new PolizasPK();
        ClaseGeneral.polizasPK.setFkcontrato(fkcontrato.getText());
        ClaseGeneral.polizasPK.setNumeropoliza(numeropoliza.getText());
        ClaseGeneral.polizasPK.setTipopoliza("" + tipopoliza.getSelectedItem());
        ClaseGeneral.polizas.setPolizasPK(ClaseGeneral.polizasPK);
        ClaseGeneral.polizas.setAseguradora(aseguradora.getText().toUpperCase());
        ClaseGeneral.polizas.setFechaexpedicionpoliza(fechaexpedicionpoliza.getDate());
        ClaseGeneral.polizas.setResolucionpoliza(resolucionpoliza.getText());
        ClaseGeneral.polizas.setFechaaprobacionpoliza(fechaaprobacionpoliza.getDate());
        ClaseGeneral.polizas.setValorasegurado(BigDecimal.valueOf(Long.parseLong("" + valorasegurado.getText().trim().replace(".", ""))));
        ClaseGeneral.polizas.setFechainicialamparo(fechainicialamparo.getDate());
        ClaseGeneral.polizas.setFechafinalamparo(fechafinalamparo.getDate());

        try {
            ClaseGeneral.controlPolizas.edit(ClaseGeneral.polizas, polizasId);
        } catch (Exception ex) {
            Logger.getLogger(PanelPolizas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void metodoEliminar() {
        try {
            ClaseGeneral.polizasPK = new PolizasPK();
            ClaseGeneral.polizasPK.setFkcontrato(fkcontrato.getText());
            ClaseGeneral.polizasPK.setNumeropoliza(numeropoliza.getText());

            ClaseGeneral.controlPolizas.destroy(ClaseGeneral.polizasPK);
        } catch (Exception ex) {
            Logger.getLogger(PanelPolizas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public final void metodoMostrar() {
        ClaseGeneral.polizas = new Polizas();
        lista = ClaseGeneral.controlPolizas.findAllInPolizasByFkcontrato(fkcontrato.getText());

        jTable.getColumnModel().getColumn(3).setCellRenderer(informacion.modeloDerecha);

        for (int i = 0; i < 100; i++) {
            jTable.setValueAt("", i, 0);
            jTable.setValueAt("", i, 1);
            jTable.setValueAt("", i, 2);
            jTable.setValueAt("", i, 3);
        }

        int i = 0;
        for (Object lista1 : lista) {
            ClaseGeneral.polizas = (Polizas) lista1;
            jTable.setValueAt("" + ClaseGeneral.polizas.getAseguradora(), i, 0);
            jTable.setValueAt("" + ClaseGeneral.polizas.getPolizasPK().getNumeropoliza(), i, 1);
            jTable.setValueAt("" + ClaseGeneral.polizas.getPolizasPK().getTipopoliza(), i, 2);
            jTable.setValueAt("" + ClaseInformacion.formatoDecimal.format(ClaseGeneral.polizas.getValorasegurado()), i, 3);
            i++;
        }

        jTable.clearSelection();
        jTable.getColumnModel().getColumn(0).setPreferredWidth(350);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(150);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aseguradora;
    private org.jdesktop.swingx.JXDatePicker fechaaprobacionpoliza;
    private org.jdesktop.swingx.JXDatePicker fechaexpedicionpoliza;
    private org.jdesktop.swingx.JXDatePicker fechafinalamparo;
    private org.jdesktop.swingx.JXDatePicker fechainicialamparo;
    private javax.swing.JTextField fkcontrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel71;
    public javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField numeropoliza;
    private javax.swing.JTextField resolucionpoliza;
    private javax.swing.JComboBox tipopoliza;
    private javax.swing.JTextField valorasegurado;
    // End of variables declaration//GEN-END:variables
}
