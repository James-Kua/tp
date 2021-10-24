package seedu.address.logic.commands.person;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.Command;
import seedu.address.logic.commands.CommandResult;
import seedu.address.model.Model;

/**
 * Clears the contacts stored in address book.
 */
public class ClearPersonCommand extends Command {

    public static final String MESSAGE_SUCCESS = "The contacts in contHACKS has been cleared!";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.clearPersons();
        assert model.getAddressBook().getPersonList().isEmpty();
        return new CommandResult(MESSAGE_SUCCESS);
    }
}