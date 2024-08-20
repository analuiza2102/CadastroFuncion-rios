package br.com.cadastrofuncionarios;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AbaOperacional extends JPanel {

    public AbaOperacional() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Aumentando as margens entre os componentes
        gbc.fill = GridBagConstraints.BOTH;

        // Definindo a fonte padrão para os componentes
        Font fontLabel = new Font("Arial", Font.PLAIN, 14);
        Font fontField = new Font("Arial", Font.PLAIN, 14);
        Font fontTitle = new Font("Arial", Font.BOLD, 16);

        // Painel de "Benefícios"
        JPanel painelBeneficios = new JPanel(new GridBagLayout());
        painelBeneficios.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Benefícios", TitledBorder.LEFT, TitledBorder.TOP));
        ((TitledBorder) painelBeneficios.getBorder()).setTitleFont(fontTitle);

        // Adicionando checkboxes ao painel de Benefícios
        String[] beneficios = {"INSS", "FGTS", "IRRF", "Vale Transporte", "Vale Refeição", "Plano de Saúde", 
                               "Reembolso INSS/IRRF", "Empregado Doméstico", "Benefício Previdência - Aposentadoria"};
        for (int i = 0; i < beneficios.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            gbc.anchor = GridBagConstraints.WEST;
            JCheckBox checkBeneficio = new JCheckBox(beneficios[i]);
            checkBeneficio.setFont(fontField);
            painelBeneficios.add(checkBeneficio, gbc);
        }

        // Painel de "Dados Gerais"
        JPanel painelDadosGerais = new JPanel(new GridBagLayout());
        painelDadosGerais.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Dados Gerais", TitledBorder.LEFT, TitledBorder.TOP));
        ((TitledBorder) painelDadosGerais.getBorder()).setTitleFont(fontTitle);

        // Adicionando componentes ao painel de Dados Gerais
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblRacaCor = new JLabel("Raça Cor");
        lblRacaCor.setFont(fontLabel);
        painelDadosGerais.add(lblRacaCor, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbRacaCor = new JComboBox<>(new String[]{"Selecione", "Branca", "Negra", "Parda", "Amarela", "Indígena"});
        cmbRacaCor.setFont(fontField);
        painelDadosGerais.add(cmbRacaCor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblTipoDeficiencia = new JLabel("Tipo de Deficiência");
        lblTipoDeficiencia.setFont(fontLabel);
        painelDadosGerais.add(lblTipoDeficiencia, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbTipoDeficiencia = new JComboBox<>(new String[]{"0", "1", "2", "3", "4"});
        cmbTipoDeficiencia.setFont(fontField);
        painelDadosGerais.add(cmbTipoDeficiencia, gbc);

        // Painel de "Sindicato"
        JPanel painelSindicato = new JPanel(new GridBagLayout());
        painelSindicato.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Sindicato", TitledBorder.LEFT, TitledBorder.TOP));
        ((TitledBorder) painelSindicato.getBorder()).setTitleFont(fontTitle);

        // Adicionando componentes ao painel de Sindicato
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblSindicato = new JLabel("Sindicato");
        lblSindicato.setFont(fontLabel);
        painelSindicato.add(lblSindicato, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtSindicato = new JTextField(20);
        txtSindicato.setFont(fontField);
        painelSindicato.add(txtSindicato, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblMesDissidio = new JLabel("Mês Dissídio");
        lblMesDissidio.setFont(fontLabel);
        painelSindicato.add(lblMesDissidio, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbMesDissidio = new JComboBox<>(new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                                                                         "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"});
        cmbMesDissidio.setFont(fontField);
        painelSindicato.add(cmbMesDissidio, gbc);

        // Painel de "Dados Funcionário"
        JPanel painelDadosFuncionario = new JPanel(new GridBagLayout());
        painelDadosFuncionario.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Dados Funcionário", TitledBorder.LEFT, TitledBorder.TOP));
        ((TitledBorder) painelDadosFuncionario.getBorder()).setTitleFont(fontTitle);

        // Adicionando componentes ao painel de Dados Funcionário
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblFormaPagamento = new JLabel("Forma de Pagamento");
        lblFormaPagamento.setFont(fontLabel);
        painelDadosFuncionario.add(lblFormaPagamento, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbFormaPagamento = new JComboBox<>(new String[]{"Selecione", "Depósito em Conta", "Cheque", "Dinheiro"});
        cmbFormaPagamento.setFont(fontField);
        painelDadosFuncionario.add(cmbFormaPagamento, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblBanco = new JLabel("Banco");
        lblBanco.setFont(fontLabel);
        painelDadosFuncionario.add(lblBanco, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbBanco = new JComboBox<>(new String[]{"Banco do Brasil", "Bradesco", "Itaú", "Santander", "Caixa Econômica"});
        cmbBanco.setFont(fontField);
        painelDadosFuncionario.add(cmbBanco, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblAgencia = new JLabel("Agência");
        lblAgencia.setFont(fontLabel);
        painelDadosFuncionario.add(lblAgencia, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtAgencia = new JTextField(10);
        txtAgencia.setFont(fontField);
        painelDadosFuncionario.add(txtAgencia, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblNumeroConta = new JLabel("Número Conta");
        lblNumeroConta.setFont(fontLabel);
        painelDadosFuncionario.add(lblNumeroConta, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtNumeroConta = new JTextField(10);
        txtNumeroConta.setFont(fontField);
        painelDadosFuncionario.add(txtNumeroConta, gbc);

        // Painel de "Exames Admissionais"
        JPanel painelExames = new JPanel(new GridBagLayout());
        painelExames.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Exames Admissionais", TitledBorder.LEFT, TitledBorder.TOP));
        ((TitledBorder) painelExames.getBorder()).setTitleFont(fontTitle);

        // Adicionando componentes ao painel de Exames Admissionais
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblNomeMedico = new JLabel("Nome Médico");
        lblNomeMedico.setFont(fontLabel);
        painelExames.add(lblNomeMedico, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtNomeMedico = new JTextField(20);
        txtNomeMedico.setFont(fontField);
        painelExames.add(txtNomeMedico, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblCRM = new JLabel("CRM");
        lblCRM.setFont(fontLabel);
        painelExames.add(lblCRM, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtCRM = new JTextField(10);
        txtCRM.setFont(fontField);
        painelExames.add(txtCRM, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataExame = new JLabel("Data Exame");
        lblDataExame.setFont(fontLabel);
        painelExames.add(lblDataExame, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtDataExame = new JTextField(10);
        txtDataExame.setFont(fontField);
        painelExames.add(txtDataExame, gbc);

        // Painel de "Foto"
        JPanel painelFoto = new JPanel(new GridBagLayout());
        painelFoto.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Foto", TitledBorder.LEFT, TitledBorder.TOP));
        ((TitledBorder) painelFoto.getBorder()).setTitleFont(fontTitle);

        // Botões de Selecionar e Limpar Foto
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        JButton btnSelecionarFoto = new JButton("Selecionar");
        painelFoto.add(btnSelecionarFoto, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JButton btnLimparFoto = new JButton("Limpar");
        painelFoto.add(btnLimparFoto, gbc);

        // Adicionar os painéis ao painel principal
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(painelBeneficios, gbc);

        gbc.gridx = 1;
        add(painelSindicato, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        add(painelDadosGerais, gbc);

        gbc.gridx = 1;
        add(painelDadosFuncionario, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        add(painelExames, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        add(painelFoto, gbc);
    }
}


