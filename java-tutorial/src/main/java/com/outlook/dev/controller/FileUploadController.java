package com.outlook.dev.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	
	public static String uploadDirectory="C:\\TEJA_WS\\OutlookAPI_WS\\java-tutorial\\uploads";
	
	
@RequestMapping(value="/uploadview")
public String uploadPage(Model model) {
 System.out.println("this method name is uploadPage().");
	return "uploadview";
}
@RequestMapping(value="/uploadstatusview.html",headers = "content-type=multipart/*")
public String upload(Model model,@RequestParam("files") MultipartFile[] files) throws IllegalArgumentException,MultipartException{
	 System.out.println("Before creating folder");
		System.out.println(uploadDirectory);

	new File(uploadDirectory).mkdir();
	
	 System.out.println("After creating folder");

	StringBuilder fileNames= new StringBuilder();
	for(MultipartFile file: files) {
		Path fileNameAndPath= Paths.get(uploadDirectory,file.getOriginalFilename());
		fileNames.append(file.getOriginalFilename());
		try {
			Files.write(fileNameAndPath, file.getBytes());
			 System.out.println("After writing to file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    model.addAttribute("msg", "Successfully uploaded files "+fileNames.toString());
    System.out.println("Before returning jsp page");
    return "uploadstatusview";
}
}
