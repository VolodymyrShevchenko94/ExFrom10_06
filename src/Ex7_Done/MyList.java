package Ex7_Done;

public class MyList<T> implements List {

    private final int DEFAULT_CAPACITY_ARRAY = 0;

    private final int CAPACITY_INCREMENT_ARRAY = 1;

    private int sizeArray;

    private int capacityArray;

    private Object[] arrayData;


    public MyList() {
        capacityArray = DEFAULT_CAPACITY_ARRAY;
        sizeArray = 0;
        arrayData = new Object[capacityArray];
    }

    @Override
    public void addElementToList(Object elementToAdd) {
        if (sizeArray == capacityArray) {
            capacityArray += CAPACITY_INCREMENT_ARRAY;
            Object[] newArrayData = new Object[capacityArray];
            for (int i = 0; i < sizeArray; i++) {
                newArrayData[i] = arrayData[i];
            }
            arrayData = newArrayData;
        }
        arrayData[sizeArray] = elementToAdd;
        sizeArray++;

    }

    @Override
    public Object getElementByIndex(int indexElement) {
        return arrayData[indexElement];
    }

    @Override
    public int getSizeList() {
        return sizeArray;
    }


}