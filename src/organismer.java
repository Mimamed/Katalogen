public abstract class organismer
{

    //varje organism ska ha dessa grejer i sig, alltså ett namn, ålder, humör, position i djur listan och lunna förstöras
    int ålder, position;
    String namn, humör;

    public abstract void föd(int ålder, String namn, String humör, int position);

    public void döda()
    {
        arvprogram.djur.remove(position);
    }
}
