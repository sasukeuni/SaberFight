/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saberfight;

/**
 *
 * @author sasukeuni
 */
public class Constantes {
    private static int left = 0;
    private static int right = 0;
    private static String[] text = new String[5];

    public static int getLeft() {
        return left;
    }

    public static void setLeft(int left) {
        Constantes.left = left;
    }

    public static int getRight() {
        return right;
    }

    public static void setRight(int right) {
        Constantes.right = right;
    }

    public static String[] getText() {
        return text;
    }

    public static void setText(String[] text) {
        Constantes.setText(text);
    }
}
