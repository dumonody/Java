package cn.chatsys.util.win;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WindowUtil {

	/**
	 * 获取编辑框中的文本内容
	 * @param frame
	 * @return
	 */
	public static String getJEditorPaneText(JFrame frame)
	{
		String ans = new String();
		JPanel p = (JPanel) frame.getContentPane();
		Component[] components = p.getComponents();
		for(Component cmpt : components)
		{
			if(cmpt instanceof JEditorPane)
			{
				ans = ((JEditorPane) cmpt).getText();
			}
		}
		return ans;
	}
	
	/**
	 * 设置文本显示区的内容
	 * @param frame
	 * @param content
	 */
	public static void setTextArea(JFrame frame, String content)
	{
		JPanel p = (JPanel) frame.getContentPane();
		Component[] components = p.getComponents();
		for(Component cmpt : components)
		{
			if(cmpt instanceof JScrollPane)
			{
				JTextArea textarea = (JTextArea)(((JScrollPane) cmpt).getViewport().getView());
				textarea.setText(textarea.getText() + content);
			}
		}
	}

	/**
	 * 设置文本发送区的内容
	 * @param frame
	 * @param content
	 */
	public static void setJEditorPaneText(JFrame frame, String content)
	{
		JPanel p = (JPanel) frame.getContentPane();
		Component[] components = p.getComponents();
		for(Component cmpt : components)
		{
			if(cmpt instanceof JEditorPane)
			{
				((JEditorPane) cmpt).setText(content);
			}
		}
	}
}
