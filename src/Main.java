public class Main {
    public static void main(String[] args)
    {
        for (int i= 1; i <= 10; i ++)
        {
            System.out.println(i);
        }
        for (int y = 10; y > 0; y = y - 1)
        {
            System.out.println(y);
        }
        for(int o = 0; o <= 17; o = o + 2)
        {
            System.out.println(o);
        }
        for(int r = 10; r >= -10; r = r - 1)
        {
            System.out.println(r);
        }
        for(int year = 1904; year <= 2096; year = year + 4)
        {
            System.out.println(year+" год является высокосным");
        }
        for(int t=7;t<100;t=t+7)
        {
            System.out.println(t);
        }
        for(int f=1;f<=512;f=f*2)
        {
            System.out.println(f);
        }
        int total1=0;
        int money1=29000;
        for (int h=1; h<=12;h++)
        {
            total1=total1+money1;
            System.out.println("месяц "+h+" сумма накоплений равна "+total1+" рублей");}
        int total=29000;
        int money=total/100;
        for (int h=1; h<=12;h++)
        {
            total=total+money;
        System.out.println("месяц "+h+" сумма накоплений равна "+total+" рублей");
        }

        int number=2;
        int j=0;
        for (int g=1; g<=10;g++)
        {
            number=2;
            number=number*g;
            System.out.println("2*"+g+"="+number);
        }
    }
}