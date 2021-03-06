package org.droiddraw.widget;

import java.awt.Graphics;
import java.awt.Image;

import org.droiddraw.gui.ImageResources;
import org.droiddraw.property.StringProperty;

public class RadioGroup extends LinearLayout
{
	public static final String TAG_NAME = "RadioGroup";
	StringProperty checkedItem;

	public RadioGroup()
	{
		super();
		
		// 设置图标，方便ui设计时进行辨识
		this.setIconInTools(ImageResources.instance().getImage("def/radio_group"));
		
		checkedItem = new StringProperty("Default Button",
				"android:checkedButton", "");
		// Defaults are different in RadioGroup *sigh*
		orientation.setDefaultIndex(1);
		orientation.setSelectedIndex(1);
		addProperty(checkedItem);
		this.setTagName(TAG_NAME);
	}
	
	@Override
	protected int getDefaultWrapContentHeight()
	{
		return 30;
	}
	
	@Override
	protected void paintText(Graphics g, Image iconInTools)
	{
		// 本组件为了好看一点，不绘制设计时的显示
		//文本（该 文本原本仅是为了方便便识widget之用）
	}
}
