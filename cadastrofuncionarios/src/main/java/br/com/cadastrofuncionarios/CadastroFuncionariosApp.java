package br.com.cadastrofuncionarios;

import javax.swing.*;
import java.awt.*;

public class CadastroFuncionariosApp {

    public static void main(String[] args) {
        // Configuração básica da janela
        JFrame frame = new JFrame("Funcionários");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela

        // Criar o painel superior
        JPanel painelSuperior = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 2, 2); // Margens entre os componentes

         // Definindo a fonte padrão para os componentes
         Font fontLabel = new Font("Arial", Font.PLAIN, 14); // Fonte para JLabels
         Font fontField = new Font("Arial", Font.PLAIN, 14); // Fonte para JTextFields
         Font fontTitle = new Font("Arial", Font.BOLD, 16);  // Fonte para Títulos de painéis

        // Linha 1 - Status e Botões
        gbc.gridx = 0; // Coluna 0 do grid de componentes, ou seja, a primeira coluna   
        gbc.gridy = 0; // Linha 0 do grid de componentes, ou seja, a primeira linha 
        gbc.gridwidth = 1; // Ocupa 1 coluna do grid 
        gbc.anchor = GridBagConstraints.WEST; // Alinhamento à esquerda 
        JLabel lblStatus = new JLabel("Status:"); // Rótulo "Status" 
        painelSuperior.add(lblStatus, gbc); // Adiciona o rótulo ao painel 

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        JLabel lblStatusValue = new JLabel("Aberta");  // Rótulo com o valor do status 
        lblStatusValue.setForeground(Color.BLUE); // Define a cor do texto para azul
        painelSuperior.add(lblStatusValue, gbc); // Adiciona o rótulo ao painel 

        gbc.gridx = 2; // Coluna 2 do grid de componentes 
        gbc.gridwidth = 1; // Ocupa 1 coluna do grid 
        gbc.gridy = 0; // Linha 0 do grid de componentes
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;
        JButton btnSalvar = new JButton("Salvar"); // Botão "Salvar"
        painelSuperior.add(btnSalvar, gbc); // Adiciona o botão ao painel

        gbc.gridx = 3;
        JButton btnConcluir = new JButton("Concluir"); // Botão "Concluir"
        painelSuperior.add(btnConcluir, gbc); // Adiciona o botão ao painel 

        gbc.gridx = 4;
        JButton btnExcluir = new JButton("Excluir"); // Botão "Excluir" 
        painelSuperior.add(btnExcluir, gbc); // Adiciona o botão ao painel

        gbc.gridx = 5;
        JButton btnOcorrencia = new JButton("Ocorrência");
        painelSuperior.add(btnOcorrencia, gbc);

        gbc.gridx = 6;
        JLabel lblSituacao = new JLabel("Situação:");
        painelSuperior.add(lblSituacao, gbc);

        gbc.gridx = 7;
        JLabel lblSituacaoValue = new JLabel("Ativo");
        lblSituacaoValue.setForeground(Color.GREEN);
        painelSuperior.add(lblSituacaoValue, gbc);

        gbc.gridx = 8;
        JButton btnFechar = new JButton("Fechar");
        painelSuperior.add(btnFechar, gbc);

        // Linha 2 - CPF e Nome
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        painelSuperior.add(new JLabel("CPF:"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JTextField txtCPF = new JTextField(15);
        painelSuperior.add(txtCPF, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        painelSuperior.add(new JLabel("Nome:"), gbc);

        gbc.gridx = 4;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JTextField txtNome = new JTextField(25);
        painelSuperior.add(txtNome, gbc);

        // Criação do JTabbedPane para as abas
        JTabbedPane tabbedPane = new JTabbedPane();

        // Adiciona as abas utilizando as classes separadas
        tabbedPane.addTab("Principal", new AbaPrincipal());
        tabbedPane.addTab("Documentação", new AbaDocumentacao());
        tabbedPane.addTab("Contrato", new AbaContrato());
        tabbedPane.addTab("Operacional", new AbaOperacional());

        // Colocar o JTabbedPane dentro de um JScrollPane
        JScrollPane scrollPane = new JScrollPane(tabbedPane);
        //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Adicionar os painéis ao frame
        frame.setLayout(new BorderLayout());
        frame.add(painelSuperior, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Exibe a tela
        frame.setVisible(true);
    }
}
