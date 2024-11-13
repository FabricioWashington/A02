/*
    Classe principal que contém todas as variáveis globais necessárias e permite acesso direto às informações do sistema, mantendo o código organizado e mais fácil de manter.
    Define a interface e a estrutura do menu, centralizando a criação do JFrame e as opções de menu.
    Utilizaa classe ConfiguracoesSistema.java para exibir as informações no rodapé.
 */
import java.awt.*;
import javax.swing.*;

public class MenuPrincipal {

    private CadastroUsuarios cadastroUsuarios;
    private CadastroPessoas cadastroPessoas;
    private ListaUsuarios listaUsuarios;
    private ListaPessoas listaPessoas;

    public MenuPrincipal() {
        // Criação do frame principal
        JFrame principal = new JFrame("Sistema Pessoa");
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setSize(800, 800);

        // Criação da barra de menu
        JMenuBar menuPrincipal = new JMenuBar();
        cadastroUsuarios = new CadastroUsuarios();

        // Criação e adição das opções de menu
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuVisualizacao = new JMenu("Visualização");

        JMenu menuSair = new JMenu("Sair");
        menuSair.addMenuListener(new javax.swing.event.MenuListener() {
            @Override
            public void menuSelected(javax.swing.event.MenuEvent e) {
                System.exit(0); // Sai do sistema
            }

            @Override
            public void menuDeselected(javax.swing.event.MenuEvent e) {
            }

            @Override
            public void menuCanceled(javax.swing.event.MenuEvent e) {
            }
        });

        menuPrincipal.add(menuCadastro);
        menuPrincipal.add(menuVisualizacao);
        menuPrincipal.add(menuSair);

        // Itens de menu para cadastro
        JMenuItem itemMenuCadastroUsuarios = new JMenuItem("Usuários");
        JMenuItem itemMenuCadastroPessoas = new JMenuItem("Pessoas");
        menuCadastro.add(itemMenuCadastroUsuarios);
        menuCadastro.add(itemMenuCadastroPessoas);

        //adicionar ação para Usuarios e Pessoas.
        // Itens de menu para visualização
        JMenuItem itemMenuVisualizacaoListaUsuarios = new JMenuItem("Lista de usuários");
        JMenuItem itemMenuVisualizacaoListaPessoas = new JMenuItem("Lista de pessoas");
        menuVisualizacao.add(itemMenuVisualizacaoListaUsuarios);
        menuVisualizacao.add(itemMenuVisualizacaoListaPessoas);

        // Área de trabalho no centro
        JTextArea areaTrabalho = new JTextArea();

        // Painel e label do rodapé, utilizando as variáveis globais da classe ConfiguracoesSistema.java
        JPanel painelRodape = new JPanel();
        JLabel labelRodape = new JLabel("Versão: " + ConfiguracoesSistema.VERSAO_SISTEMA
                + " | Usuário: " + ConfiguracoesSistema.NOME_USUARIO
                + " | Data de acesso: " + ConfiguracoesSistema.DATA_ACESSO);
        painelRodape.add(labelRodape);

        // Adiciona componentes ao frame principal
        principal.getContentPane().add(BorderLayout.NORTH, menuPrincipal);
        principal.getContentPane().add(BorderLayout.CENTER, areaTrabalho);
        principal.getContentPane().add(BorderLayout.SOUTH, painelRodape);

        // Action listeners para abrir os formulários e listas
        itemMenuCadastroUsuarios.addActionListener(e -> CadastroUsuarios.abrirCadastroUsuarios(principal));
        itemMenuCadastroPessoas.addActionListener(e -> CadastroPessoas.abrirCadastroPessoas(principal));
        itemMenuVisualizacaoListaUsuarios.addActionListener(e -> ListaUsuarios.abrirListaUsuarios(principal));
        itemMenuVisualizacaoListaPessoas.addActionListener(e -> ListaPessoas.abrirListaPessoas(principal));
        principal.setLocationRelativeTo(null); // Centraliza a janela
        principal.setVisible(true); // Torna a janela visível
    }

}
