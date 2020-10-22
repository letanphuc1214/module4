package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
//    static Map<String, String> listHashMap = new HashMap<>();
//    static {
//        listHashMap.put("computer", "may tinh");
//        listHashMap.put("dog", "con cho");
//        listHashMap.put("cat", "con meo");
//        listHashMap.put("book", "quyen sach");
//        listHashMap.put("house", "nha");
//    }
//    @GetMapping ("/dictionnary")
//    public String getTranslate(HttpServletRequest request){
//       String translate = request.getParameter("keyword");
//        if (listHashMap.containsKey(translate)){
//            request.setAttribute("vocabulary",listHashMap.get(translate));
//        }
//        else if (translate != null){
//            request.setAttribute("vocabulary", "tu nay khong co");
//        }
//        return "index";
//    }
    static Map<String, String> listHashmap = new HashMap<>();
    static {
        listHashmap.put("france", "phap");
        listHashmap.put("italy", "y");
        listHashmap.put("germany", "duc");
        listHashmap.put("Spain", "tay ban nha");
    }

@GetMapping ("/dictionary")
    public String getTranslate (HttpServletRequest request){
        String translate = request.getParameter("keyword");
        if (listHashmap.containsKey(translate)){
            request.setAttribute("vocabulary", listHashmap.get(translate));
        }
        else if (translate != null){
            request.setAttribute("vocabulary", "khong co tu nay trong tu dien");
        }
    return "index";
}

}
