public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        // Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задача 6
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес " + totalWeight);
        var differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе " + differenceWeight);
        // Задача 7
        System.out.println("Задача 7");
        var differenceWeight1 = boxer2Weight - boxer1Weight;
        System.out.println("Вычитание " + differenceWeight1);
        var differenceWeight2 = boxer2Weight % boxer1Weight;
        System.out.println("Остаток от деления " + differenceWeight2);
        // Задача 8
        System.out.println("Задача 8");
        var workTime = 640;
        var hoursPerDay = 8;
        var workers = workTime / hoursPerDay;
        System.out.println("Всего работников в компании - " + workers);
        var newWorkers = workers + 94;
        var newWorkTime = newWorkers * 8;
        System.out.println("Если в компании работает " + newWorkers + " человека, то всего " + newWorkTime + " часов работы может быть поделено между сотрудниками ");
    }
}