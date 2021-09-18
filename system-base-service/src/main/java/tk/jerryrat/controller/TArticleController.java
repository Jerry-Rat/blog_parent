package tk.jerryrat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TArticleController
 * @author: Bing
 * @Description
 * @date: 2021/9/17 14:14
 */
@RestController
public class TArticleController {
    @GetMapping("/")
    public String test(){
        return "succeed";
    }
}
