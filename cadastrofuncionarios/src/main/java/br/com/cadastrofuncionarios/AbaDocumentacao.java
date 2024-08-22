package br.com.cadastrofuncionarios;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;
import javax.swing.text.MaskFormatter;


public class AbaDocumentacao extends JPanel {

    public AbaDocumentacao() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Criação dos painéis
        JPanel painelRG = criarPainelRG();
        JPanel painelMilitar = criarPainelMilitar();
        JPanel painelCNH = criarPainelCNH();
        JPanel painelTituloEleitor = criarPainelTituloEleitor();

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
    }

    private JPanel criarPainelRG() {
        JPanel painelRG = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        TitledBorder borderRG = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "RG", TitledBorder.LEFT, TitledBorder.TOP);
        borderRG.setTitleFont(new Font("Arial", Font.BOLD, 16));
        painelRG.setBorder(borderRG);

        // Linha 1 - RG, Orgão Expedidor, UF, Data Expedição
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblNumeroRG = new JLabel("Número");
        lblNumeroRG.setFont(new Font("Arial", Font.PLAIN, 14));
        painelRG.add(lblNumeroRG, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JFormattedTextField txtNumeroRG = new JFormattedTextField(createNumberFormatter());
        txtNumeroRG.setColumns(10);
        txtNumeroRG.setFont(new Font("Arial", Font.PLAIN, 14));
        painelRG.add(txtNumeroRG, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblOrgaoExpedidor = new JLabel("Orgão Expedidor");
        lblOrgaoExpedidor.setFont(new Font("Arial", Font.PLAIN, 14));
        painelRG.add(lblOrgaoExpedidor, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbOrgaoExpedidor = new JComboBox<>(new String[]{"SSP", "DGPC", "DETRAN", "IFP", "PM", "PC", "Outros"});
        cmbOrgaoExpedidor.setFont(new Font("Arial", Font.PLAIN, 14));
        painelRG.add(cmbOrgaoExpedidor, gbc);

        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblUF = new JLabel("UF");
        lblUF.setFont(new Font("Arial", Font.PLAIN, 14));
        painelRG.add(lblUF, gbc);

        gbc.gridx = 6;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbUF = new JComboBox<>(new String[]{"GO", "SP", "RJ", "MG", "RS", "SC", "PR", "DF", "BA", "CE", "PE", "RN", "PB", "SE", "AL", "MA", "PI", "TO", "PA", "AP", "RR", "AM", "AC", "RO", "MT", "MS", "ES", "Outros"});
        cmbUF.setFont(new Font("Arial", Font.PLAIN, 14));
        painelRG.add(cmbUF, gbc);

        gbc.gridx = 7;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataExpedicao = new JLabel("Data Expedição");
        lblDataExpedicao.setFont(new Font("Arial", Font.PLAIN, 14));
        painelRG.add(lblDataExpedicao, gbc);

        gbc.gridx = 8;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JFormattedTextField txtDataExpedicao = new JFormattedTextField(createFormatter("##/##/####"));
        txtDataExpedicao.setColumns(10);
        txtDataExpedicao.setFont(new Font("Arial", Font.PLAIN, 14));
        painelRG.add(txtDataExpedicao, gbc);

        return painelRG;
    }

    private JPanel criarPainelMilitar() {
        JPanel painelMilitar = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        TitledBorder borderMilitar = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Informação Militar", TitledBorder.LEFT, TitledBorder.TOP);
        borderMilitar.setTitleFont(new Font("Arial", Font.BOLD, 16));
        painelMilitar.setBorder(borderMilitar);

        // Linha 2 - Situação Militar, Data Baixa
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblSituacao = new JLabel("Situação");
        lblSituacao.setFont(new Font("Arial", Font.PLAIN, 14));
        painelMilitar.add(lblSituacao, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtSituacao = new JTextField(10);
        txtSituacao.setFont(new Font("Arial", Font.PLAIN, 14));
        painelMilitar.add(txtSituacao, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataBaixa = new JLabel("Data Baixa");
        lblDataBaixa.setFont(new Font("Arial", Font.PLAIN, 14));
        painelMilitar.add(lblDataBaixa, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JFormattedTextField txtDataBaixa = new JFormattedTextField(createFormatter("##/##/####"));
        txtDataBaixa.setColumns(10);
        txtDataBaixa.setFont(new Font("Arial", Font.PLAIN, 14));
        painelMilitar.add(txtDataBaixa, gbc);

        return painelMilitar;
    }

    private JPanel criarPainelCNH() {
        JPanel painelCNH = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        TitledBorder borderCNH = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "CNH", TitledBorder.LEFT, TitledBorder.TOP);
        borderCNH.setTitleFont(new Font("Arial", Font.BOLD, 16));
        painelCNH.setBorder(borderCNH);

        // Linha 3 - Número CNH, Categoria, Data Cadastro, Data Vencimento
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblNumeroCNH = new JLabel("Número");
        lblNumeroCNH.setFont(new Font("Arial", Font.PLAIN, 14));
        painelCNH.add(lblNumeroCNH, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JFormattedTextField txtNumeroCNH = new JFormattedTextField(createNumberFormatter());
        txtNumeroCNH.setColumns(10);
        txtNumeroCNH.setFont(new Font("Arial", Font.PLAIN, 14));
        painelCNH.add(txtNumeroCNH, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblCategoria = new JLabel("Categoria");
        lblCategoria.setFont(new Font("Arial", Font.PLAIN, 14));
        painelCNH.add(lblCategoria, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtCategoria = new JTextField(5);
        txtCategoria.setFont(new Font("Arial", Font.PLAIN, 14));
        painelCNH.add(txtCategoria, gbc);

        gbc.gridx = 6;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataCadastro = new JLabel("Data Cadastro");
        lblDataCadastro.setFont(new Font("Arial", Font.PLAIN, 14));
        painelCNH.add(lblDataCadastro, gbc);

        gbc.gridx = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JFormattedTextField txtDataCadastro = new JFormattedTextField(createFormatter("##/##/####"));
        txtDataCadastro.setColumns(10);
        txtDataCadastro.setFont(new Font("Arial", Font.PLAIN, 14));
        painelCNH.add(txtDataCadastro, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataVencimento = new JLabel("Data Vencimento");
        lblDataVencimento.setFont(new Font("Arial", Font.PLAIN, 14));
        painelCNH.add(lblDataVencimento, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JFormattedTextField txtDataVencimento = new JFormattedTextField(createFormatter("##/##/####"));
        txtDataVencimento.setColumns(10);
        txtDataVencimento.setFont(new Font("Arial", Font.PLAIN, 14));
        painelCNH.add(txtDataVencimento, gbc);

        return painelCNH;
    }

    private JPanel criarPainelTituloEleitor() {
        JPanel painelTituloEleitor = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        TitledBorder borderTituloEleitor = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Título de Eleitor", TitledBorder.LEFT, TitledBorder.TOP);
        borderTituloEleitor.setTitleFont(new Font("Arial", Font.BOLD, 16));
        painelTituloEleitor.setBorder(borderTituloEleitor);

        // Linha 4 - Número, Zona, Seção
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblNumeroTitulo = new JLabel("Número");
        lblNumeroTitulo.setFont(new Font("Arial", Font.PLAIN, 14));
        painelTituloEleitor.add(lblNumeroTitulo, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JFormattedTextField txtNumeroTitulo = new JFormattedTextField(createNumberFormatter());
        txtNumeroTitulo.setColumns(10);
        txtNumeroTitulo.setFont(new Font("Arial", Font.PLAIN, 14));
        painelTituloEleitor.add(txtNumeroTitulo, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblZona = new JLabel("Zona");
        lblZona.setFont(new Font("Arial", Font.PLAIN, 14));
        painelTituloEleitor.add(lblZona, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JFormattedTextField txtZona = new JFormattedTextField(createNumberFormatter());
        txtZona.setColumns(5);
        txtZona.setFont(new Font("Arial", Font.PLAIN, 14));
        painelTituloEleitor.add(txtZona, gbc);

        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblSecao = new JLabel("Seção");
        lblSecao.setFont(new Font("Arial", Font.PLAIN, 14));
        painelTituloEleitor.add(lblSecao, gbc);

        gbc.gridx = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JFormattedTextField txtSecao = new JFormattedTextField(createNumberFormatter());
        txtSecao.setColumns(5);
        txtSecao.setFont(new Font("Arial", Font.PLAIN, 14));
        painelTituloEleitor.add(txtSecao, gbc);

        return painelTituloEleitor;
    }

    // Método utilitário para criar um MaskFormatter
    private MaskFormatter createFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
        } catch (java.text.ParseException exc) {
            System.err.println("formatter is bad: " + exc.getMessage());
            System.exit(-1);
        }
        return formatter;
    }

    // Método utilitário para criar um NumberFormatter
    private NumberFormatter createNumberFormatter() {
        NumberFormat format = NumberFormat.getIntegerInstance();
        format.setGroupingUsed(false);
        return new NumberFormatter(format);
    }
}
