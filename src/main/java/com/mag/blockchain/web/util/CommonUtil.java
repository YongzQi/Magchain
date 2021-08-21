package com.mag.blockchain.web.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CommonUtil{

    /**
     * get local ip
     * @return
     */
    public static String getLocalIp() {
		try {
            InetAddress ip4 = InetAddress.getLocalHost();
            return ip4.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
        }
        return "";
    }
}