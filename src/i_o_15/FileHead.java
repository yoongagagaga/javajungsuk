package i_o_15;

        import java.io.BufferedReader;
        import java.io.File;
        import java.io.FileNotFoundException;
        import java.io.FileReader;

public class FileHead
{

    public static void main(String[] args)
    {
        try
        {
            int lineNum = Integer.parseInt(args[0]);
            String fileName = args[1];
            File f = new File(fileName);
            if(f.exists()&&!f.isDirectory()) {
                BufferedReader br = new BufferedReader(new FileReader(fileName));}
            String line = "";
            int i = 1;
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}


