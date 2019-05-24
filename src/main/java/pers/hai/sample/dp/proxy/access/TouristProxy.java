package pers.hai.sample.dp.proxy.access;

import org.apache.log4j.Logger;

/**
 * 游客，访客代理
 *
 * Create Time: 2019-04-07 20:15
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class TouristProxy implements Forum {

    private Logger logger = Logger.getLogger(TouristProxy.class);

    @Override
    public void visit() {
        logger.info("访客正在访问话题");
    }

    @Override
    public void comment() {
        logger.info("访客正在评论话题");
    }

    @Override
    public void createTopic() throws UnauthorizedException {
        throw new UnauthorizedException("访客无权创建话题");
    }

    @Override
    public void moidfyTopic() throws UnauthorizedException{
        throw new UnauthorizedException("访客无权修改话题");
    }

    @Override
    public void deleteTopic() throws UnauthorizedException{
        throw new UnauthorizedException("访客无权删除话题");
    }

    @Override
    public boolean auditTopic(String topicId) throws UnauthorizedException{
        throw new UnauthorizedException("访客无权审核话题");
    }
}
