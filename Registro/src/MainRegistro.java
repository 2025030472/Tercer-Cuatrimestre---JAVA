import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainRegistro extends JFrame {
    private JPanel mainPanel;
    private JTextField tfName;
    private JTextField tfEmail;
    private JButton registrarButton;
    private JLabel textRegistro;
    private JPasswordField tfPassword;

    public MainRegistro() {
        // Spawn ventana
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);

        // Boton
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreUsuario = tfName.getText();
                textRegistro.setText("Registro exitoso, para '" + nombreUsuario + "' !");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainRegistro ventana = new MainRegistro();
                ventana.setVisible(true);
            }
        });
    }
}