package pers.hai.sample.dp;

import org.junit.Test;
import pers.hai.sample.dp.composite.Directory;
import pers.hai.sample.dp.composite.File;
import pers.hai.sample.dp.composite.FileTreatMentException;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-30 09:35
 * Last Modify: 2019-05-30
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class CompositeTests extends Testable {

    @Test
    public void test1() {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);

            bindir.add(new File("vi", 1000));
            bindir.add(new File("latex", 2000));
            rootdir.printList();

            System.out.println();
            System.out.println("Making user entries...");
            Directory yukidir = new Directory("yuki");
            Directory hanakodir = new Directory("hanako");
            Directory tomuradir = new Directory("tomura");
            usrdir.add(yukidir);
            usrdir.add(hanakodir);
            usrdir.add(tomuradir);
            yukidir.add(new File("diary.html", 100));
            yukidir.add(new File("Composite.java", 200));
            hanakodir.add(new File("memo.tex", 300));
            tomuradir.add(new File("game.doc", 400));
            tomuradir.add(new File("junk.mail", 500));
            rootdir.printList();
        } catch (FileTreatMentException ex) {
            logger.error(ex.getMessage());
        }
    }
}
