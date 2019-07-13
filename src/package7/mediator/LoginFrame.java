package package7.mediator;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    // 构造函数。
    // 生成并配置各个Colleague后，显示对话框。
    public LoginFrame(String title) {
        super(title);
        setBackground(Color.LIGHT_GRAY);
        // 使用布局管理器生成4×2窗格
        setLayout(new GridLayout(4, 2));
        // 生成各个Colleague
        createColleagues();
        // 游客、登录的单选按钮
        add(checkGuest);
        add(checkLogin);
        //用户名、密码的输入框
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        //确认、取消的按钮
        add(buttonOk);
        add(buttonCancel);
        colleagueChanged();
        // 显示
        pack();
        show();
    }

    // 生成各个Colleague。
    @Override
    public void createColleagues() {
        // 生成游客、登录的单选按钮
        CheckboxGroup g = new CheckboxGroup();
        // 初始化窗口时默认选择游客按钮
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
        // 生成用户名、密码两个文本框
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        // 生成确认、取消的两个按钮
        buttonOk = new ColleagueButton("Confirm");
        buttonCancel = new ColleagueButton("Cancel");
        // 设置Mediator
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        // 设置Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleagueChanged() {
        //游客模式：用户名密码都不可填
        if (checkGuest.getState()) {
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        }
        // 用户登录模式：用户名可填写，根据用户名文本框里填写的内容来确定 密码框和按钮 是否可用
        else {
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    private void userpassChanged() {
        //如果填写了用户名
        if (textUser.getText().length() > 0) {
            //可以填写密码
            textPass.setColleagueEnabled(true);
            //如果用户名和密码都超过了4个字符，符合要求，确认按钮才能启用
            if (textUser.getText().length() >= 4 && textPass.getText().length() >= 4) {     
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        }
        //如果没有填写用户名，则密码和确定按钮都不显示
        else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("动作是：" + e.getActionCommand());
        System.exit(0);
    }
}
