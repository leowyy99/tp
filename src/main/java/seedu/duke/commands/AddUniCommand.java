package seedu.duke.commands;

import seedu.duke.modules.ModuleList;
import seedu.duke.universities.University;
import seedu.duke.universities.UniversityList;

public class AddUniCommand extends Command {
    public static final String COMMAND_WORD = "adduni";

    private final University universityToAdd;

    public AddUniCommand(University universityToAdd, UniversityList universitySelectedList,
                         ModuleList moduleSelectedList) {
        super(universitySelectedList, moduleSelectedList);
        assert universityToAdd.getName() != null;
        assert universityToAdd.getClass() != null;
        this.universityToAdd = universityToAdd;
        universitySelectedList.addUniversity(universityToAdd);
        assert universitySelectedList.getSize() != 0;
        assert universitySelectedList.searchUniversity(universityToAdd.getName());
        assert universitySelectedList.get(universitySelectedList.getSize() - 1).getName().equals(universityToAdd.getName());
        System.out.println("New university added: " + universityToAdd.getName());
    }
}