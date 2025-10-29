import javax.swing.*;

//Classe principal
public class JanelaPrincipal extends JFrame{
    private JTextField  campoNome, campoEmail, campoRua, campoCidade;
    private JComboBox<String>comboCurso;
    private JCheckBox checkEmail, checkNotificacao;
    private JRadioButton radioMasc, radioFem;
    private JRadioButton btnCadastrar, btnLimpar, btnSair;

    public JanelaPrincipal() {
        setTitle("Sistema de Cadastro de Alunos");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Menu
        JMenuBar barra = new JMenuBar();
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem itemSair = new JMenuItem("Sair");
        itemSair.addActionListener(e->System.exit(0))
        menuArquivo.add(itemSair);

        JMenu menuAjuda = new JMenu("Ajuda");
        JMenuItem itemSobre = new JMenuItem("Sobre");
        itemSobre.addActionListener(e->JOptionPane.showInternalMessageDialog(this, "Sistema dde Cadastro de Alunos\nVersão1.0"));
        menuAjuda.add(itemSobre);

        barra.add(menuArquivo);
        barra.add(menuAjuda);
        setJMenuBar(barra);

    }
}