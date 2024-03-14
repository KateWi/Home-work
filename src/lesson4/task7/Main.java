package lesson4.task7;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[8][8];
        String w = "W";
        String b = "B";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = w;
                    //System.out.print(b + " ");
                } else {
                    array[i][j] = b;
                    //System.out.print(w + " ");
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}