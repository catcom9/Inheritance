package ie.atu.week9;

public class PreferredCustomer extends Customer{
    private int loyaltyPoints;
    private int discountLevel;

    public PreferredCustomer() {
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }

    public PreferredCustomer(String name, String address, String phone, int custNumber, boolean mailingList, int loyaltyPoints, int discountLevel) {
        super(name, address, phone, custNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    public void addLoyaltyPoints(int points){
        this.loyaltyPoints += points;
        setDiscountLevel();
    }

    private void setDiscountLevel(){
        if(loyaltyPoints >= 500){
            discountLevel = 1;
        }
        if (loyaltyPoints >= 1000){
            discountLevel = 2;
        }
        if (loyaltyPoints >= 1500){
            discountLevel = 3;
        }
        if (loyaltyPoints >= 2000){
            discountLevel = 4;
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel;
    }
}
