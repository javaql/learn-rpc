/**
 * Server.java 2019年05月30日 16:30
 * <p/>
 *
 *
 * @Description
 * @version 1.0
 */
package org.bozlc.rpc.server;

import java.io.IOException;

/**
 * TODO
 *
 * @author 齐龙
 * @date 2019年05月30日 16:30
 */
public interface Server {
    /**
     * Socket 端口
     */
    int PORT = 28880;

    /**
     * 启动服务端
     */
    void start() throws IOException;

    /**
     * 停止服务端
     */
    void stop();

    /**
     * 服务注册
     * @param serviceInterface  -- 对外暴露服务接口
     * @param impl  --  内部实现类
     */
    void regist(Class<?> serviceInterface, Class<?> impl);

}
