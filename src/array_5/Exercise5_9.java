package array_5;

public class Exercise5_9
{
    public static void main(String[] args)
    {
        char[][] star =
                {
                        {'*','*',' ',' ',' '},
                        {'*','*',' ',' ',' '},
                        {'*','*','*','*','*'},
                        {'*','*','*','*','*'}
                };

        char[][] result = new char[star[0].length][star.length];

        for(char[] chars : star){
            for(char aChars : chars)
            {
                System.out.print(aChars);
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < star.length; i++)
        {
            for(int j=0; j<star[i].length; j++)
            {
                int x =j;
                int y = star.length-1-i;

                result[x][y] = star[i][j];
            }
        }
        for(char[] chars : result)
        {
            for(char aChars : chars)
            {
                System.out.print(aChars);
            }
            System.out.println();
        }
    }
}
