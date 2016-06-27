package org.thingml.generated.network;

import org.thingml.generated.messages.*;
import org.thingml.java.*;
import org.thingml.java.ext.*;

import com.neovisionaries.ws.client.WebSocket;
import com.neovisionaries.ws.client.WebSocketFactory;
import com.neovisionaries.ws.client.WebSocketAdapter;

public class WSJava extends Component {
	private final WebSocketFactory factory = new WebSocketFactory();
	private WebSocket ws;

	/*$PORTS$*/

	public WSJava(String serverURL) {
		try {
			ws = factory.createSocket(serverURL);
			ws.connect();
			ws.addListener(new WebSocketAdapter() {
				@Override
				public void onTextMessage(WebSocket websocket, String message) throws Exception {
					parse(message);
				}
			});
		} catch (Exception e) {
			System.err.println("Cannot connect to websocket server " + serverURL + " because " + e.getMessage());
			stop();
		}
	}

	private void parse(final String payload) {
        /*$PARSING CODE$*/
	}

	@Override
	public void run() {
		while (active) {
			try {
				final Event e = queue.take();//should block if queue is empty, waiting for a message
				final String payload = /*$SERIALIZER$*/.toString(e);
				if (payload != null)
					ws.sendText(payload);
			} catch (InterruptedException e) {
				//e.printStackTrace();
			}
		}
	}

	@Override
	public Component buildBehavior(String id, Component root) {
        /*$INIT PORTS$*/
		return this;
	}
}

