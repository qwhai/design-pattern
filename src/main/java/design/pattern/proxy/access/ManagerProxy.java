package design.pattern.proxy.access;

import org.apache.log4j.Logger;

/**
 * @Description 管理员代理
 * @Author Q-WHai
 * @Date 2019/4/7 20:15
 */
public class ManagerProxy implements Forum {

    private Logger logger = Logger.getLogger(ManagerProxy.class);

    @Override
    public void visit() {
        logger.info("管理员正在访问话题");
    }

    @Override
    public void comment() throws UnauthorizedException {
        throw new UnauthorizedException("管理员无权评论话题");
    }

    @Override
    public void createTopic() throws UnauthorizedException {
        throw new UnauthorizedException("管理员无权创建话题");
    }

    @Override
    public void moidfyTopic() throws UnauthorizedException{
        throw new UnauthorizedException("管理员无权修改话题");
    }

    @Override
    public void deleteTopic() throws UnauthorizedException{
        logger.info("管理员正在删除话题");
    }

    @Override
    public boolean auditTopic(String topicId) throws UnauthorizedException{
        logger.info("管理员正在审核话题");
        return true;
    }
}
