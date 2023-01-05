/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Anushka Kondur
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {
        int randomNum= 0;
        double distance = 0.0;
        int x=0;
        int y=0;
        int newX = x;
        int newY =y;
        int num= Integer.parseInt(args[0]);
        int count = 0;
        System.out.println("("+ newX + "," + newY + ")");
        while (count<num) {
            randomNum = (int) (System.currentTimeMillis() % (3 * count + 11));
            randomNum = (randomNum % 4) + 1;
            if (randomNum == 1)
                newX += 1;
            else if (randomNum == 2)
                newX -= 1;
            else if (randomNum == 3)
                newY += 1;
            else if (randomNum == 4)
                newY -= 1;
            System.out.println("(" + newX + "," + newY + ")");
            count++;
        }
            distance = (newX - x)*(newX - x) + (newY - y)*(newY - y);
            System.out.println("Squared distance ="+ distance);

        }

    }

