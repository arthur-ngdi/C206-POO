import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Robo r1 = new Robo("C3PO");
        Robo r2 = new Robo("R2D2");
        Robo r3 = new Robo("BB-8");

        System.out.println("Quantidade de robos criados: " + Robo.cont);

        r1.mostraInfo();
        r2.mostraInfo();
        r3.mostraInfo();

        JOptionPane.showMessageDialog(null, "Hello World");
        String a = JOptionPane.showInputDialog(null, "Entre com o nome");

    }
}
