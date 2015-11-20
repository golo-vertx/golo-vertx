package io.vertx.golo.core.Buffer;

public class Buffer { 

private io.vertx.core.buffer.Buffer originalInstance; 
// io.vertx.core.buffer.Buffer buffer() 
public io.vertx.core.buffer.Buffer buffer() {
        return originalInstance.buffer(); 
}
// io.vertx.core.buffer.Buffer buffer(int initialSizeHint) 
public io.vertx.core.buffer.Buffer buffer(int initialSizeHint) {
        return originalInstance.buffer(initialSizeHint); 
}
// io.vertx.core.buffer.Buffer buffer(java.lang.String string) 
public io.vertx.core.buffer.Buffer buffer(java.lang.String string) {
        return originalInstance.buffer(string); 
}
// io.vertx.core.buffer.Buffer buffer(java.lang.String string, java.lang.String enc) 
public io.vertx.core.buffer.Buffer buffer(java.lang.String string, java.lang.String enc) {
        return originalInstance.buffer(string, enc); 
}
// java.lang.String toString(java.lang.String enc) 
public java.lang.String toString(java.lang.String enc) {
        return originalInstance.toString(enc); 
}
// byte getByte(int pos) 
public byte getByte(int pos) {
        return originalInstance.getByte(pos); 
}
// short getUnsignedByte(int pos) 
public short getUnsignedByte(int pos) {
        return originalInstance.getUnsignedByte(pos); 
}
// int getInt(int pos) 
public int getInt(int pos) {
        return originalInstance.getInt(pos); 
}
// long getUnsignedInt(int pos) 
public long getUnsignedInt(int pos) {
        return originalInstance.getUnsignedInt(pos); 
}
// long getLong(int pos) 
public long getLong(int pos) {
        return originalInstance.getLong(pos); 
}
// double getDouble(int pos) 
public double getDouble(int pos) {
        return originalInstance.getDouble(pos); 
}
// float getFloat(int pos) 
public float getFloat(int pos) {
        return originalInstance.getFloat(pos); 
}
// short getShort(int pos) 
public short getShort(int pos) {
        return originalInstance.getShort(pos); 
}
// int getUnsignedShort(int pos) 
public int getUnsignedShort(int pos) {
        return originalInstance.getUnsignedShort(pos); 
}
// io.vertx.core.buffer.Buffer getBuffer(int start, int end) 
public io.vertx.core.buffer.Buffer getBuffer(int start, int end) {
        return originalInstance.getBuffer(start, end); 
}
// java.lang.String getString(int start, int end, java.lang.String enc) 
public java.lang.String getString(int start, int end, java.lang.String enc) {
        return originalInstance.getString(start, end, enc); 
}
// java.lang.String getString(int start, int end) 
public java.lang.String getString(int start, int end) {
        return originalInstance.getString(start, end); 
}
// io.vertx.core.buffer.Buffer appendBuffer(io.vertx.core.buffer.Buffer buff) 
public io.vertx.core.buffer.Buffer appendBuffer(io.vertx.core.buffer.Buffer buff) {
        return originalInstance.appendBuffer(buff); 
}
// io.vertx.core.buffer.Buffer appendBuffer(io.vertx.core.buffer.Buffer buff, int offset, int len) 
public io.vertx.core.buffer.Buffer appendBuffer(io.vertx.core.buffer.Buffer buff, int offset, int len) {
        return originalInstance.appendBuffer(buff, offset, len); 
}
// io.vertx.core.buffer.Buffer appendByte(byte b) 
public io.vertx.core.buffer.Buffer appendByte(byte b) {
        return originalInstance.appendByte(b); 
}
// io.vertx.core.buffer.Buffer appendUnsignedByte(short b) 
public io.vertx.core.buffer.Buffer appendUnsignedByte(short b) {
        return originalInstance.appendUnsignedByte(b); 
}
// io.vertx.core.buffer.Buffer appendInt(int i) 
public io.vertx.core.buffer.Buffer appendInt(int i) {
        return originalInstance.appendInt(i); 
}
// io.vertx.core.buffer.Buffer appendUnsignedInt(long i) 
public io.vertx.core.buffer.Buffer appendUnsignedInt(long i) {
        return originalInstance.appendUnsignedInt(i); 
}
// io.vertx.core.buffer.Buffer appendLong(long l) 
public io.vertx.core.buffer.Buffer appendLong(long l) {
        return originalInstance.appendLong(l); 
}
// io.vertx.core.buffer.Buffer appendShort(short s) 
public io.vertx.core.buffer.Buffer appendShort(short s) {
        return originalInstance.appendShort(s); 
}
// io.vertx.core.buffer.Buffer appendUnsignedShort(int s) 
public io.vertx.core.buffer.Buffer appendUnsignedShort(int s) {
        return originalInstance.appendUnsignedShort(s); 
}
// io.vertx.core.buffer.Buffer appendFloat(float f) 
public io.vertx.core.buffer.Buffer appendFloat(float f) {
        return originalInstance.appendFloat(f); 
}
// io.vertx.core.buffer.Buffer appendDouble(double d) 
public io.vertx.core.buffer.Buffer appendDouble(double d) {
        return originalInstance.appendDouble(d); 
}
// io.vertx.core.buffer.Buffer appendString(java.lang.String str, java.lang.String enc) 
public io.vertx.core.buffer.Buffer appendString(java.lang.String str, java.lang.String enc) {
        return originalInstance.appendString(str, enc); 
}
// io.vertx.core.buffer.Buffer appendString(java.lang.String str) 
public io.vertx.core.buffer.Buffer appendString(java.lang.String str) {
        return originalInstance.appendString(str); 
}
// io.vertx.core.buffer.Buffer setByte(int pos, byte b) 
public io.vertx.core.buffer.Buffer setByte(int pos, byte b) {
        return originalInstance.setByte(pos, b); 
}
// io.vertx.core.buffer.Buffer setUnsignedByte(int pos, short b) 
public io.vertx.core.buffer.Buffer setUnsignedByte(int pos, short b) {
        return originalInstance.setUnsignedByte(pos, b); 
}
// io.vertx.core.buffer.Buffer setInt(int pos, int i) 
public io.vertx.core.buffer.Buffer setInt(int pos, int i) {
        return originalInstance.setInt(pos, i); 
}
// io.vertx.core.buffer.Buffer setUnsignedInt(int pos, long i) 
public io.vertx.core.buffer.Buffer setUnsignedInt(int pos, long i) {
        return originalInstance.setUnsignedInt(pos, i); 
}
// io.vertx.core.buffer.Buffer setLong(int pos, long l) 
public io.vertx.core.buffer.Buffer setLong(int pos, long l) {
        return originalInstance.setLong(pos, l); 
}
// io.vertx.core.buffer.Buffer setDouble(int pos, double d) 
public io.vertx.core.buffer.Buffer setDouble(int pos, double d) {
        return originalInstance.setDouble(pos, d); 
}
// io.vertx.core.buffer.Buffer setFloat(int pos, float f) 
public io.vertx.core.buffer.Buffer setFloat(int pos, float f) {
        return originalInstance.setFloat(pos, f); 
}
// io.vertx.core.buffer.Buffer setShort(int pos, short s) 
public io.vertx.core.buffer.Buffer setShort(int pos, short s) {
        return originalInstance.setShort(pos, s); 
}
// io.vertx.core.buffer.Buffer setUnsignedShort(int pos, int s) 
public io.vertx.core.buffer.Buffer setUnsignedShort(int pos, int s) {
        return originalInstance.setUnsignedShort(pos, s); 
}
// io.vertx.core.buffer.Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b) 
public io.vertx.core.buffer.Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b) {
        return originalInstance.setBuffer(pos, b); 
}
// io.vertx.core.buffer.Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b, int offset, int len) 
public io.vertx.core.buffer.Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b, int offset, int len) {
        return originalInstance.setBuffer(pos, b, offset, len); 
}
// io.vertx.core.buffer.Buffer setString(int pos, java.lang.String str) 
public io.vertx.core.buffer.Buffer setString(int pos, java.lang.String str) {
        return originalInstance.setString(pos, str); 
}
// io.vertx.core.buffer.Buffer setString(int pos, java.lang.String str, java.lang.String enc) 
public io.vertx.core.buffer.Buffer setString(int pos, java.lang.String str, java.lang.String enc) {
        return originalInstance.setString(pos, str, enc); 
}
// int length() 
public int length() {
        return originalInstance.length(); 
}
// io.vertx.core.buffer.Buffer copy() 
public io.vertx.core.buffer.Buffer copy() {
        return originalInstance.copy(); 
}
// io.vertx.core.buffer.Buffer slice() 
public io.vertx.core.buffer.Buffer slice() {
        return originalInstance.slice(); 
}
// io.vertx.core.buffer.Buffer slice(int start, int end) 
public io.vertx.core.buffer.Buffer slice(int start, int end) {
        return originalInstance.slice(start, end); 
}
}
