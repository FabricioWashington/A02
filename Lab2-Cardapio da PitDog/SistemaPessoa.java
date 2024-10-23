import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class SistemaPessoa extends JFrame {
    public SistemaPessoa() {
        // Configurações da Janela Principal
        setTitle("Sistema de Pessoa");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // Menus principais
        JMenu cadastroMenu = new JMenu("Cadastro");
        JMenu visualizacaoMenu = new JMenu("Visualização");
        JMenu sairMenu = new JMenu("Sair"); // Menu "Sair" diretamente

        // Submenus de Cadastro e Visualização
        JMenuItem usuariosMenuItem = new JMenuItem("Usuários");
        JMenuItem pessoasMenuItem = new JMenuItem("Pessoas");
        JMenuItem listaUsuariosItem = new JMenuItem("Lista de Usuário");
        JMenuItem listaPessoasItem = new JMenuItem("Lista de Pessoas");

        // Adiciona submenus aos menus principais
        cadastroMenu.add(usuariosMenuItem);
        cadastroMenu.add(pessoasMenuItem);
        visualizacaoMenu.add(listaUsuariosItem);
        visualizacaoMenu.add(listaPessoasItem);

        // Adiciona menus à barra de menus
        menuBar.add(cadastroMenu);
        menuBar.add(visualizacaoMenu);
        menuBar.add(sairMenu); // Adiciona o menu "Sair" diretamente

        // Configura a barra de menus
        setJMenuBar(menuBar);

        // Adicionar funcionalidade ao clicar no menu "Sair"
        sairMenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0); // Encerra o programa ao clicar no menu "Sair"
            }
        });

        // Criação do rodapé
        JPanel rodape = new JPanel();
        rodape.setLayout(new BorderLayout());

        // Texto do rodapé formatado
        JLabel rodapeLabel = new JLabel("Versão: 12.1.2024    Usuário: denys.silva    Data de acesso: 20/09/2024 10:58",
                SwingConstants.CENTER);
        rodape.add(rodapeLabel, BorderLayout.CENTER);

        // Adicionar o rodapé à janela
        add(rodape, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Inicializar a GUI
        SistemaPessoa frame = new SistemaPessoa();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
