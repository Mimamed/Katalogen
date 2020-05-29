public class stolar extends saker
{
    //här skapar jag en class för en typ av objekt alltså stolar. jag extendar "saker" klassen så jag slipper skriva så mycket

    stolar(int volym, int tyngd, String namn, int position)
    {
        skapa(volym, tyngd, namn, position);
    }

    public void skapa(int volym, int tyngd, String namn, int position)
    {
        this.volym = volym;
        this.tyngd = tyngd;
        this.namn = namn;
        this.position = position;
    }

}
