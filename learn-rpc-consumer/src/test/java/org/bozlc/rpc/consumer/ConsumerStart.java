/**
 * ConsumerStart.java 2019年05月30日 17:04
 * <p/>
 *
 *
 * @Description
 * @version 1.0
 */
package org.bozlc.rpc.consumer;

import org.bozlc.rpc.provider.DemoProvider;
import org.bozlc.rpc.proxy.Client;

import java.net.InetSocketAddress;

/**
 * TODO
 *
 * @author 齐龙
 * @date 2019年05月30日 17:04
 */
public class ConsumerStart {
    public static void main(String[] args) {
        DemoProvider demoProvider = Client.getRemoteProxyObj(DemoProvider.class, new InetSocketAddress("127.0.0.1", 28880));
        DemoConsumer demoConsumer = new DemoConsumer();
        demoConsumer.setDemoProvider(demoProvider);
        String demo = demoConsumer.getDemo("qilong", "test");
        demoConsumer.saveDemo(demo);
    }
}
