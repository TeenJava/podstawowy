import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class JumpingPanel extends JPanel implements ActionListener, KeyListener{
	private BufferedImage image;
	private boolean gora = false;
	private boolean skacz = false;
	private boolean idzprawo = false;
	private int x = 0;
	private int y = 0;
	Timer timer = new Timer(15, this);
		public JumpingPanel(JFrame frame){
			super();
			frame.addKeyListener(this);
			File imageFile = new File("man.png");
			try{
				image = ImageIO.read(imageFile);
			} catch(IOException e){
				System.err.println("ERROR: Could not read the file");
				e.printStackTrace();
			}
			
			Dimension dimension = new Dimension(image.getWidth() * 6, image.getHeight());
			setPreferredSize(dimension);
		}
		@Override
		public void paintComponent(Graphics g){
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawImage(image, x, y, this);
	
			
		}
		
		public void keyTyped(KeyEvent evt){	
		
		}
		
		public void keyPressed(KeyEvent evt){
			if(evt.getKeyCode() == 32){
				timer.start();
				skacz = !skacz;
			}
			if(evt.getKeyCode() == 68){
				timer.start();
				idzprawo = !idzprawo;
			}	
				
		}
		
		public void keyReleased(KeyEvent evt){
			if(evt.getKeyCode() == 32){
					timer.stop();
					skacz = !skacz;
				}
				
			
			if(evt.getKeyCode() == 68){
				timer.stop();
				idzprawo = !idzprawo;
				
			}
			}

			
		public void actionPerformed(ActionEvent e){
			
			if(skacz){
			if(gora)y--;
			else y++;
			if(y == -30|| y == 30 || y == 0)
				gora = !gora;
			repaint();
			revalidate();
			}
			
			if(idzprawo){
				if(x != image.getWidth() * 6 - image.getWidth())
					x++;
				repaint();
				revalidate();
				
			}
				
		}
		

}
