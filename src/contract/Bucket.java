package contract;

import java.util.List;

/**
 * Modélise un panier d'achat contenant le produit acheté et le change.
 */
public interface Bucket {

    /**
     * Renvoie le produit contenu dans ce panier.
     * @return le produit contenu dans ce panier
     */
    FoodItem getItem();

    /**
     * Renvoie vrai si le panier contient un produit.
     * @return vrai si le panier contient un produit
     */
    boolean containsItem();

    /**
     * Retourne le change contenu dans le panier.
     * @return le change contenu dans le panier
     */
    List<Coin> getChange();

    /**
     * Positionne dans ce panier le produit passé en argument.
     * @param item
     */
    void setItem(FoodItem item);

    /**
     * Ajoute une pièce de monnaie dans le panier.
     * @param coin la pièce à ajouter
     */
    boolean addCoin(Coin coin);

    /**
     * Vide complètement le panier (produit et pièces)
     */
    void clearAll();

    /**
     * Supprime toutes les pièces du panier.
     */
    void clearChange();

    /**
     * Supprime le produit du panier.
     */
    void clearItem();

}
