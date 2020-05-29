import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arvprogram
{

    //här skapar jag listorna för katalogen
    static List<saker> obekter = new ArrayList<saker>();
    static List<organismer> djur = new ArrayList<organismer>();

    public static void main(String[] args)
    {
        djur.add(new apor(4, "chimpans", "glad", djur.size()));
        djur.add(new apor(7, "gorrilla", "arg", djur.size()));

        obekter.add(new TV(1, 100, "SFBio", obekter.size()));
        obekter.add(new TV(3, 500, "MatrixBio", obekter.size()));
        obekter.add(new stolar(1, 10, "soffa", obekter.size()));

        for (organismer djur :djur)
        {
            System.out.println(djur.namn);
        }
        for (saker objekt: obekter)
        {
            System.out.println(objekt.namn);
        }

        obekter.get(2).förstör();
        System.out.println("nu mitt hus brändes, detta är vad jag har nu");

        for (organismer djur :djur)
        {
            System.out.println(djur.namn);
        }
        for (saker objekt: obekter)
        {
            System.out.println(objekt.namn);
        }


    }
}
