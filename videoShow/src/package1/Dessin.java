package package1;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.JPanel;


public class Dessin extends JPanel{
	/**
     * stocke la liste des trains ayant �t� ajout�es à cette zone de dessin.
     */
    private final List<IObjectDessinable> listedessinale = new ArrayList<>();
    

    /**
     * retourne la largeur de la zone de dessin.
     *
     * @return la largeur.
     */
    public int getLargeur() {
        return getWidth();
    }

    /**
     * retourne la hauteur de la zone de dessin.
     *
     * @return la hauteur.
     */
    public int getHauteur() {
        return getHeight();
    }

    /**
     * ajoute un train cercle à la zone de dessin.
     *
     * @param ch le train  à ajouter au Dessin
     * @see train
     */
    public void ajouterObjet(IObjectDessinable t) {

        if (!listedessinale.contains(t)) {
            // l'objet n'est pas déjà dans la liste
            // on le rajoute a la liste des objets du dessin
        	listedessinale.add(t);
            // le dessin se réaffiche
            repaint();
            this.pause(10);
        }
    }

    /**
     * temporisation de l'animation.
     *
     * @param duree delai de temporisation en ms.
     */
    public void pause(int duree) {
        try {
            Thread.sleep(duree);
        } catch (InterruptedException e) {
        }
    }

    /**
     * affiche la zone de dessin et son contenu
     *
     * @param g le contexte graphique
     */
  
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //  dessiner les trains que contient le dessin
        for (IObjectDessinable t : listedessinale) {
        	t.dessiner(g);
        }
    }

    /**
     * fait deplacer d'un déplacement élémentaire chacun des train cercles
     * que la zone de dessin contient.
     */
    public void animer() {
        //  dessiner les Objets que contient le dessin
        for (IObjectDessinable objDessinable : listedessinale) {
        	if (objDessinable instanceof IObjectAnimable) {
        		((IObjectAnimable) objDessinable).deplacer();
        	}
            
        }
    }

}
