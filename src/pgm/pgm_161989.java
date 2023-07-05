package pgm;

public class pgm_161989 {

    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        System.out.println(solution(n, m, section));
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int startSection = 0;
        int endSection = 0;
        for (int sectionNumber : section) {
            if (endSection < sectionNumber) {
                startSection = sectionNumber;
                endSection = startSection + m - 1;
                answer++;
            }
        }
        return answer;
    }

}
