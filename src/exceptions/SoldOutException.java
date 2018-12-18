package exceptions;

/**
 * Utilisé  pour signaler que le produit sélectionné n'est plus disponible dans la machine.
 */
public final class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}
