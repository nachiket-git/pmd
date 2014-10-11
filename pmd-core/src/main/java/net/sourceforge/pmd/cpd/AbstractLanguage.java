/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.cpd;

import java.io.FilenameFilter;
import java.util.Properties;

import net.sourceforge.pmd.util.filter.Filters;

public abstract class AbstractLanguage implements Language {
    private final String name;
	private final Tokenizer tokenizer;
	private final FilenameFilter fileFilter;

	public AbstractLanguage(String name, Tokenizer tokenizer, String... extensions) {
	    this.name = name;
		this.tokenizer = tokenizer;
		fileFilter = Filters.toFilenameFilter(Filters.getFileExtensionOrDirectoryFilter(extensions));
	}

	public FilenameFilter getFileFilter() {
		return fileFilter;
	}

	public Tokenizer getTokenizer() {
		return tokenizer;
	}

	public void setProperties(Properties properties) {
	    // needs to be implemented by subclasses.
	}

	public String getName() {
	    return name;
	}
}
