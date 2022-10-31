package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        answer = getAnswer(number);

        return answer;
    }

    private static int getAnswer(int inputNumber) {
        String nowValueString = null;
        int result = 0;

        for(int i = 1; i <= inputNumber; i++) {
           nowValueString = String.valueOf(i);

           result += find369(nowValueString);
        }

        return result;
    }

    private static int find369(String inputString) {
        int result = 0;
        char nowChar;

        for (int i = 0; i < inputString.length(); i++) {
            nowChar = inputString.charAt(i);
            if (nowChar == '3' || nowChar == '6' || nowChar == '9') {
                result++;
            }
        }

        return result;
    }
}
