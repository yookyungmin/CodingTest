package main.Lv1;

public class case1 {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;

        int[] answer = new int[2];

        for (int i = 0; i < route.length(); i++) {

            switch (route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'w':
                    east--;
                    break;
            }

        }
        answer[0] = east;
        answer[1] = north;
        return answer;

    }
}
