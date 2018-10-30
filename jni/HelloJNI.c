#include "jni.h"
#include <stdio.h>
#include "com_studyjni_hello_HelloJNI.h"

JNIEXPORT void JNICALL Java_com_studyjni_hello_HelloJNI_sayHello(JNIEnv *env, jobject thisObj) {
   printf("Hello World!\n");
   return;
}