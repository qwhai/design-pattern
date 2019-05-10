package design.pattern.command;

import org.apache.log4j.Logger;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/13 14:43
 */
public class Label implements Widget, Dragable {

    private Logger logger = Logger.getLogger(Label.class);
    private String label;

    public Label(String label) {
        this.label = label;
    }

    @Override
    public void loaded() {
        logger.info("控件Label已加载完成");
    }

    @Override
    public void changeContent(String text) {
        logger.info("正在调用Label.changeContent().");
        label = text;
        logger.info(String.format("修改后的内容：%s", label));
    }

    @Override
    public void drag(int x, int y) {
        logger.info(String.format("将Label控件拖到位置：(%d, %d)", x, y));
    }
}
