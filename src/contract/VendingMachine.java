package contract;

import exceptions.*;

import java.io.IOException;
import java.util.List;

/**
 * Modélise un distributeur de produits.
 */
public interface VendingMachine {

    /**
     * Initialise le distributeur avec l'inventaire des produits (chargés de donnees/inventaire.txt),
     * et un change constitué de 5 pièces de chaque denomination existante.
     * @throws IOException si le chargement de l'inventaire du fichier rencontre un problème d'entrée-sortie
     */
    void init() throws IOException;

    /**
     * Retourne le prix du produit sélectionné passé en paramètre.
     * @param item le produit sélectionné (simulation d'une sélection de produit par le client)
     * @return le prix du produit sélectionné
     * @throws SoldOutException si le produit est en rupture de stock dans le distributeur
     */
    int selectItemAndGetPrice(FoodItem item) throws SoldOutException;

    /**
     * Insère une pièce de monnaie dans le distributeur - dans le panier (ou bucket) d'achat
     * @param coin la pièce insérée
     * @throws TooMuchInsertedMoneyException si le total des pièces insérées dépasse 500 cents
     */
    void insertCoin(Coin coin) throws TooMuchInsertedMoneyException;

    /**
     * Retourne toutes les pièces insérées.
     * Simule une demande de restitution des pièces sans avoir acheté de produit.
     * @return toutes les pièces actuellement insérées dans le distributeur.
     */
    List<Coin> refund();

    /**
     * Retourne le panier d'achat contenant le produit sélection (et maintenant acheté) ainsi que le change.
     * Simule l'achat effectif d'un produit, la collecte de celui-ci, et le change rendu par le distributeur.
     * @return le panier contenant le produit acheté et le change
     * @throws ItemNotSelectedException si aucun produit n'avait été sélectionné auparavant
     * @throws NotFullyPaidException si le produit n'a pas encore été totalement payé (donc partiellement payé)
     * @throws NotSufficientChangeException si le distributeur n'a pas suffisamment de change pour rendre la monnaie
     * suite à l'achat. La transaction est donc annulée (le produit n'est pas vendu).
     */
    Bucket collectItemAndChange() throws ItemNotSelectedException, NotFullyPaidException, NotSufficientChangeException;

    /**
     * Remet tout le contenu du distributeur à zero, produits et change.
     */
    void reset();

    /**
     * Retourne le chiffre d'affaires courant du distributeur (somme des ventes).
     * @return le chiffre d'affaires du distributeur
     */
    long totalSales();

    /**
     * Ecrit le chiffre d'affaires du distributeur pour chaque produit dans un fichier (donnees/revenues.txt).
     * Le chiffre d'affaires de chaque produit est écrit sur une ligne: nom du produit;quantite vendue;valeur totale
     * @throws IOException si un problème survient dans l'écriture du fichier
     */
    void printRevenues() throws IOException;

    /**
     * Retourne l'inventaire des pièces de monnaie actuellement dans le distributeur.
     * @return l'inventaire des pièces de monnaies contenues dans le distributeur
     */
    CashInventory getCashInventory();

    /**
     * Retourne l'inventaire des produits actuellement dans le distributeur.
     * @return l'inventaire des produits contenus dans le distributeur
     */
    FoodInventory getItemInventory();

}
