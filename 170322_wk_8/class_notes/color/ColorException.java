package color;
public class ColorException extends Exception
{
    private String errorString;
    public ColorException(String s)
    {
        this.errorString = s;
    }
    public String getError()
    {
        return this.errorString;
    }
}