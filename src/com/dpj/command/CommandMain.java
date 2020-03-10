package com.dpj.command;

import com.dpj.command.editor.BoldCommand;
import com.dpj.command.editor.History;
import com.dpj.command.editor.HtmlDocument;
import com.dpj.command.editor.UndoCommand;
import com.dpj.command.fx.Button;

public class CommandMain {
    public static void main(String[] args){
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello world");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        System.out.println(document.getContent());
    }
}
