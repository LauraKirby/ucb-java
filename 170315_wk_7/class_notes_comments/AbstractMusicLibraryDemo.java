abstract class AbstractMusicLibrary
{
    String midiVoice1 = "acoustic guitar";
    String midiVoice2 = "electric guitar";
    AbstractMusicLibrary()
    {
        System.out.println("We, the vendor, provide 99 midi voices, and you, the customer-developer, can add your own custom voices to the library");
    }
    int getPianoVoice(String voiceName)
    {
        if(voiceName == "piano") return 1;
        else if(voiceName == "organ") return 2;
        else return 0;
    }
    int getGuitarVoice(String voiceName)
    {
        if (voiceName == "acousticGuitar") return 10;
        else if (voiceName == "electricGuitar") return 20;
        else return 0;
    }
    // we recommend a integer that is >= 100
    abstract int getYourCustomInstrumentVoice(String voicename);
}
class CustomMusicLibrary extends AbstractMusicLibrary
{
    int getYourCustomInstrumentVoice(String voicename) { return 100; }
}
class AbstractMusicLibraryDemo
{
   public static void main(String[] args)
   {
      CustomMusicLibrary cml = new CustomMusicLibrary();
      System.out.println(cml.getGuitarVoice("acousticGuitar"));
   }
}