/**
 * Created by Anatoliy on 20.01.2017.
 */

public enum Items {
    SHORTSWORD("Короткий меч","Меч для битья первоуровневых крыс", 2), LONGSWORD("Длинный меч", "Меч для нарезки злых гоблинов", 3),
    BLACKSWORD("Чёрная Вдова", "Ты никогда не купишь его", 3), PANTS("Штаны", "Остаться без штанов в пещере со сталактитами - смертельная опасность", 1),
    CHAINMAIL("Кольчуга", "Обычная кольчуга. Не как у Гномов", 4), POCKETHORSE("Карманная Лошадь", "Её имя - Плотва!", 7),
    JAR("Баночка Мёда", "Им можно обмазываться и пить", 2), PILLOW("Подушка", "Не забудь добавить топор под неё", 1),
    TENT("Палатка", "Укроет дождливой ночью. Или нет.", 5), BOOTS("Ботинки", "Опять сапожища хреновые подсунули..", 2),
    NAILS("Гвозди", "Стальные. Девятидюймовые. Твои.", 9), ALARMCLOCK("Будильник", "Не забывай ставить его заного каждые 3 часа", 3);

    String name;
    String description;
    int weight;

    /**
     *
     * @param name
     * @param description
     * @param weight
     */
    Items(String name, String description, int weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }

    /**
     * Показывает сведения об айтеме
     */
    public void show() {
        System.out.println("Название: " + name + " Описание: " + description + " Вес: " + weight);
    }

    @Override
    public String toString() {
        return name + ", " + description;
    }
}
