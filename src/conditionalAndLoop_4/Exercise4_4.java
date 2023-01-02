package conditionalAndLoop_4;

public class Exercise4_4
{
    public static void main(String[] args)
    {
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;

        for(int i = 1; sum<100; i++, s = -s)
        {
            num = s * i;  // i 와 부호 (s) 를 곱해서 더할 값을 구한다.
            sum += num;
        }
        System.out.println("num = " + num);
        System.out.println("sum = " + sum);
    }
}
