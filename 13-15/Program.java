import java.util.*;

class Program
{
    public static void main(String[] args)
    {
        Scanner work = new Scanner(System.in);
        System.out.println("Здравствуйте!\n");
        while(true) 
        {
            System.out.println("Выберите желаемый пункт меню:\n (1) Просмотреть списки животных\n (2) Обучить животное\n (3) Завести новое животное\n (0) Выйти");
            int menu = work.nextInt();
            if (menu == 1) 
            {
                System.out.println("Список каких животных вы желаете увидеть?\n (1) Домашние \n(2) Вьючные \n(0) Выйти");
                int view = work.nextInt();
                if (view == 1) 
                {
                    new Pets(view);
                }
                else if (view == 2) 
                {
                    new Mounts(view);
                }
            }
            else if (menu == 2) 
            {
                System.out.println("Какое животное вы хотите обучить?\n (1) Домашние \n(2) Вьючные \n(0) Выйти");
            }
            else if (menu == 3) 
            {
                System.out.println("Введите название домашнего животного, которого желаете завести:");
                work.nextLine();
                String animal = work.nextLine();
                new Pets(animal);
                work.close();
            }
            else if (menu == 0) 
            {
                System.exit(0);
            }
        }
    }
}