package Zootopia;
import java.util.*;

public class Program
{
    public static void main(String[] args)
    {
        Scanner work = new Scanner(System.in);
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
                        new Cats(1, work);
                    }
                    else if (pet == 2) 
                    {
                        new Dogs(1, work);
                    }
                    else if (pet == 3) 
                    {
                        new Hamsters(1, work);
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
                        new Cats(2, work);
                    }
                    else if (pet == 2) 
                    {
                        new Dogs(2, work);
                    }
                    else if (pet == 3) 
                    {
                        new Hamsters(2, work);
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
                new Pets(animal, work);
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