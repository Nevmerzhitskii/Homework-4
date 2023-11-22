public class Main {
    public static void main(String[] args) {

        System.out.println( "Задача №1 ");

        int age = 18;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний ");
        }
        if (age < 18){
            System.out.println("Если возраст человека равен " + age + " он не достиг совершенолетия, " +
                    "нужно немгого подождать");
        }

        System.out.println( "Задача №2 ");

        int outsideTemp = 6;
        if (outsideTemp > 5) {
            System.out.println("На улице " + outsideTemp  + " градусов можно идти без шапки ");
        }
        if (outsideTemp < 5){
            System.out.println("На улице " + outsideTemp  + " градусов нужно надеть шапку ");
        }

        System.out.println( "Задача №3 ");

        int speed = 59;
        if (speed < 60){
            System.out.println("Если скорость " + speed + " км/ч то можно ездить спокойно");
        }
        if (speed > 60){
            System.out.println("Если скорость " + speed + " км/ч то придется заплатить штраф спокойно");
        }

        System.out.println( "Задача №4 ");

        int humanAge = 25;
        if (humanAge > 2 && humanAge < 6 ) {
            System.out.println("Если возраст человека равен " + humanAge + " годам, то ему нужно ходить в детский сад");
        }
        if (humanAge > 7 && humanAge < 17){
            System.out.println("Если возраст человека равен " + humanAge + " годам, то ему нужно ходить в школу");
        }
        if (humanAge >= 18 && humanAge <= 24){
            System.out.println("Если возраст человека равен " + humanAge + " годам," +
                    " то его место в университете");
        }
        if (humanAge > 24){
            System.out.println("Если возраст человека равен " + humanAge + " годам," +
                    " то ему пора ходить на работу");
        }

        System.out.println( "Задача №5 ");

        int childAge = 13;
        if (childAge < 5){
            System.out.println("Если возраст ребенка " + childAge + " года, " +
                    "то ему нельзя кататься на аттракционе");
        }
        if (childAge > 5 && childAge < 14){
            System.out.println("Если возраст ребенка " + childAge + " лет, " +
                    "то он может кататься только в сопровождении взрослого");
        }
        if (childAge > 14){
            System.out.println("Если возраст ребенка " + childAge + " лет, " +
                    "то он может кататься без сопровождения взрослого");
        }

        System.out.println( "Задача №6 ");


        int qualitySeatPassengers = 59;
        int qualityStandingPassengers = 41;
        int trainCapacity = qualitySeatPassengers + qualityStandingPassengers;
        int freSeatPlases = 60 - qualitySeatPassengers ;
        int freStandingPlases = 42 - qualityStandingPassengers;

        if ( trainCapacity >= 102){
            System.out.println("Вагон переполнен ");
        }
        else{
            System.out.println( "В вагоне сидячих свободных мест " + freSeatPlases +
                    " свободных стоячих мест " + freStandingPlases);
        }


        System.out.println( "Задача №7 ");

        int one = 1;
        int two = 2;
        int three = 3;

        if (three > two && one < three){
            System.out.println("Наибольшее число " + three );
        }
        else if ( two > one){
            System.out.println("Наибольшее число " + two );
        }
        else {
            System.out.println(" Наибольшее число " + one);
        }



























    }
}