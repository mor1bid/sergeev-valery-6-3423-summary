package Zootopia;
import java.util.*;
import java.io.File;
import java.io.Writer;
import java.io.Reader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
        doglist.createNewFile();
        Writer noter = new OutputStreamWriter(new FileOutputStream("Zootopia/zoolists/", true), "UTF-8");
        Reader seeker = new InputStreamReader(new FileInputStream("Zootopia/zoolists/"), "UTF-8");
        long fize = Files.size(Paths.get("Zootopia/zoolists/pets.txt"));
        int size = (int) (long) fize;
        if (size < 1) 
        {
            size = 0;
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
                        new Cats(1, work, noter, seeker, size);
                    }
                    else if (pet == 2) 
                    {
                        new Dogs(1, work, noter, seeker, size);
                    }
                    else if (pet == 3) 
                    {
                        new Hamsters(1, work, noter, seeker, size);
                    }
                }
                else if (view == 2) 
                {
                    new Mounts(view);
                }
                
            }
            else if (menu == 2) 
            {
                System.out.println("Какое животное вы хотите обучить?\n(1) Домашние \n(2) Вьючные \n(0) Выйти");
                int choi = work.nextInt();
                if (choi == 1) 
                {
                    System.out.println("\n(1) Кошки\n(2) Собаки\n(3) Хомяки\n(0) Выйти\n");
                    int pet = work.nextInt();
                    if (pet == 1) 
                    {
                        new Cats(2, work, noter, seeker, size);
                    }
                    else if (pet == 2) 
                    {
                        new Dogs(2, work, noter, seeker, size);
                    }
                    else if (pet == 3) 
                    {
                        new Hamsters(2, work, noter, seeker, size);
                    }
                }
                else 
                {
                    System.out.println("\n(1) Лошади\n(2) Ослы\n(3) Верблюды\n(0) Выйти\n");
                    int pet = work.nextInt();
                    if (pet == 1) 
                    {
                        new Horses(2, work);
                    }
                    else if (pet == 2) 
                    {
                        new Donkeys(2, work);
                    }
                    else if (pet == 3) 
                    {
                        new Camels(2, work);
                    }
                }

            }
            else if (menu == 3) 
            {
                System.out.println("Введите название домашнего животного, которого желаете завести:");
                work.nextLine();
                String animal = work.nextLine();
                new Pets(animal, work, noter, seeker, size);
                // work.close();
            }
            else if (menu == 0) 
            {
                System.out.println("До встречи!");
                System.exit(0);
            }
        }
    }
}