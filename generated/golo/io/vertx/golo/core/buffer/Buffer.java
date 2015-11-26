package io.vertx.golo.core.buffer;

import io.vertx.lang.golo.InternalHelper;

// io.vertx.core.buffer.Buffer 
public class Buffer { 

private io.vertx.core.buffer.Buffer delegate; 
public Buffer(Object delegate) { 
    this.delegate = (io.vertx.core.buffer.Buffer)delegate; 
}
public Object getDelegate() { 
    return delegate; 
}
// io.vertx.core.buffer.Buffer buffer() 
public static io.vertx.core.buffer.Buffer buffer() {
        return (io.vertx.core.buffer.Buffer)InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer buffer(int initialSizeHint) 
public static io.vertx.core.buffer.Buffer buffer(int initialSizeHint) {
        return (io.vertx.core.buffer.Buffer)InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(initialSizeHint), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer buffer(java.lang.String string) 
public static io.vertx.core.buffer.Buffer buffer(java.lang.String string) {
        return (io.vertx.core.buffer.Buffer)InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(string), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer buffer(java.lang.String string, java.lang.String enc) 
public static io.vertx.core.buffer.Buffer buffer(java.lang.String string, java.lang.String enc) {
        return (io.vertx.core.buffer.Buffer)InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(string, enc), io.vertx.golo.core.buffer.Buffer.class); 
}
// java.lang.String toString(java.lang.String enc) 
public java.lang.String toString(java.lang.String enc) {
        return (java.lang.String)delegate.toString(enc); 
}
// byte getByte(int pos) 
public byte getByte(int pos) {
        return (byte)delegate.getByte(pos); 
}
// short getUnsignedByte(int pos) 
public short getUnsignedByte(int pos) {
        return (short)delegate.getUnsignedByte(pos); 
}
// int getInt(int pos) 
public int getInt(int pos) {
        return (int)delegate.getInt(pos); 
}
// long getUnsignedInt(int pos) 
public long getUnsignedInt(int pos) {
        return (long)delegate.getUnsignedInt(pos); 
}
// long getLong(int pos) 
public long getLong(int pos) {
        return (long)delegate.getLong(pos); 
}
// double getDouble(int pos) 
public double getDouble(int pos) {
        return (double)delegate.getDouble(pos); 
}
// float getFloat(int pos) 
public float getFloat(int pos) {
        return (float)delegate.getFloat(pos); 
}
// short getShort(int pos) 
public short getShort(int pos) {
        return (short)delegate.getShort(pos); 
}
// int getUnsignedShort(int pos) 
public int getUnsignedShort(int pos) {
        return (int)delegate.getUnsignedShort(pos); 
}
// io.vertx.core.buffer.Buffer getBuffer(int start, int end) 
public io.vertx.core.buffer.Buffer getBuffer(int start, int end) {
        return (io.vertx.core.buffer.Buffer)delegate.getBuffer(start, end); 
}
// java.lang.String getString(int start, int end, java.lang.String enc) 
public java.lang.String getString(int start, int end, java.lang.String enc) {
        return (java.lang.String)delegate.getString(start, end, enc); 
}
// java.lang.String getString(int start, int end) 
public java.lang.String getString(int start, int end) {
        return (java.lang.String)delegate.getString(start, end); 
}
// io.vertx.core.buffer.Buffer appendBuffer(io.vertx.core.buffer.Buffer buff) 
public io.vertx.core.buffer.Buffer appendBuffer(io.vertx.core.buffer.Buffer buff) {
        return (io.vertx.core.buffer.Buffer)delegate.appendBuffer(buff); 
}
// io.vertx.core.buffer.Buffer appendBuffer(io.vertx.core.buffer.Buffer buff, int offset, int len) 
public io.vertx.core.buffer.Buffer appendBuffer(io.vertx.core.buffer.Buffer buff, int offset, int len) {
        return (io.vertx.core.buffer.Buffer)delegate.appendBuffer(buff, offset, len); 
}
// io.vertx.core.buffer.Buffer appendByte(byte b) 
public io.vertx.core.buffer.Buffer appendByte(byte b) {
        return (io.vertx.core.buffer.Buffer)delegate.appendByte(b); 
}
// io.vertx.core.buffer.Buffer appendUnsignedByte(short b) 
public io.vertx.core.buffer.Buffer appendUnsignedByte(short b) {
        return (io.vertx.core.buffer.Buffer)delegate.appendUnsignedByte(b); 
}
// io.vertx.core.buffer.Buffer appendInt(int i) 
public io.vertx.core.buffer.Buffer appendInt(int i) {
        return (io.vertx.core.buffer.Buffer)delegate.appendInt(i); 
}
// io.vertx.core.buffer.Buffer appendUnsignedInt(long i) 
public io.vertx.core.buffer.Buffer appendUnsignedInt(long i) {
        return (io.vertx.core.buffer.Buffer)delegate.appendUnsignedInt(i); 
}
// io.vertx.core.buffer.Buffer appendLong(long l) 
public io.vertx.core.buffer.Buffer appendLong(long l) {
        return (io.vertx.core.buffer.Buffer)delegate.appendLong(l); 
}
// io.vertx.core.buffer.Buffer appendShort(short s) 
public io.vertx.core.buffer.Buffer appendShort(short s) {
        return (io.vertx.core.buffer.Buffer)delegate.appendShort(s); 
}
// io.vertx.core.buffer.Buffer appendUnsignedShort(int s) 
public io.vertx.core.buffer.Buffer appendUnsignedShort(int s) {
        return (io.vertx.core.buffer.Buffer)delegate.appendUnsignedShort(s); 
}
// io.vertx.core.buffer.Buffer appendFloat(float f) 
public io.vertx.core.buffer.Buffer appendFloat(float f) {
        return (io.vertx.core.buffer.Buffer)delegate.appendFloat(f); 
}
// io.vertx.core.buffer.Buffer appendDouble(double d) 
public io.vertx.core.buffer.Buffer appendDouble(double d) {
        return (io.vertx.core.buffer.Buffer)delegate.appendDouble(d); 
}
// io.vertx.core.buffer.Buffer appendString(java.lang.String str, java.lang.String enc) 
public io.vertx.core.buffer.Buffer appendString(java.lang.String str, java.lang.String enc) {
        return (io.vertx.core.buffer.Buffer)delegate.appendString(str, enc); 
}
// io.vertx.core.buffer.Buffer appendString(java.lang.String str) 
public io.vertx.core.buffer.Buffer appendString(java.lang.String str) {
        return (io.vertx.core.buffer.Buffer)delegate.appendString(str); 
}
// io.vertx.core.buffer.Buffer setByte(int pos, byte b) 
public io.vertx.core.buffer.Buffer setByte(int pos, byte b) {
        return (io.vertx.core.buffer.Buffer)delegate.setByte(pos, b); 
}
// io.vertx.core.buffer.Buffer setUnsignedByte(int pos, short b) 
public io.vertx.core.buffer.Buffer setUnsignedByte(int pos, short b) {
        return (io.vertx.core.buffer.Buffer)delegate.setUnsignedByte(pos, b); 
}
// io.vertx.core.buffer.Buffer setInt(int pos, int i) 
public io.vertx.core.buffer.Buffer setInt(int pos, int i) {
        return (io.vertx.core.buffer.Buffer)delegate.setInt(pos, i); 
}
// io.vertx.core.buffer.Buffer setUnsignedInt(int pos, long i) 
public io.vertx.core.buffer.Buffer setUnsignedInt(int pos, long i) {
        return (io.vertx.core.buffer.Buffer)delegate.setUnsignedInt(pos, i); 
}
// io.vertx.core.buffer.Buffer setLong(int pos, long l) 
public io.vertx.core.buffer.Buffer setLong(int pos, long l) {
        return (io.vertx.core.buffer.Buffer)delegate.setLong(pos, l); 
}
// io.vertx.core.buffer.Buffer setDouble(int pos, double d) 
public io.vertx.core.buffer.Buffer setDouble(int pos, double d) {
        return (io.vertx.core.buffer.Buffer)delegate.setDouble(pos, d); 
}
// io.vertx.core.buffer.Buffer setFloat(int pos, float f) 
public io.vertx.core.buffer.Buffer setFloat(int pos, float f) {
        return (io.vertx.core.buffer.Buffer)delegate.setFloat(pos, f); 
}
// io.vertx.core.buffer.Buffer setShort(int pos, short s) 
public io.vertx.core.buffer.Buffer setShort(int pos, short s) {
        return (io.vertx.core.buffer.Buffer)delegate.setShort(pos, s); 
}
// io.vertx.core.buffer.Buffer setUnsignedShort(int pos, int s) 
public io.vertx.core.buffer.Buffer setUnsignedShort(int pos, int s) {
        return (io.vertx.core.buffer.Buffer)delegate.setUnsignedShort(pos, s); 
}
// io.vertx.core.buffer.Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b) 
public io.vertx.core.buffer.Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b) {
        return (io.vertx.core.buffer.Buffer)delegate.setBuffer(pos, b); 
}
// io.vertx.core.buffer.Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b, int offset, int len) 
public io.vertx.core.buffer.Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b, int offset, int len) {
        return (io.vertx.core.buffer.Buffer)delegate.setBuffer(pos, b, offset, len); 
}
// io.vertx.core.buffer.Buffer setString(int pos, java.lang.String str) 
public io.vertx.core.buffer.Buffer setString(int pos, java.lang.String str) {
        return (io.vertx.core.buffer.Buffer)delegate.setString(pos, str); 
}
// io.vertx.core.buffer.Buffer setString(int pos, java.lang.String str, java.lang.String enc) 
public io.vertx.core.buffer.Buffer setString(int pos, java.lang.String str, java.lang.String enc) {
        return (io.vertx.core.buffer.Buffer)delegate.setString(pos, str, enc); 
}
// int length() 
public int length() {
        return (int)delegate.length(); 
}
// io.vertx.core.buffer.Buffer copy() 
public io.vertx.core.buffer.Buffer copy() {
        return (io.vertx.core.buffer.Buffer)delegate.copy(); 
}
// io.vertx.core.buffer.Buffer slice() 
public io.vertx.core.buffer.Buffer slice() {
        return (io.vertx.core.buffer.Buffer)delegate.slice(); 
}
// io.vertx.core.buffer.Buffer slice(int start, int end) 
public io.vertx.core.buffer.Buffer slice(int start, int end) {
        return (io.vertx.core.buffer.Buffer)delegate.slice(start, end); 
}
}
