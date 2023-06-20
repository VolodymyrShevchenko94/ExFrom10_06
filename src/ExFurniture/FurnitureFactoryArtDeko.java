package ExFurniture;

public class FurnitureFactoryArtDeko implements FurnitureFactory {
    @Override
    public Furniture createArmchair() {
        Furniture armchair = new ArmChairDeko();
        return armchair;
    }

    @Override
    public Furniture createSofa() {
        Furniture sofa = new SofaArtDeko();
        return sofa;
    }

    @Override
    public Furniture createTable() {
        Furniture table = new TableArtDeko();
        return table;
    }
}
