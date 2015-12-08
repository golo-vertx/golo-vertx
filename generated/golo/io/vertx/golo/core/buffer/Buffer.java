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
public static Buffer buffer() {
        return InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer buffer(int initialSizeHint) 
public static Buffer buffer(int initialSizeHint) {
        return InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(initialSizeHint), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer buffer(java.lang.String string) 
public static Buffer buffer(java.lang.String string) {
        return InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(string), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer buffer(java.lang.String string, java.lang.String enc) 
public static Buffer buffer(java.lang.String string, java.lang.String enc) {
        return InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(string,enc), io.vertx.golo.core.buffer.Buffer.class); 
}
// java.lang.String toString(java.lang.String enc) 
public String toString(java.lang.String enc) {
        return delegate.toString(enc); 
}
// byte getByte(int pos) 
public byte getByte(int pos) {
        return delegate.getByte(pos); 
}
// short getUnsignedByte(int pos) 
public short getUnsignedByte(int pos) {
        return delegate.getUnsignedByte(pos); 
}
// int getInt(int pos) 
public int getInt(int pos) {
        return delegate.getInt(pos); 
}
// long getUnsignedInt(int pos) 
public long getUnsignedInt(int pos) {
        return delegate.getUnsignedInt(pos); 
}
// long getLong(int pos) 
public long getLong(int pos) {
        return delegate.getLong(pos); 
}
// double getDouble(int pos) 
public double getDouble(int pos) {
        return delegate.getDouble(pos); 
}
// float getFloat(int pos) 
public float getFloat(int pos) {
        return delegate.getFloat(pos); 
}
// short getShort(int pos) 
public short getShort(int pos) {
        return delegate.getShort(pos); 
}
// int getUnsignedShort(int pos) 
public int getUnsignedShort(int pos) {
        return delegate.getUnsignedShort(pos); 
}
// io.vertx.core.buffer.Buffer getBuffer(int start, int end) 
public Buffer getBuffer(int start, int end) {
        return InternalHelper.safeCreate(this.delegate.getBuffer(start,end), io.vertx.golo.core.buffer.Buffer.class); 
}
// java.lang.String getString(int start, int end, java.lang.String enc) 
public String getString(int start, int end, java.lang.String enc) {
        return delegate.getString(start,end,enc); 
}
// java.lang.String getString(int start, int end) 
public String getString(int start, int end) {
        return delegate.getString(start,end); 
}
// io.vertx.core.buffer.Buffer appendBuffer(io.vertx.core.buffer.Buffer buff) 
public Buffer appendBuffer(io.vertx.core.buffer.Buffer buff) {
        return InternalHelper.safeCreate(this.delegate.appendBuffer(buff), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer appendBuffer(io.vertx.core.buffer.Buffer buff, int offset, int len) 
public Buffer appendBuffer(io.vertx.core.buffer.Buffer buff, int offset, int len) {
        return InternalHelper.safeCreate(this.delegate.appendBuffer(buff,offset,len), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer appendByte(byte b) 
public Buffer appendByte(byte b) {
        return InternalHelper.safeCreate(this.delegate.appendByte(b), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer appendUnsignedByte(short b) 
public Buffer appendUnsignedByte(short b) {
        return InternalHelper.safeCreate(this.delegate.appendUnsignedByte(b), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer appendInt(int i) 
public Buffer appendInt(int i) {
        return InternalHelper.safeCreate(this.delegate.appendInt(i), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer appendUnsignedInt(long i) 
public Buffer appendUnsignedInt(long i) {
        return InternalHelper.safeCreate(this.delegate.appendUnsignedInt(i), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer appendLong(long l) 
public Buffer appendLong(long l) {
        return InternalHelper.safeCreate(this.delegate.appendLong(l), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer appendShort(short s) 
public Buffer appendShort(short s) {
        return InternalHelper.safeCreate(this.delegate.appendShort(s), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer appendUnsignedShort(int s) 
public Buffer appendUnsignedShort(int s) {
        return InternalHelper.safeCreate(this.delegate.appendUnsignedShort(s), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer appendFloat(float f) 
public Buffer appendFloat(float f) {
        return InternalHelper.safeCreate(this.delegate.appendFloat(f), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer appendDouble(double d) 
public Buffer appendDouble(double d) {
        return InternalHelper.safeCreate(this.delegate.appendDouble(d), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer appendString(java.lang.String str, java.lang.String enc) 
public Buffer appendString(java.lang.String str, java.lang.String enc) {
        return InternalHelper.safeCreate(this.delegate.appendString(str,enc), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer appendString(java.lang.String str) 
public Buffer appendString(java.lang.String str) {
        return InternalHelper.safeCreate(this.delegate.appendString(str), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setByte(int pos, byte b) 
public Buffer setByte(int pos, byte b) {
        return InternalHelper.safeCreate(this.delegate.setByte(pos,b), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setUnsignedByte(int pos, short b) 
public Buffer setUnsignedByte(int pos, short b) {
        return InternalHelper.safeCreate(this.delegate.setUnsignedByte(pos,b), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setInt(int pos, int i) 
public Buffer setInt(int pos, int i) {
        return InternalHelper.safeCreate(this.delegate.setInt(pos,i), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setUnsignedInt(int pos, long i) 
public Buffer setUnsignedInt(int pos, long i) {
        return InternalHelper.safeCreate(this.delegate.setUnsignedInt(pos,i), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setLong(int pos, long l) 
public Buffer setLong(int pos, long l) {
        return InternalHelper.safeCreate(this.delegate.setLong(pos,l), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setDouble(int pos, double d) 
public Buffer setDouble(int pos, double d) {
        return InternalHelper.safeCreate(this.delegate.setDouble(pos,d), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setFloat(int pos, float f) 
public Buffer setFloat(int pos, float f) {
        return InternalHelper.safeCreate(this.delegate.setFloat(pos,f), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setShort(int pos, short s) 
public Buffer setShort(int pos, short s) {
        return InternalHelper.safeCreate(this.delegate.setShort(pos,s), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setUnsignedShort(int pos, int s) 
public Buffer setUnsignedShort(int pos, int s) {
        return InternalHelper.safeCreate(this.delegate.setUnsignedShort(pos,s), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b) 
public Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b) {
        return InternalHelper.safeCreate(this.delegate.setBuffer(pos,b), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b, int offset, int len) 
public Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b, int offset, int len) {
        return InternalHelper.safeCreate(this.delegate.setBuffer(pos,b,offset,len), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setString(int pos, java.lang.String str) 
public Buffer setString(int pos, java.lang.String str) {
        return InternalHelper.safeCreate(this.delegate.setString(pos,str), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer setString(int pos, java.lang.String str, java.lang.String enc) 
public Buffer setString(int pos, java.lang.String str, java.lang.String enc) {
        return InternalHelper.safeCreate(this.delegate.setString(pos,str,enc), io.vertx.golo.core.buffer.Buffer.class); 
}
// int length() 
public int length() {
        return delegate.length(); 
}
// io.vertx.core.buffer.Buffer copy() 
public Buffer copy() {
        return InternalHelper.safeCreate(this.delegate.copy(), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer slice() 
public Buffer slice() {
        return InternalHelper.safeCreate(this.delegate.slice(), io.vertx.golo.core.buffer.Buffer.class); 
}
// io.vertx.core.buffer.Buffer slice(int start, int end) 
public Buffer slice(int start, int end) {
        return InternalHelper.safeCreate(this.delegate.slice(start,end), io.vertx.golo.core.buffer.Buffer.class); 
}
}
