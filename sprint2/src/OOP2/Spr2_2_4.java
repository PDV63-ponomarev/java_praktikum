package OOP2;

// есть 4 уровня защиты класса

// public  - есть доступ к элементу из любого места
// protected - есть доступ внутри пакета и классе-наследнике
// package-private (default) - доступ внутри пакета
// private - доступ только внутри класса

// для получения доступа к полям закрытого класса исп get и set
// get - позволяет получить значение из закрытой переменной
// set - позволяет сохранить новое значение в переменную
// можно называть по разному, но принято через get set

import java.util.Scanner;

public class Spr2_2_4 {
    static void main() {
        Bank bank = new Bank();
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько хотите положить на счет?");
        long money = scan.nextLong();
        bank.setMoney(money);
        System.out.println("На вашем счету " + bank.getMoney() + " руб.");
        System.out.println("Комиссия составила " + bank.getCommission() + " руб.");
    }
}

class Bank{
    private long money = 0;
    private long commission = 100;
    private boolean isOfficial = false; //банк государственный?

    public boolean isOfficial(){ //метод называется так же как переменная
        return isOfficial;
    }

    // get метод для получения значения
    public long getMoney(){
        return money;
    }
    public long getCommission(){
        return money;
    }

    // set медол для сохранения в money значения
    public void setMoney(long newMoneyAmount){
//        calculatetCommision(newMoneyAmount); // усложнение логики
        if (newMoneyAmount > 0 && newMoneyAmount > commission){
            money = newMoneyAmount - commission;
        } else {
            commission = 0;
            System.out.println("Минимальная сумма - 51 рубль.");
        }
    }

}