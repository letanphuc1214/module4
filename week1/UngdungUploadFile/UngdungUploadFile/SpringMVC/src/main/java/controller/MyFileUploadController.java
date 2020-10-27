package controller;

import form.MyUploadForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

@Controller

public class MyFileUploadController {
    // Phương thức này được gọi mỗi lần có Submit.
//    @InitBinder
//    public void initBinder(WebDataBinder dataBinder) {
//        Object target = dataBinder.getTarget();
//        if (target == null) {
//            return;
//        }
//        System.out.println("Target=" + target);
//        if (target.getClass() == MyUploadForm.class) {
//            // Đăng ký để chuyển đổi giữa các đối tượng multipart thành byte[]
//            dataBinder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
//        }
//    }

    // GET: Hiển thị trang form uploadfh

    @GetMapping(value = "/uploadOneFile")
    public String uploadOneFileHandler(Model model) {
        return "test";
    }

    // POST: Xử lý Upload

    @PostMapping(value = "/uploadOneFile")
    public String uploadOneFileHandlerPOST(Model model, @RequestParam("fileUpdate") MultipartFile fileUpdate) {
        MyUploadForm myUploadForm = new MyUploadForm();
        myUploadForm.setFileUpdate(fileUpdate);
        myUploadForm.upLoadFile();
        model.addAttribute("image",myUploadForm.image);
         return "_menu";
    }

}