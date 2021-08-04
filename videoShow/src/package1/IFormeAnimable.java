package package1;

import fr.im2ag.m2cci.animation.IForme;

/**
 * Un objet IFormeAnimable est capable d'animer (de déplacer) une forme.
 * 
 */
public interface IFormeAnimable {
    
    /**
     * fait faire un déplacement élémentaire à une forme.
     *
     * @param f la forme à déplacer
     */
    public void deplacer(Forme f);

	void animer(IForme f);
    
}
