import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import javax.swing.JPanel;

public class GradientPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Color c1 = new Color(204, 255, 255);  // Top color
        Color c2 = new Color(153, 204, 255);  // Bottom color
        GradientPaint gp = new GradientPaint(0, 0, c1, 0, getHeight(), c2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}
