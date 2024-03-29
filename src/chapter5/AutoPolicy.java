package chapter5;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.setAccountNumber(accountNumber);
        this.setMakeAndModel(makeAndModel);
        this.setState(state);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isNoFaulState() {
        boolean noFaulState;

        switch( getState()) {
            case "MA": case "NJ": case "NY": case "PA":
                noFaulState = true;
                break;
            default:
                noFaulState = false;
                break;
        }
        return noFaulState;
    }
}
