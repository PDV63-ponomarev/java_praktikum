package oper_switch;

// switch - альтернатива if else с множеством вариантов
// блоки break и default необезательны

public class Spr2_1_2 {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee("Капучино");

        months();
    }

    public static void months(){
        int month = 5;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день");
                break;
            case 2:
                System.out.println("Это февраль. Здесь 28 или 29 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 дней");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}

class CoffeeMachine {
//    public void makeCoffee(String coffeeType){
//        if(coffeeType.equals("Капучино")){
//            makeEspresso();
//            addMilk();
//        } else if(coffeeType.equals("Американо")){
//            makeEspresso();
//            addWater();
//        }
//        else if (coffeeType.equals("Экспрессо")){
//            makeEspresso();
//        }else {
//            System.out.println("Такое не готовлю");
//        }
//    }

    public void makeCoffee(String coffeeType){
        switch (coffeeType){
            case "Капучино":
                makeEspresso();
                addMilk();
                break;
            case "Американо":
                makeEspresso();
                addWater();
                break;
            case "Экспрессо":
                makeEspresso();
                break;
            default:
                System.out.println("Такое не готовлю");
        }
    }

    public void makeEspresso(){
        System.out.println("Приготовлено экспрессо");
    }
    public void addMilk(){
        System.out.println("С молоком.");
    }
    public void addWater(){
        System.out.println("C водой");
    }

}