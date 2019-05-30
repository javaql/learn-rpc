/**
 * DemoProvider.java 2019年05月30日 16:13
 * <p/>
 *
 *
 * @Description
 * @version 1.0
 */
package org.bozlc.rpc.provider;

/**
 * TODO
 *
 * @author 齐龙
 * @date 2019年05月30日 16:13
 */
public interface DemoProvider {
    public String getDemo(String demo);
    public void saveDemo(String demo);
}
