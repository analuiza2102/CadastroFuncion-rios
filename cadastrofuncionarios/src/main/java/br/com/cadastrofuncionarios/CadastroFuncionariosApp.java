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
        frame.setLayout(new BorderLayout());

        // Criar o painel superior
        JPanel painelSuperior = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Margens entre os componentes

        // Linha 1 - Status e Botões
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        painelSuperior.add(new JLabel("Status:"), gbc);

        gbc.gridx = 1;
        JLabel lblStatusValue = new JLabel("Aberta");
        lblStatusValue.setForeground(Color.BLUE);
        painelSuperior.add(lblStatusValue, gbc);

        gbc.gridx = 2;
        JButton btnSalvar = new JButton("Salvar");
        painelSuperior.add(btnSalvar, gbc);

        gbc.gridx = 3;
        JButton btnConcluir = new JButton("Concluir");
        painelSuperior.add(btnConcluir, gbc);

        gbc.gridx = 4;
        JButton btnExcluir = new JButton("Excluir");
        painelSuperior.add(btnExcluir, gbc);

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

        // Adicionar os painéis ao frame
        frame.add(painelSuperior, BorderLayout.NORTH);
        frame.add(tabbedPane, BorderLayout.CENTER);

        // Exibe a tela
        frame.setVisible(true);
    }
}
