package com.example.administrator.mooth08_demo01;

import java.util.ArrayList;

/**
 * data:2017/7/30
 * author:汉堡(Administrator)
 * function:
 */

public class XFBean {
    public ArrayList<WS> ws;

    public class WS {
        public ArrayList<CW> cw;
    }

    public class CW {
        public String w;
    }
}
