package design.pattern.command;

import org.apache.log4j.Logger;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/13 14:42
 */
public class Button implements Widget, Dragable {

    private Logger logger = Logger.getLogger(Button.class);
    private String content;

    public Button(String content) {
        this.content = content;
    }

    @Override
    public void loaded() {
        logger.info("控件Button已加载完成");
    }

    @Override
    public void changeContent(String text) {
        logger.info("正在调用Button.changeContent().");
        content = text;
        logger.info(String.format("修改后的内容：%s", content));
    }

    @Override
    public void drag(int x, int y) {
        logger.info(String.format("将Button控件拖到位置：(%d, %d)", x, y));
    }
}
