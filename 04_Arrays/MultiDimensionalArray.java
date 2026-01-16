public class MultiDimensionalArray {
    public static void main(String[] args) {

        // 2D Array
        int[][] flats = new int[3][3];

        // Initializing the 2D array
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;

        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        flats[2][0] = 301;
        flats[2][1] = 302;
        flats[2][2] = 303;

        // Displaying the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }

        // 3D Array
        int[][][] flats3d = new int[2][3][2];

        // Initializing the 3D array
        flats3d[0][0][0] = 101;
        flats3d[0][0][1] = 102;
        flats3d[0][1][0] = 103;
        flats3d[0][1][1] = 104;
        flats3d[0][2][0] = 105;
        flats3d[0][2][1] = 106;

        flats3d[1][0][0] = 201;
        flats3d[1][0][1] = 202;
        flats3d[1][1][0] = 203;
        flats3d[1][1][1] = 204;
        flats3d[1][2][0] = 205;
        flats3d[1][2][1] = 206;

        
         // just for example purpose of 3D array 
        // Displaying the 3D array
        System.out.println("\n3D Array:");
        for (int i = 0; i < flats3d.length; i++) {
            for (int j = 0; j < flats3d[i].length; j++) {
                for (int k = 0; k < flats3d[i][j].length; k++) {
                    System.out.print(flats3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
