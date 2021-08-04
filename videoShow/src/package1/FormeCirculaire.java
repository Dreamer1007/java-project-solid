package package1;
import java.lang.Object;
import  java.awt.geom.RectangularShape;
import  java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Forme dont la géométrie est définie par un cercle. le point de référence de
 * la forme est le centre du cercle
 *
**/
public abstract class FormeCirculaire extends Forme {

    /**
     * le rayon du cercle
     */
    protected final int rayon;

    /**
     * Constructeur
     *
     * @param x abscisse du centre de la forme circulaire
     * @param y ordonnée du centre de la forme circulaire
     * @param rayon de la forme circulaire
     * @param epaisseurTrait l'epaisseur du trait pour le contour de la forme
     * @param couleurTrait la couleur du trait de contour
     * @param couleurRemplissage la couleur de remplissage
     */
    public FormeCirculaire(int x, int y, int rayon, float epaisseurTrait, 
            Color couleurTrait, Color couleurRemplissage) {
        super(x, y, epaisseurTrait, couleurTrait, couleurRemplissage);
        this.rayon = rayon;
    }
    
    final protected Rectangle calculeRectEnglobant() {
    	return new Rectangle(x -rayon, y -rayon,
    	2*rayon, 2*rayon);
    
}
}
