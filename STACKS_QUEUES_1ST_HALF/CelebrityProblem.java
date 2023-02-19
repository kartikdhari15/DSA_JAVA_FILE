package STACKS_QUEUES_1ST_HALF;
import java.util.Stack;

public class CelebrityProblem {
    public static int findCelebrity(int[][] party) {
        int n = party.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            if (party[a][b] == 1) {
                // a knows b, so a cannot be the celebrity
                stack.push(b);
            } else {
                // a does not know b, so b cannot be the celebrity
                stack.push(a);
            }
        }

        int candidate = stack.pop();

        for (int i = 0; i < n; i++) {
            if (i != candidate && (party[candidate][i] == 1 || party[i][candidate] == 0)) {
                // candidate knows someone or someone doesn't know the candidate
                return -1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[][] party = {
                {0, 1, 1, 0},
                {1, 0, 1, 1},
                {0, 0, 0, 0},
                {0, 1, 1, 0}
        };

        int celebrity = findCelebrity(party);

        if (celebrity == -1) {
            System.out.println("No celebrity found.");
        } else {
            System.out.println("Celebrity found: " + celebrity);
        }
    }
}

