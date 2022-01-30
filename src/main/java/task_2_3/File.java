package task_2_3;

import java.io.*;

public class File {
    public static int count = 0;
    public static String write(Customer customer){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\IdeaProjects\\" +
                    "Spring_3_Add\\src\\main\\java\\task_2_3\\result.txt", true));

            bw.write(customer + "\r\n");

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.valueOf(++count);
    }
    public static String read(){
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\user\\" +
                    "IdeaProjects\\Spring_3_Add\\src\\main\\java\\task_2_3\\result.txt")));

            String str = null;
            while((str = br.readLine()) != null){
                sb.append(str).append("<br>");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
