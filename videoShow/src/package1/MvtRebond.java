package package1;
import java.lang.Object;

import fr.im2ag.m2cci.animation.IForme;

import  java.awt.geom.RectangularShape;
import  java.awt.geom.Rectangle2D;
import java.awt.Rectangle;

/**
 * Animateru d�finissant un mouvement rectiligne avec rebond quand la forme atteint
 * l'un des bords de la zone de dessin
 * 
 * @author Philippe GENOUD - Universit� Grenoble Alpes (UGA) - Laboratoire
 * Informatique de Grenoble (LIG) - �quipe STeamer
 */
public class MvtRebond extends AnimateurAvecDessin {


    /**
     * d�placement �l�mentaire horizontal
     */
    private int dx;

    /**
     * d�placement �l�mentaire vertical
     */
    private int dy;

    public MvtRebond(Dessin d, int dx, int dy) {
        super(d);
        this.dx = dx;
        this.dy = dy;
    }

    // implementation de l'interface IAnimable
    @Override
    public void animer(IForme f) {
        
        Rectangle r = f.getRectEnglobant();
        if (sortAGauche(r) || sortADroite(r)) {
            this.dx = -this.dx;
        }
        if (sortEnHaut(r) || sortEnBas(r)) {
            this.dy = -this.dy;
        }
        f.placerA(f.getX() + dx, f.getY() + dy);
    }

	private boolean sortEnBas(Rectangle r) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deplacer(Forme f) {
		// TODO Auto-generated method stub
		
	}
}
