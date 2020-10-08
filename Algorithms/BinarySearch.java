package Algorithms;
// Алгоритм бинарного поиска
public class BinarySearch {
    /* Функция, получающая на вход отсортированный массив и значение.
   Если значение присутствует в массиве, то функция возвращает его позицию */

    static Integer binary_search(int[]list, int item) {

        int low = 0;              	// В переменных low и high хранятся границы той части списка, в которой выполняется поиск
        int high = list.length - 1;

        while (low <= high) {				// Пока эта часть не сократится до одного элемента ... проверяем средний элемент
            double mid = (low + high)/2;
            int guess = list[(int) mid];
            if (guess == item)				// Значение найдено
                return (int) mid;			// Возвращаем значение mid, приведенное к целому числу, так как номер позиции может быть только целым числом
            if (guess > item)				// Много
                high = (int) (mid - 1);
            else							// Мало
                low = (int) (mid + 1);
        }
        return null;				// Значение не существует. Null означает "ничто"

    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] my_list = {1, 3, 5, 7, 9, 10, 31321, 43232, 2121, 44, 22}; // нумерация элементов начинается с нуля
        int x = binary_search(my_list, 10);
        System.out.println(x);



    }
}
