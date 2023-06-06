import java.util.*;

public class Mounts {
    public Mounts(Object data) 
    {
        
    }
}
class Horses extends Pets {
    private Map<Integer, String> names;
    public Horses(int choi)
    {
        super(choi);
        this.names = new HashMap<Integer, String>();
        if (choi>names.size()) { System.out.println("Ошибка!"); }
        else System.out.println(names.get(choi));
    }
}
class Donkeys extends Pets {
    private Map<Integer, String> names;
    public Donkeys(int choi)
    {
        super(choi);
        this.names = new HashMap<Integer, String>();
        if (choi>names.size()) { System.out.println("Ошибка!"); }
        else System.out.println(names.get(choi));
    }
}
class Camels extends Pets {
    private Map<Integer, String> names;
    public Camels(int choi)
    {
        super(choi);
        this.names = new HashMap<Integer, String>();
        if (choi>names.size()) { System.out.println("Ошибка!"); }
        else System.out.println(names.get(choi));
    }
}