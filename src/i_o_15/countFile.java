package i_o_15;
import java.io.File;
public class countFile
{
    static int totalFiles = 0;
    static int totalDirs = 0;
    static int totalSize = 0;

    public static void main(String[] args)
    {
        if(args.length !=1) //입력된 데이터의 길이가 1이 아닌경우
        {
            System.out.println("USAGE : java DirectoryInfoTest DIRECTORY"); // 출력 후
            System.exit(0);  // 탈출(종료)
        }

        File dir = new File(args[0]);  // File 타입형의 객체를 만들고, args[0]을 매개변수로 받는다

        if(!dir.exists() || !dir.isDirectory())
        {//디렉토리가 존재하지 않거나 디랙토리가 디렉토리(폴더)가 아니면
            System.out.println("유효하지 않은 디렉토리입니다."); // 출력
            System.exit(0); //종료
        }

        countFiles(dir);

        System.out.println();
        System.out.println("총" +  totalFiles + "개의 파일");
        System.out.println("총" + totalDirs + "개의 디렉토리");
        System.out.println("크기" + totalSize + "bytes");
    }

    public static void countFiles(File dir)
    {/*
     (1) 아래의 로직에 맞게 코드를 작성하시오
     1. dir의 파일 목록(File[])을 얻어온다.

     2. 얻어온 파일목록의 파일 중에서...
     디렉토리이면, totalDirs의 값을 증가시키고 countFiles()를 재귀호출한다.
     3. 파일이면, totalRiles를 증가시키고 파일의 크기를 totalSize에 더한다.
     */
        File[] files =dir.listFiles(); // 1. dir의 파일 목록(File[])을 얻어온다.

        for (File file : files)
        {
            if (file.isDirectory()) //디렉토리이면, totalDirs의 값을 증가시키고
            {
                totalDirs++;
                countFiles(file); //countFiles()를 재귀호출한다.
            }
            else  // 파일이면, totalRiles를 증가시키고
            {
                totalFiles++; //totalRiles를 증가시키고
                totalSize += file.length();  //파일의 크기를 totalSize에 더한다.

            }
        }
    }
}
