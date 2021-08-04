package package1;

import java.awt.Color;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

/**
 * Un polygone régulier inscrit dans un cercle
 *
 */
public class PolygoneRegulier extends FormeCirculaireReguliere {

    /**
     * Constructeur d'un PolygoneRegulier
     *
     * @param nbSommets le nombre de sommets du polygone régulier
     * @param x abscisse du centre du polygone régulier
     * @param y ordonnée du centre du polygone régulier
     * @param r rayon du cercle dans lequel le polygone régulier est inscrite
     * @param epTrait épaisseur du trait de contour
     * @param cTrait couleur du trait de contour
     * @param cRemp couleur de remplissage du polygone régulier
     */
    public PolygoneRegulier(int nbSommets, int x, int y, int r, float epTrait, Color cTrait, Color cRemp) {
        super(nbSommets, x, y, r, epTrait, cTrait, cRemp);
    }

    @Override
	public Path2D relierSommets(Point2D[] sommets) {
        // Etape 2
        // construction du chemin reliant les points
        Path2D path = new Path2D.Float();
        path.moveTo(sommets[0].getX(), sommets[0].getY());
        for (int i = 1; i < sommets.length; i++) {
            path.lineTo(sommets[i].getX(), sommets[i].getY());
        }
        path.closePath();
        return path;
    }

}
