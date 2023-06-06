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
    public Horses(int choi, Scanner work)
    {
        super(choi);
        this.names = new HashMap<Integer, String>();
        if (choi>names.size()) { System.out.println("Ошибка!"); }
        else System.out.println(names.get(choi));
    }
}
class Donkeys extends Mounts {
    private Map<Integer, String> names;
    public Donkeys(int choi, Scanner work)
    {
        super(choi);
        this.names = new HashMap<Integer, String>();
        if (choi>names.size()) { System.out.println("Ошибка!"); }
        else System.out.println(names.get(choi));
    }
}
class Camels extends Mounts {
    private Map<Integer, String> names;
    public Camels(int choi, Scanner work)
    {
        super(choi);
        this.names = new HashMap<Integer, String>();
        if (choi>names.size()) { System.out.println("Ошибка!"); }
        else System.out.println(names.get(choi));
    }
}