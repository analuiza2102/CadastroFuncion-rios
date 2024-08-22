package br.com.cadastrofuncionarios;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AbaPrincipal extends JPanel {

    public AbaPrincipal() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Criação dos painéis
        JPanel painelDadosGerais = criarPainelDadosGerais();
        JPanel painelEndereco = criarPainelEndereco();

        // Adicionar os painéis ao painel principal
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(painelDadosGerais, gbc);

        gbc.gridy = 1;
        add(painelEndereco, gbc);
    }

    // Método para criar o painel de "Dados Gerais"
    private JPanel criarPainelDadosGerais() {
        JPanel painelDadosGerais = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Configurando a borda e o título do painel
        TitledBorder borderDadosGerais = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Dados Gerais", TitledBorder.LEFT, TitledBorder.TOP);
        borderDadosGerais.setTitleFont(new Font("Arial", Font.BOLD, 16));
        painelDadosGerais.setBorder(borderDadosGerais);

        // Linha 1 - Empresa e Divisão RH
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblEmpresa = new JLabel("Empresa");
        lblEmpresa.setFont(new Font("Arial", Font.PLAIN, 14));
        painelDadosGerais.add(lblEmpresa, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbEmpresa = new JComboBox<>(new String[]{"1000 - EMPRESA RH", "1001 - EMPRESA FINANCEIRA", "1002 - EMPRESA DE TECNOLOGIA", "1003 - EMPRESA DE LOGÍSTICA", "1004 - EMPRESA DE MARKETING", "1005 - EMPRESA DE VENDAS"});
        cmbEmpresa.setFont(new Font("Arial", Font.PLAIN, 14));
        painelDadosGerais.add(cmbEmpresa, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDivisao = new JLabel("Divisão RH");
        lblDivisao.setFont(new Font("Arial", Font.PLAIN, 14));
        painelDadosGerais.add(lblDivisao, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbDivisao = new JComboBox<>(new String[]{"1001 - ADMINISTRAÇÃO", "1002 - FINANCEIRO", "1003 - TECNOLOGIA", "1004 - LOGÍSTICA", "1005 - MARKETING", "1006 - VENDAS"});
        cmbDivisao.setFont(new Font("Arial", Font.PLAIN, 14));
        painelDadosGerais.add(cmbDivisao, gbc);

        // Linha 2 - Matrícula e Funcionário
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblMatricula = new JLabel("Matrícula");
        lblMatricula.setFont(new Font("Arial", Font.PLAIN, 14));
        painelDadosGerais.add(lblMatricula, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtMatricula = new JTextField("", 5);
        txtMatricula.setFont(new Font("Arial", Font.PLAIN, 14));
        painelDadosGerais.add(txtMatricula, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblFuncionario = new JLabel("Funcionário");
        lblFuncionario.setFont(new Font("Arial", Font.PLAIN, 14));
        painelDadosGerais.add(lblFuncionario, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtFuncionario = new JTextField("", 25);
        txtFuncionario.setFont(new Font("Arial", Font.PLAIN, 14));
        painelDadosGerais.add(txtFuncionario, gbc);

        return painelDadosGerais;
    }

    // Método para criar o painel de "Endereço"
    private JPanel criarPainelEndereco() {
        JPanel painelEndereco = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Configurando a borda e o título do painel
        TitledBorder borderEndereco = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Endereço", TitledBorder.LEFT, TitledBorder.TOP);
        borderEndereco.setTitleFont(new Font("Arial", Font.BOLD, 16));
        painelEndereco.setBorder(borderEndereco);

        // Linha 3 - CEP e Endereço
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblCEP = new JLabel("CEP");
        lblCEP.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(lblCEP, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtCEP = new JTextField("", 8);
        txtCEP.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(txtCEP, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblEndereco = new JLabel("Endereço");
        lblEndereco.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(lblEndereco, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtEndereco = new JTextField("", 30);
        txtEndereco.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(txtEndereco, gbc);

        // Linha 4 - Número, Bairro e Município
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblNumero = new JLabel("Nº");
        lblNumero.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(lblNumero, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtNumero = new JTextField("", 5);
        txtNumero.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(txtNumero, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblBairro = new JLabel("Bairro");
        lblBairro.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(lblBairro, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtBairro = new JTextField("", 20);
        txtBairro.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(txtBairro, gbc);

        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblMunicipio = new JLabel("Município");
        lblMunicipio.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(lblMunicipio, gbc);

        gbc.gridx = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtMunicipio = new JTextField("", 20);
        txtMunicipio.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(txtMunicipio, gbc);

        // Linha 5 - Telefone e Email
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblTelefone = new JLabel("Telefone");
        lblTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(lblTelefone, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtTelefone = new JTextField("", 15);
        txtTelefone.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(txtTelefone, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblCelular = new JLabel("Celular");
        lblCelular.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(lblCelular, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtTelefoneCelular = new JTextField("", 15);
        txtTelefoneCelular.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(txtTelefoneCelular, gbc);

        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(lblEmail, gbc);

        gbc.gridx = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtEmail = new JTextField("", 20);
        txtEmail.setFont(new Font("Arial", Font.PLAIN, 14));
        painelEndereco.add(txtEmail, gbc);

        return painelEndereco;
    }
}
