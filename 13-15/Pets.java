import java.util.*;

public class Pets 
{
    public Pets(Object data) 
    {
        if (data.equals("Кот") ||
            data.equals("Кошка")) 
        {
            new Cats(1);
        }
        else if (data.equals("Собака") ||
                data.equals("Пёс")) 
        {
            new Dogs(1);
        }
    }
}
class Cats extends Pets {
    private Map<Integer, String> names;
    public Cats(int choi)
    {
        super(choi);
        this.names = new HashMap<Integer, String>();
        if (choi>names.size()) { System.out.println("Ошибка!"); }
        else System.out.println(names.get(choi));
    }
}
class Dogs extends Pets {
    private Map<Integer, String> names;
    public Dogs(int choi)
    {
        super(choi);
        this.names = new HashMap<Integer, String>();
        if (choi>names.size()) { System.out.println("Ошибка!"); }
        else System.out.println(names.get(choi));
    }
}
class Hamsters extends Pets {
    private Map<Integer, String> names;
    public Hamsters(int choi)
    {
        super(choi);
        this.names = new HashMap<Integer, String>();
        if (choi>names.size()) { System.out.println("Ошибка!"); }
        else System.out.println(names.get(choi));
    }
}
