import java.time.*;
public interface InterfaceWithDefaultAndStaticMethods
{
  static ZonedDateTime getGMT()
  {
      ZonedDateTime currentDate = ZonedDateTime.now(ZoneOffset.UTC);
      return currentDate;
  }
  static String showString()
  {
    return "hello";
  }
  default double getDefaultAccountBalance()
  {
      return 0.0;
  }
  default boolean getTrue()
  {
      return true;
  }
}