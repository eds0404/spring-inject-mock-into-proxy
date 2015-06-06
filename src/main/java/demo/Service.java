package demo;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Component component;

    public void action() {
        System.out.println(component.action());
    }
}
