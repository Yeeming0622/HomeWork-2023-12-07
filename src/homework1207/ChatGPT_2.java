package homework1207;

import java.util.Scanner;

public class ChatGPT_2 {
    public static void main(String[] args) {
        // 創建一個 Scanner 對象，用於從控制台讀取輸入
        Scanner scanner = new Scanner(System.in);

        // 提示用戶輸入姓名
        System.out.print("請輸入你的名字：");
        String name = scanner.nextLine();

        // 提示用戶輸入年齡
        System.out.print("請輸入你的年齡：");
        int age = scanner.nextInt();

        // 計算出生年份
        int birthYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - age;

        // 輸出結果
        System.out.println("你好，" + name + "！你的出生年份是：" + birthYear);

        // 關閉 Scanner
        scanner.close();
    }
}
