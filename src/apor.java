public class apor extends organismer
{

    apor(int ålder, String namn, String humör, int position)
    {
        föd(ålder, namn, humör, position);
    }

    public void föd(int ålder, String namn, String humör, int position)
    {
        this.ålder = ålder;
        this.namn = namn;
        this.humör = humör;
        this.position = position;
    }
}
