/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobdii;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainRegister extends javax.swing.JFrame {
    ArrayList<Curso> ListaCurso;
    ArrayList<Aluno> ListaAluno;
    String modoCurso;
    String modoAluno;
    
    
    public void LoadTableCurso () {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Curso_cod","Curso_nome"},0);
        
        tbl_curso.setModel(modelo);
        tbl_curso.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_curso.getColumnModel().getColumn(1).setPreferredWidth(200);
        
        for (int i=0;i<ListaCurso.size();i++){
            modelo.addRow(new Object[]{ListaCurso.get(i).getCodigo(),ListaCurso.get(i).getNome()});
        }
        
        LoadCBCurso();
    }
    
    public void LoadTableAluno () {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Aluno_cod","Aluno_nome"},0);
        
        tbl_aluno.setModel(modelo);
        tbl_aluno.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_aluno.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbl_aluno.getColumnModel().getColumn(2).setPreferredWidth(200);
        
        for (int i=0;i<ListaAluno.size();i++){
            modelo.addRow(new Object[]{ListaAluno.get(i).getMatricula(),ListaAluno.get(i).getNome(), ListaAluno.get(i).getCurso().getNome()});
        }
        
        LoadCBCurso();
    }
    
    public void LoadCBCurso () {
        cb_aluno_cursos.removeAllItems();
        
        for (int i=0;i<ListaCurso.size();i++){
            cb_aluno_cursos.addItem(ListaCurso.get(i).getNome());
        }
    }
    
    public MainRegister() {
        initComponents();
        ListaCurso = new ArrayList();
        ListaAluno = new ArrayList();
        modoCurso = "Navegar";
        modoAluno = "Navegar";
        ManangeInterfaceCurso(modoCurso);
        ManangeInterfaceAluno(modoAluno);
        
    }
    
    public void ManangeInterfaceCurso (String modoCurso){
        switch(modoCurso){
            
        case "Navegar":
            btn_curso_salvar.setEnabled(false);
            btn_curso_cancelar.setEnabled(false);
            btn_curso_novo.setEnabled(true);
            btn_curso_editar.setEnabled(false);
            btn_curso_excluir.setEnabled(false);
            c_curso_cod.setEnabled(false);
            c_curso_nome.setEnabled(false);
            
            break;
          
        case "Novo":
            btn_curso_salvar.setEnabled(true);
            btn_curso_cancelar.setEnabled(true);
            btn_curso_novo.setEnabled(false);
            btn_curso_editar.setEnabled(false);
            btn_curso_excluir.setEnabled(false);
            c_curso_cod.setEnabled(true);
            c_curso_nome.setEnabled(true);
            
            break;
        case "Editar":
            btn_curso_salvar.setEnabled(true);
            btn_curso_cancelar.setEnabled(true);
            btn_curso_novo.setEnabled(false);
            btn_curso_editar.setEnabled(false);
            btn_curso_excluir.setEnabled(false);
            c_curso_cod.setEnabled(true);
            c_curso_nome.setEnabled(true);
            
            break;
        case "Excluir":
            btn_curso_salvar.setEnabled(false);
            btn_curso_cancelar.setEnabled(false);
            btn_curso_novo.setEnabled(true);
            btn_curso_editar.setEnabled(true);
            btn_curso_excluir.setEnabled(true);
            c_curso_cod.setEnabled(false);
            c_curso_nome.setEnabled(false);
          
            break;
        case "Selecionar":
            btn_curso_salvar.setEnabled(false);
            btn_curso_cancelar.setEnabled(false);
            btn_curso_novo.setEnabled(true);
            btn_curso_editar.setEnabled(true);
            btn_curso_excluir.setEnabled(true);
            c_curso_cod.setEnabled(false);
            c_curso_nome.setEnabled(false);
            break;
        default: System.out.println("Modo Invalido!");
        
        }
    }
    
    public void ManangeInterfaceAluno (String modoAluno){
        switch(modoAluno){
            
        case "Navegar":
            btn_aluno_salvar.setEnabled(false);
            btn_aluno_cancelar.setEnabled(false);
            btn_aluno_novo.setEnabled(true);
            btn_aluno_editar.setEnabled(false);
            btn_aluno_excluir.setEnabled(false);
            c_aluno_cod.setEnabled(false);
            c_aluno_nome.setEnabled(false);
            cb_aluno_cursos.setEnabled(false);
            break;
        case "Novo":
            btn_aluno_salvar.setEnabled(true);
            btn_aluno_cancelar.setEnabled(true);
            btn_aluno_novo.setEnabled(false);
            btn_aluno_editar.setEnabled(false);
            btn_aluno_excluir.setEnabled(false);
            c_aluno_cod.setEnabled(true);
            c_aluno_nome.setEnabled(true);
            cb_aluno_cursos.setEnabled(true);
            
            break;
        case "Editar":
            btn_aluno_salvar.setEnabled(true);
            btn_aluno_cancelar.setEnabled(true);
            btn_aluno_novo.setEnabled(false);
            btn_aluno_editar.setEnabled(false);
            btn_aluno_excluir.setEnabled(false);
            c_aluno_cod.setEnabled(true);
            c_aluno_nome.setEnabled(true);
            cb_aluno_cursos.setEnabled(true);
            break;
        case "Excluir":
            btn_aluno_salvar.setEnabled(false);
            btn_aluno_cancelar.setEnabled(false);
            btn_aluno_novo.setEnabled(true);
            btn_aluno_editar.setEnabled(true);
            btn_aluno_excluir.setEnabled(true);
            c_aluno_cod.setEnabled(false);
            c_aluno_nome.setEnabled(false);
            cb_aluno_cursos.setEnabled(false);
            break;
        case "Selecionar":
            btn_aluno_salvar.setEnabled(false);
            btn_aluno_cancelar.setEnabled(false);
            btn_aluno_novo.setEnabled(true);
            btn_aluno_editar.setEnabled(true);
            btn_aluno_excluir.setEnabled(true);
            c_aluno_cod.setEnabled(false);
            c_aluno_nome.setEnabled(false);
            cb_aluno_cursos.setEnabled(false);
            break;
        default: System.out.println("Modo Invalido!");
        
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_curso = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c_curso_cod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_curso_nome = new javax.swing.JTextField();
        btn_curso_salvar = new javax.swing.JButton();
        btn_curso_cancelar = new javax.swing.JButton();
        btn_curso_novo = new javax.swing.JButton();
        btn_curso_editar = new javax.swing.JButton();
        btn_curso_excluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_aluno_salvar = new javax.swing.JButton();
        btn_aluno_cancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_aluno = new javax.swing.JTable();
        btn_aluno_novo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c_aluno_cod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        c_aluno_nome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_aluno_cursos = new javax.swing.JComboBox<>();
        btn_aluno_editar = new javax.swing.JButton();
        btn_aluno_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_curso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Curso_Cod", "Curso_Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_curso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_cursoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_curso);
        if (tbl_curso.getColumnModel().getColumnCount() > 0) {
            tbl_curso.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_curso.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Curso"));

        jLabel2.setText("Código:");

        c_curso_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_curso_codActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_curso_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_curso_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(c_curso_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(c_curso_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btn_curso_salvar.setText("Salvar");
        btn_curso_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_curso_salvarActionPerformed(evt);
            }
        });

        btn_curso_cancelar.setText("Cancelar");
        btn_curso_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_curso_cancelarActionPerformed(evt);
            }
        });

        btn_curso_novo.setText("Novo");
        btn_curso_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_curso_novoActionPerformed(evt);
            }
        });

        btn_curso_editar.setText("Editar");
        btn_curso_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_curso_editarActionPerformed(evt);
            }
        });

        btn_curso_excluir.setText("Excluir");
        btn_curso_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_curso_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_curso_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_curso_cancelar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_curso_novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_curso_editar)
                                .addGap(86, 86, 86)
                                .addComponent(btn_curso_excluir)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_curso_novo)
                    .addComponent(btn_curso_editar)
                    .addComponent(btn_curso_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_curso_salvar)
                    .addComponent(btn_curso_cancelar))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cursos", jPanel1);

        btn_aluno_salvar.setText("Salvar");
        btn_aluno_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aluno_salvarActionPerformed(evt);
            }
        });

        btn_aluno_cancelar.setText("Cancelar");
        btn_aluno_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aluno_cancelarActionPerformed(evt);
            }
        });

        tbl_aluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Aluno_Mat", "Aluno_Nome", "Cod_Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_alunoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_aluno);
        if (tbl_aluno.getColumnModel().getColumnCount() > 0) {
            tbl_aluno.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_aluno.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbl_aluno.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        btn_aluno_novo.setText("Novo");
        btn_aluno_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aluno_novoActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Aluno"));

        jLabel5.setText("Matrícula:");

        c_aluno_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_aluno_codActionPerformed(evt);
            }
        });

        jLabel6.setText("Nome:");

        jLabel7.setText("Curso: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c_aluno_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_aluno_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(cb_aluno_cursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(c_aluno_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_aluno_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_aluno_cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btn_aluno_editar.setText("Editar");
        btn_aluno_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aluno_editarActionPerformed(evt);
            }
        });

        btn_aluno_excluir.setText("Excluir");
        btn_aluno_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aluno_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_aluno_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_aluno_cancelar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_aluno_novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_aluno_editar)
                                .addGap(86, 86, 86)
                                .addComponent(btn_aluno_excluir)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aluno_novo)
                    .addComponent(btn_aluno_editar)
                    .addComponent(btn_aluno_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aluno_salvar)
                    .addComponent(btn_aluno_cancelar))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alunos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_curso_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_curso_novoActionPerformed
        c_curso_cod.setText("");
        c_curso_nome.setText("");
        modoCurso = "Novo";
        ManangeInterfaceCurso(modoCurso);
        
    }//GEN-LAST:event_btn_curso_novoActionPerformed

    private void c_curso_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_curso_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_curso_codActionPerformed

    private void btn_curso_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_curso_cancelarActionPerformed
        c_curso_cod.setText("");
        c_curso_nome.setText("");
        modoCurso = "Navegar";
        ManangeInterfaceCurso(modoCurso);    }//GEN-LAST:event_btn_curso_cancelarActionPerformed

    private void btn_curso_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_curso_salvarActionPerformed
        int cod = Integer.parseInt(c_curso_cod.getText());
        if(modoCurso.equals("Novo")){
            
            Curso C = new Curso (cod,c_curso_nome.getText());
            ListaCurso.add(C);
            
        }
        else if (modoCurso.equals("Editar")){
            int index = tbl_curso.getSelectedRow();
            ListaCurso.get(index).setCodigo(cod);
            ListaCurso.get(index).setNome(c_curso_nome.getText());
        }
        
        LoadTableCurso();
        modoCurso = "Navegar";
        ManangeInterfaceCurso(modoCurso);
        c_curso_cod.setText("");
        c_curso_nome.setText("");
    }//GEN-LAST:event_btn_curso_salvarActionPerformed

    private void btn_curso_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_curso_editarActionPerformed
        modoCurso = "Editar";
        ManangeInterfaceCurso(modoCurso);
    }//GEN-LAST:event_btn_curso_editarActionPerformed

    private void tbl_cursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_cursoMouseClicked
        int index = tbl_curso.getSelectedRow();
        if(index >=0 && index < ListaCurso.size()){
            Curso C = ListaCurso.get(index);
            c_curso_cod.setText(String.valueOf(C.getCodigo()));
            c_curso_nome.setText(C.getNome());
            modoCurso = "Selecionar";
            ManangeInterfaceCurso(modoCurso);
        }
        
    }//GEN-LAST:event_tbl_cursoMouseClicked

    private void btn_curso_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_curso_excluirActionPerformed
        int index = tbl_curso.getSelectedRow();
        if(index >=0 && index < ListaCurso.size()){
            ListaCurso.remove(index);
            

        }
        LoadTableCurso();
        
        modoCurso = "Navegar";
        ManangeInterfaceCurso(modoCurso);
    }//GEN-LAST:event_btn_curso_excluirActionPerformed

    private void btn_aluno_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aluno_salvarActionPerformed
        int index = cb_aluno_cursos.getSelectedIndex();
       
        if(index == -1){
            JOptionPane.showMessageDialog(this, "Selecione um curso!");
        }
        else{
            Aluno A = new Aluno();
            A.setMatricula(Integer.parseInt(c_aluno_cod.getText()));
            A.setNome(c_aluno_nome.getText());
            A.setCurso(ListaCurso.get(index));
            
            ListaAluno.add(A);
            ListaCurso.get(index).addAluno(A);
        }
        LoadTableAluno();
        modoAluno = "Navegar";
        ManangeInterfaceAluno(modoAluno);
    }//GEN-LAST:event_btn_aluno_salvarActionPerformed

    private void btn_aluno_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aluno_cancelarActionPerformed
        modoAluno = "Navegar";
        ManangeInterfaceAluno(modoAluno);
    }//GEN-LAST:event_btn_aluno_cancelarActionPerformed

    private void tbl_alunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_alunoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_alunoMouseClicked

    private void btn_aluno_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aluno_novoActionPerformed
        
        modoAluno = "Novo";
        ManangeInterfaceAluno(modoAluno);
        
    }//GEN-LAST:event_btn_aluno_novoActionPerformed

    private void c_aluno_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_aluno_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_aluno_codActionPerformed

    private void btn_aluno_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aluno_editarActionPerformed
        modoAluno = "Editar";
        ManangeInterfaceAluno(modoAluno);
    }//GEN-LAST:event_btn_aluno_editarActionPerformed

    private void btn_aluno_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aluno_excluirActionPerformed
        modoAluno = "Navegar";
        ManangeInterfaceAluno(modoAluno);
    }//GEN-LAST:event_btn_aluno_excluirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aluno_cancelar;
    private javax.swing.JButton btn_aluno_editar;
    private javax.swing.JButton btn_aluno_excluir;
    private javax.swing.JButton btn_aluno_novo;
    private javax.swing.JButton btn_aluno_salvar;
    private javax.swing.JButton btn_curso_cancelar;
    private javax.swing.JButton btn_curso_editar;
    private javax.swing.JButton btn_curso_excluir;
    private javax.swing.JButton btn_curso_novo;
    private javax.swing.JButton btn_curso_salvar;
    private javax.swing.JTextField c_aluno_cod;
    private javax.swing.JTextField c_aluno_nome;
    private javax.swing.JTextField c_curso_cod;
    private javax.swing.JTextField c_curso_nome;
    private javax.swing.JComboBox<String> cb_aluno_cursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_aluno;
    private javax.swing.JTable tbl_curso;
    // End of variables declaration//GEN-END:variables
}
