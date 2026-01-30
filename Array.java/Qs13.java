import java.util.*;

public class Qs13 {

    public static boolean escapeGhosts(int[][] ghosts, int[] target) {
        int myDist = Math.abs(target[0]) + Math.abs(target[1]);

        for (int[] ghost : ghosts) {
            int ghostDist = Math.abs(ghost[0] - target[0])
                          + Math.abs(ghost[1] - target[1]);

            if (ghostDist <= myDist) {
                return false;
            } 
        }     

        return true; 
    }            

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] ghosts = new int[n][2];

        for (int i = 0; i < n; i++) {
            ghosts[i][0] = sc.nextInt();
            ghosts[i][1] = sc.nextInt();
        }

        int[] target = new int[2];
        target[0] = sc.nextInt();
        target[1] = sc.nextInt();

        boolean result = escapeGhosts(ghosts, target);
        System.out.println(result);

        sc.close();
    }
}
