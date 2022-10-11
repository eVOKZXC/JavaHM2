package ru.mirea.Panferov.task9;

public class Card {
    private Masters master;
    private Dignities dignity;

    public Card(Masters master, Dignities dignity) {
        this.master = master;
        this.dignity = dignity;
    }
    public Card(){}

    public void setMaster(Masters master) { this.master = master; }
    public void setDignity(Dignities dignity) { this.dignity = dignity; }

    @Override
    public String toString() {
        return master + " " + dignity;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;

        Card card = (Card) obj;
        return this.dignity == card.dignity && this.master == card.master;
    }
}
