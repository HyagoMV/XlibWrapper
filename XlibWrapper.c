#include "jni.h"

#include "jx11_XlibWrapper.h"

#include <X11/X.h>
#include <X11/Xlib.h>

JNIEXPORT jlong JNICALL Java_jx11_XlibWrapper_XOpenDisplay(JNIEnv*, jclass) {
	return XOpenDisplay(NULL);
}

JNIEXPORT jlong JNICALL Java_jx11_XlibWrapper_DefaultScreen(JNIEnv*, jclass,
		jlong display) {
	return DefaultScreen(display);
}

JNIEXPORT jlong JNICALL Java_jx11_XlibWrapper_RootWindow(JNIEnv*, jclass,
		jlong display, jlong screen) {
	return RootWindow(display, screen);
}

JNIEXPORT jlong JNICALL Java_jx11_XlibWrapper_XCreateSimpleWindow(JNIEnv*,
		jclass, jlong display, jlong root, jint x, jint y, jint windth,
		jint height, jint border_width, jlong border, jlong background) {
	return XCreateSimpleWindow(display, root, x, y, windth, height,
			border_width, border, background);
}

JNIEXPORT void JNICALL Java_jx11_XlibWrapper_XMapWindow(JNIEnv*, jclass,
		jlong display, jlong window) {
	XMapWindow(display, window);
}

JNIEXPORT jlong JNICALL Java_jx11_XlibWrapper_XEvent(JNIEnv*, jclass) {
	XEvent event;
	return &event;
}

JNIEXPORT jint JNICALL Java_jx11_XlibWrapper_XNextEvent(JNIEnv*, jclass,
		jlong display, jlong event) {
	return XNextEvent(display, event);
}

JNIEXPORT void JNICALL Java_jx11_XlibWrapper_XUnmapWindow(JNIEnv*, jclass,
		jlong display, jlong window) {
	XUnmapWindow(display, window);
}

JNIEXPORT void JNICALL Java_jx11_XlibWrapper_XDestroyWindow(JNIEnv*, jclass,
		jlong display, jlong window) {
	XDestroyWindow(display, window);
}

JNIEXPORT void JNICALL Java_jx11_XlibWrapper_XCloseDisplay(JNIEnv*, jclass,
		jlong display) {
	XCloseDisplay(display);
}

