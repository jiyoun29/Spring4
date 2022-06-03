package EZENWEB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Indexcontroller {

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("data","초동");
            return "main";
    }

    @GetMapping("/getdata")
    @ResponseBody // @ResponseBody:응답 객체
    public String getData(){
        return 초동200; //타임리프 사용시 반환타입 무조건 html 파일명 -> 오류 발생
            //ResponseBody 없을 경우 html 반환 [타임리프]
            //ResponseBody 있을 경우 java객체 반환
    }
}
