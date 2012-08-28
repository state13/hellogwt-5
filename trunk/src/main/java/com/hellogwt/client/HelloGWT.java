package com.hellogwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import com.hellogwt.client.service.GreetingService;
import com.hellogwt.client.service.GreetingServiceAsync;
import com.hellogwt.shared.domain.Greeting;

import java.util.List;

public class HelloGWT implements EntryPoint {

    public void onModuleLoad() {
        HelloGWTWidget helloGWTWidget = GWT.create(HelloGWTWidget.class);

        RootPanel.get().add(helloGWTWidget);
    }
}