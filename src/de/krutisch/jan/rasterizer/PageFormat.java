/*
 * Created on 20.05.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package de.krutisch.jan.rasterizer;

/**
 * @author Jan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PageFormat {
	
	private int width;
	private int height;
	private int marginTop;
	private int marginRight;
	private int marginBottom;
	private int marginLeft;
	private boolean valid;
	private String name;
	private String description;
	
	
	PageFormat() {
		this.width=0;
		this.height=0;
		this.marginTop=0;
		this.marginRight=0;
		this.marginBottom=0;
		this.marginLeft=0;
	}
	/*PageFormat(String name,String description,int width,int height) {
		this.name = name;
		this.description = description;
		this.width=width;
		this.height=height;
		this.marginTop=0;
		this.marginRight=0;
		this.marginBottom=0;
		this.marginLeft=0;
	}
	PageFormat(String name,String description,int width,int height, int marginTop, int marginRight,int marginBottom,int marginLeft) {
		this.name = name;
		this.description = description;
		this.width=width;
		this.height=height;
		this.marginTop=marginTop;
		this.marginRight=marginRight;
		this.marginBottom=marginBottom;
		this.marginLeft=marginLeft;
	}
	*/
	public boolean isValid() {
		boolean isValid = true;
		
		if (name.length()==0) isValid = false;
				
		if (width <= 0) isValid = false;
		if (height <= 0) isValid = false;

		if (marginTop < 0) isValid = false;
		if (marginBottom < 0) isValid = false;
		if (marginLeft < 0) isValid = false;
		if (marginRight < 0) isValid = false;
		if ((marginLeft + marginRight) > width) isValid = false;
		if ((marginTop + marginBottom) > height) isValid = false;
		
		return isValid;
		
	}
	
	/**
	 * @return Returns the marginBottom.
	 */
	public int getMarginBottom() {
		return marginBottom;
	}
	/**
	 * @param marginBottom The marginBottom to set.
	 */
	public void setMarginBottom(int marginBottom) {
		this.marginBottom = marginBottom;
	}
	/**
	 * @return Returns the marginLeft.
	 */
	public int getMarginLeft() {
		return marginLeft;
	}
	/**
	 * @param marginLeft The marginLeft to set.
	 */
	public void setMarginLeft(int marginLeft) {
		this.marginLeft = marginLeft;
	}
	/**
	 * @return Returns the marginRight.
	 */
	public int getMarginRight() {
		return marginRight;
	}
	/**
	 * @param marginRight The marginRight to set.
	 */
	public void setMarginRight(int marginRight) {
		this.marginRight = marginRight;
	}
	/**
	 * @return Returns the marginTop.
	 */
	public int getMarginTop() {
		return marginTop;
	}
	/**
	 * @param marginTop The marginTop to set.
	 */
	public void setMarginTop(int marginTop) {
		this.marginTop = marginTop;
	}
	/**
	 * @return Returns the width.
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width The width to set.
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return Returns the height.
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height The height to set.
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}
