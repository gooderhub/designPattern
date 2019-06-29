package package7.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }
    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            //先从数据库中提取出来邮箱信息
            Properties mailprop = Database.getProperties("D:\\01-ZY\\IdeaProjects_GitHub\\designPattern\\src\\package7\\facade\\maildata");
            String username = mailprop.getProperty(mailaddr);
            //按照固定的步骤构造网页并生成文件
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph("欢迎来到" + username + "的主页。");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
