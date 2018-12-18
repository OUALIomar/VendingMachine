package exceptions;

/**
 * Utilisé pour signaler que le produit sélectionné n'a pas été complètement payé.
 */
public final class NotFullyPaidException extends Exception {
    private final int remaining;

    public NotFullyPaidException(String msg, int remaining) {
        super(msg);
        this.remaining = remaining;
    }

    public double getRemaining() {
        return remaining;
    }
}
