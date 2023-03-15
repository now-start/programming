import java.io.*;

// 1076
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws NumberFormatException, IOException {
        String temp = "";
        for (int i = 0; i < 2; i++) {
            switch (br.readLine()) {
                case "black":
                    temp += 0;
                    break;
                case "brown":
                    temp += 1;
                    break;
                case "red":
                    temp += 2;
                    break;
                case "orange":
                    temp += 3;
                    break;
                case "yellow":
                    temp += 4;
                    break;
                case "green":
                    temp += 5;
                    break;
                case "blue":
                    temp += 6;
                    break;
                case "violet":
                    temp += 7;
                    break;
                case "grey":
                    temp += 8;
                    break;
                case "white":
                    temp += 9;
                    break;
            }
        }

        long result = Integer.parseInt(temp);
        switch (br.readLine()) {
            case "black":
                result *= 1;
                break;
            case "brown":
                result *= 10;
                break;
            case "red":
                result *= 100;
                break;
            case "orange":
                result *= 1000;
                break;
            case "yellow":
                result *= 10000;
                break;
            case "green":
                result *= 100000;
                break;
            case "blue":
                result *= 1000000;
                break;
            case "violet":
                result *= 10000000;
                break;
            case "grey":
                result *= 100000000;
                break;
            case "white":
                result *= 1000000000;
                break;
        }

        bw.write(result + "");
        bw.flush();
    }

}
