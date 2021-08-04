package package1;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

/**
 * Une �toile � 5 branches.
 */
public class Etoile extends FormeCirculaireReguliere {

    /**
     * Constructeur d'une �toile
     *
     * @param x abscisse du centre
     * @param y ordonn�e du centre
     * @param r rayon
     * @param epTrait l'epaisseur du trait
     * @param cTrait couleur du trait
     * @param cRemp couleur remplissage
     */
    protected Etoile(int x, int y, int r, float epTrait, Color cTrait, Color cRemp) {
        super(5, x, y, r, epTrait, cTrait, cRemp);
    }

    /**
     * calcule le chemin contour de l'�toile � 5 branches. Les sommets r�partis
     * sur le cercle (num�rot� de 0 � 4) sont r�li�s de la mani�re suivante:
     *
     * - sommet 0 au sommet 2
     *
     * - sommet 2 au sommet 4
     *
     * - sommet 4 au sommet 1
     *
     * - sommet 1 au sommet 3
     *
     * - sommet 3 au sommet 0
     *
     * @param tabSommets le tableau des sommets r�partis r�guli�rement sur le
     * cercle
     * @return le contour
     */
    @Override
    protected Path2D construireContour(Point2D.Float[] tabSommets) {
        Path2D.Float leContour = new Path2D.Float();
        leContour.moveTo(tabSommets[0].getX(), tabSommets[0].getY());
        leContour.lineTo(tabSommets[2].getX(), tabSommets[2].getY());
        leContour.lineTo(tabSommets[4].getX(), tabSommets[4].getY());
        leContour.lineTo(tabSommets[1].getX(), tabSommets[1].getY());
        leContour.lineTo(tabSommets[3].getX(), tabSommets[3].getY());
        leContour.closePath();
        return leContour;
    }

	@Override
	public void deplacer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Rectangle getRectEnglobant() {
		// TODO Auto-generated method stub
		return null;
	}

	

}