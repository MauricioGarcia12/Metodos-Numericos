package programa2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CopiaBiseccion extends javax.swing.JFrame {

    DefaultTableModel modelo;
    int iteracion = 0;
    double errorRelativoIteracion = 1.0;
    double rounded = 0;
    double rounded2 = 0;
    double rounded3 = 0;
    double PM = 0;
    double FV = 1.0;

    public CopiaBiseccion() {
        initComponents();
        JOptionPane.showMessageDialog(null, "\tBienvenido al Método por Bisección"
                + "\n1.A excepción de la función, todos los espacios deben ser llenados"
                + "\n2.A excepción del Error%, todos los rublos deben ser llenados con Números enteros solamente"
                + "\n3.El programa sólo acepta 10 digitos"
                + "\n4.No se puede poner más de un punto decimal en el Error%"
                + "\n5.Sí la multiplicación de ambas funciones f(a)*f(b)<0 el programa correra normalmente"
                + "\n6.5.Sí la multiplicación de ambas funciones f(a)*f(b)>0 deberá ingresar un nuevo intervalo"
                + "\n7. 5.Sí la multiplicación de ambas funciones f(a)*f(b)=0 habra encontrado la raiz de la función");

        String cabecera[] = {"Número de Iteración", "Error Relativo de Iteración %",
            "Punto Medio PM", "FV (f(x)*g(x)"};
        String datos[][] = {};
        modelo = new DefaultTableModel(datos, cabecera);
        tabla.setModel(modelo);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPorcentajeError = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtX6 = new javax.swing.JTextField();
        txtX5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtX4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtX3 = new javax.swing.JTextField();
        txtX2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtX = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spinnerNumeroDecimales = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonLimpiarRublos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 157, 240));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Porcentaje de Error%: ");

        txtPorcentajeError.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeErrorKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        jLabel2.setText("X^6");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        jLabel3.setText("X^5");

        txtX6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX6KeyTyped(evt);
            }
        });

        txtX5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX5KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        jLabel4.setText("X^4");

        txtX4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX4KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        jLabel5.setText("X^3");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        jLabel6.setText("X^2");

        txtX3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX3KeyTyped(evt);
            }
        });

        txtX2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX2KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel7.setText(" X");

        txtX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtXKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        jLabel8.setText("C");

        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 2, 18)); // NOI18N
        jLabel9.setText("f(x)");

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel10.setText("Número de Decimales: ");

        spinnerNumeroDecimales.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel11.setText("INTERVALO: ");

        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("[");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("  a");

        txtB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("]");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText(" b");

        botonIniciar.setBackground(new java.awt.Color(18, 32, 252));
        botonIniciar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        botonIniciar.setText("Iniciar");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonLimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonLimpiar.setText("Limpiar Tabla");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonLimpiarRublos.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        botonLimpiarRublos.setText("Limpiar Rublos");
        botonLimpiarRublos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarRublosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPorcentajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerNumeroDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtX6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtX5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(botonLimpiarRublos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel15)))
                        .addGap(93, 93, 93))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtX4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtX3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(77, 77, 77))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcentajeError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtX6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(spinnerNumeroDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(botonLimpiarRublos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonLimpiar)
                        .addGap(23, 23, 23)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        JOptionPane.showMessageDialog(null, "Saliendo del programa");
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        //Falta re-Inicializar todas las variables
        iteracion = 0;
        errorRelativoIteracion = 0.0;
        rounded = 0;
        rounded2 = 0;
        rounded3 = 0;
        PM = 0;
        FV = 1.0;

        String cabecera[] = {"Número de Iteración", "Error Relativo de Iteración %",
            "Punto Medio PM", "FV (f(x)*g(x)"};
        String datos[][] = {};
        modelo = new DefaultTableModel(datos, cabecera);
        tabla.setModel(modelo);
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void txtPorcentajeErrorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeErrorKeyTyped
        char c = evt.getKeyChar();
        //Con punto decimal 
        if ((c >= 33 && c <= 45) || (c == 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtPorcentajeErrorKeyTyped

    private void txtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || c == 47 || c == 46 || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtAKeyTyped

    private void txtBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || c == 47 || c == 46 || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtBKeyTyped

    private void txtX6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX6KeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || c == 47 || c == 46 || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtX6KeyTyped

    private void txtX5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX5KeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || c == 47 || c == 46 || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }

    }//GEN-LAST:event_txtX5KeyTyped

    private void txtX4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX4KeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || c == 47 || c == 46 || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtX4KeyTyped

    private void txtX3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX3KeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || c == 47 || c == 46 || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtX3KeyTyped

    private void txtX2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX2KeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || c == 47 || c == 46 || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtX2KeyTyped

    private void txtXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtXKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || c == 47 || c == 46 || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtXKeyTyped

    private void txtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || c == 47 || c == 46 || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtCKeyTyped

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        try {
            //Método Bisección
            double porcentajeError = Double.parseDouble(txtPorcentajeError.getText());
            //Valores de la función
            double x6 = Double.parseDouble(txtX6.getText());
            double x5 = Double.parseDouble(txtX5.getText());
            double x4 = Double.parseDouble(txtX4.getText());
            double x3 = Double.parseDouble(txtX3.getText());
            double x2 = Double.parseDouble(txtX2.getText());
            double x = Double.parseDouble(txtX.getText());
            double c = Double.parseDouble(txtC.getText());

            //Valores del Intervalo.
            double a = Integer.parseInt(txtA.getText());
            double b = Integer.parseInt(txtB.getText());

            //Valores Para los Raounded 
            int decimal1 = (int) (Math.pow(10, (int) spinnerNumeroDecimales.getValue()));
            double decimal2 = (double) decimal1;

            //Porcentaje de error digitado
            double error = Double.parseDouble(txtPorcentajeError.getText());
            //Variable de a
            int A6 = (int) Math.pow(a, 6);
            int A5 = (int) Math.pow(a, 5);
            int A4 = (int) Math.pow(a, 4);
            int A3 = (int) Math.pow(a, 3);
            int A2 = (int) Math.pow(a, 2);
            int A1 = (int) Math.pow(a, 1);

            //Variable de b
            int B6 = (int) Math.pow(b, 6);
            int B5 = (int) Math.pow(b, 5);
            int B4 = (int) Math.pow(b, 4);
            int B3 = (int) Math.pow(b, 3);
            int B2 = (int) Math.pow(b, 2);
            int B1 = (int) Math.pow(b, 1);

            //Calculo de la función A
            double funcionA = (x6 * A6) + (x5 * A5) + (x4 * A4)
                    + (x3 * A3) + (x2 * A2) + (x * A1) + c;
            System.out.println(funcionA);

            //Càlculo de la funciòn B
            double funcionB = (x6 * B6) + (x5 * B5) + (x4 * B4)
                    + (x3 * B3) + (x2 * B2) + (x * B1) + c;
            System.out.println(funcionA);

            //Tres condicionales principales
            boolean valNoResultado = false;
            if (funcionA * funcionB > 0) {
                JOptionPane.showMessageDialog(null, "La raiz no está en el intervalo, digite otro intervalo");
                txtA.setText("");
                txtB.setText("");
            } else if (funcionA * funcionB < 0) {
                //Algoritmo
                double auxA, auxB;
                PM = (a + b) / 2;
                System.out.println(" Afuera PM:" + PM);
                double auxFV = 0.0;
                FV = (x6 * (Math.pow(PM, 6))) + (x5 * (Math.pow(PM, 5)))
                        + (x4 * (Math.pow(PM, 4))) + (x3 * (Math.pow(PM, 3)))
                        + (x2 * (Math.pow(PM, 2))) + (x * (Math.pow(PM, 1)))
                        + c;
                System.out.println(" Afuera FV:" + FV);
                iteracion = 1;

                auxFV = FV;

                do {
                    System.out.println("\n");
                    System.out.println("auxFV: " + auxFV);
                    System.out.println("Error: " + errorRelativoIteracion);
                    System.out.println("Iteracion: " + iteracion);

                    if (((PM * a) < 0) || (PM < 0 && b < 0)) {
                        System.out.println("PM : " + PM);
                        
                        b = PM;
                        System.out.println("Tomo a:" + a);
                        System.out.println("nuevo b: " + b);
                        PM = (PM + a) / 2;
                        FV = (x6 * (Math.pow(PM, 6))) + (x5 * (Math.pow(PM, 5)))
                                + (x4 * (Math.pow(PM, 4))) + (x3 * (Math.pow(PM, 3)))
                                + (x2 * (Math.pow(PM, 2))) + (x * (Math.pow(PM, 1)))
                                + c;

                        System.out.println("FV: " + FV);
                        System.out.println("PM+a/2: " + PM);

                    } else if (((PM * b) < 0) || (PM < 0 && a < 0)) {
                        System.out.println("PM: " + PM);
                        a = PM;
                        System.out.println("Tomo b: " + b);
                        System.out.println("nuevo a: " + a);
                        PM = (PM + b) / 2;

                        FV = (x6 * (Math.pow(PM, 6))) + (x5 * (Math.pow(PM, 5)))
                                + (x4 * (Math.pow(PM, 4))) + (x3 * (Math.pow(PM, 3)))
                                + (x2 * (Math.pow(PM, 2))) + (x * (Math.pow(PM, 1)))
                                + c;

                        System.out.println("FV: " + FV);
                        System.out.println("PM+b/2: " + PM);

                    }

                    errorRelativoIteracion = Math.abs(((FV - auxFV) / FV) * 100);
                    iteracion++;

                    errorRelativoIteracion = Math.round(errorRelativoIteracion * decimal1) / decimal2;
                    System.out.println("ERROR ROUNDED: " + errorRelativoIteracion);
                    FV = Math.round(FV * decimal1) / decimal2;
                    auxFV = FV;
                    System.out.println("FV ROUNDED: " + FV);
                    PM = Math.round(PM * decimal1) / decimal2;
                    System.out.println("PM ROUNDED: " + PM);

                    Object datos[] = {iteracion, errorRelativoIteracion, PM, FV};
                    modelo.addRow(datos);

                } while ((FV == 0) || (porcentajeError <= errorRelativoIteracion));
                valNoResultado = true;

            } else if (funcionA * funcionB == 0 || valNoResultado == true) {
                JOptionPane.showMessageDialog(null, "¡FELICIDADES HA ENCONTRADO LA RAÍZ!");
                //  Colocar lo del método limpiar

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Siga las indicaciones por favor");
        }


    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonLimpiarRublosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarRublosActionPerformed

        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        txtPorcentajeError.setText("");
        txtX.setText("");
        txtX2.setText("");
        txtX3.setText("");
        txtX4.setText("");
        txtX5.setText("");
        txtX6.setText("");

    }//GEN-LAST:event_botonLimpiarRublosActionPerformed

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
            java.util.logging.Logger.getLogger(CopiaBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CopiaBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CopiaBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CopiaBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CopiaBiseccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonLimpiarRublos;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinnerNumeroDecimales;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtPorcentajeError;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtX3;
    private javax.swing.JTextField txtX4;
    private javax.swing.JTextField txtX5;
    private javax.swing.JTextField txtX6;
    // End of variables declaration//GEN-END:variables
}
