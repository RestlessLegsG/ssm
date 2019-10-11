    package com.how2java.controller;


    import com.alibaba.fastjson.JSON;
    import com.how2java.pojo.LinkMan;
    import com.how2java.pojo.Producer;
    import com.how2java.service.LinkManService;
    import com.how2java.service.ProducerService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestMethod;
    import org.springframework.web.bind.annotation.ResponseBody;
    import org.springframework.web.servlet.ModelAndView;

    import javax.servlet.http.HttpServletRequest;
    import java.util.HashMap;
    import java.util.Map;


    @Controller

@RequestMapping("")
    public class ProducerController {
        @Autowired
        ProducerService producerservice;
        @Autowired
        LinkManService linkManService;
        @RequestMapping(value="/page/nameCheck",method= RequestMethod.POST)
        @ResponseBody
        public String poducerNameCheck(HttpServletRequest request)
                throws Exception {
            String producername=request.getParameter("producername");

            System.out.println("服务端接收到的数据是：" +producername);

            Producer producer = producerservice.getName(producername);

            Map<String,Object> resultMap = new HashMap<>();
                if (producer==null){
                    resultMap.put("msg", "success");

            }else {
                    resultMap.put("msg", "fail");

        }
            return JSON.toJSONString(resultMap);
        }


        @RequestMapping("/page")
        public ModelAndView listAllname(){
            ModelAndView mav=new ModelAndView();
            Map map=new HashMap<>();

            for(LinkMan linkMan:linkManService.namelist())
            {
              map.put(linkMan.getLinkName(),linkMan.getId());
            }
            System.out.println("服务收到的数据是：" +map.toString());
            mav.addObject("map",map);
            mav.setViewName("/page");
            return mav;
        }




    }
