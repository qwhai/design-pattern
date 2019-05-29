package pers.hai.sample.dp.proxy.access;

/**
 * 角色
 *    1.root
 *    2.管理员
 *    3.作者
 *    4.访客
 *
 * Create Time: 2019-04-07 20:08
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public interface Forum {

    void visit() throws UnauthorizedException;       // 访问
    void comment() throws UnauthorizedException;     // 评论

    void createTopic() throws UnauthorizedException; // 创建话题
    void moidfyTopic() throws UnauthorizedException; // 更新话题
    void deleteTopic() throws UnauthorizedException; // 删除话题

    boolean auditTopic(String topicId) throws UnauthorizedException; // 审核话题
}
