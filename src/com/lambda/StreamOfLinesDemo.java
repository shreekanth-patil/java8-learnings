package com.lambda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOfLinesDemo {
	
	/**
	 * @throws IOException
	 * 
	 * Normal IO operation till java 7
	 */
	@SuppressWarnings("unused")
	private static void readLinesUsingFileReader() throws IOException
	{
	    File file = new File("c:/temp/data.txt");
	    FileReader fr = new FileReader(file);
	    BufferedReader br = new BufferedReader(fr);
	    String line;
	    while((line = br.readLine()) != null){
	        if(line.contains("password")){
	            System.out.println(line);
	        }
	    }
	    br.close();
	    fr.close();
	}
	
	/**
	 * @throws IOException
	 * Read file lazily as stream of lines
	 */
	@SuppressWarnings("unused")
	private static void readStreamOfLinesUsingFiles() throws IOException
	{
	    Stream<String> lines = Files.lines(Paths.get("c:/temp", "data.txt"));
	    Optional<String> hasPassword = lines.filter(s -> s.contains("password")).findFirst();
	    if(hasPassword.isPresent()){
	        System.out.println(hasPassword.get());
	    }
	    //Close the stream and it's underlying file as well
	    lines.close();
	}
	
	/**
	 * @throws IOException
	 * Read file as stream of lines with try-with-resources
	 */
	@SuppressWarnings("unused")
	private static void readStreamOfLinesUsingFilesWithTryBlock() throws IOException
	{
	    Path path = Paths.get("c:/temp", "data.txt");
	    //The stream hence file will also be closed here
	    try(Stream<String> lines = Files.lines(path)){
	        Optional<String> hasPassword = lines.filter(s -> s.contains("password")).findFirst();
	        if(hasPassword.isPresent()){
	            System.out.println(hasPassword.get());
	        }
	    }
	}
	
	/**
	 * @throws IOException
	 * If you want to test if the underlying file is closed or not, you can check it like this:
	 */
	@SuppressWarnings("unused")
	private static void readStreamOfLinesUsingFilesWithTryBlock2() throws IOException
	{
	    Path path = Paths.get("c:/temp", "data.txt");
	    //When filteredLines is closed, it closes underlying stream as well as underlying file.
	    try(Stream<String> filteredLines = Files.lines(path)
	                                    //test if file is closed or not
	                                    .onClose(() -> System.out.println("File closed"))
	                                    .filter(s -> s.contains("password"))){
	        Optional<String> hasPassword = filteredLines.findFirst();
	        if(hasPassword.isPresent()){
	            System.out.println(hasPassword.get());
	        }
	    }
	}

}
