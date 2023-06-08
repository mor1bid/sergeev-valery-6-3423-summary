package Zootopia;
import java.util.*;
import java.io.Writer;
import java.io.Reader;
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
        Writer writer = new OutputStreamWriter(new FileOutputStream("Zootopia/zoolists/cats.txt", true), "UTF-8");
        Reader reader = new InputStreamReader(new FileInputStream("Zootopia/zoolists/cats.txt"), "UTF-8");
        if (choi == 1) 
        {
            if (size == 0) 
            {
                System.out.println("Тут пока никого нет!\n");
            }
            else 
            {
                System.out.println(reader + "\n");
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
                long key = size;
                if (size>0) 
                {
                    System.out.println("Пожалуйста, введите номер, под которым записан ваш питомец в списке: ");
                    key = work.nextInt();
                }
                System.out.println("Введите одну или несколько (через пробел) команд, которым вы желаете обучить ваше животное: ");
                String mycmd = work.nextLine();
                writer.write(" " + mycmd);
                writer.write("\n");
                writer.flush();
            }
        }
        if (choi == 3)
        {
            System.out.println("Как зовут вашего питомца?\n");
            String name = work.nextLine();
            writer.write("\n");
            writer.write(size);
            writer.write(" " + name);
            writer.flush();
            System.out.println("\nВаш питомец был добавлен в список домашних животных! \nЕго номер в списке: " + size + "\n");
        }
    }
}
class Dogs extends Pets {
    Dogs(int choi, Scanner work, int size) throws IOException
    {
        super(choi, work, size);
        Writer writer = new OutputStreamWriter(new FileOutputStream("Zootopia/zoolists/dogs.txt", true), "UTF-8");
        Reader reader = new InputStreamReader(new FileInputStream("Zootopia/zoolists/dogs.txt"), "UTF-8");
        if (choi == 1) 
        {
            if (size == 0) 
            {
                System.out.println("Тут пока никого нет!\n");
            }
            else 
            {
                System.out.println(reader.read() + "\n");
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
                long key = size;
                if (size>1) 
                {
                    System.out.println("Пожалуйста, введите номер, под которым записан ваш питомец в списке: ");
                    key = work.nextInt();
                }
                System.out.println("Введите одну или несколько (через пробел) команд, которым вы желаете обучить ваше животное: ");
                String mycmd = work.nextLine();
                writer.write(" " + mycmd);
                writer.write("\n");
                writer.flush();
            }
        }
        if (choi == 3)
        {
            System.out.println("Как зовут вашего питомца?\n");
            String name = work.nextLine();
            writer.write("\n");
            writer.write(size);
            writer.write(" " + name);
            writer.flush();
            System.out.println("\nВаш питомец был добавлен в список домашних животных! \nЕго номер в списке: " + size + "\n");
        }
    }
}
class Hamsters extends Pets 
{
    Hamsters(int choi, Scanner work, int size) throws IOException
    {
        super(choi, work, size);
        Writer writer = new OutputStreamWriter(new FileOutputStream("Zootopia/zoolists/hamsters.txt", true), "UTF-8");
        Reader reader = new InputStreamReader(new FileInputStream("Zootopia/zoolists/hamsters.txt"), "UTF-8");
        if (choi == 1) 
        {
            if (size == 0) 
            {
                System.out.println("Тут пока никого нет!\n");
            }
            else 
            {
                System.out.println(reader + "\n");
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
                long key = size;
                if (size>1) 
                {
                    System.out.println("Пожалуйста, введите номер, под которым записан ваш питомец в списке: ");
                    key = work.nextInt();
                }
                System.out.println("Введите одну или несколько (через пробел) команд, которым вы желаете обучить ваше животное: ");
                String mycmd = work.nextLine();
                writer.write(" " + mycmd);
                writer.write("\n");
                writer.flush();
            }
        }
        if (choi == 3)
        {
            System.out.println("Как зовут вашего питомца?\n");
            String name = work.nextLine();
            writer.write("\n");
            writer.write(size);
            writer.write(" " + name);
            writer.flush();
            System.out.println("\nВаш питомец был добавлен в список домашних животных! \nЕго номер в списке: " + size + "\n");
        }
    }
}

