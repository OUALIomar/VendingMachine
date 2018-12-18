package exceptions;

/**
 * Utilisé pour signaler que le change n'est pas suffisant pour rendre la monnaie.
 */
public final class NotSufficientChangeException extends Exception {

    public NotSufficientChangeException(String message) {
        super(message);
    }
}
