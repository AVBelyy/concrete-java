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
 * A structure that represents the target of an entity linking annotation.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class LinkTarget implements org.apache.thrift.TBase<LinkTarget, LinkTarget._Fields>, java.io.Serializable, Cloneable, Comparable<LinkTarget> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LinkTarget");

  private static final org.apache.thrift.protocol.TField CONFIDENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("confidence", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField TARGET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("targetId", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField DB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dbId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LinkTargetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LinkTargetTupleSchemeFactory());
  }

  private double confidence; // optional
  private edu.jhu.hlt.concrete.UUID targetId; // optional
  private String dbId; // optional
  private String dbName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Confidence of this LinkTarget object.
     */
    CONFIDENCE((short)1, "confidence"),
    /**
     * A UUID that represents the target of this LinkTarget. This
     * UUID should exist in the Entity/Situation(Mention)Set that the
     * Linking object is contained in.
     */
    TARGET_ID((short)2, "targetId"),
    /**
     * A database ID that represents the target of this linking.
     * 
     * This should be used if the target of the linking is not associated
     * with an Entity|Situation(Mention)Set in Concrete, and therefore cannot be linked by
     * a UUID internal to concrete.
     * 
     * If present, other optional field 'dbName' should also be populated.
     */
    DB_ID((short)3, "dbId"),
    /**
     * The name of the database that represents the target of this linking.
     * 
     * Together with the 'dbId', this can form a pointer to a target
     * that is not represented inside concrete.
     * 
     * Should be populated alongside 'dbId'.
     */
    DB_NAME((short)4, "dbName");

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
        case 1: // CONFIDENCE
          return CONFIDENCE;
        case 2: // TARGET_ID
          return TARGET_ID;
        case 3: // DB_ID
          return DB_ID;
        case 4: // DB_NAME
          return DB_NAME;
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
  private static final int __CONFIDENCE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CONFIDENCE,_Fields.TARGET_ID,_Fields.DB_ID,_Fields.DB_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONFIDENCE, new org.apache.thrift.meta_data.FieldMetaData("confidence", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.TARGET_ID, new org.apache.thrift.meta_data.FieldMetaData("targetId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.DB_ID, new org.apache.thrift.meta_data.FieldMetaData("dbId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LinkTarget.class, metaDataMap);
  }

  public LinkTarget() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LinkTarget(LinkTarget other) {
    __isset_bitfield = other.__isset_bitfield;
    this.confidence = other.confidence;
    if (other.isSetTargetId()) {
      this.targetId = new edu.jhu.hlt.concrete.UUID(other.targetId);
    }
    if (other.isSetDbId()) {
      this.dbId = other.dbId;
    }
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
  }

  public LinkTarget deepCopy() {
    return new LinkTarget(this);
  }

  @Override
  public void clear() {
    setConfidenceIsSet(false);
    this.confidence = 0.0;
    this.targetId = null;
    this.dbId = null;
    this.dbName = null;
  }

  /**
   * Confidence of this LinkTarget object.
   */
  public double getConfidence() {
    return this.confidence;
  }

  /**
   * Confidence of this LinkTarget object.
   */
  public LinkTarget setConfidence(double confidence) {
    this.confidence = confidence;
    setConfidenceIsSet(true);
    return this;
  }

  public void unsetConfidence() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONFIDENCE_ISSET_ID);
  }

  /** Returns true if field confidence is set (has been assigned a value) and false otherwise */
  public boolean isSetConfidence() {
    return EncodingUtils.testBit(__isset_bitfield, __CONFIDENCE_ISSET_ID);
  }

  public void setConfidenceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONFIDENCE_ISSET_ID, value);
  }

  /**
   * A UUID that represents the target of this LinkTarget. This
   * UUID should exist in the Entity/Situation(Mention)Set that the
   * Linking object is contained in.
   */
  public edu.jhu.hlt.concrete.UUID getTargetId() {
    return this.targetId;
  }

  /**
   * A UUID that represents the target of this LinkTarget. This
   * UUID should exist in the Entity/Situation(Mention)Set that the
   * Linking object is contained in.
   */
  public LinkTarget setTargetId(edu.jhu.hlt.concrete.UUID targetId) {
    this.targetId = targetId;
    return this;
  }

  public void unsetTargetId() {
    this.targetId = null;
  }

  /** Returns true if field targetId is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetId() {
    return this.targetId != null;
  }

  public void setTargetIdIsSet(boolean value) {
    if (!value) {
      this.targetId = null;
    }
  }

  /**
   * A database ID that represents the target of this linking.
   * 
   * This should be used if the target of the linking is not associated
   * with an Entity|Situation(Mention)Set in Concrete, and therefore cannot be linked by
   * a UUID internal to concrete.
   * 
   * If present, other optional field 'dbName' should also be populated.
   */
  public String getDbId() {
    return this.dbId;
  }

  /**
   * A database ID that represents the target of this linking.
   * 
   * This should be used if the target of the linking is not associated
   * with an Entity|Situation(Mention)Set in Concrete, and therefore cannot be linked by
   * a UUID internal to concrete.
   * 
   * If present, other optional field 'dbName' should also be populated.
   */
  public LinkTarget setDbId(String dbId) {
    this.dbId = dbId;
    return this;
  }

  public void unsetDbId() {
    this.dbId = null;
  }

  /** Returns true if field dbId is set (has been assigned a value) and false otherwise */
  public boolean isSetDbId() {
    return this.dbId != null;
  }

  public void setDbIdIsSet(boolean value) {
    if (!value) {
      this.dbId = null;
    }
  }

  /**
   * The name of the database that represents the target of this linking.
   * 
   * Together with the 'dbId', this can form a pointer to a target
   * that is not represented inside concrete.
   * 
   * Should be populated alongside 'dbId'.
   */
  public String getDbName() {
    return this.dbName;
  }

  /**
   * The name of the database that represents the target of this linking.
   * 
   * Together with the 'dbId', this can form a pointer to a target
   * that is not represented inside concrete.
   * 
   * Should be populated alongside 'dbId'.
   */
  public LinkTarget setDbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CONFIDENCE:
      if (value == null) {
        unsetConfidence();
      } else {
        setConfidence((Double)value);
      }
      break;

    case TARGET_ID:
      if (value == null) {
        unsetTargetId();
      } else {
        setTargetId((edu.jhu.hlt.concrete.UUID)value);
      }
      break;

    case DB_ID:
      if (value == null) {
        unsetDbId();
      } else {
        setDbId((String)value);
      }
      break;

    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CONFIDENCE:
      return getConfidence();

    case TARGET_ID:
      return getTargetId();

    case DB_ID:
      return getDbId();

    case DB_NAME:
      return getDbName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CONFIDENCE:
      return isSetConfidence();
    case TARGET_ID:
      return isSetTargetId();
    case DB_ID:
      return isSetDbId();
    case DB_NAME:
      return isSetDbName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LinkTarget)
      return this.equals((LinkTarget)that);
    return false;
  }

  public boolean equals(LinkTarget that) {
    if (that == null)
      return false;

    boolean this_present_confidence = true && this.isSetConfidence();
    boolean that_present_confidence = true && that.isSetConfidence();
    if (this_present_confidence || that_present_confidence) {
      if (!(this_present_confidence && that_present_confidence))
        return false;
      if (this.confidence != that.confidence)
        return false;
    }

    boolean this_present_targetId = true && this.isSetTargetId();
    boolean that_present_targetId = true && that.isSetTargetId();
    if (this_present_targetId || that_present_targetId) {
      if (!(this_present_targetId && that_present_targetId))
        return false;
      if (!this.targetId.equals(that.targetId))
        return false;
    }

    boolean this_present_dbId = true && this.isSetDbId();
    boolean that_present_dbId = true && that.isSetDbId();
    if (this_present_dbId || that_present_dbId) {
      if (!(this_present_dbId && that_present_dbId))
        return false;
      if (!this.dbId.equals(that.dbId))
        return false;
    }

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_confidence = true && (isSetConfidence());
    list.add(present_confidence);
    if (present_confidence)
      list.add(confidence);

    boolean present_targetId = true && (isSetTargetId());
    list.add(present_targetId);
    if (present_targetId)
      list.add(targetId);

    boolean present_dbId = true && (isSetDbId());
    list.add(present_dbId);
    if (present_dbId)
      list.add(dbId);

    boolean present_dbName = true && (isSetDbName());
    list.add(present_dbName);
    if (present_dbName)
      list.add(dbName);

    return list.hashCode();
  }

  @Override
  public int compareTo(LinkTarget other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetConfidence()).compareTo(other.isSetConfidence());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfidence()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.confidence, other.confidence);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTargetId()).compareTo(other.isSetTargetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetId, other.targetId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbId()).compareTo(other.isSetDbId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbId, other.dbId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbName()).compareTo(other.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, other.dbName);
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
    StringBuilder sb = new StringBuilder("LinkTarget(");
    boolean first = true;

    if (isSetConfidence()) {
      sb.append("confidence:");
      sb.append(this.confidence);
      first = false;
    }
    if (isSetTargetId()) {
      if (!first) sb.append(", ");
      sb.append("targetId:");
      if (this.targetId == null) {
        sb.append("null");
      } else {
        sb.append(this.targetId);
      }
      first = false;
    }
    if (isSetDbId()) {
      if (!first) sb.append(", ");
      sb.append("dbId:");
      if (this.dbId == null) {
        sb.append("null");
      } else {
        sb.append(this.dbId);
      }
      first = false;
    }
    if (isSetDbName()) {
      if (!first) sb.append(", ");
      sb.append("dbName:");
      if (this.dbName == null) {
        sb.append("null");
      } else {
        sb.append(this.dbName);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (targetId != null) {
      targetId.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LinkTargetStandardSchemeFactory implements SchemeFactory {
    public LinkTargetStandardScheme getScheme() {
      return new LinkTargetStandardScheme();
    }
  }

  private static class LinkTargetStandardScheme extends StandardScheme<LinkTarget> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LinkTarget struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONFIDENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.confidence = iprot.readDouble();
              struct.setConfidenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TARGET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.targetId = new edu.jhu.hlt.concrete.UUID();
              struct.targetId.read(iprot);
              struct.setTargetIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbId = iprot.readString();
              struct.setDbIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LinkTarget struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetConfidence()) {
        oprot.writeFieldBegin(CONFIDENCE_FIELD_DESC);
        oprot.writeDouble(struct.confidence);
        oprot.writeFieldEnd();
      }
      if (struct.targetId != null) {
        if (struct.isSetTargetId()) {
          oprot.writeFieldBegin(TARGET_ID_FIELD_DESC);
          struct.targetId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.dbId != null) {
        if (struct.isSetDbId()) {
          oprot.writeFieldBegin(DB_ID_FIELD_DESC);
          oprot.writeString(struct.dbId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.dbName != null) {
        if (struct.isSetDbName()) {
          oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
          oprot.writeString(struct.dbName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LinkTargetTupleSchemeFactory implements SchemeFactory {
    public LinkTargetTupleScheme getScheme() {
      return new LinkTargetTupleScheme();
    }
  }

  private static class LinkTargetTupleScheme extends TupleScheme<LinkTarget> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LinkTarget struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetConfidence()) {
        optionals.set(0);
      }
      if (struct.isSetTargetId()) {
        optionals.set(1);
      }
      if (struct.isSetDbId()) {
        optionals.set(2);
      }
      if (struct.isSetDbName()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetConfidence()) {
        oprot.writeDouble(struct.confidence);
      }
      if (struct.isSetTargetId()) {
        struct.targetId.write(oprot);
      }
      if (struct.isSetDbId()) {
        oprot.writeString(struct.dbId);
      }
      if (struct.isSetDbName()) {
        oprot.writeString(struct.dbName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LinkTarget struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.confidence = iprot.readDouble();
        struct.setConfidenceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.targetId = new edu.jhu.hlt.concrete.UUID();
        struct.targetId.read(iprot);
        struct.setTargetIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.dbId = iprot.readString();
        struct.setDbIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.dbName = iprot.readString();
        struct.setDbNameIsSet(true);
      }
    }
  }

}
