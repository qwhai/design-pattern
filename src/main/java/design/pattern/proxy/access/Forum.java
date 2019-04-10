package design.pattern.proxy.access;

/**
 * @Description
 *      1.root
 *      2.管理员
 *      3.作者
 *      4.访客
 * @Author Q-WHai
 * @Date 2019/4/7 20:08
 */
public interface Forum {

    void visit() throws UnauthorizedException;       // 访问
    void comment() throws UnauthorizedException;     // 评论

    void createTopic() throws UnauthorizedException; // 创建话题
    void moidfyTopic() throws UnauthorizedException; // 更新话题
    void deleteTopic() throws UnauthorizedException; // 删除话题

    boolean auditTopic(String topicId) throws UnauthorizedException; // 审核话题
}
