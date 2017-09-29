/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ideafish.platform.portal.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 首页
 *
 * @author mapingmp
 * @version $Id: HomeIndex.java, v 0.1 2017年09月14日 下午2:57 mapingmp Exp $
 */
@Controller
public class HomeIndex {

    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}