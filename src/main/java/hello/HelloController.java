package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    Bullshit bs=new Bullshit("Bob Nunz", 58, 73);
    
    @RequestMapping("/")
    public Bullshit index() {
        return bs;
    }
    
}
