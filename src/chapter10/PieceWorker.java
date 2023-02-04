package chapter10;

public class PieceWorker extends Employee {

    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName,
                       String socialSecurityNumber,int wage, int pieces, Date birthDate)
    {

        super(firstName, lastName, socialSecurityNumber, birthDate);
        this.setWage(wage);
        this.setPieces(pieces);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage <= 0)
            throw new IllegalArgumentException(
                    "Wage must be > 0");
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        if(pieces < 0)
            throw new IllegalArgumentException(
                    "Pieces must be >= 0");

        this.pieces = pieces;
    }

    @Override
    public double getPaymentAmount() {

        return getWage() * getPieces();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%.2f;%n%s: %d",
                "Piece Worker", super.toString(),
                "wage per piece", getWage(),
                "pieces produced", getPieces());
    }


}
