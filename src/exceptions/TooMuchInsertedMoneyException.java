package exceptions;

/**
 * Utilisé pour signaler que la somme d'argent introduite dans la machine dépasse le maximum autorisé.
 */
public final class TooMuchInsertedMoneyException extends Exception {

    public TooMuchInsertedMoneyException(String message) {
        super(message);
    }
}
