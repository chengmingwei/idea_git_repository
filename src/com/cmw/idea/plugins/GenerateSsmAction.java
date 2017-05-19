package com.cmw.idea.plugins;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * @Remark SpringBoot MyBatis 代码自动生成类
 * @Author 程明卫
 * @Date 2017-05-19 11:20
 */
public class GenerateSsmAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        String userName = askForName(project);
        sayHello(project, userName);

    }

    private String askForName(Project project) {
        return Messages.showInputDialog(project,
                "What is your name?", "Input Your Name",
                Messages.getQuestionIcon());
    }

    private void sayHello(Project project, String userName) {
        Messages.showMessageDialog(project,
                String.format("Hello, %s!\n Welcome to PubEditor.", userName), "Information",
                Messages.getInformationIcon());
    }
}
