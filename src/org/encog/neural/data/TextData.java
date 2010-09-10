/*
 * Encog(tm) Core v2.5 
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 * 
 * Copyright 2008-2010 by Heaton Research Inc.
 * 
 * Released under the LGPL.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 * 
 * Encog and Heaton Research are Trademarks of Heaton Research, Inc.
 * For information on Heaton Research trademarks, visit:
 * 
 * http://www.heatonresearch.com/copyright.html
 */

package org.encog.neural.data;

import org.encog.persist.BasicPersistedObject;
import org.encog.persist.EncogCollection;
import org.encog.persist.EncogPersistedObject;
import org.encog.persist.Persistor;
import org.encog.persist.persistors.TextDataPersistor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An Encog object that can hold text data. This object can be stored in an
 * Encog persisted file.
 * 
 * @author jheaton
 * 
 */
public class TextData extends BasicPersistedObject {
	/**
	 * The serial ID.
	 */
	private static final long serialVersionUID = 6895724776252007263L;

	/**
	 * The text data that is stored.
	 */
	private String text;

	/**
	 * The logging object.
	 */
	@SuppressWarnings("unused")
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * Clone this object.
	 * 
	 * @return A cloned version of this object.
	 */
	@Override
	public Object clone() {
		final TextData result = new TextData();
		result.setName(getName());
		result.setDescription(getDescription());
		result.setText(getText());
		return result;
	}

	/**
	 * Create a persistor to store this object.
	 * 
	 * @return A persistor.
	 */
	public Persistor createPersistor() {
		return new TextDataPersistor();
	}

	/**
	 * @return The text held by this object.
	 */
	public String getText() {
		return this.text;
	}


	/**
	 * Set the text held by this object.
	 * 
	 * @param text
	 *            The text held by this object.
	 */
	public void setText(final String text) {
		this.text = text;
	}
}
