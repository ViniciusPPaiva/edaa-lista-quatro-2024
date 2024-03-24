public class BuscaBinaria {
    public static void main(String[] args) {
        int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
                65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
                75, 76, 77, 78, 79, 80, 81,
                82, 83, 84, 85, 86, 87, 88, 89,
                90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };
            System.out.println(buscaIndices(listaNumeros, 99));  
    }
    public static int buscaIndices(int[] arr, int valorBusca) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (arr[mid] == valorBusca) {
                return mid;
            }
            if (arr[mid] < valorBusca) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}