package contract;

import java.util.Map;

/**
 * Modélise un inventaire de produits alimentaires.
 */
public interface FoodInventory {

    /**
     * Retourne la quantité du produit passé en paramètre.
     * @param item le produit dont on veut connaître la quantité
     * @return la quantitié du produit
     */
    long getQuantity(FoodItem item);

    /**
     * Ajoute un produit selon la quantité spécifiée à l'inventaire.
     * @param item le produit à ajouter
     * @param quantity la quantité du produit à ajouter
     * @return vrai si l'ajout a réussi
     */
    boolean add(FoodItem item, long quantity);

    /**
     * Enlève un produit selon la quantité spécifiée, de l'inventaire.
     * @param item le produit à retirer
     * @param quantity la quantité du produit à retirer
     * @return vrai si la suppression a réussi
     */
    boolean remove(FoodItem item, long quantity);

    /**
     * Retourne vrai si le produit passé en paramètre est dans l'inventaire.
     * @param item le produit dont on recherche la présence dans l'inventaire
     * @return vrai si le produit se trouve dans l'inventaire
     */
    boolean hasItem(FoodItem item);

    /**
     * Renvoie le contenu complet de l'inventaire, chaque produit associé à sa quantité.
     * @return le mapping entre les produits dans l'inventaire et leurs quantités respectives
     */
    Map<FoodItem, Long> getInventory();

    /**
     * Remet le contenu de l'inventaire à zéro (on enlève tous les produits).
     */
    void clear();
}
