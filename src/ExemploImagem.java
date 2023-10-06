import javax.swing.*;

public class ExemploImagem extends JFrame {
    public ExemploImagem() {
        super("Imagem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 800, 800);

        ImageIcon icon = new ImageIcon("src/Imagens/coringudo.jpg");
        JLabel label = new JLabel(icon);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ExemploImagem();
    }

}
