package br.com.cadastrofuncionarios;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DecimalFormat;
import java.io.File;

public class AbaOperacional extends JPanel {

    public AbaOperacional() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.BOTH;

        // Painel de "Dados Funcionário"
        JPanel painelDadosFuncionario = criarPainelDadosFuncionario();
        JPanel painelInfoBancarias = criarPainelInfoBancarias();
        JPanel painelExames = criarPainelExames();
        JPanel painelSindicato = criarPainelSindicato();
        JPanel painelFoto = criarPainelFoto();

        // Adicionar todos os painéis ao painel principal
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(painelDadosFuncionario, gbc);

        gbc.gridy = 1;
        add(painelInfoBancarias, gbc);

        gbc.gridy = 2;
        add(painelExames, gbc);

        gbc.gridy = 3;
        add(painelSindicato, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 4;
        add(painelFoto, gbc);
    }

    // Métodos para criar cada painel
    private JPanel criarPainelDadosFuncionario() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createTitledBorder("Dados Funcionário"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Nome
        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(new JLabel("Nome:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        JTextField txtNome = new JTextField(20);
        painel.add(txtNome, gbc);

        // Raça/Cor
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        painel.add(new JLabel("Raça/Cor:"), gbc);
        gbc.gridx = 2;
        gbc.gridwidth = 2;
        JComboBox<String> cmbRacaCor = new JComboBox<>(new String[]{"Selecione", "Branco", "Indígena", "Pardo", "Preto", "Amarelo"});
        painel.add(cmbRacaCor, gbc);

        // Tipo de Deficiência
        gbc.gridx = 0;
        gbc.gridy = 2;
        painel.add(new JLabel("Tipo de Deficiência:"), gbc);
        gbc.gridx = 2;
        gbc.gridwidth = 2;
        JComboBox<String> cmbTipoDeficiencia = new JComboBox<>(new String[]{"Selecione", "I- Deficiência Física", "II- Deficiência Auditiva", "III- Deficiência Visual", "IV- Deficiência Intelectual", "V- Deficiência Múltipla", "VI- Reabilitado", "VII- Não se aplica"});
        painel.add(cmbTipoDeficiencia, gbc);

        return painel;
    }

    private JPanel criarPainelInfoBancarias() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createTitledBorder("Informações Bancárias"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
    
        // Forma de Pagamento
        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(new JLabel("Forma de Pagamento:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        JComboBox<String> cmbFormaPagamento = new JComboBox<>(new String[]{"Selecione", "Crédito em Conta", "Cheque", "Dinheiro"});
        painel.add(cmbFormaPagamento, gbc);
    
        // Banco
        gbc.gridx = 0;
        gbc.gridy = 1;
        painel.add(new JLabel("Banco:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        JComboBox<String> cmbBanco = new JComboBox<>(new String[]{"Selecione", "Banco do Brasil", "Bradesco", "Caixa Econômica", "Itaú", "Santander"});
        painel.add(cmbBanco, gbc);
    
        // Agência e Número da Conta
        gbc.gridx = 0;
        gbc.gridy = 2;
        painel.add(new JLabel("Agência:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 1;
    
        // Campo de Agência com restrição para apenas números
        try {
            MaskFormatter agenciaFormatter = new MaskFormatter("#####"); // 5 dígitos
            agenciaFormatter.setPlaceholderCharacter('0');
            JFormattedTextField txtAgencia = new JFormattedTextField(agenciaFormatter);
            txtAgencia.setColumns(5);
            painel.add(txtAgencia, gbc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        gbc.gridx = 2;
        painel.add(new JLabel("Número Conta:"), gbc);
        gbc.gridx = 3;
        gbc.gridwidth = 2;
    
        // Campo de Número da Conta com restrição para apenas números
        try {
            MaskFormatter numeroContaFormatter = new MaskFormatter("##########"); // 10 dígitos
            numeroContaFormatter.setPlaceholderCharacter('0');
            JFormattedTextField txtNumeroConta = new JFormattedTextField(numeroContaFormatter);
            txtNumeroConta.setColumns(10);
            painel.add(txtNumeroConta, gbc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return painel;
    }
    

    private JPanel criarPainelExames() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createTitledBorder("Exames Admissionais"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Nome Médico
        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(new JLabel("Nome Médico:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        JTextField txtNomeMedico = new JTextField(20);
        painel.add(txtNomeMedico, gbc);

        // CRM
        gbc.gridx = 0;
        gbc.gridy = 1;
        painel.add(new JLabel("CRM:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        JFormattedTextField txtCRM = new JFormattedTextField(new NumberFormatter(new DecimalFormat("#0")));
        txtCRM.setColumns(10);
        painel.add(txtCRM, gbc);

        // Data Exame
        gbc.gridx = 0;
        gbc.gridy = 2;
        painel.add(new JLabel("Data Exame:"), gbc);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        try {
            MaskFormatter dateFormatter = new MaskFormatter("##/##/####");
            JFormattedTextField txtDataExame = new JFormattedTextField(dateFormatter);
            txtDataExame.setColumns(10);
            painel.add(txtDataExame, gbc);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return painel;
    }

    private JPanel criarPainelSindicato() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createTitledBorder("Sindicato"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Sindicato
        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(new JLabel("Sindicato:"), gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        JComboBox<String> cmbSindicato = new JComboBox<>(new String[]{"SINDICATO FUNCIONAL", "SINDICATO DOS BANCÁRIOS", "SINDICATO DOS COMERCIÁRIOS", "SINDICATO DOS METALÚRGICOS", "SINDICATO DOS MOTORISTAS", "SINDICATO DOS PROFESSORES", "SINDICATO DOS SERVIDORES PÚBLICOS", "SINDICATO DOS TRABALHADORES RURAIS", "SINDICATO DOS VIGILANTES", "OUTROS"});
        painel.add(cmbSindicato, gbc);

        // Mês Dissídio
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        painel.add(new JLabel("Mês Dissídio:"), gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        JComboBox<String> cmbMesDissidio = new JComboBox<>(new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"});
        painel.add(cmbMesDissidio, gbc);

        return painel;
    }

    private JPanel criarPainelFoto() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createTitledBorder("Foto"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
    
        JLabel lblFoto = new JLabel();
        lblFoto.setHorizontalAlignment(JLabel.CENTER);
        lblFoto.setPreferredSize(new Dimension(150, 150));
        lblFoto.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    
        // Botão para selecionar a foto
        JButton btnSelecionarFoto = new JButton("Selecionar");
        btnSelecionarFoto.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int result = fileChooser.showOpenDialog(null);
    
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());
                Image image = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                lblFoto.setIcon(new ImageIcon(image));
            }
        });
    
        // Botão para limpar a foto
        JButton btnLimparFoto = new JButton("Limpar");
        btnLimparFoto.addActionListener(e -> lblFoto.setIcon(null));
    
        // Adiciona o JLabel de foto ao painel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2; // Deixa o JLabel ocupar duas colunas
        gbc.anchor = GridBagConstraints.CENTER;
        painel.add(lblFoto, gbc);
    
        // Adiciona o botão "Selecionar"
        gbc.gridy = 1;
        gbc.gridwidth = 1; // Cada botão ocupa uma coluna
        gbc.anchor = GridBagConstraints.LINE_START;
        painel.add(btnSelecionarFoto, gbc);
    
        // Adiciona o botão "Limpar"
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        painel.add(btnLimparFoto, gbc);
    
        return painel;
    }
}    
