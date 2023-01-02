package conditionalAndLoop_4;

public class Exercise4_3
{
    public static void main(String[] args)
    {
        int sum =0, sumsum = 0;

        for(int i = 1; i <= 10; i++)
        {
            sum += i;
            sumsum += sum;
        }
        System.out.println(sumsum);
    }
}
