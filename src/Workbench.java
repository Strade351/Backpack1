import java.util.ArrayList;

/**
 * Created by Anatoliy on 21.01.2017.
 */

/**
 * ID предметов и рецепты крафта
 *
 SHORTSWORDid1, LONGSWORDid2,                                              id1 + id11 = id3
 BLACKSWORDid3  PANTSid4                                                   id8 + id12 = id6
 CHAINMAILid5   POCKETHORSEid6                                             id7 + id12 = id9
 JARid7         PILLOWid8                                                  id11 + id9 + id9 = id5
 TENTid9        BOOTSid10
 NAILSid11      ALARMCLOCKid12
 */

public class Workbench {
    ArrayList<Integer> itemIDs = new ArrayList<Integer>();
    ArrayList<Items> madeItems = new ArrayList<Items>();

    /**
     * Добавляем элемент на стол
     * Смотрим его название и кидаем айдишник на стол.
     */
    public void addItem(Items item) {
        switch (item.name()) {
            case "SHORTSWORD" : itemIDs.add(1);
                System.out.println("Вы добавили короткий меч, id1");
                break;

            case "LONGSWORD" : itemIDs.add(2);
                System.out.println("Вы добавили длинный меч, id2");
                break;

            case "BLACKSWORD" : itemIDs.add(3);
                System.out.println("Вы добавили чёрный меч, id3");
                break;

            case "PANTS" : itemIDs.add(4);
                System.out.println("Вы добавили штаны, id4");
                break;

            case "CHAINMAIL" : itemIDs.add(5);
                System.out.println("Вы добавили кольчугу, id5");
                break;

            case "POCKETHORSE" : itemIDs.add(6);
                System.out.println("Вы добавили карманную лошадь, id6");
                break;

            case "JAR" : itemIDs.add(7);
                System.out.println("Вы добавили банку, id7");
                break;

            case "PILLOW" : itemIDs.add(8);
                System.out.println("Вы добавили подушку, id8");
                break;

            case "TENT" : itemIDs.add(9);
                System.out.println("Вы добавили палатку, id9");
                break;

            case "BOOTS" : itemIDs.add(10);
                System.out.println("Вы добавили сапоги, id10");
                break;

            case "NAILS" : itemIDs.add(11);
                System.out.println("Вы добавили гвозди, id11");
                break;

            case "ALARMCLOCK" : itemIDs.add(12);
                System.out.println("Вы добавили будильник, id12");
                break;
        }
        System.out.println("Вы добавили на стол " + item.name);
        System.out.println("Сейчас на столе: ");
        for (int i = 0; i < itemIDs.size(); i++) {
            System.out.println(knowID(itemIDs.get(i)));

        }
    }

    /**
     * Узнать название по айдишнику
     * @param id
     * @return
     */
    private String knowID(int id) {
        String answer = null;                               //строка для ответа
        switch (id) {
            case 1 : answer = "короткий меч, id1";
                break;

            case 2 : answer = "длинный меч, id2";
                break;

            case 3 : answer = "чёрный меч, id3";
                break;

            case 4 :answer = "штаны, id4";
                break;

            case 5 : answer = "кольчуга, id5";
                break;

            case 6 :
                answer = "карманную лошадь, id6";
                break;

            case 7 :
                answer = "банку, id7";
                break;

            case 8 :
                answer = "подушку, id8";
                break;

            case 9 :
                answer = "палатку, id9";
                break;

            case 10 :
                answer = "сапоги, id10";
                break;

            case 11 :
                answer = "гвозди, id11";
                break;

            case 12 :
                answer = "будильник, id12";
                break;
        }
        return answer;
    }

    /**
     * Функция крафта
     */
    public void craft() {
        if (itemIDs.size() < 4) {
            if (itemIDs.contains(1)) {
                if (itemIDs.contains(11)) {
                    System.out.println("Вы успешно скрафтили Чёрный Меч! Поздравляем!");
                    deleteItemIDs();
                    itemIDs.add(3);
                }
                else
                    craftFail();
            }

            if (itemIDs.contains(8)) {
                if (itemIDs.contains(12)) {
                    System.out.println("Вы успешно завели Карманную Лошадь! Поздравляем!");
                    deleteItemIDs();
                    itemIDs.add(6);
                }
                else
                    craftFail();
            }
            if (itemIDs.contains(7)) {
                if (itemIDs.contains(12)) {
                    System.out.println("Вы успешно скрафтили Палатку! Поздравляем!");
                    deleteItemIDs();
                    itemIDs.add(9);
                }
                else craftFail();
            }
            if (itemIDs.contains(11)) {
                if (itemIDs.contains(9)) {
                    if (itemIDs.contains(9)) {
                        System.out.println("Вы успешно скрафтили Кольчугу! Поздравляем!");
                    }
                    else
                        craftFail();
                }
                else
                    craftFail();
            }
        }
        else {
            craftFail();
        }
    }

    /**
     * Очистить массив с айдишниками
     */
    private void deleteItemIDs() {
        for (int i = 0; i < itemIDs.size(); i++) {
            itemIDs.remove(i);
            i--;
        }
    }

    /**
     * Сообщение о неудачном крафте и очистка массива
     */
    private void craftFail() {
        System.out.println("Крафт не удался. Вы потеряли все ингридиенты");
        deleteItemIDs();
    }
}
