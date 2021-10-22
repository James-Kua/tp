package seedu.address.testutil;

import java.util.Set;

import seedu.address.logic.commands.modulelesson.EditModuleLessonCommand.EditLessonDescriptor;
import seedu.address.model.modulelesson.LessonDay;
import seedu.address.model.modulelesson.LessonTime;
import seedu.address.model.modulelesson.ModuleLesson;
import seedu.address.model.person.ModuleCode;
import seedu.address.model.person.Remark;

/**
 * A utility class to help with building EditLessonDescriptor objects.
 */
public class EditLessonDescriptorBuilder {

    private EditLessonDescriptor descriptor;

    public EditLessonDescriptorBuilder() {
        descriptor = new EditLessonDescriptor();
    }

    public EditLessonDescriptorBuilder(EditLessonDescriptor descriptor) {
        this.descriptor = descriptor;
    }

    /**
     * Returns an {@code EditLessonDescriptor} with fields containing {@code lesson}'s details
     */
    public EditLessonDescriptorBuilder(ModuleLesson lesson) {
        descriptor = new EditLessonDescriptor();
        descriptor.setModuleCode(lesson.getModuleCodes());
        descriptor.setLessonDay(lesson.getDay());
        descriptor.setLessonTime(lesson.getTime());
        descriptor.setRemark(lesson.getRemark());
    }

    /**
     * Sets the {@code ModuleCode} of the {@code EditLessonDescriptor} that we are building.
     */
    public EditLessonDescriptorBuilder withModuleCode(Set<ModuleCode> code) {
        descriptor.setModuleCode(code);
        return this;
    }

    /**
     * Sets the {@code LessonDay} of the {@code EditLessonDescriptor} that we are building.
     */
    public EditLessonDescriptorBuilder withLessonDay(LessonDay day) {
        descriptor.setLessonDay(day);
        return this;
    }

    /**
     * Sets the {@code LessonTime} of the {@code EditLessonDescriptor} that we are building.
     */
    public EditLessonDescriptorBuilder withLessonTime(LessonTime time) {
        descriptor.setLessonTime(time);
        return this;
    }

    /**
     * Sets the {@code Remark} of the {@code EditLessonDescriptor} that we are building.
     */
    public EditLessonDescriptorBuilder withRemark(Remark remark) {
        descriptor.setRemark(remark);
        return this;
    }

    public EditLessonDescriptor build() {
        return descriptor;
    }
}
