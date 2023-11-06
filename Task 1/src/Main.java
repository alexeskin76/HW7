import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount;          //Жабьи глаза
        int ghoulTearsCount;        //Слезы вурдалака
        int ravenBonesCount;        //Кости ворона
        int dumplingsCount;         //Пельмени(а почему, собственно нет? xD )
        boolean isCanCook = false;


        //todo реализовать ввод пользователем кол-ва ингредиентов.

        System.out.println("Введите кол-во жабьих глаз: ");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Введите кол-во слез вурдалака: ");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.println("Введите кол-во костей ворона: ");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.println("Введите кол-во пельменей: ");
        dumplingsCount = new Scanner(System.in).nextInt();


        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можете приготовить эликсир зоркости");
            isCanCook = true;
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("Вы можете приготовить эликсир стойкости");
            isCanCook = true;
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("Вы можете приготовить эликсир скрытности");
            isCanCook = true;
        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4) {
            System.out.println("Вы можете приготовить запретный эликсир");
            isCanCook = true;
        }
        if (!isCanCook) {
            System.out.println("Вы не можете приготовить ни один эликсир");
        }
    }
}