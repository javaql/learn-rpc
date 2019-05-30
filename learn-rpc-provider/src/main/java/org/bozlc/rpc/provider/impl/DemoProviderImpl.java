/**
 * DemoProviderImpl.java 2019年05月30日 16:22
 * <p/>
 *
 *
 * @Description
 * @version 1.0
 */
package org.bozlc.rpc.provider.impl;

import org.bozlc.rpc.provider.DemoProvider;

/**
 * TODO
 *
 * @author 齐龙
 * @date 2019年05月30日 16:22
 */
public class DemoProviderImpl implements DemoProvider {
    @Override
    public String getDemo(String demo) {
        return "success get " + demo;
    }

    @Override
    public void saveDemo(String demo) {
        System.out.println("保存数据[" + demo + "]");
    }
}
