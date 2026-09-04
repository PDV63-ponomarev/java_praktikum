package algorithm1;

public class AsymmetricComplexity2 {
    static void main(String[] args) {

    }

    // считать сумму элементов в массиве
    // сложность (длительность) возростает линейно согласно кол-ву элементов
    public void summElement(){
        int[] array = new int[]{1, 2, 3, 4, 6, 78, 6, 4, 2, 5, 4, 2, 2, 2};
        int summ = 0;
        for (int i = 0; i < array.length; i ++){
            summ += array[i];
        }
        System.out.println(summ);
    }


    // поиск совпадений в массиве.
    // запоминаем первый элемент, проходим по всем элементам, если есть совпадение запоминаем
    public void coincidence(){
        int[] array = new int[]{1, 2, 3, 4, 6, 78, 6, 4, 2, 5};

        boolean duplicateFout = false;
        for (int i = 0; i < array.length && !duplicateFout; i ++){
            for (int j = 0; j < array.length; j ++){
                //пропуск одинакового индекса, чтобы не сравнивать с самим собой
                if (j == i) continue;
                if (array[i] == array[j]){
                    duplicateFout = true;
                    break;
                }
            }
        }
        System.out.println("Дубликат найден: " + duplicateFout);
    }
}
