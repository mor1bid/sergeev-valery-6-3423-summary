package Zootopia;
import java.util.*;

public class Mounts extends Program 
{
    public Mounts(Object data) 
    {
        
    }
}
class Horses extends Mounts {
    private Map<Integer, String> names;
    Horses(int choi)
    {
        super(choi);
        this.names = new HashMap<Integer, String>();
        names.put(1, "Хомяк,'Ко мне', 'Лежать', 'Дай лапу', 09.11.2016");
        names.put(2, "Носик, 'Лежать', 15.12.2020");
        names.put(3, "Махно, 'не знает', 05.10.2022");
        if (choi == 1) 
        {
            if (names.size() == 0) 
            {
                System.out.println("Тут пока никого нет!");
            }
            else 
            {
                System.out.println(names.values() + "\n");
            }
        }
    }
}
class Donkeys extends Mounts {
    private Map<Integer, String> names;
    Donkeys(int choi)
    {
        super(choi);
        this.names = new HashMap<Integer, String>();
        names.put(1, "Кружок, 'не знает', 12.01.2019");
        names.put(2, "Жора, 'Стоять', 01.06.2014");
        names.put(3, "Сэнди, 'Ко мне', 'Стоять', 13.01.2009");
        if (choi == 1) 
        {
            if (names.size() == 0) 
            {
                System.out.println("Тут пока никого нет!");
            }
            else 
            {
                System.out.println(names.values() + "\n");
            }
        }
    }
}
class Camels extends Mounts {
    private Map<Integer, String> names;
    Camels(int choi)
    {
        super(choi);
        this.names = new HashMap<Integer, String>();
        names.put(1, "Том, 'Лежать', 'Стоять', 15.12.2000");
        names.put(2, "Ёжик, 'Ко мне', 'Лежать', 'Стоять', 09.11.1993");
        names.put(3, "Чёрный, 'Ко мне', 'Лежать', 'Стоять', 31.04.2014");
        if (choi == 1) 
        {
            if (names.size() == 0) 
            {
                System.out.println("Тут пока никого нет!");
            }
            else 
            {
                System.out.println(names.values() + "\n");
            }
        }
    }
}