/* 
 * =============================================================
 * Copyright (C) 2007-2011 Edgenius (http://www.edgenius.com)
 * =============================================================
 * License Information: http://www.edgenius.com/licensing/edgenius/2.0/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2.0
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 *
 * http://www.gnu.org/licenses/gpl.txt
 *  
 * ****************************************************************
 */
package com.edgenius.wiki.gwt.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

/**
 * @author Dapeng.Ni
 */
public interface LargeIconBundle extends ClientBundle {
	public class I{
		private static LargeIconBundle iconBundle;
		public static LargeIconBundle get(){
			if(iconBundle == null)
				iconBundle = (LargeIconBundle) GWT.create(LargeIconBundle.class);
			return iconBundle;
		}
	}
	@Source("com/edgenius/wiki/gwt/public/resources/images/geniuswiki/default/large/warning.png")
	public ImageResource warning();
	@Source("com/edgenius/wiki/gwt/public/resources/images/geniuswiki/default/large/question.png")
	public ImageResource question();

}
