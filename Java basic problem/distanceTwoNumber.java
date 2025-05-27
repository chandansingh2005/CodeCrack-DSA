public class distanceTwoNumber {
    // program to calculate distance between two points
    public static double distance(int x1, int y1, int x2, int y2) {
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
        return dist;
    }

    public static void main(String args[]) {
        System.out.println(distance(2, 2, 4, 6));

    }

}



