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
    	JButton saveButton = new JButton("Save");
    	JButton loadButton = new JButton("Load");
        JButton runButton = new JButton("Run");
        JButton randomButton = new JButton("Randomize");
        saveButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        		BufferedImage image = new BufferedImage(m.getWidth(),m.getHeight(), BufferedImage.TYPE_INT_RGB);
        		Graphics2D graphics2D = image.createGraphics();
        		frame.paint(graphics2D);
        		String userDirectory = FileSystems.getDefault()
                        .getPath("")
                        .toAbsolutePath()
                        .toString();
        		System.out.println(userDirectory);
                ImageIO.write(image,"jpeg", new File(userDirectory + "/savedimg.jpeg"));
        		}
        		catch(Exception exception) {

        		}
        	}
        }
        		);
        		JButton clrButton = new JButton("Clear");

        clrButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.remove(m);
        		frame.revalidate();
        		frame.repaint();
        	}
        }
        		);
        		p.add(saveButton);
        		p.add(loadButton);
        p.add(clrButton);
        p.add(runButton);
        frame.add(p,BorderLayout.NORTH);
        frame.setVisible(true);
        frame.pack();


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
