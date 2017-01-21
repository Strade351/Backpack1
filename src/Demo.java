/**
 * Created by Anatoliy on 20.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Character character = new Character();
        Chest chest1 = new Chest(1);
        Chest chest2 = new Chest(2);
        Chest chest3 = new Chest(3);
        Chest chest4 = new Chest(4);
        Chest chest5 = new Chest(5);
        Workbench workbench = new Workbench();

        character.backpack.grabThings(chest1);
        character.backpack.grabThings(chest2);
        character.backpack.grabThings(chest3);
        character.backpack.grabThings(chest4);
        character.backpack.grabThings(chest5);
        character.pereborka();                  //перебор предметов
        character.picnic();                     //пикник, очистка рюкзака
        character.pereborka();                  //перебор опустошённого рюкзака


                                                //крафт. с персонажем не связан из-за того что изначально у айтемов нет айдишников, что сильно затрудняет процесс
                                                //работает, хоть и на if-ax
        workbench.addItem(Items.BOOTS);
        workbench.addItem(Items.NAILS);
        workbench.craft();

        workbench.addItem(Items.SHORTSWORD);
        workbench.addItem(Items.NAILS);
        workbench.craft();
    }
}

