package com.du.study.controller.wms;

import com.alibaba.fastjson.JSONObject;
import com.du.study.entity.vo.WmsInboundRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("eis/wms")
public class WmsController {
    @PostMapping("/inboundTask")
    @ResponseBody
    public JSONObject WmsInboundController(WmsInboundRequest wmsInboundRequest){
       JSONObject object=new JSONObject();
       object.put("code",true);
       object.put("message","null");
        return object;
    }
}
