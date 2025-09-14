//task12
import java.io.File;

class FileFinder {
    public static void main(String[] args) {
        FileFinder fileName=new FileFinder();
       File root= new File("C:\\Users\\CodeLine\\OneDrive\\Desktop\\codeline1\\code_creators_git\\from_hanin");
        String name="Close10.txt";
        fileName.findFileByName(root,name);
        System.out.println(fileName.findFileByName(root, name));
    }
    public File findFileByName(File rootDir, String fileName) {
        if (!rootDir.isDirectory()) {
            return null;
        } else {
            File[] files = rootDir.listFiles();
                for (File file : files) {
                    if (file.isFile() && file.getName().equalsIgnoreCase(fileName)) {
                        return file;
                    } else if (file.isDirectory()) {
                       return findFileByName(file, fileName);
                }
            }
        }
        return rootDir;
    }
}
