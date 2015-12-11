package io.vertx.golo.core.buffer;

import io.vertx.lang.golo.InternalHelper;
import io.vertx.golo.core.metrics.Measured;
import java.util.Map;
import io.vertx.core.json.JsonObject;
import io.vertx.core.shareddata.impl.ClusterSerializable;
// Type: io.vertx.core.buffer.Buffer 
public class Buffer {
      private io.vertx.core.buffer.Buffer delegate;
  public Buffer(Object delegate) {
    this.delegate = (io.vertx.core.buffer.Buffer) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Create a new, empty buffer.
   * @return the buffer
   */
  public static Buffer buffer() {
return    InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(), io.vertx.golo.core.buffer.Buffer.class);
  }
  /**
   * Create a new buffer given the initial size hint.
   * <p>
   * If you know the buffer will require a certain size, providing the hint can prevent unnecessary re-allocations
   * as the buffer is written to and resized.
   * @param initialSizeHint the hint, in bytes
   * @return the buffer
   */
  public static Buffer buffer(int initialSizeHint) {
return    InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(initialSizeHint), io.vertx.golo.core.buffer.Buffer.class);
  }
  /**
   * Create a new buffer from a string. The string will be UTF-8 encoded into the buffer.
   * @param string the string
   * @return the buffer
   */
  public static Buffer buffer(String string) {
return    InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(string), io.vertx.golo.core.buffer.Buffer.class);
  }
  /**
   * Create a new buffer from a string and using the specified encoding.
   * The string will be encoded into the buffer using the specified encoding.
   * @param string the string
   * @param enc 
   * @return the buffer
   */
  public static Buffer buffer(String string, String enc) {
return    InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(string, enc), io.vertx.golo.core.buffer.Buffer.class);
  }
  /**
   * Returns a <code>String</code> representation of the Buffer with the encoding specified by <code>enc</code>
   * @param enc 
   * @return 
   */
  public String toString(String enc) {
return    this.delegate.toString(enc);
  }
  /**
   * Returns the <code>byte</code> at position <code>pos</code> in the Buffer.
   * @param pos 
   * @return 
   */
  public byte getByte(int pos) {
return    this.delegate.getByte(pos);
  }
  /**
   * Returns the unsigned <code>byte</code> at position <code>pos</code> in the Buffer, as a <code>short</code>.
   * @param pos 
   * @return 
   */
  public short getUnsignedByte(int pos) {
return    this.delegate.getUnsignedByte(pos);
  }
  /**
   * Returns the <code>int</code> at position <code>pos</code> in the Buffer.
   * @param pos 
   * @return 
   */
  public int getInt(int pos) {
return    this.delegate.getInt(pos);
  }
  /**
   * Returns the unsigned <code>int</code> at position <code>pos</code> in the Buffer, as a <code>long</code>.
   * @param pos 
   * @return 
   */
  public long getUnsignedInt(int pos) {
return    this.delegate.getUnsignedInt(pos);
  }
  /**
   * Returns the <code>long</code> at position <code>pos</code> in the Buffer.
   * @param pos 
   * @return 
   */
  public long getLong(int pos) {
return    this.delegate.getLong(pos);
  }
  /**
   * Returns the <code>double</code> at position <code>pos</code> in the Buffer.
   * @param pos 
   * @return 
   */
  public double getDouble(int pos) {
return    this.delegate.getDouble(pos);
  }
  /**
   * Returns the <code>float</code> at position <code>pos</code> in the Buffer.
   * @param pos 
   * @return 
   */
  public float getFloat(int pos) {
return    this.delegate.getFloat(pos);
  }
  /**
   * Returns the <code>short</code> at position <code>pos</code> in the Buffer.
   * @param pos 
   * @return 
   */
  public short getShort(int pos) {
return    this.delegate.getShort(pos);
  }
  /**
   * Returns the unsigned <code>short</code> at position <code>pos</code> in the Buffer, as an <code>int</code>.
   * @param pos 
   * @return 
   */
  public int getUnsignedShort(int pos) {
return    this.delegate.getUnsignedShort(pos);
  }
  /**
   * Returns a copy of a sub-sequence the Buffer as a {@link io.vertx.golo.core.buffer.Buffer} starting at position <code>start</code>
   * and ending at position <code>end - 1</code>
   * @param start 
   * @param end 
   * @return 
   */
  public Buffer getBuffer(int start, int end) {
return    InternalHelper.safeCreate(this.delegate.getBuffer(start, end), io.vertx.golo.core.buffer.Buffer.class);
  }
  /**
   * Returns a copy of a sub-sequence the Buffer as a <code>String</code> starting at position <code>start</code>
   * and ending at position <code>end - 1</code> interpreted as a String in the specified encoding
   * @param start 
   * @param end 
   * @param enc 
   * @return 
   */
  public String getString(int start, int end, String enc) {
return    this.delegate.getString(start, end, enc);
  }
  /**
   * Returns a copy of a sub-sequence the Buffer as a <code>String</code> starting at position <code>start</code>
   * and ending at position <code>end - 1</code> interpreted as a String in UTF-8 encoding
   * @param start 
   * @param end 
   * @return 
   */
  public String getString(int start, int end) {
return    this.delegate.getString(start, end);
  }
  /**
   * Appends the specified <code>Buffer</code> to the end of this Buffer. The buffer will expand as necessary to accommodate
   * any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together.
   * @param buff 
   * @return 
   */
  public Buffer appendBuffer(Buffer buff) {
    this.delegate.appendBuffer((io.vertx.core.buffer.Buffer)buff.getDelegate());
    return this;
  }
  /**
   * Appends the specified <code>Buffer</code> starting at the <code>offset</code> using <code>len</code> to the end of this Buffer. The buffer will expand as necessary to accommodate
   * any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together.
   * @param buff 
   * @param offset 
   * @param len 
   * @return 
   */
  public Buffer appendBuffer(Buffer buff, int offset, int len) {
    this.delegate.appendBuffer((io.vertx.core.buffer.Buffer)buff.getDelegate(), offset, len);
    return this;
  }
  /**
   * Appends the specified <code>byte</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together.
   * @param b 
   * @return 
   */
  public Buffer appendByte(byte b) {
    this.delegate.appendByte(b);
    return this;
  }
  /**
   * Appends the specified unsigned <code>byte</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together.
   * @param b 
   * @return 
   */
  public Buffer appendUnsignedByte(short b) {
    this.delegate.appendUnsignedByte(b);
    return this;
  }
  /**
   * Appends the specified <code>int</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together.
   * @param i 
   * @return 
   */
  public Buffer appendInt(int i) {
    this.delegate.appendInt(i);
    return this;
  }
  /**
   * Appends the specified unsigned <code>int</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together.
   * @param i 
   * @return 
   */
  public Buffer appendUnsignedInt(long i) {
    this.delegate.appendUnsignedInt(i);
    return this;
  }
  /**
   * Appends the specified <code>long</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together.
   * @param l 
   * @return 
   */
  public Buffer appendLong(long l) {
    this.delegate.appendLong(l);
    return this;
  }
  /**
   * Appends the specified <code>short</code> to the end of the Buffer.The buffer will expand as necessary to accommodate any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together.
   * @param s 
   * @return 
   */
  public Buffer appendShort(short s) {
    this.delegate.appendShort(s);
    return this;
  }
  /**
   * Appends the specified unsigned <code>short</code> to the end of the Buffer.The buffer will expand as necessary to accommodate any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together.
   * @param s 
   * @return 
   */
  public Buffer appendUnsignedShort(int s) {
    this.delegate.appendUnsignedShort(s);
    return this;
  }
  /**
   * Appends the specified <code>float</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together.
   * @param f 
   * @return 
   */
  public Buffer appendFloat(float f) {
    this.delegate.appendFloat(f);
    return this;
  }
  /**
   * Appends the specified <code>double</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together.
   * @param d 
   * @return 
   */
  public Buffer appendDouble(double d) {
    this.delegate.appendDouble(d);
    return this;
  }
  /**
   * Appends the specified <code>String</code> to the end of the Buffer with the encoding as specified by <code>enc</code>.<p>
   * The buffer will expand as necessary to accommodate any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together.<p>
   * @param str 
   * @param enc 
   * @return 
   */
  public Buffer appendString(String str, String enc) {
    this.delegate.appendString(str, enc);
    return this;
  }
  /**
   * Appends the specified <code>String str</code> to the end of the Buffer with UTF-8 encoding.<p>
   * The buffer will expand as necessary to accommodate any bytes written.<p>
   * Returns a reference to <code>this</code> so multiple operations can be appended together<p>
   * @param str 
   * @return 
   */
  public Buffer appendString(String str) {
    this.delegate.appendString(str);
    return this;
  }
  /**
   * Sets the <code>byte</code> at position <code>pos</code> in the Buffer to the value <code>b</code>.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param b 
   * @return 
   */
  public Buffer setByte(int pos, byte b) {
    this.delegate.setByte(pos, b);
    return this;
  }
  /**
   * Sets the unsigned <code>byte</code> at position <code>pos</code> in the Buffer to the value <code>b</code>.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param b 
   * @return 
   */
  public Buffer setUnsignedByte(int pos, short b) {
return    InternalHelper.safeCreate(this.delegate.setUnsignedByte(pos, b), io.vertx.golo.core.buffer.Buffer.class);
  }
  /**
   * Sets the <code>int</code> at position <code>pos</code> in the Buffer to the value <code>i</code>.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param i 
   * @return 
   */
  public Buffer setInt(int pos, int i) {
    this.delegate.setInt(pos, i);
    return this;
  }
  /**
   * Sets the unsigned <code>int</code> at position <code>pos</code> in the Buffer to the value <code>i</code>.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param i 
   * @return 
   */
  public Buffer setUnsignedInt(int pos, long i) {
    this.delegate.setUnsignedInt(pos, i);
    return this;
  }
  /**
   * Sets the <code>long</code> at position <code>pos</code> in the Buffer to the value <code>l</code>.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param l 
   * @return 
   */
  public Buffer setLong(int pos, long l) {
    this.delegate.setLong(pos, l);
    return this;
  }
  /**
   * Sets the <code>double</code> at position <code>pos</code> in the Buffer to the value <code>d</code>.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param d 
   * @return 
   */
  public Buffer setDouble(int pos, double d) {
    this.delegate.setDouble(pos, d);
    return this;
  }
  /**
   * Sets the <code>float</code> at position <code>pos</code> in the Buffer to the value <code>f</code>.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param f 
   * @return 
   */
  public Buffer setFloat(int pos, float f) {
    this.delegate.setFloat(pos, f);
    return this;
  }
  /**
   * Sets the <code>short</code> at position <code>pos</code> in the Buffer to the value <code>s</code>.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param s 
   * @return 
   */
  public Buffer setShort(int pos, short s) {
    this.delegate.setShort(pos, s);
    return this;
  }
  /**
   * Sets the unsigned <code>short</code> at position <code>pos</code> in the Buffer to the value <code>s</code>.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param s 
   * @return 
   */
  public Buffer setUnsignedShort(int pos, int s) {
    this.delegate.setUnsignedShort(pos, s);
    return this;
  }
  /**
   * Sets the bytes at position <code>pos</code> in the Buffer to the bytes represented by the <code>Buffer b</code>.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param b 
   * @return 
   */
  public Buffer setBuffer(int pos, Buffer b) {
    this.delegate.setBuffer(pos, (io.vertx.core.buffer.Buffer)b.getDelegate());
    return this;
  }
  /**
   * Sets the bytes at position <code>pos</code> in the Buffer to the bytes represented by the <code>Buffer b</code> on the given <code>offset</code> and <code>len</code>.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param b 
   * @param offset 
   * @param len 
   * @return 
   */
  public Buffer setBuffer(int pos, Buffer b, int offset, int len) {
    this.delegate.setBuffer(pos, (io.vertx.core.buffer.Buffer)b.getDelegate(), offset, len);
    return this;
  }
  /**
   * Sets the bytes at position <code>pos</code> in the Buffer to the value of <code>str</code> encoded in UTF-8.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param str 
   * @return 
   */
  public Buffer setString(int pos, String str) {
    this.delegate.setString(pos, str);
    return this;
  }
  /**
   * Sets the bytes at position <code>pos</code> in the Buffer to the value of <code>str</code> encoded in encoding <code>enc</code>.<p>
   * The buffer will expand as necessary to accommodate any value written.
   * @param pos 
   * @param str 
   * @param enc 
   * @return 
   */
  public Buffer setString(int pos, String str, String enc) {
    this.delegate.setString(pos, str, enc);
    return this;
  }
  /**
   * Returns the length of the buffer, measured in bytes.
   * All positions are indexed from zero.
   * @return 
   */
  public int length() {
return    this.delegate.length();
  }
  /**
   * Returns a copy of the entire Buffer.
   * @return 
   */
  public Buffer copy() {
return    InternalHelper.safeCreate(this.delegate.copy(), io.vertx.golo.core.buffer.Buffer.class);
  }
  /**
   * Returns a slice of this buffer. Modifying the content
   * of the returned buffer or this buffer affects each other's content
   * while they maintain separate indexes and marks.
   * @return 
   */
  public Buffer slice() {
return    InternalHelper.safeCreate(this.delegate.slice(), io.vertx.golo.core.buffer.Buffer.class);
  }
  /**
   * Returns a slice of this buffer. Modifying the content
   * of the returned buffer or this buffer affects each other's content
   * while they maintain separate indexes and marks.
   * @param start 
   * @param end 
   * @return 
   */
  public Buffer slice(int start, int end) {
return    InternalHelper.safeCreate(this.delegate.slice(start, end), io.vertx.golo.core.buffer.Buffer.class);
  }
}
