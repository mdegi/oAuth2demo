package mt.com.md.oath2demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ApplicationController {

        
    @RequestMapping(value = "/publicpage")
    public String publicPage() {
        return "<html><br/>Hello you have entered a Public page successfully</html>";
    }


    @RequestMapping(value = "/privatepage")
    public String privatePage() {
        return "<html><br/>Hello you have entered a secured and private page successfully</html>";
    }

    @RequestMapping("user")
    @ResponseBody
    public Principal user(Principal principal) {
        return  principal;
    }

}


