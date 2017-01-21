import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by Anatoliy on 20.01.2017.
 */



public class Chest implements Iterator {

    Random r = new Random();
    Items[] chestStuff;

    private int id;
    int itemCount;
    int i = -1;

    /**
     * Заполнение сундука в констркуторе
     * @param id
     */
    Chest(int id) {
        itemCount = 1 + r.nextInt(5);
        this.id = id;
        chestStuff = new Items[itemCount];
        for (int i = 0; i < chestStuff.length; i++) {
            chestStuff[i] = Items.values()[r.nextInt(12)];
        }
    }

    @Override
    public boolean hasNext() {
        if (i < itemCount)
            return true;
        else
            return false;
    }

    @Override
    public Object next() {
        i = i + 1;
        if (i < itemCount) {
            return chestStuff[i];
        }
        else
            return null;
    }

    @Override
    public String toString() {
        return chestStuff.toString();
    }

    @Override
    public void remove() {

    }

    public int getId() {
        return id;
    }
}
