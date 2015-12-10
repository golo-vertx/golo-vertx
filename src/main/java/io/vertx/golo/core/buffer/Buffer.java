package io.vertx.golo.core.buffer;

import io.vertx.lang.golo.InternalHelper;
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
                // io.vertx.core.buffer.Buffer buffer() 
    // TypeParams: [] 
        public static Buffer buffer() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer buffer(int initialSizeHint) 
    // TypeParams: [] 
        public static Buffer buffer(int initialSizeHint) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(initialSizeHint), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer buffer(java.lang.String string) 
    // TypeParams: [] 
        public static Buffer buffer(String string) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(string), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer buffer(java.lang.String string, java.lang.String enc) 
    // TypeParams: [] 
        public static Buffer buffer(String string,String enc) {
                //param classes(remove later):   STRING   STRING  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(io.vertx.core.buffer.Buffer.buffer(string,enc), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // java.lang.String toString(java.lang.String enc) 
    // TypeParams: [] 
        public String toString(String enc) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return this.delegate.toString(enc); 
    }
        // byte getByte(int pos) 
    // TypeParams: [] 
        public byte getByte(int pos) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return this.delegate.getByte(pos); 
    }
        // short getUnsignedByte(int pos) 
    // TypeParams: [] 
        public short getUnsignedByte(int pos) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return this.delegate.getUnsignedByte(pos); 
    }
        // int getInt(int pos) 
    // TypeParams: [] 
        public int getInt(int pos) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return this.delegate.getInt(pos); 
    }
        // long getUnsignedInt(int pos) 
    // TypeParams: [] 
        public long getUnsignedInt(int pos) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return this.delegate.getUnsignedInt(pos); 
    }
        // long getLong(int pos) 
    // TypeParams: [] 
        public long getLong(int pos) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return this.delegate.getLong(pos); 
    }
        // double getDouble(int pos) 
    // TypeParams: [] 
        public double getDouble(int pos) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return this.delegate.getDouble(pos); 
    }
        // float getFloat(int pos) 
    // TypeParams: [] 
        public float getFloat(int pos) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return this.delegate.getFloat(pos); 
    }
        // short getShort(int pos) 
    // TypeParams: [] 
        public short getShort(int pos) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return this.delegate.getShort(pos); 
    }
        // int getUnsignedShort(int pos) 
    // TypeParams: [] 
        public int getUnsignedShort(int pos) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return this.delegate.getUnsignedShort(pos); 
    }
        // io.vertx.core.buffer.Buffer getBuffer(int start, int end) 
    // TypeParams: [] 
        public Buffer getBuffer(int start,int end) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.getBuffer(start,end), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // java.lang.String getString(int start, int end, java.lang.String enc) 
    // TypeParams: [] 
        public String getString(int start,int end,String enc) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE   STRING  
        //evenTypes (remove later):        
        return this.delegate.getString(start,end,enc); 
    }
        // java.lang.String getString(int start, int end) 
    // TypeParams: [] 
        public String getString(int start,int end) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):      
        return this.delegate.getString(start,end); 
    }
        // io.vertx.core.buffer.Buffer appendBuffer(io.vertx.core.buffer.Buffer buff) 
    // TypeParams: [] 
        public Buffer appendBuffer(Buffer buff) {
                //param classes(remove later):   API  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.appendBuffer(buff), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer appendBuffer(io.vertx.core.buffer.Buffer buff, int offset, int len) 
    // TypeParams: [] 
        public Buffer appendBuffer(Buffer buff,int offset,int len) {
                //param classes(remove later):   API   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):        
        return InternalHelper.safeCreate(this.delegate.appendBuffer(buff,offset,len), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer appendByte(byte b) 
    // TypeParams: [] 
        public Buffer appendByte(byte b) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.appendByte(b), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer appendUnsignedByte(short b) 
    // TypeParams: [] 
        public Buffer appendUnsignedByte(short b) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.appendUnsignedByte(b), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer appendInt(int i) 
    // TypeParams: [] 
        public Buffer appendInt(int i) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.appendInt(i), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer appendUnsignedInt(long i) 
    // TypeParams: [] 
        public Buffer appendUnsignedInt(long i) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.appendUnsignedInt(i), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer appendLong(long l) 
    // TypeParams: [] 
        public Buffer appendLong(long l) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.appendLong(l), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer appendShort(short s) 
    // TypeParams: [] 
        public Buffer appendShort(short s) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.appendShort(s), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer appendUnsignedShort(int s) 
    // TypeParams: [] 
        public Buffer appendUnsignedShort(int s) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.appendUnsignedShort(s), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer appendFloat(float f) 
    // TypeParams: [] 
        public Buffer appendFloat(float f) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.appendFloat(f), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer appendDouble(double d) 
    // TypeParams: [] 
        public Buffer appendDouble(double d) {
                //param classes(remove later):   PRIMITIVE  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.appendDouble(d), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer appendString(java.lang.String str, java.lang.String enc) 
    // TypeParams: [] 
        public Buffer appendString(String str,String enc) {
                //param classes(remove later):   STRING   STRING  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.appendString(str,enc), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer appendString(java.lang.String str) 
    // TypeParams: [] 
        public Buffer appendString(String str) {
                //param classes(remove later):   STRING  
        //evenTypes (remove later):    
        return InternalHelper.safeCreate(this.delegate.appendString(str), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setByte(int pos, byte b) 
    // TypeParams: [] 
        public Buffer setByte(int pos,byte b) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.setByte(pos,b), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setUnsignedByte(int pos, short b) 
    // TypeParams: [] 
        public Buffer setUnsignedByte(int pos,short b) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.setUnsignedByte(pos,b), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setInt(int pos, int i) 
    // TypeParams: [] 
        public Buffer setInt(int pos,int i) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.setInt(pos,i), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setUnsignedInt(int pos, long i) 
    // TypeParams: [] 
        public Buffer setUnsignedInt(int pos,long i) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.setUnsignedInt(pos,i), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setLong(int pos, long l) 
    // TypeParams: [] 
        public Buffer setLong(int pos,long l) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.setLong(pos,l), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setDouble(int pos, double d) 
    // TypeParams: [] 
        public Buffer setDouble(int pos,double d) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.setDouble(pos,d), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setFloat(int pos, float f) 
    // TypeParams: [] 
        public Buffer setFloat(int pos,float f) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.setFloat(pos,f), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setShort(int pos, short s) 
    // TypeParams: [] 
        public Buffer setShort(int pos,short s) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.setShort(pos,s), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setUnsignedShort(int pos, int s) 
    // TypeParams: [] 
        public Buffer setUnsignedShort(int pos,int s) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.setUnsignedShort(pos,s), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b) 
    // TypeParams: [] 
        public Buffer setBuffer(int pos,Buffer b) {
                //param classes(remove later):   PRIMITIVE   API  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.setBuffer(pos,b), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setBuffer(int pos, io.vertx.core.buffer.Buffer b, int offset, int len) 
    // TypeParams: [] 
        public Buffer setBuffer(int pos,Buffer b,int offset,int len) {
                //param classes(remove later):   PRIMITIVE   API   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):          
        return InternalHelper.safeCreate(this.delegate.setBuffer(pos,b,offset,len), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setString(int pos, java.lang.String str) 
    // TypeParams: [] 
        public Buffer setString(int pos,String str) {
                //param classes(remove later):   PRIMITIVE   STRING  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.setString(pos,str), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer setString(int pos, java.lang.String str, java.lang.String enc) 
    // TypeParams: [] 
        public Buffer setString(int pos,String str,String enc) {
                //param classes(remove later):   PRIMITIVE   STRING   STRING  
        //evenTypes (remove later):        
        return InternalHelper.safeCreate(this.delegate.setString(pos,str,enc), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // int length() 
    // TypeParams: [] 
        public int length() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return this.delegate.length(); 
    }
        // io.vertx.core.buffer.Buffer copy() 
    // TypeParams: [] 
        public Buffer copy() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.copy(), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer slice() 
    // TypeParams: [] 
        public Buffer slice() {
                //param classes(remove later):  
        //evenTypes (remove later):  
        return InternalHelper.safeCreate(this.delegate.slice(), io.vertx.golo.core.buffer.Buffer.class); 
    }
        // io.vertx.core.buffer.Buffer slice(int start, int end) 
    // TypeParams: [] 
        public Buffer slice(int start,int end) {
                //param classes(remove later):   PRIMITIVE   PRIMITIVE  
        //evenTypes (remove later):      
        return InternalHelper.safeCreate(this.delegate.slice(start,end), io.vertx.golo.core.buffer.Buffer.class); 
    }
        }
