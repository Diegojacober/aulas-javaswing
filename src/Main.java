
import javax.swing.*;
import java.awt.*;

public class Main {
//    public static void acao() {
//        System.out.println("Acao");
//    }

    public static void main(String[] args) {
        /*
        JFrame janela = new JFrame("Basico.janela"); // Instancia o objeto de janela
        janela.setSize(800, 800); // Metodo para o tamanhp da janela
        janela.setLocation(300, 300);// Método que define a posição da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Método para definir a ação ao fechar a janela
        janela.setLayout(null); // Define o tipo de layout da janela, null permite posicionar elementos livremente

        JButton botao = new JButton("butão");
        botao.setBounds(260, 200, 120, 60);
        botao.setFont(new Font("Arial", Font.BOLD, 14));
        botao.setForeground(Color.RED);
        botao.setBackground(Color.BLUE);
        janela.add(botao);

        JTextField campoTexto = new JTextField();
        campoTexto.setSize(200, 50);
        campoTexto.setLocation(500, 600);
        janela.add(campoTexto);

        JLabel label = new JLabel();
        label.setBounds(100, 100, 300, 200);
        label.setForeground(Color.RED);
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setText("Texto padrão");
        janela.add(label);

        botao.addActionListener(e -> label.setText(campoTexto.getText()));
        janela.setVisible(true); // Método para fazer aparecer a janela
        */

        /*Janela janela = new Janela("TITULO DA JANELA");
        Rotulo rotulo = new Rotulo();
        CampoTexto campoTexto = new CampoTexto();
        Botao botao = new Botao("TEXTO BOTAO");
        botao.addActionListener(e -> rotulo.setText(campoTexto.getText()));

        janela.add(rotulo);
        janela.add(campoTexto);
        janela.add(botao);

        janela.setVisible(true);*/

        JFrame frame = new JFrame("Exemplo imagem");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 800);

        ImageIcon iconeAmpliado = new ImageIcon("src/Imagens/coringudo.gif");
        iconeAmpliado.setImage(iconeAmpliado.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT));

        JLabel jLabel = new JLabel(iconeAmpliado);
        frame.add(jLabel);
        frame.setVisible(true);
    }
}
