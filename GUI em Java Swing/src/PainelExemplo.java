import javax.swing.*;
import java.awt.*;

public class PainelExemplo  extends JFrame {
    public PainelExemplo() {
        super("Painéis e Layouts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520, 320);
        setLocationRelativeTo(null);

        JPanel topo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topo.setBackground(new Color(220, 235, 255));
        topo.add(new JButton("Botão A"));

        JPanel centro = new JPanel(new GridLayout(2,2,8,8));
        centro.setBorder(BorderFactory.createTitledBorder("Centro (GridLayout)"));
        centro.add(new Button("1"));
        centro.add(new Button("2"));
        centro.add(new Button("3"));
        centro.add(new Button("4"));

        JPanel rodape = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rodape.setBackground(new Color(235,235,235));
        rodape.add(new JButton("OK"));
        rodape.add(new JButton("Cancelar"));

        setLayout(new BorderLayout(8,8));
        add(topo, BorderLayout.NORTH);
        add(centro, BorderLayout.CENTER);
        add(rodape, BorderLayout.SOUTH);

    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new PainelExemplo().setVisible(true));
    }
}
