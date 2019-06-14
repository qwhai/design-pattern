package pers.hai.sample.dp.mediator;

/**
 * TODO
 * <p>
 * Create Time: 2019-06-14 14:28
 * Last Modify: 2019-06-14
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public abstract class Person {
    protected String name;
    Mediator mediator;

    Person(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
}