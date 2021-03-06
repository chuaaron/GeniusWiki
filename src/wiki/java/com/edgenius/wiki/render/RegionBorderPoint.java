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
package com.edgenius.wiki.render;

/**
 * @author Dapeng.Ni
 */
public class RegionBorderPoint {

	int pos1;
	int pos2;
	boolean start;
	String regionKey;
	//the reason I add integrate format keyIndex is sort region by order. This is good in some same region scenarios. 
	//For example, h2. {font}Header{font}.  FontRegion and HeadingRegion could be same, but I want to HeadingRegion wraps FontRegion.
	//Otherwise, TOC macro won't work as ReferenceObject links to FontRegion. 
	//Although relay on Region filter order is not good practice, but now it works as expected...
	int keyIndex; 
	
	public RegionBorderPoint(int pos1, boolean start, int pos2, String regionKey, int keyIndex) {
		this.pos1 = pos1;
		this.pos2 = pos2;
		this.start = start;
		this.regionKey = regionKey;
		this.keyIndex = keyIndex;
	}
	public String toString(){
		return pos1+":" + pos2+":" + start+":" + keyIndex + ":" + regionKey;
	}
	public int getPoint() {
		return pos1;
	}

	/**
	 * @return
	 */
	public boolean isStart() {
		return start;
	}

	/**
	 * @return
	 */
	public String getRegionKey() {
		return regionKey;
	}
	/**
	 * @return the keyIndex
	 */
	public int getKeyIndex() {
		return keyIndex;
	}

}
