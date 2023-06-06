package Zootopia;
import java.util.*;

public class Pets extends Program
{
    public void CatsPub(int choi, Scanner work) throws Exception
    {
        new Cats(choi, work);
    }
    public Pets(Object data, Scanner work) 
    {
        if (data.equals("Кот") ||
            data.equals("Cat")) 
        {
            new Cats(3, work);
        }
        else if (data.equals("Собака") ||
                data.equals("Пёс")) 
        {
            new Dogs(3, work);
        }
        else if (data.equals("Хомяк") ||
                data.equals("Грызун")) 
        {
            new Hamsters(3, work);
        }
    }
}
class Cats extends Pets 
{
    private Map<Integer, String> names;
    private Map<Integer, String> cmds;
    Cats(int choi, Scanner work)
    {
        super(choi, work);
        this.names = new HashMap<Integer, String>();
        if (choi == 1) 
        {
            if (names.size() == 0) 
            {
                System.out.println("Тут пока никого нет!\n");
            }
            else 
            {
                System.out.println(names.values() + "\n");
            }
        }
        if (choi == 2) 
        {
            if (names.size() == 0) 
            {
                System.out.println("Тут пока некого обучать!");
            }
            else 
            {
                int key = names.size();
                if (names.size()>1) 
                {
                    System.out.println("Пожалуйста, введите номер, под которым записан ваш питомец в списке: ");
                    key = work.nextInt();
                }
                System.out.println("Введите одну или несколько (через пробел) команд, которым вы желаете обучить ваше животное: ");
                String mycmd = work.nextLine();
                cmds.put(key, mycmd);
            }
        }
        if (choi == 3)
        {
            System.out.println("Как зовут вашего питомца?\n");
            String name = work.nextLine();
            names.put(names.size(), name);
            System.out.println("\nВаш питомец был добавлен в список домашних животных! \nЕго номер в списке: " + names.size() + "\n");
        }
    }
//     public void CatsPub(int choi, Scanner work) throws Exception
//     {
//         new Cats(choi, work);
//         // Method m = Cats.class.getDeclaredMethod("Cats");
//         // m.setAccessible(true);
//         // m.invoke(newcat);
//     }
}
class Dogs extends Pets {
    private Map<Integer, String> names;
    private Map<Integer, String> cmds;
    Dogs(int choi, Scanner work)
    {
        super(choi, work);
        this.names = new HashMap<Integer, String>();
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
        if (choi == 2) 
        {
            if (names.size() == 0) 
            {
                System.out.println("Тут пока некого обучать!");
            }
            else 
            {
                int key = names.size();
                if (names.size()>1) 
                {
                    System.out.println("Пожалуйста, введите номер, под которым записан ваш питомец в списке: ");
                    key = work.nextInt();
                }
                System.out.println("Введите одну или несколько (через пробел) команд, которым вы желаете обучить ваше животное: ");
                String mycmd = work.nextLine();
                cmds.put(key, mycmd);
            }
        }
        if (choi == 3)
        {
            System.out.println("Как зовут вашего питомца?\n");
            String name = work.nextLine();
            names.put(names.size(), name);
            System.out.println("\nВаш питомец был добавлен в список домашних животных! \nЕго номер в списке: " + names.size() + "\n");
        }
    }
}
class Hamsters extends Pets 
{
    private Map<Integer, String> names;
    private Map<Integer, String> cmds;
    Hamsters(int choi, Scanner work)
    {
        super(choi, work);
        this.names = new HashMap<Integer, String>();
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
        if (choi == 2) 
        {
            if (names.size() == 0) 
            {
                System.out.println("Тут пока некого обучать!");
            }
            else 
            {
                int key = names.size();
                if (names.size()>1) 
                {
                    System.out.println("Пожалуйста, введите номер, под которым записан ваш питомец в списке: ");
                    key = work.nextInt();
                }
                System.out.println("Введите одну или несколько (через пробел) команд, которым вы желаете обучить ваше животное: ");
                String mycmd = work.nextLine();
                cmds.put(key, mycmd);
            }
        }
        if (choi == 3)
        {
            System.out.println("Как зовут вашего питомца?\n");
            String name = work.nextLine();
            names.put(names.size(), name);
            System.out.println("\nВаш питомец был добавлен в список домашних животных! \nЕго номер в списке: " + names.size() + "\n");
        }
    }
}

