public abstract class saker
{

    //varje sak(objekt) ska ha dessa saker i sig, alltså volym, tyngd, namn och position i objekt listan och kunna förstöras såklart
    int volym, tyngd, position;
    String namn;

    public abstract void skapa(int volym, int tyngd, String namn, int position);

    public void förstör()
    {
        arvprogram.obekter.remove(position);
    }
}
