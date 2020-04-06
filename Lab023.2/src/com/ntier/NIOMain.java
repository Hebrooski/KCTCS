package com.ntier;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class NIOMain {

	public static void main(String[] args) {
		String pathString = args[0];
		String globBoy = args[1];
		
		Path pth = Paths.get(pathString);
		PathMatcher pm = FileSystems.getDefault().getPathMatcher(globBoy);
		try(DirectoryStream<Path> ds = Files.newDirectoryStream(pth, "a*")) {
			for(Path currentPath : ds) {
				if(pm.matches(pth)) {
					System.out.println(currentPath);
				}
				else {
					System.out.println("No match");
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
