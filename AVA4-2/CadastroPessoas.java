
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CadastroPessoas {

    private CadastroUsuarios cadastroUsuarios;

    public CadastroPessoas() {
    }

    public static void abrirCadastroPessoas(JFrame principal) {
        JDialog cadastroPessoas = new JDialog(principal, "Cadastro de Pessoa", true);
        cadastroPessoas.setSize(600, 300);
        cadastroPessoas.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Cadastro de Pessoa", SwingConstants.CENTER);
        cadastroPessoas.add(titulo, BorderLayout.NORTH);

        JPanel painelCampos = new JPanel(new GridLayout(7, 2, 5, 5));
        painelCampos.add(new JLabel("Nome:"));
        painelCampos.add(new JTextField(40));
        painelCampos.add(new JLabel("Endereço:"));
        painelCampos.add(new JTextField(60));
        painelCampos.add(new JLabel("Cidade:"));
        painelCampos.add(new JTextField(40));
        painelCampos.add(new JLabel("UF:"));
        painelCampos.add(new JTextField(2));
        painelCampos.add(new JLabel("Email:"));
        painelCampos.add(new JTextField(30));
        painelCampos.add(new JLabel("Telefone:"));
        painelCampos.add(new JTextField(20));
        painelCampos.add(new JLabel("Sexo:"));
        JComboBox<String> comboSexo = new JComboBox<>(new String[]{"Masculino", "Feminino"});
        painelCampos.add(comboSexo);

        JPanel painelBotoes = CadastroUsuarios.criarPainelBotoes(cadastroPessoas);

        cadastroPessoas.add(painelCampos, BorderLayout.CENTER);
        cadastroPessoas.add(painelBotoes, BorderLayout.SOUTH);
        cadastroPessoas.setLocationRelativeTo(principal);
        cadastroPessoas.setVisible(true);
    }

}
