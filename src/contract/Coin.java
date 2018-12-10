package contract;

/**
 * Modélise les pièces de monnaie acceptées (en centimes).
 */
public enum Coin {

    C01(1), C05(5), C10(10), C20(20), C50(50), C100(100), C200(200);

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
