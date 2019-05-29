package pers.hai.sample.dp.proxy.access;

import org.apache.log4j.Logger;

/**
 * 作者（题主）代理
 *
 * Create Time: 2019-04-07 20:15
 * Last Modify: 2019-05-24
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class WriterProxy implements Forum {

    private Logger logger = Logger.getLogger(WriterProxy.class);

    @Override
    public void visit() {
        logger.info("题主正在访问话题");
    }

    @Override
    public void comment() {
        logger.info("题主正在评论话题");
    }

    @Override
    public void createTopic() throws UnauthorizedException {
        logger.info("题主正在创建话题");
    }

    @Override
    public void moidfyTopic() throws UnauthorizedException{
        logger.info("题主正在修改话题");
    }

    @Override
    public void deleteTopic() throws UnauthorizedException{
        logger.info("题主正在删除话题");
    }

    @Override
    public boolean auditTopic(String topicId) throws UnauthorizedException{
        throw new UnauthorizedException("题主无权审核话题");
    }
}
