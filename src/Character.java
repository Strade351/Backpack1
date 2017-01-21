/**
 * Created by Anatoliy on 21.01.2017.
 */

public class Character {
    Backpack backpack = new Backpack();

    public void pereborka() {
        System.out.println("Пора перерыть это барахло!");
        if (backpack.iterator().hasNext()) {
            for (int i = 0; i < backpack.getItems().size(); i++) {
                backpack.getItems().get(i).show();
            }
        }
        else {
            System.out.println("Тут пусто!");
        }
    }

    public void picnic() {
        System.out.println("Привал! Пора выкинуть всё из рюкзака");
            for (int i = 0; i < backpack.getItems().size(); i++) {
                use(i);
                i--;
            }
    }

    public void use(int usefulSlot) {
        System.out.println("Предмет " + backpack.getItems().get(usefulSlot) + " был использован");
        backpack.getItems().remove(usefulSlot);
    }
}
