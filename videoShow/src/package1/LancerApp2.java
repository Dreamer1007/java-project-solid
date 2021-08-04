package package1;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
public class LancerApp2 {
	public static void main(String[] args) {
		// création de la fenêtre de l'application
		JFrame laFenetre= new JFrame("TrainCercle, etc.");
		laFenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		laFenetre.setSize(512, 512);
		// création de la zônede dessin dans la fenêtre
		Dessin d = new Dessin();
		laFenetre.getContentPane().add(d);
		// affiche la fenêtre
		laFenetre.setVisible(true);
		// les objets fixes de la zone de dessin
		d.ajouterObjet(new Etoile(350, 100, 50, 8.f,null, Color.GREEN));
		d.ajouterObjet(new PolygoneRegulier(130, 240, 40, 5, 4.0f, Color.BLACK, null));
		d.ajouterObjet(new TrainCercle(d,10,10));
		// un visage rond
		d.ajouterObjet(new Visage(d,10,10));
		
		
		while(true) {
		// la zone de dessin se réaffiche
		d.repaint();
		// un temps de pause pour avoir le temps de voir le nouveau dessin
		d.pause(50);
		// fait un déplacement élémentaire aux objets animables
		d.animer();
		}
		}
}
