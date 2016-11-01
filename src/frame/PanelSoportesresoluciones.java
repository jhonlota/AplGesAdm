/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelSoportescomprobantesContratos.java
 *
 * Created on 16/01/2012, 05:14:48 PM
 */
package frame;

import clases.ClaseGeneral;
import clases.ClaseInformacion;
import entidades.Soportescomprobantes;
import entidades.SoportescomprobantesPK;
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
public class PanelSoportesresoluciones extends javax.swing.JPanel {

    private List lista = new ArrayList();
    private ClaseInformacion informacion = new ClaseInformacion();

    /**
     * Creates new form PanelSoportescomprobantesContratos
     */
    public PanelSoportesresoluciones() {
        initComponents();

        subgrupo.setEditable(true);
        cinfo.setEditable(true);
        cuentainterna.setEditable(true);

        AutoCompleteDecorator.decorate(subgrupo);
        AutoCompleteDecorator.decorate(cinfo);
        AutoCompleteDecorator.decorate(cuentainterna);

        fkcomprobante.setText("" + ClaseGeneral.comprobantes.getId());
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
        fkcomprobante = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tipoSoporte = new javax.swing.JComboBox();
        jTextField15 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cuenta = new javax.swing.JTextField();
        actividad = new javax.swing.JTextField();
        subgrupo = new javax.swing.JComboBox();
        ccostos = new javax.swing.JTextField();
        cinfo = new javax.swing.JComboBox();
        cuentainterna = new javax.swing.JComboBox();
        valor = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        valorTotal = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("C. COSTOS");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel7.setPreferredSize(new java.awt.Dimension(90, 25));

        setName("panelSoportescomprobantes"); // NOI18N
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("NÚMERO DE LA RESOLUCIÓN : ");
        jLabel1.setPreferredSize(new java.awt.Dimension(175, 25));
        add(jLabel1);

        fkcomprobante.setBackground(ClaseGeneral.verde);
        fkcomprobante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fkcomprobante.setForeground(ClaseGeneral.rojo);
        fkcomprobante.setFocusable(false);
        fkcomprobante.setMargin(new java.awt.Insets(2, 4, 2, 4));
        fkcomprobante.setPreferredSize(new java.awt.Dimension(150, 25));
        add(fkcomprobante);

        jLabel73.setPreferredSize(new java.awt.Dimension(20, 25));
        add(jLabel73);

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator16.setPreferredSize(new java.awt.Dimension(20, 25));
        add(jSeparator16);

        jLabel2.setText("TIPO DE SOPORTE : ");
        jLabel2.setPreferredSize(new java.awt.Dimension(125, 25));
        add(jLabel2);

        tipoSoporte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipoSoporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "OG: ORDEN DE GASTO", "FR: FONDO RENOVABLE", "CM: CAJA MENOR" }));
        tipoSoporte.setPreferredSize(new java.awt.Dimension(150, 25));
        add(tipoSoporte);

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField15.setEnabled(false);
        jTextField15.setFocusable(false);
        jTextField15.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jTextField15.setOpaque(false);
        jTextField15.setPreferredSize(new java.awt.Dimension(425, 25));
        add(jTextField15);

        jLabel72.setPreferredSize(new java.awt.Dimension(810, 25));
        add(jLabel72);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 70));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CUENTA");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setPreferredSize(new java.awt.Dimension(95, 25));
        jPanel1.add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ACTIVIDAD");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setPreferredSize(new java.awt.Dimension(95, 25));
        jPanel1.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SUBGRUPO");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel5.setPreferredSize(new java.awt.Dimension(95, 25));
        jPanel1.add(jLabel5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("C. COSTOS");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setPreferredSize(new java.awt.Dimension(95, 25));
        jPanel1.add(jLabel6);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("C. INFO");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel8.setPreferredSize(new java.awt.Dimension(95, 25));
        jPanel1.add(jLabel8);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CUENTA INTERNA");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel10.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(jLabel10);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VALOR");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel9.setPreferredSize(new java.awt.Dimension(160, 25));
        jPanel1.add(jLabel9);

        cuenta.setBackground(ClaseGeneral.campo);
        cuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuenta.setText("0");
        cuenta.setMargin(new java.awt.Insets(2, 4, 2, 4));
        cuenta.setPreferredSize(new java.awt.Dimension(95, 25));
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
        actividad.setPreferredSize(new java.awt.Dimension(95, 25));
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
        subgrupo.setPreferredSize(new java.awt.Dimension(95, 25));
        jPanel1.add(subgrupo);

        ccostos.setBackground(ClaseGeneral.campo);
        ccostos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ccostos.setText("0");
        ccostos.setMargin(new java.awt.Insets(2, 4, 2, 4));
        ccostos.setPreferredSize(new java.awt.Dimension(95, 25));
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
        cinfo.setOpaque(false);
        cinfo.setPreferredSize(new java.awt.Dimension(95, 25));
        jPanel1.add(cinfo);

        cuentainterna.setBackground(ClaseGeneral.campo);
        cuentainterna.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuentainterna.setModel(ClaseGeneral.controlCuentainterna.COMBOCodigoInCuentainternaBy());
        cuentainterna.setSelectedItem("0");
        cuentainterna.setOpaque(false);
        cuentainterna.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(cuentainterna);

        valor.setBackground(ClaseGeneral.campo);
        valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valor.setText("0");
        valor.setMargin(new java.awt.Insets(2, 4, 2, 4));
        valor.setPreferredSize(new java.awt.Dimension(160, 25));
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
        jTextField16.setPreferredSize(new java.awt.Dimension(635, 25));
        add(jTextField16);

        valorTotal.setBackground(ClaseGeneral.verde);
        valorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valorTotal.setForeground(new java.awt.Color(255, 0, 0));
        valorTotal.setText("0");
        valorTotal.setFocusable(false);
        valorTotal.setMargin(new java.awt.Insets(2, 4, 2, 4));
        valorTotal.setPreferredSize(new java.awt.Dimension(170, 25));
        add(valorTotal);

        jLabel74.setPreferredSize(new java.awt.Dimension(810, 25));
        add(jLabel74);

        jScrollPane.setPreferredSize(new java.awt.Dimension(810, 370));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CUENTA", "ACTIVIDAD", "SUBGRUPO", "C. COSTOS", "C. INFO", "CUENTA INTERNA", "VALOR"
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
        ClaseGeneral.soportescomprobantes = new Soportescomprobantes();
        ClaseGeneral.soportescomprobantesPK = new SoportescomprobantesPK();
        ClaseGeneral.soportescomprobantesPK.setFkcomprobante(Integer.parseInt("" + fkcomprobante.getText()));
        ClaseGeneral.soportescomprobantesPK.setId(0);
        ClaseGeneral.soportescomprobantesPK.setAno(ClaseGeneral.comprobantes.getAno());
        ClaseGeneral.soportescomprobantes.setSoportescomprobantesPK(ClaseGeneral.soportescomprobantesPK);
        ClaseGeneral.soportescomprobantes.setCuenta(cuenta.getText());
        ClaseGeneral.soportescomprobantes.setActividad(actividad.getText());
        ClaseGeneral.soportescomprobantes.setSubgrupo("" + subgrupo.getSelectedItem());
        ClaseGeneral.soportescomprobantes.setCcostos(ccostos.getText());
        ClaseGeneral.soportescomprobantes.setCinfo("" + cinfo.getSelectedItem());
        ClaseGeneral.soportescomprobantes.setCuentainterna("" + cuentainterna.getSelectedItem());
        ClaseGeneral.soportescomprobantes.setValor(BigDecimal.valueOf(Long.parseLong("" + valor.getText().trim().replace(".", ""))));

        if (ClaseGeneral.controlSoportescomprobantes.verify(ClaseGeneral.soportescomprobantes)) {
            try {
                ClaseGeneral.controlSoportescomprobantes.create(ClaseGeneral.soportescomprobantes);
            } catch (Exception ex) {
                Logger.getLogger(PanelSoportesresoluciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void metodoConsultar() {
        try {
            fkcomprobante.setText("" + ClaseGeneral.soportescomprobantes.getSoportescomprobantesPK().getFkcomprobante());
            cuenta.setText(ClaseGeneral.soportescomprobantes.getCuenta());
            actividad.setText(ClaseGeneral.soportescomprobantes.getActividad());
            subgrupo.setSelectedItem(ClaseGeneral.soportescomprobantes.getSubgrupo());
            ccostos.setText(ClaseGeneral.soportescomprobantes.getCcostos());
            cinfo.setSelectedItem(ClaseGeneral.soportescomprobantes.getCinfo());
            cuentainterna.setSelectedItem(ClaseGeneral.soportescomprobantes.getCuentainterna());
            valor.setText("" + ClaseInformacion.formatoDecimal.format(ClaseGeneral.soportescomprobantes.getValor()));
        } catch (Exception ex) {
            Logger.getLogger(PanelResoluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void metodoActualizar() {
        Soportescomprobantes soportescomprobantesId = ClaseGeneral.soportescomprobantes;
        soportescomprobantesId.setSoportescomprobantesPK(ClaseGeneral.soportescomprobantes.getSoportescomprobantesPK());

        ClaseGeneral.soportescomprobantes = new Soportescomprobantes();
        ClaseGeneral.soportescomprobantesPK = new SoportescomprobantesPK();
        ClaseGeneral.soportescomprobantesPK.setFkcomprobante(Integer.parseInt(fkcomprobante.getText()));
        //ClaseGeneral.soportescomprobantesPK.setId();
        ClaseGeneral.soportescomprobantesPK.setAno(ClaseGeneral.comprobantes.getAno());
        ClaseGeneral.soportescomprobantes.setSoportescomprobantesPK(ClaseGeneral.soportescomprobantesPK);
        ClaseGeneral.soportescomprobantes.setCuenta(cuenta.getText());
        ClaseGeneral.soportescomprobantes.setActividad(actividad.getText());
        ClaseGeneral.soportescomprobantes.setSubgrupo("" + subgrupo.getSelectedItem());
        ClaseGeneral.soportescomprobantes.setCcostos(ccostos.getText());
        ClaseGeneral.soportescomprobantes.setCinfo("" + cinfo.getSelectedItem());
        ClaseGeneral.soportescomprobantes.setCuentainterna("" + cuentainterna.getSelectedItem());
        ClaseGeneral.soportescomprobantes.setValor(BigDecimal.valueOf(Long.parseLong("" + valor.getText().trim().replace(".", ""))));

        if (ClaseGeneral.controlSoportescomprobantes.verify(ClaseGeneral.soportescomprobantes)) {
            try {
                ClaseGeneral.controlSoportescomprobantes.edit(ClaseGeneral.soportescomprobantes, soportescomprobantesId);
            } catch (Exception ex) {
                Logger.getLogger(PanelSoportesresoluciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void metodoEliminar() {
        try {
            ClaseGeneral.soportescomprobantesPK = new SoportescomprobantesPK();
            ClaseGeneral.soportescomprobantesPK.setFkcomprobante(Integer.parseInt(fkcomprobante.getText()));
            ClaseGeneral.soportescomprobantesPK.setId(ClaseGeneral.soportescomprobantes.getSoportescomprobantesPK().getId());
            ClaseGeneral.soportescomprobantesPK.setAno(ClaseGeneral.comprobantes.getAno());

            ClaseGeneral.controlSoportescomprobantes.destroy(ClaseGeneral.soportescomprobantesPK);
        } catch (Exception ex) {
            Logger.getLogger(PanelSoportesresoluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void metodoMostrar() {
        BigDecimal valTotal = BigDecimal.ZERO;
        ClaseGeneral.soportescomprobantes = new Soportescomprobantes();
        lista = ClaseGeneral.controlSoportescomprobantes.findAllInSoportescomprobantesByFkcomprobanteAno(Integer.parseInt(fkcomprobante.getText()), ClaseGeneral.comprobantes.getAno());

        jTable.getColumnModel().getColumn(6).setCellRenderer(informacion.modeloDerecha);

        for (int i = 0; i < 100; i++) {
            jTable.setValueAt("", i, 0);
            jTable.setValueAt("", i, 1);
            jTable.setValueAt("", i, 2);
            jTable.setValueAt("", i, 3);
            jTable.setValueAt("", i, 4);
            jTable.setValueAt("", i, 5);
            jTable.setValueAt("", i, 6);
        }

        int i = 0;
        for (Object lista1 : lista) {
            ClaseGeneral.soportescomprobantes = (Soportescomprobantes) lista1;
            jTable.setValueAt("" + ClaseGeneral.soportescomprobantes.getCuenta(), i, 0);
            jTable.setValueAt("" + ClaseGeneral.soportescomprobantes.getActividad(), i, 1);
            jTable.setValueAt("" + ClaseGeneral.soportescomprobantes.getSubgrupo(), i, 2);
            jTable.setValueAt("" + ClaseGeneral.soportescomprobantes.getCcostos(), i, 3);
            jTable.setValueAt("" + ClaseGeneral.soportescomprobantes.getCinfo(), i, 4);
            jTable.setValueAt("" + ClaseGeneral.soportescomprobantes.getCuentainterna(), i, 5);
            jTable.setValueAt("" + ClaseInformacion.formatoDecimal.format(ClaseGeneral.soportescomprobantes.getValor()), i, 6);
            valTotal = valTotal.add(ClaseGeneral.soportescomprobantes.getValor());
            i++;
        }

        jTable.clearSelection();
        jTable.getColumnModel().getColumn(0).setPreferredWidth(110);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(110);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(110);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(110);
        jTable.getColumnModel().getColumn(5).setPreferredWidth(110);
        jTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        valorTotal.setText("" + ClaseInformacion.formatoDecimal.format(valTotal));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField actividad;
    public javax.swing.JTextField ccostos;
    public javax.swing.JComboBox cinfo;
    public javax.swing.JTextField cuenta;
    public javax.swing.JComboBox cuentainterna;
    private javax.swing.JTextField fkcomprobante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator16;
    public javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    public javax.swing.JComboBox subgrupo;
    private javax.swing.JComboBox tipoSoporte;
    private javax.swing.JTextField valor;
    private javax.swing.JTextField valorTotal;
    // End of variables declaration//GEN-END:variables
}