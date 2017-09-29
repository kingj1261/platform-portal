/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.ideafish.platform.portal.web.tool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 工具类
 *
 * @author mapingmp
 * @version $Id: FileIndex.java, v 0.1 2017年09月14日 下午2:57 mapingmp Exp $
 */
@Controller
public class FileIndex {

    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}