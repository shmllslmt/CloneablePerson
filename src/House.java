public class House implements Cloneable {
    private int numBathroom;
    private int numRoom;
    private Address address;

    House() {
        this(4, 4);
    }

    House(int bath, int room) {
        this.numBathroom = bath;
        this.numRoom = room;
        this.address = new Address("Jln Perubatan", "Taman Universiti", "Johor");
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setNumBathroom(int numBathroom) {
        this.numBathroom = numBathroom;
    }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return  "This house has " + numBathroom +
                " bathrooms and " + numRoom +
                " rooms. It is located at " + address;
    }
}
