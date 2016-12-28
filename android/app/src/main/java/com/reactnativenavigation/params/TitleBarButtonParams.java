package com.reactnativenavigation.params;

import com.mikepenz.actionitembadge.library.ActionItemBadge;

public class TitleBarButtonParams extends BaseTitleBarButtonParams {
    public String eventId;
    public StyleParams.Color color;
    public StyleParams.Color disabledColor;
    public boolean enabled = true;
    public String hint;
    public ActionItemBadge.BadgeStyles style;

    public void setColorFromScreenStyle(StyleParams.Color titleBarButtonColor) {
        if (!color.hasColor() && titleBarButtonColor.hasColor()) {
            color = titleBarButtonColor;
        }
    }

    public StyleParams.Color getColor() {
        if (enabled) {
            return color;
        }
        return disabledColor.hasColor() ? disabledColor : AppStyle.appStyle.titleBarDisabledButtonColor;
    }
}
