package com.dpj.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
