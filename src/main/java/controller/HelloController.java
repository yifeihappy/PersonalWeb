package controller;

import bean.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.InputStream;


@Controller
public class HelloController {
    @RequestMapping(value="/hello")
    public ModelAndView hello() throws Exception{

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "hello world!");
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        return mv;
    }
}
