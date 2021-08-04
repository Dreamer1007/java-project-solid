package package1;

import java.awt.Graphics;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

public interface IObjectDessinable {
	
	abstract void dessiner(Graphics g);

	public void deplacer();

	Path2D relierSommets(Point2D[] sommets);

}
