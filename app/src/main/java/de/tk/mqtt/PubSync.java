package de.tk.mqtt;

import android.app.Activity;
import android.content.Context;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;

public class PubSync {

    public static Boolean doTest(String msg, Activity activity){
        try {
            MqttClient client = new MqttClient("tcp://"+activity.getPreferences(Context.MODE_PRIVATE).getString("IPAddress", "")+":1","java_client", null);
            MqttTopic topic = client.getTopic("LEDstripe");
            MqttMessage message = new MqttMessage(msg.getBytes());
            message.setQos(1);
            client.connect();
            MqttDeliveryToken token = topic.publish(message);
            while (!token.isComplete()){
                token.waitForCompletion(1000);
            }
            client.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}