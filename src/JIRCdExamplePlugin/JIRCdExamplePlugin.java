package JIRCdExamplePlugin;

import JIRCd.Events.EventListener;
import JIRCd.Plugins.Plugin;
import JIRCd.Plugins.PluginInfo;
import JIRCd.Plugins.PluginEventManager;

public class JIRCdExamplePlugin implements Plugin {
	public String Name = "Plugin example";
	public String Author = "Alex";
	public String Description = "Just a small program to demonstrate the JIRCd API.";
	
	public EventListener Listener = new JIRCdExampleListener();
	
	public PluginInfo GetPluginInformation(){
		return new PluginInfo(Name, Author, Description);
	}
	
	public void OnEnable() {
		PluginEventManager.RegisterEvent("OnClientJoinChannel", Listener, this);
		PluginEventManager.RegisterEvent("OnClientSendChannelMessage", Listener, this);
	}
	
	public void OnDisable() {
		
	}
}