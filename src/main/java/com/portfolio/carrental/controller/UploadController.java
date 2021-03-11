package com.portfolio.carrental.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping(value = "/uploadForm", method = RequestMethod.GET)
    public void uploadForm() {
        log.info("upload form");
    }

    @RequestMapping(value = "/uploadFormAction", method = RequestMethod.POST)
    public void uploadFormPost(MultipartFile[] uploadFile) {
        log.info("정상 접근");
        for (MultipartFile multipartFile : uploadFile) {
            log.info("============================");
            log.info("UploadFileName: " + multipartFile.getOriginalFilename());
            log.info("UploadFileSize: " + multipartFile.getSize());
        }
    }

    @RequestMapping(value = "/uploadAjax", method = RequestMethod.GET)
    public void uploadAjax(MultipartFile[] uploadFile) {
        log.info("upload ajax");
    }

    @RequestMapping(value = "/uploadAjaxAction", method = RequestMethod.POST)
    public void uploadAjaxPost(MultipartFile[] uploadFiles) {
        String uploadFolder = "C:\\TEMP\\upload";
        for (MultipartFile multipartFile : uploadFiles) {
            log.info("=====================");
            String uploadFileName = multipartFile.getOriginalFilename();
            log.info("Upload File Name : " + uploadFileName);
            log.info("Upload File Size : " + multipartFile.getSize());
            // IE has file path
            uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\") + 1);
            log.info("Only File Name : " + uploadFileName);

            File saveFile = new File(uploadFolder, uploadFileName);

            try {
                multipartFile.transferTo(saveFile);
			} catch (Exception e) {
				log.error(e.getStackTrace());
			}
		}
	}

}