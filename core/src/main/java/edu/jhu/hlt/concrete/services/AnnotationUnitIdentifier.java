/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete.services;

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
 * An annotation unit is the part of the communication to be annotated.
 * It can be the entire communication or a particular sentence in the communication.
 * If the sentenceID is null, the unit is the entire communication
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class AnnotationUnitIdentifier implements org.apache.thrift.TBase<AnnotationUnitIdentifier, AnnotationUnitIdentifier._Fields>, java.io.Serializable, Cloneable, Comparable<AnnotationUnitIdentifier> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AnnotationUnitIdentifier");

  private static final org.apache.thrift.protocol.TField COMMUNICATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("communicationId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SENTENCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sentenceId", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AnnotationUnitIdentifierStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AnnotationUnitIdentifierTupleSchemeFactory());
  }

  private String communicationId; // required
  private edu.jhu.hlt.concrete.UUID sentenceId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Communication identifier for loading data
     */
    COMMUNICATION_ID((short)1, "communicationId"),
    /**
     * Sentence identifer if annotating sentences
     */
    SENTENCE_ID((short)2, "sentenceId");

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
        case 1: // COMMUNICATION_ID
          return COMMUNICATION_ID;
        case 2: // SENTENCE_ID
          return SENTENCE_ID;
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
  private static final _Fields optionals[] = {_Fields.SENTENCE_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMMUNICATION_ID, new org.apache.thrift.meta_data.FieldMetaData("communicationId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SENTENCE_ID, new org.apache.thrift.meta_data.FieldMetaData("sentenceId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AnnotationUnitIdentifier.class, metaDataMap);
  }

  public AnnotationUnitIdentifier() {
  }

  public AnnotationUnitIdentifier(
    String communicationId)
  {
    this();
    this.communicationId = communicationId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AnnotationUnitIdentifier(AnnotationUnitIdentifier other) {
    if (other.isSetCommunicationId()) {
      this.communicationId = other.communicationId;
    }
    if (other.isSetSentenceId()) {
      this.sentenceId = new edu.jhu.hlt.concrete.UUID(other.sentenceId);
    }
  }

  public AnnotationUnitIdentifier deepCopy() {
    return new AnnotationUnitIdentifier(this);
  }

  @Override
  public void clear() {
    this.communicationId = null;
    this.sentenceId = null;
  }

  /**
   * Communication identifier for loading data
   */
  public String getCommunicationId() {
    return this.communicationId;
  }

  /**
   * Communication identifier for loading data
   */
  public AnnotationUnitIdentifier setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }

  public void unsetCommunicationId() {
    this.communicationId = null;
  }

  /** Returns true if field communicationId is set (has been assigned a value) and false otherwise */
  public boolean isSetCommunicationId() {
    return this.communicationId != null;
  }

  public void setCommunicationIdIsSet(boolean value) {
    if (!value) {
      this.communicationId = null;
    }
  }

  /**
   * Sentence identifer if annotating sentences
   */
  public edu.jhu.hlt.concrete.UUID getSentenceId() {
    return this.sentenceId;
  }

  /**
   * Sentence identifer if annotating sentences
   */
  public AnnotationUnitIdentifier setSentenceId(edu.jhu.hlt.concrete.UUID sentenceId) {
    this.sentenceId = sentenceId;
    return this;
  }

  public void unsetSentenceId() {
    this.sentenceId = null;
  }

  /** Returns true if field sentenceId is set (has been assigned a value) and false otherwise */
  public boolean isSetSentenceId() {
    return this.sentenceId != null;
  }

  public void setSentenceIdIsSet(boolean value) {
    if (!value) {
      this.sentenceId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMMUNICATION_ID:
      if (value == null) {
        unsetCommunicationId();
      } else {
        setCommunicationId((String)value);
      }
      break;

    case SENTENCE_ID:
      if (value == null) {
        unsetSentenceId();
      } else {
        setSentenceId((edu.jhu.hlt.concrete.UUID)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMMUNICATION_ID:
      return getCommunicationId();

    case SENTENCE_ID:
      return getSentenceId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMMUNICATION_ID:
      return isSetCommunicationId();
    case SENTENCE_ID:
      return isSetSentenceId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AnnotationUnitIdentifier)
      return this.equals((AnnotationUnitIdentifier)that);
    return false;
  }

  public boolean equals(AnnotationUnitIdentifier that) {
    if (that == null)
      return false;

    boolean this_present_communicationId = true && this.isSetCommunicationId();
    boolean that_present_communicationId = true && that.isSetCommunicationId();
    if (this_present_communicationId || that_present_communicationId) {
      if (!(this_present_communicationId && that_present_communicationId))
        return false;
      if (!this.communicationId.equals(that.communicationId))
        return false;
    }

    boolean this_present_sentenceId = true && this.isSetSentenceId();
    boolean that_present_sentenceId = true && that.isSetSentenceId();
    if (this_present_sentenceId || that_present_sentenceId) {
      if (!(this_present_sentenceId && that_present_sentenceId))
        return false;
      if (!this.sentenceId.equals(that.sentenceId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_communicationId = true && (isSetCommunicationId());
    list.add(present_communicationId);
    if (present_communicationId)
      list.add(communicationId);

    boolean present_sentenceId = true && (isSetSentenceId());
    list.add(present_sentenceId);
    if (present_sentenceId)
      list.add(sentenceId);

    return list.hashCode();
  }

  @Override
  public int compareTo(AnnotationUnitIdentifier other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCommunicationId()).compareTo(other.isSetCommunicationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommunicationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.communicationId, other.communicationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSentenceId()).compareTo(other.isSetSentenceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSentenceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sentenceId, other.sentenceId);
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
    StringBuilder sb = new StringBuilder("AnnotationUnitIdentifier(");
    boolean first = true;

    sb.append("communicationId:");
    if (this.communicationId == null) {
      sb.append("null");
    } else {
      sb.append(this.communicationId);
    }
    first = false;
    if (isSetSentenceId()) {
      if (!first) sb.append(", ");
      sb.append("sentenceId:");
      if (this.sentenceId == null) {
        sb.append("null");
      } else {
        sb.append(this.sentenceId);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (communicationId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'communicationId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (sentenceId != null) {
      sentenceId.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AnnotationUnitIdentifierStandardSchemeFactory implements SchemeFactory {
    public AnnotationUnitIdentifierStandardScheme getScheme() {
      return new AnnotationUnitIdentifierStandardScheme();
    }
  }

  private static class AnnotationUnitIdentifierStandardScheme extends StandardScheme<AnnotationUnitIdentifier> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AnnotationUnitIdentifier struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMMUNICATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.communicationId = iprot.readString();
              struct.setCommunicationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SENTENCE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sentenceId = new edu.jhu.hlt.concrete.UUID();
              struct.sentenceId.read(iprot);
              struct.setSentenceIdIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AnnotationUnitIdentifier struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.communicationId != null) {
        oprot.writeFieldBegin(COMMUNICATION_ID_FIELD_DESC);
        oprot.writeString(struct.communicationId);
        oprot.writeFieldEnd();
      }
      if (struct.sentenceId != null) {
        if (struct.isSetSentenceId()) {
          oprot.writeFieldBegin(SENTENCE_ID_FIELD_DESC);
          struct.sentenceId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AnnotationUnitIdentifierTupleSchemeFactory implements SchemeFactory {
    public AnnotationUnitIdentifierTupleScheme getScheme() {
      return new AnnotationUnitIdentifierTupleScheme();
    }
  }

  private static class AnnotationUnitIdentifierTupleScheme extends TupleScheme<AnnotationUnitIdentifier> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AnnotationUnitIdentifier struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.communicationId);
      BitSet optionals = new BitSet();
      if (struct.isSetSentenceId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSentenceId()) {
        struct.sentenceId.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AnnotationUnitIdentifier struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.communicationId = iprot.readString();
      struct.setCommunicationIdIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.sentenceId = new edu.jhu.hlt.concrete.UUID();
        struct.sentenceId.read(iprot);
        struct.setSentenceIdIsSet(true);
      }
    }
  }

}

