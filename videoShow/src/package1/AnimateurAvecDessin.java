package package1;
import java.lang.Object;

import fr.im2ag.m2cci.animation.IForme;

import  java.awt.geom.RectangularShape;
import  java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
public abstract class AnimateurAvecDessin implements IFormeAnimable {

    protected final Dessin d;
    public AnimateurAvecDessin(Dessin d) {
        this.d = d;
    }
    
    protected boolean sortAGauche(Rectangle r) {
        return r.getX() <= 0;
    }

    protected boolean sortADroite(Rectangle r) {
        return r.getX() + r.getWidth() >= d.getLargeur();
    }

    protected boolean sortEnHaut(Rectangle r) {
        return r.getY() <= 0;
    }

    /**
     * teste si la forme sort en bas de la zone de dessin
     *
     * @param r le rectangle englobant de forme à animer
     * @return true si le rectangle englobant de la forme sort sur le bas de la
     * zone de dessin, false sinon
     */
    
	
}
