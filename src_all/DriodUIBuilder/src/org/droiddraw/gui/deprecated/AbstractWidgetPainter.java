package org.droiddraw.gui.deprecated;

import java.awt.Graphics;

import org.droiddraw.property.ColorProperty;
import org.droiddraw.widget.Widget;

@Deprecated
//2012-11-20：由Jack Jiang标记为过时——目前为止不需要
//painter机制，它是droiddraw原作者的实现，目前的评估是没
//有多大必要，相反还使得代码复杂性增加，以后以下所有代码可
//能会被删除！
public abstract class AbstractWidgetPainter implements WidgetPainter
{
	public void drawBackground(Widget w, Graphics g)
	{
		ColorProperty cp = (ColorProperty) w
				.getPropertyByAttName("android:background");
		if (cp.getColorValue() != null)
		{
			g.setColor(cp.getColorValue());
			g.fillRect(w.getX() - w.getPadding(Widget.LEFT), w.getY()
					- w.getPadding(Widget.TOP), w.getWidth()
					+ w.getPadding(Widget.LEFT) + w.getPadding(Widget.RIGHT), w
					.getHeight()
					+ w.getPadding(Widget.TOP) + w.getPadding(Widget.BOTTOM));
		}
	}

}
