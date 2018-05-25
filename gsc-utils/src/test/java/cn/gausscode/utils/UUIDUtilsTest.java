/*
 * FileName: UUIDUtilsTest.java
 * Author: fan.hao fan.hao@eppdev.cn
 * Date: 2017-10-13
 */

package cn.gausscode.utils;

import cn.gausscode.utils.uuid.UUIDUtils;
import org.junit.Test;

/**
 * @author fan.hao
 */
public class UUIDUtilsTest {
    @Test
    public void testUUID() {
        System.out.println(UUIDUtils.getUUID());
    }
}
