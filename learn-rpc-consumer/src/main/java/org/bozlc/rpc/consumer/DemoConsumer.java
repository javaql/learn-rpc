/**
 * DemoConsumer.java 2019年05月30日 16:59
 * <p/>
 *
 *
 * @Description
 * @version 1.0
 */
package org.bozlc.rpc.consumer;

import org.bozlc.rpc.provider.DemoProvider;

/**
 * TODO
 *
 * @author 齐龙
 * @date 2019年05月30日 16:59
 */
public class DemoConsumer {

    private DemoProvider demoProvider;

    public String getDemo(String name) {
        String demo = demoProvider.getDemo(name);
        System.out.println("读取到结果[" + demo + "]");
        return demo;
    }

    public String getDemo(String name, String name1) {
        String demo = demoProvider.getDemo(name, name1);
        System.out.println("读取到结果[" + demo + "]");
        return demo;
    }

    public void saveDemo(String name) {
        demoProvider.saveDemo(name);
    }

    public void setDemoProvider(DemoProvider demoProvider) {
        this.demoProvider = demoProvider;
    }
}
