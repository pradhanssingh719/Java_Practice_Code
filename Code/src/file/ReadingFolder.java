package file;

import java.io.File;

public class ReadingFolder {

	public static void main(String[] args) {
		String folderpath = System.getProperty("user.dir") + "\\screenshots";
		File direcotry = new File(folderpath);
		if (direcotry.isDirectory() == false) {
			System.out.println("Not a Directory. Do Nothing.");
			return;
		} else {
			File[] files = direcotry.listFiles();
			for (File file : files) {
				System.out.println("Deleting old File: " + file.getName());
				file.delete();
			}
			System.out.println("Screenshot Folder cleaned.");
		}
	}

}
