package com.webapp.project.app.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(value = "")
public class LoginView extends VerticalLayout{

	public LoginView() {
		
		setSizeFull();
		setJustifyContentMode(JustifyContentMode.CENTER);
		setAlignItems(Alignment.CENTER);
		
		TextField email = new TextField();
		email.setLabel("Email address");
		email.setWidth("300px");
		email.setPlaceholder("name@example.com");
		email.setClearButtonVisible(true);
		email.setPattern("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
		
		TextField password = new TextField();
		password.setLabel("Password");
		password.setPlaceholder("password");
		password.setWidth("300px");
		
		HorizontalLayout horizontalLayout = new HorizontalLayout();
		horizontalLayout.add(new Button("NEXT"));
		horizontalLayout.add(new Button("REGISTER"));
		
		
		add(email, password, horizontalLayout);
	}
}
