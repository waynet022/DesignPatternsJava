package com.dpj.command;

import com.dpj.command.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
