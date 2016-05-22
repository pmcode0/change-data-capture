/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package crypto.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroEncryptedMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroEncryptedMessage\",\"namespace\":\"crypto.avro\",\"fields\":[{\"name\":\"encryptedMessage\",\"type\":\"bytes\"},{\"name\":\"keys\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AvroKeyVersion\",\"fields\":[{\"name\":\"encryptedKey\",\"type\":\"bytes\"},{\"name\":\"encryptedIV\",\"type\":\"bytes\"},{\"name\":\"versionName\",\"type\":\"string\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.nio.ByteBuffer encryptedMessage;
  @Deprecated public java.util.List<crypto.avro.AvroKeyVersion> keys;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public AvroEncryptedMessage() {}

  /**
   * All-args constructor.
   */
  public AvroEncryptedMessage(java.nio.ByteBuffer encryptedMessage, java.util.List<crypto.avro.AvroKeyVersion> keys) {
    this.encryptedMessage = encryptedMessage;
    this.keys = keys;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return encryptedMessage;
    case 1: return keys;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: encryptedMessage = (java.nio.ByteBuffer)value$; break;
    case 1: keys = (java.util.List<crypto.avro.AvroKeyVersion>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'encryptedMessage' field.
   */
  public java.nio.ByteBuffer getEncryptedMessage() {
    return encryptedMessage;
  }

  /**
   * Sets the value of the 'encryptedMessage' field.
   * @param value the value to set.
   */
  public void setEncryptedMessage(java.nio.ByteBuffer value) {
    this.encryptedMessage = value;
  }

  /**
   * Gets the value of the 'keys' field.
   */
  public java.util.List<crypto.avro.AvroKeyVersion> getKeys() {
    return keys;
  }

  /**
   * Sets the value of the 'keys' field.
   * @param value the value to set.
   */
  public void setKeys(java.util.List<crypto.avro.AvroKeyVersion> value) {
    this.keys = value;
  }

  /** Creates a new AvroEncryptedMessage RecordBuilder */
  public static crypto.avro.AvroEncryptedMessage.Builder newBuilder() {
    return new crypto.avro.AvroEncryptedMessage.Builder();
  }
  
  /** Creates a new AvroEncryptedMessage RecordBuilder by copying an existing Builder */
  public static crypto.avro.AvroEncryptedMessage.Builder newBuilder(crypto.avro.AvroEncryptedMessage.Builder other) {
    return new crypto.avro.AvroEncryptedMessage.Builder(other);
  }
  
  /** Creates a new AvroEncryptedMessage RecordBuilder by copying an existing AvroEncryptedMessage instance */
  public static crypto.avro.AvroEncryptedMessage.Builder newBuilder(crypto.avro.AvroEncryptedMessage other) {
    return new crypto.avro.AvroEncryptedMessage.Builder(other);
  }
  
  /**
   * RecordBuilder for AvroEncryptedMessage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroEncryptedMessage>
    implements org.apache.avro.data.RecordBuilder<AvroEncryptedMessage> {

    private java.nio.ByteBuffer encryptedMessage;
    private java.util.List<crypto.avro.AvroKeyVersion> keys;

    /** Creates a new Builder */
    private Builder() {
      super(crypto.avro.AvroEncryptedMessage.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(crypto.avro.AvroEncryptedMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.encryptedMessage)) {
        this.encryptedMessage = data().deepCopy(fields()[0].schema(), other.encryptedMessage);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.keys)) {
        this.keys = data().deepCopy(fields()[1].schema(), other.keys);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing AvroEncryptedMessage instance */
    private Builder(crypto.avro.AvroEncryptedMessage other) {
            super(crypto.avro.AvroEncryptedMessage.SCHEMA$);
      if (isValidValue(fields()[0], other.encryptedMessage)) {
        this.encryptedMessage = data().deepCopy(fields()[0].schema(), other.encryptedMessage);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.keys)) {
        this.keys = data().deepCopy(fields()[1].schema(), other.keys);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'encryptedMessage' field */
    public java.nio.ByteBuffer getEncryptedMessage() {
      return encryptedMessage;
    }
    
    /** Sets the value of the 'encryptedMessage' field */
    public crypto.avro.AvroEncryptedMessage.Builder setEncryptedMessage(java.nio.ByteBuffer value) {
      validate(fields()[0], value);
      this.encryptedMessage = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'encryptedMessage' field has been set */
    public boolean hasEncryptedMessage() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'encryptedMessage' field */
    public crypto.avro.AvroEncryptedMessage.Builder clearEncryptedMessage() {
      encryptedMessage = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'keys' field */
    public java.util.List<crypto.avro.AvroKeyVersion> getKeys() {
      return keys;
    }
    
    /** Sets the value of the 'keys' field */
    public crypto.avro.AvroEncryptedMessage.Builder setKeys(java.util.List<crypto.avro.AvroKeyVersion> value) {
      validate(fields()[1], value);
      this.keys = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'keys' field has been set */
    public boolean hasKeys() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'keys' field */
    public crypto.avro.AvroEncryptedMessage.Builder clearKeys() {
      keys = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public AvroEncryptedMessage build() {
      try {
        AvroEncryptedMessage record = new AvroEncryptedMessage();
        record.encryptedMessage = fieldSetFlags()[0] ? this.encryptedMessage : (java.nio.ByteBuffer) defaultValue(fields()[0]);
        record.keys = fieldSetFlags()[1] ? this.keys : (java.util.List<crypto.avro.AvroKeyVersion>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}