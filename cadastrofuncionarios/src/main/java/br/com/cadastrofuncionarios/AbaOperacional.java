package cadastrofuncionarios.src.main.java.br.com.cadastrofuncionarios;

import javax.swing.*;
import java.awt.*;

public class AbaOperacional extends JPanel {

    public AbaOperacional() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Linha 1 - CPF e Nome
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("CPF:"), gbc);

        gbc.gridx = 1;
        JTextField cpfField = new JTextField(15);
        add(cpfField, gbc);

        gbc.gridx = 2;
        add(new JLabel("Nome:"), gbc);

        gbc.gridx = 3;
        JTextField nomeField = new JTextField(20);
        add(nomeField, gbc);

        // Linha 2 - Benefícios
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Benefícios:"), gbc);

        gbc.gridy++;
        gbc.gridwidth = 2;
        JCheckBox checkInss = new JCheckBox("INSS");
        add(checkInss, gbc);

        gbc.gridy++;
        JCheckBox checkValeTransporte = new JCheckBox("Vale Transporte");
        add(checkValeTransporte, gbc);

        gbc.gridy++;
        JCheckBox checkValeRefeicao = new JCheckBox("Vale Refeição");
        add(checkValeRefeicao, gbc);
        
        gbc.gridy++;
        JCheckBox checkPlanoSaude = new JCheckBox("Plano de Saúde");
        add(checkPlanoSaude, gbc);
        
        gbc.gridy++;
        JCheckBox checkPlanoOdontologico = new JCheckBox("Plano Odontológico");
        add(checkPlanoOdontologico, gbc);

        gbc.gridy++;
        JCheckBox checkSeguroVida = new JCheckBox("Seguro de Vida");
        add(checkSeguroVida, gbc);

        // COLUNA ao lado direito dos benefícios - Observações

        gbc.gridx = 3;
        gbc.gridy = 1;  
        gbc.gridwidth = 1;
        gbc.gridheight = 6;
        gbc.fill = GridBagConstraints.VERTICAL;

        JTextArea observacoesArea = new JTextArea(6, 20);

        // Adiciona uma barra de rolagem à área de texto
        JScrollPane scrollPane = new JScrollPane(observacoesArea);
        add(scrollPane, gbc);





    }
}
