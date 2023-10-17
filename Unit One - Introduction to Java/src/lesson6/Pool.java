package lesson6;

import java.util.Scanner;

public class Pool {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

        int length = 20; 
        int shallowLength = 5;
        int transition = 7;
        int shallowHeight = 3;
        int deepHeight = 8;
        int width = 8; 

        int linerCost = 2;

        //int transitionBase = Math.sqrt(transition * transition - (deepHeight - shallowHeight));
        
        /*System.out.print("Please enter the length of the pool: ");
        int length = in.nextInt();

        System.out.print("Please enter the width of the pool: ");
        int width = in.nextInt();

        System.out.print("Please enter the depth of the shallow end: ");
        int shallowDepth = in.nextInt();

        System.out.print("Please enter the depth of the deep end: ");
        int deepDepth = in.nextInt();

        System.out.print("Please enter the transition length: ");
        int transitionLength = in.nextInt();

        System.out.println("Please enter the length of the shallow end: ");
        int shallowLength = in.nextInt();

        System.out.println("Please enter the price per metre squared of the liner: ");
        int linerCost = in.nextInt();
*/

        double shallowSideWallArea = shallowHeight*shallowLength;
        double shallowVolume = shallowSideWallArea * width;

        double transitionHeight = deepHeight - shallowHeight;
        double transitionBaseLength = Math.sqrt(transition*transition - transitionHeight*transitionHeight);
        double transitionSideWallArea = 0.5*transitionBaseLength * transitionHeight;
        double transitionVolyme = (transitionSideWallArea + (shallowHeight + transitionBaseLength)) * width;
        
        double deepEndSideArea = deepHeight * (length - shallowLength - transitionBaseLength);
        double deepVolume = deepEndSideArea * width;
        in.close();
    }
}
