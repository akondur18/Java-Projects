/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {
        int reviewers = Integer.parseInt(args[0]);
        int movies = Integer.parseInt(args[1]);
        int[][] ratings = new int[reviewers][movies];
        int [] total = new int[movies];
        int index = 2;
        for (int i = 0; i < reviewers; i++) {
            for (int j = 0; j < movies; j++) {
                ratings[i][j] = Integer.parseInt(args[index]);
                index++;
            }
        }
        for (int r = 0; r < reviewers; r++) {
            for (int m = 0; m < movies; m++) {
                 total[m] += ratings[r][m];
            }
        }
        int maxTotals = total[0];
        int ratingsIndex= 0;
        for(int a=0; a<movies; a++){
            if(maxTotals<total[a]){
                maxTotals=total[a];
                ratingsIndex=a;
            }
        }
        System.out.println(ratingsIndex);
    }
}
