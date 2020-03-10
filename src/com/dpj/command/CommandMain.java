package com.dpj.command;

import com.dpj.command.fx.Button;

public class CommandMain {
    public static void main(String[] args){
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}
