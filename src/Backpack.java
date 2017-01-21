import java.util.ArrayList;
import java.util.Iterator;

public class Backpack implements Iterable {

    int slots = 12;
    int weightMax = 35;
    int currentSlot = 0;
    int currentWeight = 0;

    private ArrayList<Items> items = new ArrayList<Items>();

    public void grabThings(Chest chest) {
        for (int i = 0; i < chest.itemCount; i++) {
            if (chest.hasNext() && currentSlot < slots) {
                if (currentWeight < weightMax && (currentWeight + chest.chestStuff[i].weight) < weightMax) {
                    items.add(currentSlot, (Items) chest.next());
                    currentSlot++;
                    currentWeight += chest.chestStuff[i].weight;
                    System.out.println("Из сундука " + chest.getId() + " добавлено: " + chest.chestStuff[i] + " " + currentSlot + "/" + slots + " " + currentWeight + "/" + weightMax);
                }
                else {
                    System.out.println("Предмет " + chest.chestStuff[i].name + " из сундука " + chest.getId() + " уже не проходит по весу!");
                }
            }
            else {
                System.out.println("Место кончилось");
                break;
            }
        }
    }

    @Override
    public Iterator iterator() {
        return items.iterator();
    }

    @Override
    public String toString() {
        return String.valueOf(iterator().next());
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
}
