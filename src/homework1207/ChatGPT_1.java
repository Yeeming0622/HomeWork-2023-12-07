package homework1207;

import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChatGPT_1 {
    public static void main(String[] args) {
        try {
            // 使用 NTP 服務提供的時間伺服器
            URL url = new URL("http://worldtimeapi.org/api/timezone/Asia/Taipei");
            URLConnection connection = url.openConnection();

            // 使用 BufferedReader 讀取 URL 中的內容
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // 逐行讀取並輸出內容，遇到逗號換行
            String line;
            while ((line = reader.readLine()) != null) {
                // 將逗號替換為換行符
                line = line.replace(",", "\n");
                System.out.println(line);
            }

            // 關閉資源
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
