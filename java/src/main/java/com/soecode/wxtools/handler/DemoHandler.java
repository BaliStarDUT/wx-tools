package com.soecode.wxtools.handler;

import java.util.Map;

import com.soecode.wxtools.api.IService;
import com.soecode.wxtools.api.WxMessageHandler;
import com.soecode.wxtools.bean.WxXmlMessage;
import com.soecode.wxtools.bean.WxXmlOutMessage;
import com.soecode.wxtools.exception.WxErrorException;

public class DemoHandler implements WxMessageHandler{

	@Override
	public WxXmlOutMessage handle(WxXmlMessage wxMessage, Map<String, Object> context, IService iService)
			throws WxErrorException {
		WxXmlOutMessage xmlOutMsg = null;
        //必须以build()作为结尾，否则不生效。
        xmlOutMsg = WxXmlOutMessage.TEXT().content("恭喜你中奖了").toUser(wxMessage.getFromUserName()).fromUser(wxMessage.getToUserName()).build();
        
		return xmlOutMsg;
	}
	
}
