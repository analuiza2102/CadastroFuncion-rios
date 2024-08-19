package cadastrofuncionarios.src.main.java.br.com.cadastrofuncionarios;

import javax.swing.*;
import java.awt.*;

public class AbaDocumentacao extends JPanel {

    public AbaDocumentacao() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Margens entre os componentes

        // Exemplo de campos que podem estar na aba "Documentação"

        // Linha 1 - Número do Documento e Tipo
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Número do Documento:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JTextField txtNumeroDocumento = new JTextField(15);
        add(txtNumeroDocumento, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Tipo:"), gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JTextField txtTipo = new JTextField(20);
        add(txtTipo, gbc);

        // Linha 2 - Data de Emissão
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(new JLabel("Data de Emissão:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JTextField txtDataEmissao = new JTextField(10);
        add(txtDataEmissao, gbc);

        // Adicione outros componentes necessários para a aba "Documentação"
    }
}
