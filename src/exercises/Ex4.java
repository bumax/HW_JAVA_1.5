package exercises;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

// Реализовать алгоритм пирамидальной сортировки (HeapSort)
public class Ex4 {
    public static void Run() {
        int size = 20;
        int[] srcArray = GetRandomArray(size);
        System.out.println(Arrays.toString(srcArray));
        // проходимся по массиву с конца до начала
        for (int i = size - 1; i > 0 ; i--) {
            // перестраиваем дерево
            BuildTree(srcArray, i);
            // свапаем значение с корня дерева (максимальное значение массива) в конец диапазона
            int tmp = srcArray[i];
            srcArray[i] = srcArray[0];
            srcArray[0] = tmp;
        }
        // выводим на печать готовый массив
        System.out.println(Arrays.toString(srcArray));

    }

    /**
     * Сортировка кучи: извлечение максимального значения в корень дерева
     * @param arr
     * @param i
     * @param len
     */
    private static void HeapSort(int[] arr, int i, int len) {
        // принимаем, что максимальное значение находится в корне дерева
        int max = i;
        // вычисляем индекс левой ветви
        int left = 2 * i + 1;
        // вычисляем индекс правой ветви
        int right = 2 * i + 2;
        // если левая ветка существует и её значение больше, чем в корне, меняем индекс максимального значения
        if (left < len && arr[max] < arr[left])
            max = left;
        // аналогично проверяем правую ветку
        if (right < len && arr[max] < arr[right])
            max = right;
        // если после всех проверок у нас максимальное значение не в корне, свапаем значения и рекурсивно ещё раз проходимся по дереву
        if (arr[max] != arr[i]) {
            int tmp = arr[i];
            arr[i] = arr[max];
            arr[max] = tmp;
            HeapSort(arr, i, len);
        }
    }

    /**
     * Построение бинарного дерева
     * @param arr
     * @param lMax
     */
    public static void BuildTree(int[] arr, int lMax){
        for (int i = lMax; i >= 0; i--) {
            HeapSort(arr, i, lMax);
        }
    }

    /**
     * Генератор случайного массива
     * @param size Размер массива
     * @return
     */
    public static int[] GetRandomArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) (Math.random() * 100);
        }
        return result;
    }
}
