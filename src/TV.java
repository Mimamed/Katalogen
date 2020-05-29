public class TV extends saker
{
    //här skapar jag en class för en typ av objekt alltså TV. jag extendar "saker" klassen så jag slipper skriva så mycket

    TV(int volym, int tyngd, String namn, int position)
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
