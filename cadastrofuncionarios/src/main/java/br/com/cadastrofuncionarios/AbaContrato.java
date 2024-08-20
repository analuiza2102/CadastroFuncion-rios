package br.com.cadastrofuncionarios;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AbaContrato extends JPanel {

    public AbaContrato() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Margens entre os componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Definindo a fonte padrão para os componentes
        Font fontLabel = new Font("Arial", Font.PLAIN, 14); // Fonte para JLabels
        Font fontField = new Font("Arial", Font.PLAIN, 14); // Fonte para JTextFields e JComboBox
        Font fontTitle = new Font("Arial", Font.BOLD, 16);  // Fonte para Títulos de painéis

        // Painel de "Vínculo"
        JPanel painelVinculo = new JPanel(new GridBagLayout());
        TitledBorder borderVinculo = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Vínculo", TitledBorder.LEFT, TitledBorder.TOP);
        borderVinculo.setTitleFont(fontTitle);
        painelVinculo.setBorder(borderVinculo);

        // Linha 1 - Tipo de Vínculo e Tipo de Admissão
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblVinculo = new JLabel("Tipo de Vínculo");
        lblVinculo.setFont(fontLabel);
        painelVinculo.add(lblVinculo, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbVinculo = new JComboBox<>(new String[]{"Selecione"});
        cmbVinculo.setFont(fontField);
        painelVinculo.add(cmbVinculo, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblTipoAdmissao = new JLabel("Tipo de Admissão");
        lblTipoAdmissao.setFont(fontLabel);
        painelVinculo.add(lblTipoAdmissao, gbc);

        gbc.gridx = 5;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbTipoAdmissao = new JComboBox<>(new String[]{"Selecione"});
        cmbTipoAdmissao.setFont(fontField);
        painelVinculo.add(cmbTipoAdmissao, gbc);

        // Linha 2 - Data Admissão, Tipo de Salário, Horário, Hrs. Sem.
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataAdmissao = new JLabel("Data Admissão");
        lblDataAdmissao.setFont(fontLabel);
        painelVinculo.add(lblDataAdmissao, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtDataAdmissao = new JTextField(10);
        txtDataAdmissao.setFont(fontField);
        painelVinculo.add(txtDataAdmissao, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblTipoSalario = new JLabel("Tipo de Salário");
        lblTipoSalario.setFont(fontLabel);
        painelVinculo.add(lblTipoSalario, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbTipoSalario = new JComboBox<>(new String[]{"Selecione"});
        cmbTipoSalario.setFont(fontField);
        painelVinculo.add(cmbTipoSalario, gbc);

        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblHorario = new JLabel("Horário");
        lblHorario.setFont(fontLabel);
        painelVinculo.add(lblHorario, gbc);

        gbc.gridx = 6;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbHorario = new JComboBox<>(new String[]{"Selecione"});
        cmbHorario.setFont(fontField);
        painelVinculo.add(cmbHorario, gbc);

        gbc.gridx = 7;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblHrsSem = new JLabel("Hrs. Sem.");
        lblHrsSem.setFont(fontLabel);
        painelVinculo.add(lblHrsSem, gbc);

        gbc.gridx = 8;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtHrsSem = new JTextField(5);
        txtHrsSem.setFont(fontField);
        painelVinculo.add(txtHrsSem, gbc);

        // Painel de "Cargo"
        JPanel painelCargo = new JPanel(new GridBagLayout());
        TitledBorder borderCargo = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Cargo", TitledBorder.LEFT, TitledBorder.TOP);
        borderCargo.setTitleFont(fontTitle);
        painelCargo.setBorder(borderCargo);

        // Linha 3 - Cargo, Departamento, Categoria GFIP
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblCargo = new JLabel("Cargo");
        lblCargo.setFont(fontLabel);
        painelCargo.add(lblCargo, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbCargo = new JComboBox<>(new String[]{"Selecione"});
        cmbCargo.setFont(fontField);
        painelCargo.add(cmbCargo, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDepartamento = new JLabel("Departamento");
        lblDepartamento.setFont(fontLabel);
        painelCargo.add(lblDepartamento, gbc);

        gbc.gridx = 5;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbDepartamento = new JComboBox<>(new String[]{"Selecione"});
        cmbDepartamento.setFont(fontField);
        painelCargo.add(cmbDepartamento, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblCategoriaGFIP = new JLabel("Categoria GFIP");
        lblCategoriaGFIP.setFont(fontLabel);
        painelCargo.add(lblCategoriaGFIP, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JComboBox<String> cmbCategoriaGFIP = new JComboBox<>(new String[]{"Selecione"});
        cmbCategoriaGFIP.setFont(fontField);
        painelCargo.add(cmbCategoriaGFIP, gbc);

        // Painel de "Rescisão"
        JPanel painelRescisao = new JPanel(new GridBagLayout());
        TitledBorder borderRescisao = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Rescisão", TitledBorder.LEFT, TitledBorder.TOP);
        borderRescisao.setTitleFont(fontTitle);
        painelRescisao.setBorder(borderRescisao);

        // Linha 4 - Data Demissão, Motivo Demissão, etc.
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataDemissao = new JLabel("Data Demissão");
        lblDataDemissao.setFont(fontLabel);
        painelRescisao.add(lblDataDemissao, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtDataDemissao = new JTextField(10);
        txtDataDemissao.setFont(fontField);
        painelRescisao.add(txtDataDemissao, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblMotivoDemissao = new JLabel("Motivo Demissão");
        lblMotivoDemissao.setFont(fontLabel);
        painelRescisao.add(lblMotivoDemissao, gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtMotivoDemissao = new JTextField(20);
        txtMotivoDemissao.setFont(fontField);
        painelRescisao.add(txtMotivoDemissao, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblAvisoPrevio = new JLabel("Aviso Prévio");
        lblAvisoPrevio.setFont(fontLabel);
        painelRescisao.add(lblAvisoPrevio, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        JCheckBox chkAvisoPrevio = new JCheckBox();
        painelRescisao.add(chkAvisoPrevio, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataAvisoInicio = new JLabel("Data Aviso Início");
        lblDataAvisoInicio.setFont(fontLabel);
        painelRescisao.add(lblDataAvisoInicio, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtDataAvisoInicio = new JTextField(10);
        txtDataAvisoInicio.setFont(fontField);
        painelRescisao.add(txtDataAvisoInicio, gbc);

        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblDataAvisoFim = new JLabel("Data Aviso Fim");
        lblDataAvisoFim.setFont(fontLabel);
        painelRescisao.add(lblDataAvisoFim, gbc);

        gbc.gridx = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        JTextField txtDataAvisoFim = new JTextField(10);
        txtDataAvisoFim.setFont(fontField);
        painelRescisao.add(txtDataAvisoFim, gbc);

        // Adicionar os painéis ao painel principal
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(painelVinculo, gbc);

        gbc.gridy = 1;
        add(painelCargo, gbc);

        gbc.gridy = 2;
        add(painelRescisao, gbc);

        
    }
}
