package com.sencha.gxt.theme.blue.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueFramedPanelAppearance_BlueFramePanelResources_ie9_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.panel.BlueFramedPanelAppearance.BlueFramePanelResources {
  private static BlueFramedPanelAppearance_BlueFramePanelResources_ie9_default_InlineClientBundleGenerator _instance0 = new BlueFramedPanelAppearance_BlueFramePanelResources_ie9_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.blue.client.panel.BlueFramedPanelAppearance.FramedPanelStyle() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCGCW0WDJVB{border-style:" + ("solid")  + ";border-width:" + ("0")  + ";outline:" + ("0"+ " " +"none")  + ";}.GCGCW0WDIVB{border-top-width:" + ("1px")  + ";}.GCGCW0WDHVB{position:" + ("relative")  + ";}.GCGCW0WDEVB{border-bottom:" + ("1px"+ " " +"solid")  + ";border-right:" + ("1px"+ " " +"solid")  + ";border-left:" + ("1px"+ " " +"solid")  + ";border-top:" + ("0"+ " " +"none")  + ";overflow:" + ("hidden")  + ";position:") + (("relative")  + ";background-color:" + ("none")  + " !important;border:" + ("none")  + ";}.GCGCW0WDGVB{position:" + ("relative")  + ";}")) : ((".GCGCW0WDJVB{border-style:" + ("solid")  + ";border-width:" + ("0")  + ";outline:" + ("0"+ " " +"none")  + ";}.GCGCW0WDIVB{border-top-width:" + ("1px")  + ";}.GCGCW0WDHVB{position:" + ("relative")  + ";}.GCGCW0WDEVB{border-bottom:" + ("1px"+ " " +"solid")  + ";border-left:" + ("1px"+ " " +"solid")  + ";border-right:" + ("1px"+ " " +"solid")  + ";border-top:" + ("0"+ " " +"none")  + ";overflow:" + ("hidden")  + ";position:") + (("relative")  + ";background-color:" + ("none")  + " !important;border:" + ("none")  + ";}.GCGCW0WDGVB{position:" + ("relative")  + ";}"));
      }
      public java.lang.String body() {
        return "GCGCW0WDEVB";
      }
      public java.lang.String bodyWrap() {
        return "GCGCW0WDFVB";
      }
      public java.lang.String footer() {
        return "GCGCW0WDGVB";
      }
      public java.lang.String header() {
        return "GCGCW0WDHVB";
      }
      public java.lang.String noHeader() {
        return "GCGCW0WDIVB";
      }
      public java.lang.String panel() {
        return "GCGCW0WDJVB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.blue.client.panel.BlueFramedPanelAppearance.FramedPanelStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.blue.client.panel.BlueFramedPanelAppearance.FramedPanelStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.blue.client.panel.BlueFramedPanelAppearance.FramedPanelStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.sencha.gxt.theme.blue.client.panel.BlueFramedPanelAppearance.BlueFramePanelResources::style()();
    }
    return null;
  }-*/;
}
