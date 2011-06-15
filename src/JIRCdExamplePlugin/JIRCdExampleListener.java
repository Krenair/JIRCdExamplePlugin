package JIRCdExamplePlugin;

import JIRCd.Events.ClientJoinChannelEvent;
import JIRCd.Events.ClientSendChannelMessageEvent;
import JIRCd.Events.EventListener;

public class JIRCdExampleListener extends EventListener {
	public void OnClientJoinChannel(ClientJoinChannelEvent Event) {
		System.out.println(Event.GetClient().Nickname + " joined " + Event.GetChannel().Name);
	}
	
	public void OnClientSendChannelMessage(ClientSendChannelMessageEvent Event) {
		System.out.println(Event.GetFrom().Nickname + " to " + Event.GetTo().Name + ": " + Event.GetMessage());
	}
}