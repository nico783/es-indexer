package com.example.nico.esindexer;


import org.apache.commons.codec.digest.DigestUtils;

import java.util.Base64;

public class Encoder {

    public static String sha1(String message) {
        return DigestUtils.sha1Hex(message);
    }

    public static String base64(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }

}
