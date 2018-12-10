package contract;

/**
 * Modélise un produit alimentaire.
 */
public interface FoodItem {

    /**
     * Retourne le nom du produit.
     * @return le nom du produit
     */
    String getName();

    /**
     * Retourne le prix du produit.
     * @return le prix du produit
     */
    int getPrice();

}
