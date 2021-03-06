/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelSoportescuentasContratos.java
 *
 * Created on 16/01/2012, 05:14:48 PM
 */
package frame;

import clases.ClaseGeneral;
import clases.ClaseInformacion;
import entidades.Soportescuentas;
import entidades.SoportescuentasPK;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Jhon Lopez
 */
public class PanelSoportescuentas extends javax.swing.JPanel {

    private List lista = new ArrayList();
    private ClaseInformacion informacion = new ClaseInformacion();

    /**
     * Creates new form PanelSoportescuentasContratos
     */
    public PanelSoportescuentas() {
        initComponents();

        subgrupo.setEditable(true);
        cinfo.setEditable(true);
        cuentainterna.setEditable(true);

        AutoCompleteDecorator.decorate(subgrupo);
        AutoCompleteDecorator.decorate(cinfo);
        AutoCompleteDecorator.decorate(cuentainterna);

        fkcuenta.setText("" + ClaseGeneral.cuentas.getSoporte());
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

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fkcuenta = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jTextField15 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cuenta = new javax.swing.JTextField();
        actividad = new javax.swing.JTextField();
        subgrupo = new javax.swing.JComboBox();
        cingreso = new javax.swing.JTextField();
        ccostos = new javax.swing.JTextField();
        cinfo = new javax.swing.JComboBox();
        cuentainterna = new javax.swing.JComboBox();
        valor = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        valorTotal = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("C. COSTOS");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel7.setPreferredSize(new java.awt.Dimension(90, 25));

        setName("panelSoportescuentas"); // NOI18N
        setPreferredSize(new java.awt.Dimension(85, 25));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("DOCUMENTO DE LA CUENTA : ");
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 25));
        add(jLabel1);

        fkcuenta.setBackground(ClaseGeneral.verde);
        fkcuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fkcuenta.setForeground(ClaseGeneral.rojo);
        fkcuenta.setFocusable(false);
        fkcuenta.setMargin(new java.awt.Insets(2, 4, 2, 4));
        fkcuenta.setPreferredSize(new java.awt.Dimension(150, 25));
        add(fkcuenta);

        jLabel73.setPreferredSize(new java.awt.Dimension(20, 25));
        add(jLabel73);

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator16.setPreferredSize(new java.awt.Dimension(20, 25));
        add(jSeparator16);

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField15.setEnabled(false);
        jTextField15.setFocusable(false);
        jTextField15.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField15.setOpaque(false);
        jTextField15.setPreferredSize(new java.awt.Dimension(420, 25));
        add(jTextField15);

        jLabel72.setPreferredSize(new java.awt.Dimension(810, 25));
        add(jLabel72);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 70));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CUENTA");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setPreferredSize(new java.awt.Dimension(85, 25));
        jPanel1.add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ACTIVIDAD");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setPreferredSize(new java.awt.Dimension(85, 25));
        jPanel1.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SUBGRUPO");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel5.setPreferredSize(new java.awt.Dimension(85, 25));
        jPanel1.add(jLabel5);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("C. INGRESO");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel11.setPreferredSize(new java.awt.Dimension(85, 25));
        jPanel1.add(jLabel11);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("C. COSTOS");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setPreferredSize(new java.awt.Dimension(85, 25));
        jPanel1.add(jLabel6);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("C. INFO");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel8.setPreferredSize(new java.awt.Dimension(85, 25));
        jPanel1.add(jLabel8);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CUENTA INTERNA");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel10.setPreferredSize(new java.awt.Dimension(110, 25));
        jPanel1.add(jLabel10);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VALOR");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel9.setPreferredSize(new java.awt.Dimension(140, 25));
        jPanel1.add(jLabel9);

        cuenta.setBackground(ClaseGeneral.campo);
        cuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuenta.setText("0");
        cuenta.setMargin(new java.awt.Insets(2, 4, 2, 4));
        cuenta.setPreferredSize(new java.awt.Dimension(85, 25));
        cuenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldFocusGained(evt);
            }
        });
        jPanel1.add(cuenta);

        actividad.setBackground(ClaseGeneral.campo);
        actividad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        actividad.setText("0");
        actividad.setMargin(new java.awt.Insets(2, 4, 2, 4));
        actividad.setPreferredSize(new java.awt.Dimension(85, 25));
        actividad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldFocusGained(evt);
            }
        });
        jPanel1.add(actividad);

        subgrupo.setBackground(ClaseGeneral.campo);
        subgrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subgrupo.setModel(ClaseGeneral.controlSubgrupo.COMBOCodigoInSubgrupoBy());
        subgrupo.setSelectedItem("0");
        subgrupo.setOpaque(false);
        subgrupo.setPreferredSize(new java.awt.Dimension(85, 25));
        jPanel1.add(subgrupo);

        cingreso.setBackground(ClaseGeneral.campo);
        cingreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cingreso.setText("0");
        cingreso.setMargin(new java.awt.Insets(2, 4, 2, 4));
        cingreso.setPreferredSize(new java.awt.Dimension(85, 25));
        cingreso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldFocusGained(evt);
            }
        });
        jPanel1.add(cingreso);

        ccostos.setBackground(ClaseGeneral.campo);
        ccostos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ccostos.setText("0");
        ccostos.setMargin(new java.awt.Insets(2, 4, 2, 4));
        ccostos.setPreferredSize(new java.awt.Dimension(85, 25));
        ccostos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldFocusGained(evt);
            }
        });
        jPanel1.add(ccostos);

        cinfo.setBackground(ClaseGeneral.campo);
        cinfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cinfo.setModel(ClaseGeneral.controlCinfo.COMBOCodigoInCinfoBy());
        cinfo.setSelectedItem("0");
        cinfo.setPreferredSize(new java.awt.Dimension(85, 25));
        jPanel1.add(cinfo);

        cuentainterna.setBackground(ClaseGeneral.campo);
        cuentainterna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuentainterna.setModel(ClaseGeneral.controlCuentainterna.COMBOCodigoInCuentainternaBy());
        cuentainterna.setSelectedItem("0");
        cuentainterna.setPreferredSize(new java.awt.Dimension(110, 25));
        jPanel1.add(cuentainterna);

        valor.setBackground(ClaseGeneral.campo);
        valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valor.setText("0");
        valor.setMargin(new java.awt.Insets(2, 4, 2, 4));
        valor.setPreferredSize(new java.awt.Dimension(140, 25));
        valor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldFocusGained(evt);
            }
        });
        valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextFieldKeyReleased(evt);
            }
        });
        jPanel1.add(valor);

        add(jPanel1);

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField16.setEnabled(false);
        jTextField16.setFocusable(false);
        jTextField16.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField16.setOpaque(false);
        jTextField16.setPreferredSize(new java.awt.Dimension(655, 25));
        add(jTextField16);

        valorTotal.setBackground(ClaseGeneral.verde);
        valorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valorTotal.setForeground(new java.awt.Color(255, 0, 0));
        valorTotal.setText("0");
        valorTotal.setFocusable(false);
        valorTotal.setMargin(new java.awt.Insets(2, 4, 2, 4));
        valorTotal.setPreferredSize(new java.awt.Dimension(150, 25));
        add(valorTotal);

        jLabel71.setPreferredSize(new java.awt.Dimension(810, 25));
        add(jLabel71);

        jScrollPane.setPreferredSize(new java.awt.Dimension(810, 370));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CUENTA", "ACTIVIDAD", "SUBGRUPO", "C. INGRESO", "C. COSTOS", "C. INFO", "CUENTA INTERNA", "VALOR"
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

    private void TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldKeyReleased
        try {
            valor.setText(ClaseInformacion.formatoDecimal.format(Long.parseLong(valor.getText().trim().replace(".", ""))));
        } catch (Exception ex) {
            Logger.getLogger(PanelPolizas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TextFieldKeyReleased

    public void metodoInsertar() {
        ClaseGeneral.soportescuentas = new Soportescuentas();
        ClaseGeneral.soportescuentasPK = new SoportescuentasPK();
        ClaseGeneral.soportescuentasPK.setFkcuenta(fkcuenta.getText());
        ClaseGeneral.soportescuentasPK.setId(0);
        ClaseGeneral.soportescuentas.setSoportescuentasPK(ClaseGeneral.soportescuentasPK);
        ClaseGeneral.soportescuentas.setCuenta(cuenta.getText());
        ClaseGeneral.soportescuentas.setActividad(actividad.getText());
        ClaseGeneral.soportescuentas.setSubgrupo("" + subgrupo.getSelectedItem());
        ClaseGeneral.soportescuentas.setCingreso(cingreso.getText());
        ClaseGeneral.soportescuentas.setCcostos(ccostos.getText());
        ClaseGeneral.soportescuentas.setCinfo("" + cinfo.getSelectedItem());
        ClaseGeneral.soportescuentas.setCuentainterna("" + cuentainterna.getSelectedItem());
        ClaseGeneral.soportescuentas.setValor(BigDecimal.valueOf(Long.parseLong("" + valor.getText().trim().replace(".", ""))));

        if (ClaseGeneral.controlSoportescuentas.verify(ClaseGeneral.soportescuentas)) {
            try {
                ClaseGeneral.controlSoportescuentas.create(ClaseGeneral.soportescuentas);
            } catch (Exception ex) {
                Logger.getLogger(PanelSoportescuentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void metodoConsultar() {
        try {
            fkcuenta.setText(ClaseGeneral.soportescuentas.getSoportescuentasPK().getFkcuenta());
            cuenta.setText(ClaseGeneral.soportescuentas.getCuenta());
            actividad.setText(ClaseGeneral.soportescuentas.getActividad());
            subgrupo.setSelectedItem(ClaseGeneral.soportescuentas.getSubgrupo());
            cingreso.setText(ClaseGeneral.soportescuentas.getCingreso());
            ccostos.setText(ClaseGeneral.soportescuentas.getCcostos());
            cinfo.setSelectedItem(ClaseGeneral.soportescuentas.getCinfo());
            cuentainterna.setSelectedItem(ClaseGeneral.soportescuentas.getCuentainterna());
            valor.setText("" + ClaseInformacion.formatoDecimal.format(ClaseGeneral.soportescuentas.getValor()));

            fkcuenta.setFocusable(false);
        } catch (Exception ex) {
            Logger.getLogger(PanelResoluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void metodoActualizar() {
        Soportescuentas soportescuentasId = ClaseGeneral.soportescuentas;
        soportescuentasId.setSoportescuentasPK(ClaseGeneral.soportescuentas.getSoportescuentasPK());
        ClaseGeneral.soportescuentas = new Soportescuentas();
        ClaseGeneral.soportescuentasPK = new SoportescuentasPK();
        ClaseGeneral.soportescuentasPK.setFkcuenta(fkcuenta.getText());
        //ClaseGeneral.soportescuentasPK.setId();
        ClaseGeneral.soportescuentas.setSoportescuentasPK(ClaseGeneral.soportescuentasPK);
        ClaseGeneral.soportescuentas.setCuenta(cuenta.getText());
        ClaseGeneral.soportescuentas.setActividad(actividad.getText());
        ClaseGeneral.soportescuentas.setSubgrupo("" + subgrupo.getSelectedItem());
        ClaseGeneral.soportescuentas.setCingreso(cingreso.getText());
        ClaseGeneral.soportescuentas.setCcostos(ccostos.getText());
        ClaseGeneral.soportescuentas.setCinfo("" + cinfo.getSelectedItem());
        ClaseGeneral.soportescuentas.setCuentainterna("" + cuentainterna.getSelectedItem());
        ClaseGeneral.soportescuentas.setValor(BigDecimal.valueOf(Long.parseLong("" + valor.getText().trim().replace(".", ""))));

        if (ClaseGeneral.controlSoportescuentas.verify(ClaseGeneral.soportescuentas)) {
            try {
                ClaseGeneral.controlSoportescuentas.edit(ClaseGeneral.soportescuentas, soportescuentasId);
                ClaseGeneral.controlSoportesresoluciones.editFkcuenta(ClaseGeneral.soportescuentas);
            } catch (Exception ex) {
                Logger.getLogger(PanelSoportescuentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void metodoEliminar() {
        try {
            ClaseGeneral.soportescuentasPK = new SoportescuentasPK();
            ClaseGeneral.soportescuentasPK.setFkcuenta(fkcuenta.getText());
            ClaseGeneral.soportescuentasPK.setId(ClaseGeneral.soportescuentas.getSoportescuentasPK().getId());

            ClaseGeneral.controlSoportescuentas.destroy(ClaseGeneral.soportescuentasPK);
        } catch (Exception ex) {
            Logger.getLogger(PanelSoportescuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public final void metodoMostrar() {
        BigDecimal valTotal = BigDecimal.ZERO;
        ClaseGeneral.soportescuentas = new Soportescuentas();
        lista = ClaseGeneral.controlSoportescuentas.findAllInSoportescuentasByFkcuenta(fkcuenta.getText());

        jTable.getColumnModel().getColumn(7).setCellRenderer(informacion.modeloDerecha);

        for (int i = 0; i < 100; i++) {
            jTable.setValueAt("", i, 0);
            jTable.setValueAt("", i, 1);
            jTable.setValueAt("", i, 2);
            jTable.setValueAt("", i, 3);
            jTable.setValueAt("", i, 4);
            jTable.setValueAt("", i, 5);
            jTable.setValueAt("", i, 6);
            jTable.setValueAt("", i, 7);
        }

        int i = 0;
        for (Object lista1 : lista) {
            ClaseGeneral.soportescuentas = (Soportescuentas) lista1;
            jTable.setValueAt("" + ClaseGeneral.soportescuentas.getCuenta(), i, 0);
            jTable.setValueAt("" + ClaseGeneral.soportescuentas.getActividad(), i, 1);
            jTable.setValueAt("" + ClaseGeneral.soportescuentas.getSubgrupo(), i, 2);
            jTable.setValueAt("" + ClaseGeneral.soportescuentas.getCingreso(), i, 3);
            jTable.setValueAt("" + ClaseGeneral.soportescuentas.getCcostos(), i, 4);
            jTable.setValueAt("" + ClaseGeneral.soportescuentas.getCinfo(), i, 5);
            jTable.setValueAt("" + ClaseGeneral.soportescuentas.getCuentainterna(), i, 6);
            jTable.setValueAt("" + ClaseInformacion.formatoDecimal.format(ClaseGeneral.soportescuentas.getValor()), i, 7);
            valTotal = valTotal.add(ClaseGeneral.soportescuentas.getValor());
            i++;
        }

        jTable.clearSelection();
        jTable.getColumnModel().getColumn(0).setPreferredWidth(90);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(90);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(90);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(90);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(90);
        jTable.getColumnModel().getColumn(5).setPreferredWidth(90);
        jTable.getColumnModel().getColumn(6).setPreferredWidth(125);
        jTable.getColumnModel().getColumn(7).setPreferredWidth(145);
        valorTotal.setText("" + ClaseInformacion.formatoDecimal.format(valTotal));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField actividad;
    public javax.swing.JTextField ccostos;
    public javax.swing.JComboBox cinfo;
    public javax.swing.JTextField cingreso;
    public javax.swing.JTextField cuenta;
    public javax.swing.JComboBox cuentainterna;
    private javax.swing.JTextField fkcuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator16;
    public javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    public javax.swing.JComboBox subgrupo;
    public javax.swing.JTextField valor;
    private javax.swing.JTextField valorTotal;
    // End of variables declaration//GEN-END:variables
}
