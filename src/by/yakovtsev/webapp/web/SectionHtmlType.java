package by.yakovtsev.webapp.web;

import by.yakovtsev.webapp.model.MultiTextSection;
import by.yakovtsev.webapp.model.Section;
import by.yakovtsev.webapp.model.SectionType;
import by.yakovtsev.webapp.model.TextSection;

import java.util.Collections;

import static by.yakovtsev.webapp.web.HtmlUtil.input;
import static by.yakovtsev.webapp.web.HtmlUtil.textArea;


public enum SectionHtmlType {
    TEXT {
        @Override
        public String toHtml(Section section, SectionType type) {
            return input(type.name(), section == null ? "" : ((TextSection) section).getValue());
        }

        @Override
        public TextSection createSection(String value) {
            return new TextSection(value);
        }
    },
    MULTI_TEXT {
        @Override
        public String toHtml(Section section, SectionType type) {
            return textArea(type.name(), section == null ? Collections.singletonList("") :((MultiTextSection) section).getValues());
        }

        @Override
        public MultiTextSection createSection(String values) {
            return new MultiTextSection(values.split("\\n"));
        }
    },
    ORGANIZATION {
        @Override
        public String toHtml(Section section, SectionType type) {
            return section.toString();
        }

        @Override
        public Section createSection(String value) {
            throw new UnsupportedOperationException();
        }
    };

    public abstract String toHtml(Section section, SectionType type);

    public abstract Section createSection(String value);
}
