package contract;

import java.util.Map;

/**
 * Modélise un inventaire de pièces de monnaie.
 */
public interface CashInventory {

    /**
     * Retourne la quantité de la pièce passés en paramètre.
     * @param item la pièce dont on veut connaître la quantité
     * @return la quantitié de la pièce
     */
    long getQuantity(Coin item);

    /**
     * Ajoute un produit selon la quantité spécifiée à l'inventaire.
     * @param item le produit à ajouter
     * @param quantity la quantité du produit à ajouter
     * @return vrai si l'ajout a réussi
     */
    boolean add(Coin item, long quantity);

    /**
     * Enlève une pièce selon la quantité spécifiée, de l'inventaire.
     * @param item la pièce à retirer
     * @param quantity la quantité de la pièce  à retirer
     * @return vrai si la suppression a réussi
     */
    boolean remove(Coin item, long quantity);

    /**
     * Retourne vrai si la pièce passée en paramètre est dans l'inventaire.
     * @param item la pièce dont on recherche la présence dans l'inventaire
     * @return vrai si la pièce se trouve dans l'inventaire
     */
    boolean hasCoin(Coin item);

    /**
     * Renvoie le contenu complet de l'inventaire, chaque pièce associé à sa quantité.
     * @return le mapping entre les pièces dans l'inventaire et leurs quantités respectives
     */
    Map<Coin, Long> getInventory();

    /**
     * Remet le contenu de l'inventaire à zéro (on enlève toutes les pièces).
     */
    void clear();
}
