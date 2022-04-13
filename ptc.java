import java.io.*;
import java.util.*;

public class Solution 
{
    public static boolean Game(int[] game, int leap)
    {
        return Solutions(game, leap, 0);
    }
    private static boolean Solutions(int[] game, int leap, int i)
    {
        if(i<0 || game[i]==1)
        {
            return false;
        }  
        if(i==game.length-1 || i+leap > game.length-1)
        {
            return true;
        }
        game[i] = 1;
         return Solutions(game, leap,i+1) || Solutions(game, leap,i-1) || Solutions(game, leap, i+leap);
    }
    

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int j=0;j<T;j++)
        {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.println(Game(arr, q) ? "YES" : "NO");
        }    
        
    }
}