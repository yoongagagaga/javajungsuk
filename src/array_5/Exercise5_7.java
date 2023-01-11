package array_5;
//Exercise5_6,7
public class Exercise5_7
{
/* Exercise5_6
    public static void main(String[] args)
    {
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money=" + money);

        for(int i = 0; i < coinUnit.length; i++ )
        {
            System.out.println(coinUnit[i] + "원 : " + money/coinUnit[i]);
            money = money%coinUnit[i];
        }
    }*/

    public static void main(String[] args)
    {
        if(args.length !=1)
        {// 아무 값도 입력받지 못했을 때
            System.out.println("USAGE: java Exercise5_7 3120");
            System.exit(0);
        }

        //문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생
        int money = Integer.parseInt(args[0]);

        System.out.println("money" + money);
        int[] coinUnit = {500, 100, 50, 10}; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 다누이별 동전의 개수

        for(int i = 0; i<coinUnit.length; i++)
        {
            int coinNum;
            coinNum = money/coinUnit[i];

            if(coin[i] >= coinNum)
            {// 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.
                coin[i] -= coinNum;
            }else {
                coinNum = coin[i];
                coin[i] = 0;
            }
            money -= coinNum*coinUnit[i];
            System.out.println(coinUnit[i] + "원: " + coinNum);
        }

        if(money > 0)
        {
            System.out.println("거스름돈이 부족합니다. ");
            System.exit(0); //종료
        }

        System.out.println("=남은 동전의 개수=");
        for(int i = 0; i<coinUnit.length; i++)
        {
            System.out.println(coinUnit[i] + "원 : " + coin[i]);
        }

    }

}
