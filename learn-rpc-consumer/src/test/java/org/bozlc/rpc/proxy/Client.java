/**
 * Client.java 2019年05月30日 17:05
 * <p/>
 *
 *
 * @Description
 * @version 1.0
 */
package org.bozlc.rpc.proxy;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * 客户端
 *
 * @author 齐龙
 * @date 2019年05月30日 17:05
 */
public class Client {
    /**
     * 客户端代理获取远程服务对象
     * @param serviceInterface
     * @param addr
     * @return
     */
    public static <T> T getRemoteProxyObj(Class<?> serviceInterface,InetSocketAddress addr){
        return (T) Proxy.newProxyInstance(serviceInterface.getClassLoader(), new Class<?>[]{serviceInterface}, (proxy, method, args) -> {
            Socket socket = null;
            ObjectOutputStream output = null;
            ObjectInputStream input = null;
            try {
                // 1.创建Socket客户端，根据指定地址连接远程服务提供者
                socket = new Socket();
                socket.connect(addr);

                // 2.将远程服务调用所需的接口类、方法名、参数列表等编码后发送给服务提供者
                output = new ObjectOutputStream(socket.getOutputStream());
                output.writeUTF(serviceInterface.getName());
                output.writeUTF(method.getName());
                output.writeObject(method.getParameterTypes());
                output.writeObject(args);

                // 3.同步阻塞等待服务器返回应答，获取应答后返回
                input = new ObjectInputStream(socket.getInputStream());
                return input.readObject();
            } finally {
                if (socket != null) socket.close();
                if (output != null) output.close();
                if (input != null) input.close();
            }
        });
    }
}
