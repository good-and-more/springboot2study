package com.atguigu.boot10request;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class Boot10RequestApplicationTests {

    @Test
    void contextLoads() {
        byte[] array = new byte[]{69, 70, 71};
        String a = new String(array);
        System.out.println(a);
        String[] array2 = new String[]{"abc","def","123"};

        String need_str = String.format("%150s", " c");
        char[] chars = need_str.toCharArray();
        //System.out.println(chars);
        System.out.println(need_str);
    }


}
