import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.FileSystems;

import projsrs.DotButton;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DBScan {

    JFrame frame = new JFrame("DBScan");
    JButton grids[][] = new JButton[10][10];
    JPanel m = new JPanel(new GridLayout(10, 10));
    public DBScan() {
    	make();
    	JPanel p = new JPanel();

    }

    public void make() {

        frame.setTitle("DBScan");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                grids[i][j] = new DotButton();
                m.add(grids[i][j]);
            }
        }
        frame.add(m, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
    	DBScan DbObj = new DBScan();
    }
}
