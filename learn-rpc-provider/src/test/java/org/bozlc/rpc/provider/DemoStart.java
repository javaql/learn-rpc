/**
 * DemoStart.java 2019年05月30日 16:24
 * <p/>
 *
 *
 * @Description
 * @version 1.0
 */
package org.bozlc.rpc.provider;

import org.bozlc.rpc.provider.impl.DemoProviderImpl;
import org.bozlc.rpc.server.Server;
import org.bozlc.rpc.server.impl.ServerCenter;

import java.io.IOException;

/**
 * TODO
 *
 * @author 齐龙
 * @date 2019年05月30日 16:24
 */
public class DemoStart {
    public static void main(String[] args) {
        Server server = new ServerCenter();
        server.regist(DemoProvider.class, DemoProviderImpl.class);
        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
