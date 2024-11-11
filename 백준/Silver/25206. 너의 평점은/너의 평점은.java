import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> rating = new HashMap<>();
        rating.put("A+", 4.5);
        rating.put("A0", 4.0);
        rating.put("B+", 3.5);
        rating.put("B0", 3.0);
        rating.put("C+", 2.5);
        rating.put("C0", 2.0);
        rating.put("D+", 1.5);
        rating.put("D0", 1.0);
        rating.put("F", 0.0);

        double totalCredits = 0;  // 실제 평균에 포함될 학점의 합
        double result = 0;  // 총점수 합

        for (int i = 0; i < 20; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

            String subject = stringTokenizer.nextToken();
            double credit = Double.parseDouble(stringTokenizer.nextToken());
            String grade = stringTokenizer.nextToken();

            if (grade.equals("P"))
                continue; // "P" 과목 무시

            double gradeValue = rating.getOrDefault(grade, 0.0);
            result += credit * gradeValue;
            totalCredits += credit;
        }

        System.out.println(result / totalCredits);
    }
}
