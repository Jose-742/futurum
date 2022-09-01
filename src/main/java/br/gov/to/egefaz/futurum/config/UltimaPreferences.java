package br.gov.to.egefaz.futurum.config;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;

import org.springframework.stereotype.Component;

@Component
@SessionScoped
public class UltimaPreferences implements Serializable {
	
	
	private static final long serialVersionUID = -4574271987554913484L;
	
	
	private String theme = "secad";
    private String menuClass = "layout-menu-light";
    private String profileMode = "top";
    private String menuLayout = "static";
    private boolean compact = true;
    private boolean orientationRTL;
    public String getMenuClass() {
        return this.menuClass;
    }
    public String getProfileMode() {
        return this.profileMode;
    }
    public String getTheme() {
        return theme;
    }
    public String getMenuLayout() {
        if(this.menuLayout.equals("static"))
            return "menu-layout-static";
        else if(this.menuLayout.equals("overlay"))
            return "menu-layout-overlay";
        else if(this.menuLayout.equals("horizontal"))
            return "menu-layout-static menu-layout-horizontal";
        else if(this.menuLayout.equals("slim"))
            return "menu-layout-static layout-menu-slim";
        else
            return "menu-layout-static";
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public void setLightMenu() {
        this.menuClass = null;
    }
    public void setDarkMenu() {
        this.menuClass = "layout-menu-dark";
    }
    public void setProfileMode(String profileMode) {
        this.profileMode = profileMode;
    }
    public void setMenuLayout(String menuLayout) {
        this.menuLayout = menuLayout;
    }
    public void setCompact(boolean value) {
        this.compact = value;
    }
    public boolean isCompact() {
        return this.compact;
    }
    public boolean isOrientationRTL() {
        return orientationRTL;
    }
    public void setOrientationRTL(boolean orientationRTL) {
        this.orientationRTL = orientationRTL;
    }

}
