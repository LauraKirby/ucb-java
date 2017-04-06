import java.io.*;

class FileFromKeyboard
{
    void makeFileFromKeyboard()
    {
        // --WRITE KEYBOARD INPUT TO A FILE------------------
        String stringFromUser;
        FileWriter fw;
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        try
        {
            // true for appending
            fw = new FileWriter("keyboard-to-disk.txt", true);

            System.out.println("Enter text ('stop' to quit).");
            do
            {
              System.out.print("> ");
              stringFromUser = br.readLine();

              if(stringFromUser.compareTo("stop") == 0) break;

              fw.write(stringFromUser);
            }
            while(stringFromUser.compareTo("stop") != 0);
            fw.close();
        }
        catch(IOException e)
        {
            e.getMessage();
        }

        System.out.println("Look at the output in file  keyboard-to-disk.txt");
    }

      void copyFile()
      {
        FileInputStream fis  = new FileInputStream("keyboard-to-disk.txt");
        FileOutputStream fos = new FileOutputStream("copy-of-keyboard-to-disk.txt");
        try
        {
            byte[] myBuffer = new byte[2048];
            int i = 0;
            while ((i = fis.read(myBuffer)) != -1)
            {
                fos.write(myBuffer, 0, i);
            }
        }
        catch (IOException e)
        {
            throw e;
        }
        finally
        {
            if (fis != null) fis.close();
            if (fos != null) fos.close();
        }
        System.out.println("Look at the copy in copy-of-keyboard-to-disk.txt");
  }
}

class KeyboardToDiskWithCopyOfOutputFile
{
  public static void main(String[] args) throws IOException
  {
    FileFromKeyboard ffk = new FileFromKeyboard();
    ffk.makeFileFromKeyboard();

    // --COPY THE FILE TO A NEW FILE------------------
    ffk.copyFile();
    System.out.println("We also provide a copy of the file, named copy-of-keyboard-to-disk.txt");
  }
}