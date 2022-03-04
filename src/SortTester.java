import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
//    /* --- SELECTION SORT --- */
//    int[] arr1 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
//    Sort.selectionSort(arr1);
//    System.out.println(Arrays.toString(arr1));
//
//    /* --- INSERTION SORT --- */
//    int[] arr2 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
//    Sort.insertionSort(arr2);
//    System.out.println(Arrays.toString(arr2));
//
//    int[] arr3 = {77, -5, -4, 100, 12, 6, 89, 13, 0, 54, 3, 86, -20, 14, 40, 19};
//    Sort.selectionSort(arr3);
//    System.out.println(Arrays.toString(arr3));
//
//    int[] arr4 = {77, -5, -4, 100, 12, 6, 89, 13, 0, 54, 3, 86, -20, 14, 40, 19};
//    Sort.insertionSort(arr4);
//    System.out.println(Arrays.toString(arr4));
//
//    int[] arr5 = {100, 89, 86, 77, 54, 40, 19, 14, 13, 12, 6, 3, 0, -4, -5, -20};
//    Sort.selectionSort(arr5);
//    System.out.println(Arrays.toString(arr5));
//
//    int[] arr6 = {100, 89, 86, 77, 54, 40, 19, 14, 13, 12, 6, 3, 0, -4, -5, -20};
//    Sort.insertionSort(arr6);
//    System.out.println(Arrays.toString(arr6));
//
//    int[] arr7 = {-5, -20, 0, -4, 3, 13, 6, 12, 14, 40, 19, 54, 77, 89, 100, 86};
//    Sort.selectionSort(arr7);
//    System.out.println(Arrays.toString(arr7));
//
//    int[] arr8 = {-5, -20, 0, -4, 3, 13, 6, 12, 14, 40, 19, 54, 77, 89, 100, 86};
//    Sort.insertionSort(arr8);
//    System.out.println(Arrays.toString(arr8));
//
//    int[] arr9 = {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100};
//    Sort.selectionSort(arr9);
//    System.out.println(Arrays.toString(arr9));
//
//    int[] arr10 = {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100};
//    Sort.insertionSort(arr10);
//    System.out.println(Arrays.toString(arr10));
//
//    int[] arrayAH = {6, 4, -8, 12, -12, 4, 30, 19, -1, -1, 27, 3, 15, 9, 22, 31, -35, 7, 4};
//    Sort.selectionSort(arrayAH);
//    System.out.println(Arrays.toString(arrayAH));
//
//    int[] arrayAHH = {6, 4, -8, 12, -12, 4, 30, 19, -1, -1, 27, 3, 15, 9, 22, 31, -35, 7, 4};
//    Sort.insertionSort(arrayAHH);
//    System.out.println(Arrays.toString(arrayAHH));
//
//    int[] arrayOH = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
//    Sort.selectionSort(arrayOH);
//    System.out.println(Arrays.toString(arrayOH));
//
//    int[] arrayOHH = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
//    Sort.insertionSort(arrayOHH);
//    System.out.println(Arrays.toString(arrayOHH));
//
//    int[] arrayUH = {8, 8, 8, 4, 4, 4, -7, -7, -7, -7 , 10, 10, 16, 16, 16, 3, 3, 3, 16, 10, -7, 3, 8, 4};
//    Sort.selectionSort(arrayUH);
//    System.out.println(Arrays.toString(arrayUH));
//
//    int[] arrayUHH = {8, 8, 8, 4, 4, 4, -7, -7, -7, -7 , 10, 10, 16, 16, 16, 3, 3, 3, 16, 10, -7, 3, 8, 4};
//    Sort.insertionSort(arrayUHH);
//    System.out.println(Arrays.toString(arrayUHH));

//      int[] arrAY = {21, 8, 7, 4, 8, 4, -7, 4, -7, -7 , 10, 10, 16, -7, 16, 21, 3, 3, 16, 4, -7, 3, 8, 4, 9, 21};
//      Arrays.sort(arrAY);
//      System.out.println(Arrays.toString(arrAY));

      int[] stop = {21, 8, 7, 4, 8, 4, -7, 4, -7, -7 , 10, 10, 16, -7, 16, 21, 3, 3, 16, 4, -7, 3, 8, 4, 9, 21};
      Sort.selectionSortDescending(stop);
      System.out.println(Arrays.toString(stop));

      int[] please = {21, 8, 7, 4, 8, 4, -7, 4, -7, -7 , 10, 10, 16, -7, 16, 21, 3, 3, 16, 4, -7, 3, 8, 4, 9, 21};
      Sort.insertionSortDescending(please);
      System.out.println(Arrays.toString(please));


  }
}
