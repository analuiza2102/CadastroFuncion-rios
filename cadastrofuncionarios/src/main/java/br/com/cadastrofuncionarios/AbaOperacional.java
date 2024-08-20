package br.com.cadastrofuncionarios;

import javax.swing.*;
import java.awt.*;

public class AbaOperacional extends JPanel {

    public AbaOperacional() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Ajuste das margens entre os componentes
        gbc.fill = GridBagConstraints.BOTH; // Ajuste para que os componentes preencham mais espaço

       

        // Painel de "Dados Funcionário"
        JPanel painelDadosFuncionario = new JPanel(new GridBagLayout());
        painelDadosFuncionario.setBorder(BorderFactory.createTitledBorder("Dados Funcionário"));
        GridBagConstraints gbcDadosFuncionario = new GridBagConstraints();
        gbcDadosFuncionario.insets = new Insets(5, 5, 5, 5);
        gbcDadosFuncionario.fill = GridBagConstraints.HORIZONTAL;

        // Nome
        gbcDadosFuncionario.gridx = 0; // Coluna 0 (esquerda) do grid de componentes do painel "Dados Funcionário"; 0 é a primeira coluna
        gbcDadosFuncionario.gridy = 0; // Linha 0 (topo) do grid de componentes do painel "Dados Funcionário"; 0 é a primeira linha
        painelDadosFuncionario.add(new JLabel("Nome:"), gbcDadosFuncionario); // Adiciona um rótulo "Nome" ao painel "Dados Funcionário"

        gbcDadosFuncionario.gridx = 1; // Coluna 1 do grid de componentes do painel "Dados Funcionário" 
        gbcDadosFuncionario.gridwidth = 2; // Ocupa 2 colunas do grid
        JTextField txtNome = new JTextField(20); // Cria um campo de texto com 20 colunas
        painelDadosFuncionario.add(txtNome, gbcDadosFuncionario); // Adiciona o campo de texto ao painel "Dados Funcionário"

        // Raça Cor
        gbcDadosFuncionario.gridx = 0; // Coluna 0 do grid de componentes do painel "Dados Funcionário", a primeira coluna
        gbcDadosFuncionario.gridy = 1;   // Linha 1 do grid de componentes do painel "Dados Funcionário", a segunda linha
        gbcDadosFuncionario.gridwidth = 1; // Ocupa 1 coluna do grid
        painelDadosFuncionario.add(new JLabel("Raça/Cor:"), gbcDadosFuncionario);

        gbcDadosFuncionario.gridx = 2;  // Coluna 2 do grid de componentes do painel "Dados Funcionário" 
        gbcDadosFuncionario.gridwidth = 2;
        JComboBox<String> cmbRacaCor = new JComboBox<>(new String[]{"Selecione", "Branco", " Indigena", "Pardo", "Preto", "Amarelo"});
        painelDadosFuncionario.add(cmbRacaCor, gbcDadosFuncionario);

        // Tipo de Deficiência
        gbcDadosFuncionario.gridx = 0;  // Coluna 0 do grid de componentes do painel "Dados Funcionário" 
        gbcDadosFuncionario.gridy = 2; // Linha 2 do grid de componentes do painel "Dados Funcionário"
        painelDadosFuncionario.add(new JLabel("Tipo de Deficiência:"), gbcDadosFuncionario); // Adiciona um rótulo "Tipo de Deficiência" ao painel "Dados Funcionário"

        gbcDadosFuncionario.gridx = 2; 
        gbcDadosFuncionario.gridwidth = 2; 
        JComboBox<String> cmbTipoDeficiencia = new JComboBox<>(new String[]{"Selecione", "I- Deficiência Física", "II- Deficiência Auditiva", "III- Deficiência Visual", "IV- Deficiência Intelectual", "V- Deficiência Múltipla", "VI- Reabilitado", "VII- Não se aplica"});
        painelDadosFuncionario.add(cmbTipoDeficiencia, gbcDadosFuncionario);

        // Painel de "Informações Bancárias"
        JPanel painelInfoBancarias = new JPanel(new GridBagLayout()); 
        painelInfoBancarias.setBorder(BorderFactory.createTitledBorder("Informações Bancárias")); 
        GridBagConstraints gbcInfoBancarias = new GridBagConstraints();     
        gbcInfoBancarias.insets = new Insets(5, 5, 5, 5); // Ajuste das margens entre os componentes do painel "Informações Bancárias" 
        gbcInfoBancarias.fill = GridBagConstraints.HORIZONTAL; // Ajuste para que os componentes preencham mais espaço 

        // Forma de Pagamento 
        gbcInfoBancarias.gridx = 0;     
        gbcInfoBancarias.gridy = 0;
        painelInfoBancarias.add(new JLabel("Forma de Pagamento:"), gbcInfoBancarias);

        gbcInfoBancarias.gridx = 1;
        gbcInfoBancarias.gridwidth = 2;
        JComboBox<String> cmbFormaPagamento = new JComboBox<>(new String[]{"Selecione", "Crédito em Conta", "Cheque", "Dinheiro"});
        painelInfoBancarias.add(cmbFormaPagamento, gbcInfoBancarias);

        // Banco
        gbcInfoBancarias.gridx = 0;
        gbcInfoBancarias.gridy = 1;
        painelInfoBancarias.add(new JLabel("Banco:"), gbcInfoBancarias);

        gbcInfoBancarias.gridx = 1;
        gbcInfoBancarias.gridwidth = 2;
        JComboBox<String> cmbBanco = new JComboBox<>(new String[]{"Selecione", "Banco do Brasil", "Bradesco", "Caixa Econômica", "Itaú", "Santander"});
        painelInfoBancarias.add(cmbBanco, gbcInfoBancarias);

        // Agência e Número da Conta
        gbcInfoBancarias.gridx = 0;
        gbcInfoBancarias.gridy = 2;
        painelInfoBancarias.add(new JLabel("Agência:"), gbcInfoBancarias);

        gbcInfoBancarias.gridx = 1;
        gbcInfoBancarias.gridwidth = 1;
        JTextField txtAgencia = new JTextField(5);
        painelInfoBancarias.add(txtAgencia, gbcInfoBancarias);

        gbcInfoBancarias.gridx = 2;
        painelInfoBancarias.add(new JLabel("Número Conta:"), gbcInfoBancarias);

        gbcInfoBancarias.gridx = 3;
        gbcInfoBancarias.gridwidth = 2;
        JTextField txtNumeroConta = new JTextField(10);
        painelInfoBancarias.add(txtNumeroConta, gbcInfoBancarias);

        // Painel de "Exames Admissionais"
        JPanel painelExames = new JPanel(new GridBagLayout());
        painelExames.setBorder(BorderFactory.createTitledBorder("Exames Admissionais"));
        GridBagConstraints gbcExames = new GridBagConstraints();
        gbcExames.insets = new Insets(5, 5, 5, 5);
        gbcExames.fill = GridBagConstraints.HORIZONTAL;

        // Nome Médico
        gbcExames.gridx = 0;
        gbcExames.gridy = 0;
        painelExames.add(new JLabel("Nome Médico:"), gbcExames);

        gbcExames.gridx = 1;
        gbcExames.gridwidth = 2;
        JTextField txtNomeMedico = new JTextField(20);
        painelExames.add(txtNomeMedico, gbcExames);

        // CRM
        gbcExames.gridx = 0;
        gbcExames.gridy = 1;
        painelExames.add(new JLabel("CRM:"), gbcExames);

        gbcExames.gridx = 1;
        gbcExames.gridwidth = 2;
        JTextField txtCRM = new JTextField(10);
        painelExames.add(txtCRM, gbcExames);

        // Data Exame
        gbcExames.gridx = 0;
        gbcExames.gridy = 2;
        painelExames.add(new JLabel("Data Exame:"), gbcExames);

        gbcExames.gridx = 1;
        gbcExames.gridwidth = 2;
        JTextField txtDataExame = new JTextField(10);
        painelExames.add(txtDataExame, gbcExames);

     // Painel Sindicato
        JPanel painelSindicato = new JPanel(new GridBagLayout());
        painelSindicato.setBorder(BorderFactory.createTitledBorder("Sindicato"));

        GridBagConstraints gbcSindicato = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Linha 1 - Rótulo Sindicato
        gbc.gridx = 0;
        gbc.gridy = 0;
        painelSindicato.add(new JLabel("Sindicato:"), gbc);

        // Linha 2 - Campo Sindicato
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        JComboBox<String> cmbSindicato = new JComboBox<>(new String[]{"SINDICATO FUNCIONAL", "SINDICATO DOS BANCÁRIOS", "SINDICATO DOS COMERCIÁRIOS", "SINDICATO DOS METALÚRGICOS", "SINDICATO DOS MOTORISTAS", "SINDICATO DOS PROFESSORES", "SINDICATO DOS SERVIDORES PÚBLICOS", "SINDICATO DOS TRABALHADORES RURAIS", "SINDICATO DOS VIGILANTES", "OUTROS"});
        painelSindicato.add(cmbSindicato, gbc);

        // Linha 1 - Rótulo Mês Dissídio
        gbc.gridx = 2; // Coluna 2 do grid de componentes do painel "Sindicato", ocupando a terceira coluna e a primeira linha do grid de componentes
        gbc.gridy = 0; // Linha 0 do grid de componentes do painel "Sindicato", ocupando a primeira linha do grid de componentes 
        gbc.gridwidth = 1; // Ocupa 1 coluna do grid de componentes 
        painelSindicato.add(new JLabel("Mês Dissídio:"), gbc);

        // Linha 2 - Campo Mês Dissídio
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        JComboBox<String> cmbMesDissidio = new JComboBox<>(new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"});
        painelSindicato.add(cmbMesDissidio, gbc);

       // Painel de "Foto"
       JPanel painelFoto = new JPanel(new GridBagLayout());
       painelFoto.setBorder(BorderFactory.createTitledBorder("Foto"));
       GridBagConstraints gbcFoto = new GridBagConstraints();
       gbcFoto.insets = new Insets(5, 5, 5, 5);
       gbcFoto.fill = GridBagConstraints.HORIZONTAL;

       // Botões de Selecionar e Limpar Foto
       gbcFoto.gridx = 0;
       gbcFoto.gridy = 0;
       gbcFoto.gridwidth = 2;
       painelFoto.add(new JButton("Selecionar"), gbcFoto);

       gbcFoto.gridy = 1;
       painelFoto.add(new JButton("Limpar"), gbcFoto);

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
}





