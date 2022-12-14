package com.mz.reader.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Utils {
    public static String mdsDigest(String source, Integer salt) {
        char[] ca = source.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            ca[i] = (char) (ca[i] + salt);
        }

        String target = new String(ca);
        String md5 = DigestUtils.md5Hex(target);
        return md5;

    }
}
