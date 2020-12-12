package com.example.nico.esindexer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EncoderTest {

    @Test
    public void testSha1(){
        // arrange
        String input = "2020-12-09 00:00:04 4af3dfea0de6b8f90b818ca3cbe22bfa f4eef3cab01a7ac14b2bedaab8d53d07";

        // act
        String result = Encoder.sha1(input);

        // assert
        Assertions.assertEquals("5673036bf98e11382a6d4852ac24f0b032e82b61", result);
    }


    @Test
    public void testBase64(){
        // arrange
        String input = "{\n" +
                "\t\"k\": \"4af3dfea0de6b8f90b818ca3cbe22bfa\",\n" +
                "\t\"datetime\": \"2020-12-09 00:00:04\",\n" +
                "\t\"client_v\": \"1.0\",\n" +
                "\t\"language\": \"fr\", \n" +
                "\t\"country\": \"fr\",\n" +
                "\t\"client_ip\": \"127.0.0.1\",\n" +
                "\t\"sign\": \"5673036bf98e11382a6d4852ac24f0b032e82b61\", \n" +
                "\t\"method\": \"item_selects\",\n" +
                "\t\"args\": \n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"limit\" :\"10\"\n" +
                "\t\t\t}\n" +
                "}";

        // act
        String result = Encoder.base64(input);

        // assert
        Assertions.assertEquals("ewoJImsiOiAiNGFmM2RmZWEwZGU2YjhmOTBiODE4Y2EzY2JlMjJiZmEiLAoJImRhdGV0aW1lIjogIjIwMjAtMTItMDkgMDA6MDA6MDQiLAoJImNsaWVudF92IjogIjEuMCIsCgkibGFuZ3VhZ2UiOiAiZnIiLCAKCSJjb3VudHJ5IjogImZyIiwKCSJjbGllbnRfaXAiOiAiMTI3LjAuMC4xIiwKCSJzaWduIjogIjU2NzMwMzZiZjk4ZTExMzgyYTZkNDg1MmFjMjRmMGIwMzJlODJiNjEiLCAKCSJtZXRob2QiOiAiaXRlbV9zZWxlY3RzIiwKCSJhcmdzIjogCgkJCXsKCQkJCSJsaW1pdCIgOiIxMCIKCQkJfQp9", result);
    }

}