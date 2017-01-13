/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * A span of audio within a single communication, identified by a
 * pair of time offests. Time offsets are zero-based.
 * 
 * NOTE: This span represents a best guess, or 'provenance':
 * it cannot be guaranteed that this text span matches the _exact_
 * text of the original document, but is the annotation's best
 * effort at such a representation.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class AudioSpan implements org.apache.thrift.TBase<AudioSpan, AudioSpan._Fields>, java.io.Serializable, Cloneable, Comparable<AudioSpan> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AudioSpan");

  private static final org.apache.thrift.protocol.TField START_FIELD_DESC = new org.apache.thrift.protocol.TField("start", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField ENDING_FIELD_DESC = new org.apache.thrift.protocol.TField("ending", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AudioSpanStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AudioSpanTupleSchemeFactory());
  }

  private long start; // required
  private long ending; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Start time (in seconds)
     */
    START((short)1, "start"),
    /**
     * End time (in seconds)
     */
    ENDING((short)2, "ending");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // START
          return START;
        case 2: // ENDING
          return ENDING;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __START_ISSET_ID = 0;
  private static final int __ENDING_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START, new org.apache.thrift.meta_data.FieldMetaData("start", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ENDING, new org.apache.thrift.meta_data.FieldMetaData("ending", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AudioSpan.class, metaDataMap);
  }

  public AudioSpan() {
  }

  public AudioSpan(
    long start,
    long ending)
  {
    this();
    this.start = start;
    setStartIsSet(true);
    this.ending = ending;
    setEndingIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AudioSpan(AudioSpan other) {
    __isset_bitfield = other.__isset_bitfield;
    this.start = other.start;
    this.ending = other.ending;
  }

  public AudioSpan deepCopy() {
    return new AudioSpan(this);
  }

  @Override
  public void clear() {
    setStartIsSet(false);
    this.start = 0;
    setEndingIsSet(false);
    this.ending = 0;
  }

  /**
   * Start time (in seconds)
   */
  public long getStart() {
    return this.start;
  }

  /**
   * Start time (in seconds)
   */
  public AudioSpan setStart(long start) {
    this.start = start;
    setStartIsSet(true);
    return this;
  }

  public void unsetStart() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __START_ISSET_ID);
  }

  /** Returns true if field start is set (has been assigned a value) and false otherwise */
  public boolean isSetStart() {
    return EncodingUtils.testBit(__isset_bitfield, __START_ISSET_ID);
  }

  public void setStartIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __START_ISSET_ID, value);
  }

  /**
   * End time (in seconds)
   */
  public long getEnding() {
    return this.ending;
  }

  /**
   * End time (in seconds)
   */
  public AudioSpan setEnding(long ending) {
    this.ending = ending;
    setEndingIsSet(true);
    return this;
  }

  public void unsetEnding() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENDING_ISSET_ID);
  }

  /** Returns true if field ending is set (has been assigned a value) and false otherwise */
  public boolean isSetEnding() {
    return EncodingUtils.testBit(__isset_bitfield, __ENDING_ISSET_ID);
  }

  public void setEndingIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENDING_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START:
      if (value == null) {
        unsetStart();
      } else {
        setStart((Long)value);
      }
      break;

    case ENDING:
      if (value == null) {
        unsetEnding();
      } else {
        setEnding((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START:
      return getStart();

    case ENDING:
      return getEnding();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START:
      return isSetStart();
    case ENDING:
      return isSetEnding();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AudioSpan)
      return this.equals((AudioSpan)that);
    return false;
  }

  public boolean equals(AudioSpan that) {
    if (that == null)
      return false;

    boolean this_present_start = true;
    boolean that_present_start = true;
    if (this_present_start || that_present_start) {
      if (!(this_present_start && that_present_start))
        return false;
      if (this.start != that.start)
        return false;
    }

    boolean this_present_ending = true;
    boolean that_present_ending = true;
    if (this_present_ending || that_present_ending) {
      if (!(this_present_ending && that_present_ending))
        return false;
      if (this.ending != that.ending)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_start = true;
    list.add(present_start);
    if (present_start)
      list.add(start);

    boolean present_ending = true;
    list.add(present_ending);
    if (present_ending)
      list.add(ending);

    return list.hashCode();
  }

  @Override
  public int compareTo(AudioSpan other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStart()).compareTo(other.isSetStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start, other.start);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnding()).compareTo(other.isSetEnding());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnding()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ending, other.ending);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AudioSpan(");
    boolean first = true;

    sb.append("start:");
    sb.append(this.start);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ending:");
    sb.append(this.ending);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'start' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'ending' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AudioSpanStandardSchemeFactory implements SchemeFactory {
    public AudioSpanStandardScheme getScheme() {
      return new AudioSpanStandardScheme();
    }
  }

  private static class AudioSpanStandardScheme extends StandardScheme<AudioSpan> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AudioSpan struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.start = iprot.readI64();
              struct.setStartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENDING
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.ending = iprot.readI64();
              struct.setEndingIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetStart()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'start' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetEnding()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'ending' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AudioSpan struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(START_FIELD_DESC);
      oprot.writeI64(struct.start);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ENDING_FIELD_DESC);
      oprot.writeI64(struct.ending);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AudioSpanTupleSchemeFactory implements SchemeFactory {
    public AudioSpanTupleScheme getScheme() {
      return new AudioSpanTupleScheme();
    }
  }

  private static class AudioSpanTupleScheme extends TupleScheme<AudioSpan> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AudioSpan struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.start);
      oprot.writeI64(struct.ending);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AudioSpan struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.start = iprot.readI64();
      struct.setStartIsSet(true);
      struct.ending = iprot.readI64();
      struct.setEndingIsSet(true);
    }
  }

}

