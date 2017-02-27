/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nz.mega.sdk;

public class MegaTextChatList {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MegaTextChatList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaTextChatList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megaJNI.delete_MegaTextChatList(swigCPtr);
      }
      swigCPtr = 0;
    }
}

   MegaTextChatList copy() {
    long cPtr = megaJNI.MegaTextChatList_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaTextChatList(cPtr, false);
  }

  public MegaTextChat get(long i) {
    long cPtr = megaJNI.MegaTextChatList_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new MegaTextChat(cPtr, false);
  }

  public int size() {
    return megaJNI.MegaTextChatList_size(swigCPtr, this);
  }

  public MegaTextChatList() {
    this(megaJNI.new_MegaTextChatList(), true);
  }

}
