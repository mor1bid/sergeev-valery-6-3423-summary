package Zootopia;
import java.util.*;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class Pets extends Program
{
    public Pets(Object data, Scanner work, int size) throws IOException
    {
        if (data.equals("Кот") ||
            data.equals("Кошка") ||
            data.equals("Cat"))
        {
            new Cats(3, work, size);
        }
        else if (data.equals("Собака") ||
                data.equals("Пёс") ||
                data.equals("Dog"))
        {
            new Dogs(3, work, size);
        }
        else if (data.equals("Хомяк") ||
                data.equals("Грызун") ||
                data.equals("Hamster"))
        {
            new Hamsters(3, work, size);
        }
    }
}
class Cats extends Pets
{
    Cats(int choi, Scanner work, int size) throws IOException
    {
        super(choi, work, size);
        Writer nib = new OutputStreamWriter(new FileOutputStream("Zootopia/zoolists/cats.txt", true), "UTF-8");
        BufferedReader bread = new BufferedReader(new InputStreamReader(new FileInputStream("Zootopia/zoolists/cats.txt"), "UTF-8"));
        if (choi == 1) 
        {
            if (size == 0) 
            {
                System.out.println("Тут пока никого нет!\n");
            }
            else
            {
                String line;
                while((line = bread.readLine()) != null) 
                {
                    System.out.println(line);
                }
            }
        }
        if (choi == 2) 
        {
            if (size == 0) 
            {
                System.out.println("Тут пока некого обучать!");
            }
            else 
            {
                if (size > 1) 
                {
                    System.out.println("Пожалуйста, введите номер, под которым записан ваш питомец в списке: ");
                    size = work.nextInt();
                }
                System.out.println("Введите одну или несколько (через пробел) команд, которым вы желаете обучить ваше животное: ");
                work.nextLine();
                String mycmd = work.nextLine();
                nib.write(size);
                nib.write(". " + mycmd);
                nib.write("\n");
                nib.flush();
            }
        }
        if (choi == 3)
        {
            System.out.println("Как зовут вашего питомца?\n");
            String name = work.nextLine();
            nib.write("\n");
            nib.write(size);
            nib.write(". " + name);
            nib.flush();
            System.out.println("\nВаш питомец был добавлен в список домашних животных! \nЕго номер в списке: " + size + "\n");
        }
        bread.close();
        nib.close();
    }
}
class Dogs extends Pets {
    Dogs(int choi, Scanner work, int size) throws IOException
    {
        super(choi, work, size);
        Writer nib = new OutputStreamWriter(new FileOutputStream("Zootopia/zoolists/dogs.txt", true), "UTF-8");
        BufferedReader bread = new BufferedReader(new InputStreamReader(new FileInputStream("Zootopia/zoolists/dogs.txt"), "UTF-8"));
        if (choi == 1) 
        {
            if (size == 0) 
            {
                System.out.println("Тут пока никого нет!\n");
            }
            else 
            {
                String line;
                while((line = bread.readLine()) != null) 
                {
                    System.out.println(line);
                }
            }
        }
        if (choi == 2) 
        {
            if (size == 0) 
            {
                System.out.println("Тут пока некого обучать!");
            }
            else 
            {
                if (size > 1) 
                {
                    System.out.println("Пожалуйста, введите номер, под которым записан ваш питомец в списке: ");
                    size = work.nextInt();
                }
                System.out.println("Введите одну или несколько (через пробел) команд, которым вы желаете обучить ваше животное: ");
                work.nextLine();
                String mycmd = work.nextLine();
                nib.write(size);
                nib.write(". " + mycmd);
                nib.write("\n");
                nib.flush();
            }
        }
        if (choi == 3)
        {
            System.out.println("Как зовут вашего питомца?\n");
            String name = work.nextLine();
            nib.write("\n");
            nib.write(size);
            nib.write(". " + name);
            nib.flush();
            System.out.println("\nВаш питомец был добавлен в список домашних животных! \nЕго номер в списке: " + size + "\n");
        }
        bread.close();
        nib.close();
    }
}
class Hamsters extends Pets 
{
    Hamsters(int choi, Scanner work, int size) throws IOException
    {
        super(choi, work, size);
        Writer nib = new OutputStreamWriter(new FileOutputStream("Zootopia/zoolists/hamsters.txt", true), "UTF-8");
        BufferedReader bread = new BufferedReader(new InputStreamReader(new FileInputStream("Zootopia/zoolists/hamsters.txt"), "UTF-8"));
        if (choi == 1) 
        {
            if (size == 0)
            {
                System.out.println("Тут пока никого нет!\n");
            }
            else 
            {
                String line;
                while((line = bread.readLine()) != null) 
                {
                    System.out.println(line);
                }
            }
        }
        if (choi == 2) 
        {
            if (size == 0) 
            {
                System.out.println("Тут пока некого обучать!");
            }
            else 
            {
                if (size > 1) 
                {
                    System.out.println("Пожалуйста, введите номер, под которым записан ваш питомец в списке: ");
                    size = work.nextInt();
                }
                System.out.println("Введите одну или несколько (через пробел) команд, которым вы желаете обучить ваше животное: ");
                work.nextLine();
                String mycmd = work.nextLine();
                nib.write(size);
                nib.write(". " + mycmd);
                nib.write("\n");
                nib.flush();
            }
        }
        if (choi == 3)
        {
            System.out.println("Как зовут вашего питомца?\n");
            String name = work.nextLine();
            nib.write("\n");
            nib.write(size);
            nib.write(". " + name);
            nib.flush();
            System.out.println("\nВаш питомец был добавлен в список домашних животных! \nЕго номер в списке: " + size + "\n");
        }
        bread.close();
        nib.close();
    }
}

