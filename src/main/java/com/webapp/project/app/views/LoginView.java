package com.webapp.project.app.views;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.webapp.project.app.ContextProvider;
import com.webapp.project.app.services.LoginService;
import com.webapp.project.app.valueObjects.LoginVO;

@Route(value = "")
public class LoginView extends VerticalLayout {

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

		Button next = new Button("Next");
		next.setWidth("300px");
		next.setDisableOnClick(false);
		next.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				LoginVO loginVO = new LoginVO();
				loginVO.setEmail(email.getValue());
				LoginService loginService = ContextProvider.getBean(LoginService.class);
				loginService.persistLogin(loginVO);

				Notification.show("Please check your inbox for instructions", 4000, Position.TOP_CENTER);
				email.clear();

			}
		});

		add(email, password, next);
	}
}
