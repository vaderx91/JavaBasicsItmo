package JavaBasics.lesson2.lab2;

public class Building {
    private Purpose purpose; // назначение здания
    private String material; // материал стен
    private Integer floorsNumber; // количество этажей
    private boolean isInUse; // сдано здание или еще строится
    private Long price; // стоимость здания

    public Building() {
    }

    public Building(Purpose purpose, String material, Boolean isInUse) {
        this.purpose = purpose;
        this.material = material;
        this.isInUse = isInUse;
    }

    @Override
    public String toString() {
        return "Building{" +
                "purpose=" + purpose +
                ", material='" + material + '\'' +
                ", floorsNumber=" + floorsNumber +
                ", isInUse=" + isInUse +
                ", price=" + price +
                '}';
    }


    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(Integer floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public boolean isInUse() {
        return isInUse;
    }

    public void setInUse(boolean inUse) {
        isInUse = inUse;
    }

    public void setPrice(Long price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.err.println("invalid price");
        }
    }

    public Long getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Building building = new Building(Purpose.RESIDENTIAL, "Monolithic-brick", true);

        System.out.println(building);

        building.setFloorsNumber(10);
        building.setPrice(25000000L);

        System.out.println(building);
    }
}







