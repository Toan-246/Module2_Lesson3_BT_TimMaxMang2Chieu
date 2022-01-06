package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int row = sc.nextInt();

        System.out.println("Nhập số cột");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập phần tử hàng %d, cột %d: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("In mảng");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }

        int rowIndex = 0;
        int colIndex = 0;
        int max = arr[rowIndex][colIndex];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        System.out.println("max của mảng là : " + max + " Tại vị trí hàng " + rowIndex + ", cột " + colIndex);
    }
}
