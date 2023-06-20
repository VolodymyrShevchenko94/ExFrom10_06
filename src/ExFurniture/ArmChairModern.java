package ExFurniture;

public class ArmChairModern implements Furniture {
    private String name = "\"Стар швіп\"";
    private double price = 1340;

    @Override
    public String getNameItem() {
        return name;
    }

    @Override
    public double getPriceItem() {
        return price;
    }
}
