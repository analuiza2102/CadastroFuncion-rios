package br.com.cadastrofuncionarios;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AbaDocumentacao extends JPanel {

    public AbaDocumentacao() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Margens entre os componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Definindo a fonte padrão para os componentes
        Font fontLabel = new Font("Arial", Font.PLAIN, 14); // Fonte para JLabels
        Font fontField = new Font("Arial", Font.PLAIN, 14); // Fonte para JTextFields
        Font fontTitle = new Font("Arial", Font.BOLD, 16);  // Fonte para Títulos de painéis

        // Criando e configurando o painel de "RG"
        JPanel painelRG = new JPanel(new GridBagLayout());
        TitledBorder borderRG = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "RG", TitledBorder.LEFT, TitledBorder.TOP);
        borderRG.setTitleFont(fontTitle);
        painelRG.setBorder(borderRG);

        // Linha 1 - RG, Orgão Expedidor, UF, Data Expedição
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblNumeroRG = new JLabel("Número");
        lblNumeroRG.setFont(fontLabel);
        painelRG.add(lblNumeroRG, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtNumeroRG = new JTextField(10);
        txtNumeroRG.setFont(fontField);
        painelRG.add(txtNumeroRG, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblOrgaoExpedidor = new JLabel("Orgão Expedidor");
        lblOrgaoExpedidor.setFont(fontLabel);
        painelRG.add(lblOrgaoExpedidor, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbOrgaoExpedidor = new JComboBox<>(new String[]{"SSP", "DGPC", "DETRAN", "IFP", "PM", "PC", "Outros"});
        cmbOrgaoExpedidor.setFont(fontField);
        painelRG.add(cmbOrgaoExpedidor, gbc);

        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblUF = new JLabel("UF");
        lblUF.setFont(fontLabel);
        painelRG.add(lblUF, gbc);

        gbc.gridx = 6;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbUF = new JComboBox<>(new String[]{"GO", "SP", "RJ", "MG", "RS", "SC", "PR", "DF", "BA", "CE", "PE", "RN", "PB", "SE", "AL", "MA", "PI", "TO", "PA", "AP", "RR", "AM", "AC", "RO", "MT", "MS", "ES", "RN", "Outros"});
        cmbUF.setFont(fontField);
        painelRG.add(cmbUF, gbc);

        gbc.gridx = 7;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataExpedicao = new JLabel("Data Expedição");
        lblDataExpedicao.setFont(fontLabel);
        painelRG.add(lblDataExpedicao, gbc);

        gbc.gridx = 8;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtDataExpedicao = new JTextField(10);
        txtDataExpedicao.setFont(fontField);
        painelRG.add(txtDataExpedicao, gbc);

        // Criando e configurando o painel de "Informação Militar"
        JPanel painelMilitar = new JPanel(new GridBagLayout());
        TitledBorder borderMilitar = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Informação Militar", TitledBorder.LEFT, TitledBorder.TOP);
        borderMilitar.setTitleFont(fontTitle);
        painelMilitar.setBorder(borderMilitar);

        // Linha 2 - Situação Militar, Data Baixa
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblSituacao = new JLabel("Situação");
        lblSituacao.setFont(fontLabel);
        painelMilitar.add(lblSituacao, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtSituacao = new JTextField(10);
        txtSituacao.setFont(fontField);
        painelMilitar.add(txtSituacao, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataBaixa = new JLabel("Data Baixa");
        lblDataBaixa.setFont(fontLabel);
        painelMilitar.add(lblDataBaixa, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtDataBaixa = new JTextField(10);
        txtDataBaixa.setFont(fontField);
        painelMilitar.add(txtDataBaixa, gbc);

        // Criando e configurando o painel de "CNH"
        JPanel painelCNH = new JPanel(new GridBagLayout());
        TitledBorder borderCNH = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "CNH", TitledBorder.LEFT, TitledBorder.TOP);
        borderCNH.setTitleFont(fontTitle);
        painelCNH.setBorder(borderCNH);

        // Linha 3 - Número CNH, Categoria, Data Cadastro, Data Vencimento
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblNumeroCNH = new JLabel("Número");
        lblNumeroCNH.setFont(fontLabel);
        painelCNH.add(lblNumeroCNH, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtNumeroCNH = new JTextField(10);
        txtNumeroCNH.setFont(fontField);
        painelCNH.add(txtNumeroCNH, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblCategoria = new JLabel("Categoria");
        lblCategoria.setFont(fontLabel);
        painelCNH.add(lblCategoria, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtCategoria = new JTextField(5);
        txtCategoria.setFont(fontField);
        painelCNH.add(txtCategoria, gbc);

        gbc.gridx = 6;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataCadastro = new JLabel("Data Cadastro");
        lblDataCadastro.setFont(fontLabel);
        painelCNH.add(lblDataCadastro, gbc);

        gbc.gridx = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtDataCadastro = new JTextField(10);
        txtDataCadastro.setFont(fontField);
        painelCNH.add(txtDataCadastro, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataVencimento = new JLabel("Data Vencimento");
        lblDataVencimento.setFont(fontLabel);
        painelCNH.add(lblDataVencimento, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtDataVencimento = new JTextField(10);
        txtDataVencimento.setFont(fontField);
        painelCNH.add(txtDataVencimento, gbc);

        // Criando e configurando o painel de "Título de Eleitor"
        JPanel painelTituloEleitor = new JPanel(new GridBagLayout());
        TitledBorder borderTituloEleitor = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Título de Eleitor", TitledBorder.LEFT, TitledBorder.TOP);
        borderTituloEleitor.setTitleFont(fontTitle);
        painelTituloEleitor.setBorder(borderTituloEleitor);

        // Linha 4 - Número, Zona, Seção
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblNumeroTitulo = new JLabel("Número");
        lblNumeroTitulo.setFont(fontLabel);
        painelTituloEleitor.add(lblNumeroTitulo, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtNumeroTitulo = new JTextField(10);
        txtNumeroTitulo.setFont(fontField);
        painelTituloEleitor.add(txtNumeroTitulo, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblZona = new JLabel("Zona");
        lblZona.setFont(fontLabel);
        painelTituloEleitor.add(lblZona, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtZona = new JTextField(5);
        txtZona.setFont(fontField);
        painelTituloEleitor.add(txtZona, gbc);

        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblSecao = new JLabel("Seção");
        lblSecao.setFont(fontLabel);
        painelTituloEleitor.add(lblSecao, gbc);

        gbc.gridx = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtSecao = new JTextField(5);
        txtSecao.setFont(fontField);
        painelTituloEleitor.add(txtSecao, gbc);

        // Adicionar os painéis ao painel principal
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(painelRG, gbc);

        gbc.gridy = 1;
        add(painelMilitar, gbc);

        gbc.gridy = 2;
        add(painelCNH, gbc);

        gbc.gridy = 3;
        add(painelTituloEleitor, gbc);

        // Adicionar os outros painéis de forma similar...
    }
}

