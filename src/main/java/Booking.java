public class Booking {

    private Bedroom bedroom;
    private int nights;
    private double rate;

    public Booking(Bedroom bedroom, int nights){
        this.bedroom = bedroom;
        this.nights = nights;
        this.rate = bedroom.getRate();
    }

    public int getNights() {
        return this.nights;
    }

    public double getBill() {
        return this.rate * this.nights;
    }
}
