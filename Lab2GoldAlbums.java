import java.util.Scanner;
/** 
 * ACS-1904 Lab 2
 * @author  Sveinson
 */

public class Lab2GoldAlbums{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bandName = "";       // search key
        int bandIndex = -1;         // index of band search
        int nthGoldAlbum = -1;      // gold album search key

        // Prallel arrays
        String[] bands = {"The Beatles", "The Who", "Joe Jackson", "Rolling Stones",
                "U2", "Bob Marley","Cher"};

        String[][] goldAlbums = {{"Abbey Road", "Help", "Let It Be", "The White Album", "Beatles ‘65"},
                {"Who’s Next", "Live At Leeds", "Tommy"},
                {"Look Sharp", "Beat Crazy"},
                {"Aftermath", "Some Girls"},
                {"One", "Joshua Tree"},
                {"Legend", "Burnin’", "Natty Dread"},
                {"Believe"}};

        // get gold albums for a specific band
        System.out.println("enter a band/artist name:");
        bandName = scanner.nextLine();
        //System.out.println("band to search: " + bandName);

        // get the index of the band search key
        bandIndex = getBandIndex(bands, bandName);
        //System.out.println(bandIndex);

        // print the list of gold albums
        if(bandIndex >= 0)
            printGoldAlbums(goldAlbums, bandIndex);
        else
            System.out.println("Band not found.");

        System.out.println("\n");
        
        // print the nth gold album
        System.out.println("Enter n (1-7)");
        nthGoldAlbum = scanner.nextInt();

        System.out.println("Gold Album #" + nthGoldAlbum + ":");
        printNthGA(goldAlbums, bands, nthGoldAlbum);

        // end of program message
        System.out.println("\nend of program");
    }//end main
    /*****************************************
     * brief description of the methods purpose
     * 
     * @param        each parameter of the method should be listed with an @param
     * @param        parametername description of parameter
     * 
     * @return       any return value will be noted here
     * ****************************************/

    /*****************************************
     * print the nth gold album of each band
     *              if the nth gold album exists
     * 
     * @param        String[][] ga the 2d-array of gold albums
     * @param        Sting[] b array of bands
     * @param        int n the nth gold album
     * ****************************************/        
    public static void printNthGA(String[][] ga, String[] b, int n){
        for(int i = 0; i < ga.length; i++){
            if(ga[i].length >= n)
                System.out.println(b[i] + ": " + ga[i][n - 1]);
        }// end for
    }// end printNthWin

    /*****************************************
     * print all of the gold albums  of a specific band

     * @param        String[][] ga 2d array of gold albums
     * @param        int bIndex index of specific band
     * ****************************************/    
    public static void printGoldAlbums(String[][] ga, int bIndex){
        for(int j = 0; j < ga[bIndex].length; j++)
            System.out.print(ga[bIndex][j] + ", ");

    }// end pirntWins

    /*****************************************
     * return the index of the band search key
     * 
     * @param        String[] b array of band names
     * @param        String key band to search for
     * 
     * @return       int: index of band search key
     * ****************************************/    
    public static int getBandIndex(String[] b, String key){
        int bIndex = -1;
        //System.out.println(key.toLowerCase());

        for(int i = 0; i < b.length; i++){
            //System.out.println(d[i].toLowerCase());
            if(b[i].toLowerCase().equals(key.toLowerCase()))
                bIndex = i;
            //System.out.println(dIndex);
        }// end for

        return bIndex;
    }// end getDriverIndex
}
