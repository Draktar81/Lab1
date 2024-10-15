package org.example;

import java.util.Objects;

public class Room {
    String type;
    int bedCount;
    int number;
    String comfortables;
    int price;

    public Room(String type, int bedCount, int number, String comfortables, int price) {
        this.type = type;
        this.bedCount = bedCount;
        this.number = number;
        this.comfortables = comfortables;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComfortables() {
        return comfortables;
    }

    public void setComfortables(String comfortables) {
        this.comfortables = comfortables;
    }

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", bedCount=" + bedCount +
                ", number=" + number +
                ", comfortables='" + comfortables + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return bedCount == room.bedCount && number == room.number && price == room.price && Objects.equals(type, room.type) && Objects.equals(comfortables, room.comfortables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, bedCount, number, comfortables, price);
    }
}
