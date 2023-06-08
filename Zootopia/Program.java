package Zootopia;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Hourglass 
{
    void add() 
    {
        int cow = 0;
        cow++;
    }
}

public class Program
{
    public static void main(String[] args) throws IOException
    {
        Scanner work = new Scanner(System.in);
        File catlist = new File("Zootopia/zoolists/cats.txt");
        catlist.getParentFile().mkdir();
        catlist.createNewFile();
        File doglist = new File("Zootopia/zoolists/dogs.txt");
        doglist.createNewFile();
        File hamlist = new File("Zootopia/zoolists/hamsters.txt");
        hamlist.createNewFile();
        long fize = Files.size(Paths.get("Zootopia/zoolists/cats.txt"));
        int size = 0;
        if (size > 0) 
        {
            size = (int) (long) fize;
        }
        System.out.println("Здравствуйте!\n");
        while(true) 
        {
            System.out.println("Выберите желаемый пункт меню:\n (1) Просмотреть списки животных\n (2) Обучить животное\n (3) Завести новое животное\n (0) Выйти\n");
            int menu = work.nextInt();
            if (menu == 1) 
            {
                System.out.println("Список каких животных вы желаете увидеть?\n(1) Домашние \n(2) Вьючные \n(0) Выйти\n");
                int view = work.nextInt();
                if (view == 1)
                {
                    System.out.println("\n(1) Кошки\n(2) Собаки\n(3) Хомяки\n(0) Выйти\n");
                    int pet = work.nextInt();
                    if (pet == 1) 
                    {
                        new Cats(1, work, size);
                    }
                    else if (pet == 2) 
                    {
                        new Dogs(1, work, size);
                    }
                    else if (pet == 3) 
                    {
                        new Hamsters(1, work, size);
                    }
                }
                else if (view == 2) 
                {
                    System.out.println("\n(1) Лошади\n(2) Ослы\n(3) Верблюды\n(0) Выйти\n");
                    int pet = work.nextInt();
                    if (pet == 1) 
                    {
                        new Horses(1);
                    }
                    else if (pet == 2) 
                    {
                        new Donkeys(1);
                    }
                    else if (pet == 3) 
                    {
                        new Camels(1);
                    }
                }
                
            }
            else if (menu == 2) 
            {
                System.out.println("Какое домашнее животное вы хотите обучить? \n(1) Кошку\n(2) Собаку\n(3) Хомяка\n(0) Выйти\n");
                int pet = work.nextInt();
                if (pet == 1) 
                {
                    new Cats(2, work, size);
                }
                else if (pet == 2) 
                {
                    new Dogs(2, work, size);
                }
                else if (pet == 3) 
                {
                    new Hamsters(2, work, size);
                }
            }
            else if (menu == 3) 
            {
                System.out.println("Введите название домашнего животного, которого желаете завести:");
                work.nextLine();
                String animal = work.nextLine();
                new Pets(animal, work, size);
                size++;
            }
            else if (menu == 0) 
            {
                System.out.println("До встречи!");
                System.exit(0);
            }
        }
    }
}