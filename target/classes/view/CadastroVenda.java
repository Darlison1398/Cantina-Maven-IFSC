
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroVenda extends javax.swing.JFrame {

    /**
     * Creates new form TestejFrameForm
     */
    public CadastroVenda() {
        initComponents();
        
    }

    public JButton getjButtonAdicionarCarteirinha() {
        return jButtonAdicionarCarteirinha;
    }

    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public JButton getjButtonConsultar() {
        return jButtonConsultar;
    }

    public JButton getjButtonNovo() {
        return jButtonNovo;
    }

    public JButton getjButtonPesquisarCarteirinha() {
        return jButtonPesquisarCarteirinha;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public JButton getjButtonSalvar() {
        return jButtonSalvar;
    }

    public JComboBox<String> getjComboBoxTipoDesconto() {
        return jComboBoxTipoDesconto;
    }

    public void setjComboBoxTipoDesconto(JComboBox<String> jComboBoxTipoDesconto) {
        this.jComboBoxTipoDesconto = jComboBoxTipoDesconto;
    }

    public JFormattedTextField getjFormattedTextFieldDataHoraVenda() {
        return jFormattedTextFieldDataHoraVenda;
    }

    public void setjFormattedTextFieldDataHoraVenda(JFormattedTextField jFormattedTextFieldDataHoraVenda) {
        this.jFormattedTextFieldDataHoraVenda = jFormattedTextFieldDataHoraVenda;
    }

    public JFormattedTextField getjFormattedTextFieldValorDesconto() {
        return jFormattedTextFieldValorDesconto;
    }

    public void setjFormattedTextFieldValorDesconto(JFormattedTextField jFormattedTextFieldValorDesconto) {
        this.jFormattedTextFieldValorDesconto = jFormattedTextFieldValorDesconto;
    }

    public JTextField getjTextFieldCodigoCarteirinha() {
        return jTextFieldCodigoCarteirinha;
    }

    public void setjTextFieldCodigoCarteirinha(JTextField jTextFieldCodigoCarteirinha) {
        this.jTextFieldCodigoCarteirinha = jTextFieldCodigoCarteirinha;
    }

    public JTextField getjTextFieldId() {
        return jTextFieldId;
    }

    public void setjTextFieldId(JTextField jTextFieldId) {
        this.jTextFieldId = jTextFieldId;
    }

    public JTextField getjTextFieldNomeCliente() {
        return jTextFieldNomeCliente;
    }

    public void setjTextFieldNomeCliente(JTextField jTextFieldNomeCliente) {
        this.jTextFieldNomeCliente = jTextFieldNomeCliente;
    }

    public JTextField getjTextFieldObservacao() {
        return jTextFieldObservacao;
    }

    public void setjTextFieldObservacao(JTextField jTextFieldObservacao) {
        this.jTextFieldObservacao = jTextFieldObservacao;
    }

    public JTextField getjTextFieldStatus() {
        return jTextFieldStatus;
    }

    public void setjTextFieldStatus(JTextField jTextFieldStatus) {
        this.jTextFieldStatus = jTextFieldStatus;
    }

    public JPanel getjPanelBotoes() {
        return jPanelBotoes;
    }

    public JPanel getjPanelDados() {
        return jPanelDados;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jPanelDados = new javax.swing.JPanel();
        jTextFieldId = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();
        jLabelDataHoraVenda = new javax.swing.JLabel();
        jFormattedTextFieldDataHoraVenda = new javax.swing.JFormattedTextField();
        jLabelTipoDesconto = new javax.swing.JLabel();
        jComboBoxTipoDesconto = new javax.swing.JComboBox<>();
        jLabelValorDesconto = new javax.swing.JLabel();
        jFormattedTextFieldValorDesconto = new javax.swing.JFormattedTextField();
        jLabelObservacao = new javax.swing.JLabel();
        jTextFieldObservacao = new javax.swing.JTextField();
        jLabelStatus = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();
        jLabelCarteirinha = new javax.swing.JLabel();
        jTextFieldCodigoCarteirinha = new javax.swing.JTextField();
        jLabelNomeCliente = new javax.swing.JLabel();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jButtonPesquisarCarteirinha = new javax.swing.JButton();
        jButtonAdicionarCarteirinha = new javax.swing.JButton();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CadastroVenda");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(763, 350));
        setMinimumSize(new java.awt.Dimension(763, 350));
        setResizable(false);

        jPanelFundo.setBackground(new java.awt.Color(147, 216, 67));
        jPanelFundo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(255, 204, 204)));
        jPanelFundo.setMaximumSize(new java.awt.Dimension(763, 350));
        jPanelFundo.setMinimumSize(new java.awt.Dimension(763, 350));

        jPanelDados.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelId.setText("ID");

        jLabelDataHoraVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDataHoraVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDataHoraVenda.setText("Data Emissão");

        try {
            jFormattedTextFieldDataHoraVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelTipoDesconto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTipoDesconto.setText("Tipo Desconto");

        jComboBoxTipoDesconto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTipoDesconto.setSelectedIndex(-1);
        jComboBoxTipoDesconto.setSelectedItem(-1
        );
        jComboBoxTipoDesconto.setActionCommand("");

        jLabelValorDesconto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelValorDesconto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelValorDesconto.setText("V. Desconto");

        jFormattedTextFieldValorDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextFieldValorDesconto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextFieldValorDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldValorDescontoActionPerformed(evt);
            }
        });

        jLabelObservacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelObservacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObservacao.setText("Observação");

        jLabelStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelStatus.setText("Status");

        jLabelCarteirinha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCarteirinha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCarteirinha.setText("Carteirinha");

        jLabelNomeCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNomeCliente.setText("Cliente");

        jTextFieldNomeCliente.setEnabled(false);

        jButtonPesquisarCarteirinha.setText("...");

        jButtonAdicionarCarteirinha.setText("+");

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataHoraVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCarteirinha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelValorDesconto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jTextFieldObservacao)
                        .addGap(7, 7, 7))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldDataHoraVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTipoDesconto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxTipoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jTextFieldCodigoCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisarCarteirinha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAdicionarCarteirinha)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelNomeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataHoraVenda)
                    .addComponent(jFormattedTextFieldDataHoraVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCarteirinha)
                    .addComponent(jTextFieldCodigoCarteirinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionarCarteirinha)
                    .addComponent(jButtonPesquisarCarteirinha)
                    .addComponent(jLabelNomeCliente)
                    .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorDesconto)
                    .addComponent(jFormattedTextFieldValorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoDesconto)
                    .addComponent(jComboBoxTipoDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStatus)
                    .addComponent(jTextFieldStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelObservacao)
                    .addComponent(jTextFieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanelBotoes.setBackground(new java.awt.Color(204, 255, 102));
        jPanelBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonNovo.setBackground(new java.awt.Color(0, 153, 153));
        jButtonNovo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Create.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setActionCommand("0");
        jButtonNovo.setBorder(null);
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonNovo.setMaximumSize(new java.awt.Dimension(71, 28));
        jButtonNovo.setMinimumSize(new java.awt.Dimension(71, 28));
        jButtonNovo.setPreferredSize(new java.awt.Dimension(87, 28));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Down.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setActionCommand("1");
        jButtonSalvar.setBorder(null);
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonSalvar.setPreferredSize(new java.awt.Dimension(87, 28));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setActionCommand("1");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(71, 28));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(71, 28));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConsultar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icones/Find.png"))); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setActionCommand("0");
        jButtonConsultar.setBorder(null);
        jButtonConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonConsultar.setMaximumSize(new java.awt.Dimension(87, 28));
        jButtonConsultar.setMinimumSize(new java.awt.Dimension(87, 28));
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(0, 153, 153));
        jButtonSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Imagens/Exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setActionCommand("0");
        jButtonSair.setBorder(null);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonSair.setMaximumSize(new java.awt.Dimension(71, 28));
        jButtonSair.setMinimumSize(new java.awt.Dimension(71, 28));
        jButtonSair.setPreferredSize(new java.awt.Dimension(87, 28));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelTitulo.setBackground(new java.awt.Color(204, 255, 102));
        jPanelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 102, 102));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Cadastro Venda");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 747, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jFormattedTextFieldValorDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValorDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldValorDescontoActionPerformed

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
            java.util.logging.Logger.getLogger(TemplateCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemplateCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarCarteirinha;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisarCarteirinha;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipoDesconto;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataHoraVenda;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorDesconto;
    private javax.swing.JLabel jLabelCarteirinha;
    private javax.swing.JLabel jLabelDataHoraVenda;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelObservacao;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTipoDesconto;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelValorDesconto;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JTextField jTextFieldCodigoCarteirinha;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldObservacao;
    private javax.swing.JTextField jTextFieldStatus;
    // End of variables declaration//GEN-END:variables
}
