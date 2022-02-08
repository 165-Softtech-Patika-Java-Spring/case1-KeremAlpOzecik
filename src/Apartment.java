public class Apartment {
    private int price, room, living_room, sqrmtrs;
    private String type;
    public Apartment(int price, int room, int living_room, int sqrmtrs) {
        this.price = price;
        this.room = room;
        this.living_room = living_room;
        this.sqrmtrs = sqrmtrs;
        this.type="Apartment";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getLiving_room() {
        return living_room;
    }

    public void setLiving_room(int living_room) {
        this.living_room = living_room;
    }

    public int getSqrmtrs() {
        return sqrmtrs;
    }

    public void setSqrmtrs(int sqrmtrs) {
        this.sqrmtrs = sqrmtrs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "price=" + price+"TL" +
                ", room=" + room +
                ", living_room=" + living_room +
                ", sqrmtrs=" + sqrmtrs +
                ", type='" + type + '\'';
    }

}