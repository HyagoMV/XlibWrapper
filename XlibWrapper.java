package jx11;

public class XlibWrapper {

	// Chapter 2: Display Functions
	public static native long XAllPlanes();
	public static native long XBlackPixel(long display, int screenNumber);
	public static native long XWhitePixel(long display, int screenNumber);
	public static native int XConnectionNumber(long display);
	public static native long XDefaultColormap(long display, int screenNumber);
	public static native int XDefaultDepth(long display, int screenNumber);
	public static native int XListDepths(long display, int screenNumber, int countReturn);
	public static native long XDefaultGC(long display, int screenNumber);
	public static native long XDefaultRootWindow(long display);
	public static native long XDefaultScreenOfDisplay(long display);
	public static native long XScreenOfDisplay(long display, int screenNumber);
	public static native long XDefaultVisual(long display, int screenNumber);
	public static native int XDisplayCells(long display, int screenNumber);
	public static native int XDisplayPlanes(long display, int screenNumber);
	public static native long XDisplayString(long display);
	public static native long XExtendedMaxRequestSize(long display);
	public static native long XMaxRequestSize(long display);
	public static native long XLastKnownRequestProcessed(long display);
	public static native long XNextRequest(long display);
	public static native int XProtocolVersion(long display);
	public static native int XProtocolRevision(long display);
	public static native int XQLength(long display);
	public static native long RootWindow(long display, long screen);
	public static native int XScreenCount(long display);
	public static native long XServerVendor(long display);
	public static native int XVendorRelease(long display);
	public static native void XUnmapWindow(long display, long window);
	public static native void XUnmapSubwindows(long display, long window);
	public static native void XConfigureWindow(long display, long window, int valueMask, long values);
	public static native void XMoveWindow(long display, long window, int x, int y);
	public static native void XResizeWindow(long display, long window, int width, int height);
	public static native void XMoveResizeWindow(long display, long window, int width, int height);
	public static native void XSetWindowBorderWidth(long display, long window, int width);
	public static native void XRaiseWindow(long display, long window);
	public static native void XLowerWindow(long display, long window);
	public static native void XLowerWindow(long display, long window, int direction);
	public static native void XCirculateSubwindowsUp(long display, long window);
	public static native void XCirculateSubwindowsDown(long display, long window);
	public static native void XChangeWindowAttributes(long display, long window, long valuemask, long attributes);
	public static native void XSetWindowBackground(long display, long window, long backgroundPixel);
	public static native void XSetWindowBackgroundPixmap(long display, long window, long backgroundPixmap);
	public static native void XSetWindowBorder(long display, long window, long borderPixel);
	public static native void XSetWindowBorderPixmap(long display, long window, long backgroundPixmap);
	public static native void XSetWindowColormap(long display, long window, long colormap);
	public static native void XDefineCursor(long display, long window, long cursor);
	public static native void XUndefineCursor(long display, long window);
	
	
	// Chapter 3: Window Functions
	public static native long XCreateWindow(long display, long parent, int x, int y, int width, int height, int depth, int clazz, long visual, long valuemask, long attributes);
	public static native long XCreateSimpleWindow(long display, long parent, int x, int y, int width, int height, int borderWidth, long border, long background);
	public static native int XDestroyWindow(long display, long window);
	public static native int XDestroySubwindows(long display, long window);
	public static native void XMapWindow(long display, long windown);
	public static native void XMapRaised(long display, long windown);
	public static native void XMapSubwindows(long display, long windown);
	
	
	// Chapter 4: Window Information Functions
	public static native long XQueryTree(long display, long window, long rootReturn, long parentReturn, long childrenReturn, int nchildrenReturn);
	public static native long XGetWindowAttributes(long display, long window, long windowAttributesReturn);
	public static native long XGetGeometry(long display, long drawable, long rootReturn, int xReturn, int yReturn, int borderWidthReturn, int depthReturn);
	public static native boolean XTranslateCoordinates(long display, long srcW, long destW, int destXReturn, int destYReturn, long childReturn);
	public static native boolean XQueryPointer(long display, long window, long rootReturn, long childReturn, int rootXReturn, int rootYReturn, int windowXReturn, int windowYReturn, int maskReturn);
	public static native int XGetWindowProperty(long display, long window, long property, long longOffset, long longLength, boolean delete, long reqType, long actualTypeReturn,  int actualFormatReturn, long itemsReturn, long bytesAfterReturn, long propReturn);
	
	
	// Chapter 5: Pixmap and Cursor Functions
	public static native long XCreatePixmap(long display, long d, int  width, int height, int depth);
	public static native long XFreePixmap(long display, long pixmap);
	public static native long XQueryBestCursor(long display, long d, int width, int height, long width_return, long height_return);
	public static native void CreateFontCursor(long display, int shape);
	public static native void XCreateGlyphCursor(long display, long source_font, int mask_font, int source_char, int mask_char, long foreground_color, long background_color);
	public static native long XCreatePixmapCursor(long display, long source, long mask, long foreground_color, long background_color, long x, long y);
	public static native long XRecolorCursor(long display, long cursor, long foreground_color, long background_color);
	public static native void XFreeCursor(long display, long cursor);
	
	
	public static native int XListProperties(long display, long window, long numPropReturn);
	public static native int XChangeProperty(long display, long window, long numPropReturn);
	public static native int XListProperties(long display, long window, long property, long type, int format, int mode, long data, int nelements);
	public static native int XRotateWindowProperties(long display, long window, long property, int numProp, int npositions);
	public static native int XDeleteProperty(long display, long window, long property);
	public static native void XSetSelectionOwner(long display, long selection, long owner, long time);
	public static native void XGetSelectionOwner(long display, long selection);
	public static native void XConvertSelection(long display, long selection, long target, long property, long requestor, long time);
		
	
	public static native int XBitmapBitOrder(long display);
	public static native int XBitmapPad(long display);
	public static native int XBitmapUnit(long display);
	public static native long XOpenDisplay();
	public static native long DefaultScreen(long display);
	public static native long XEvent();
	public static native int XNextEvent(long display, long event);
	public static native void XCloseDisplay(long display);

}
