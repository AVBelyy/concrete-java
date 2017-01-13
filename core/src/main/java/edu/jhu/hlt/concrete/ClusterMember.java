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
 * An item being clustered. Does not designate cluster _membership_, as in
 * "item x belongs to cluster C", but rather just the item ("x" in this
 * example). Membership is indicated through Cluster objects.  An item may be a
 * Entity, EntityMention, Situation, SituationMention, or technically anything
 * with a UUID.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class ClusterMember implements org.apache.thrift.TBase<ClusterMember, ClusterMember._Fields>, java.io.Serializable, Cloneable, Comparable<ClusterMember> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClusterMember");

  private static final org.apache.thrift.protocol.TField COMMUNICATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("communicationId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("setId", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField ELEMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("elementId", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ClusterMemberStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ClusterMemberTupleSchemeFactory());
  }

  private edu.jhu.hlt.concrete.UUID communicationId; // required
  private edu.jhu.hlt.concrete.UUID setId; // required
  private edu.jhu.hlt.concrete.UUID elementId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * UUID of the Communication which contains the item specified by 'elementId'.
     * This is ancillary info assuming UUIDs are indeed universally unique.
     */
    COMMUNICATION_ID((short)1, "communicationId"),
    /**
     * UUID of the Entity|Situation(Mention)Set which contains the item specified by 'elementId'.
     * This is ancillary info assuming UUIDs are indeed universally unique.
     */
    SET_ID((short)2, "setId"),
    /**
     * UUID of the EntityMention, Entity, SituationMention, or Situation that
     * this item represents. This is the characteristic field.
     */
    ELEMENT_ID((short)3, "elementId");

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
        case 2: // SET_ID
          return SET_ID;
        case 3: // ELEMENT_ID
          return ELEMENT_ID;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMMUNICATION_ID, new org.apache.thrift.meta_data.FieldMetaData("communicationId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.SET_ID, new org.apache.thrift.meta_data.FieldMetaData("setId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.ELEMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("elementId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClusterMember.class, metaDataMap);
  }

  public ClusterMember() {
  }

  public ClusterMember(
    edu.jhu.hlt.concrete.UUID communicationId,
    edu.jhu.hlt.concrete.UUID setId,
    edu.jhu.hlt.concrete.UUID elementId)
  {
    this();
    this.communicationId = communicationId;
    this.setId = setId;
    this.elementId = elementId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClusterMember(ClusterMember other) {
    if (other.isSetCommunicationId()) {
      this.communicationId = new edu.jhu.hlt.concrete.UUID(other.communicationId);
    }
    if (other.isSetSetId()) {
      this.setId = new edu.jhu.hlt.concrete.UUID(other.setId);
    }
    if (other.isSetElementId()) {
      this.elementId = new edu.jhu.hlt.concrete.UUID(other.elementId);
    }
  }

  public ClusterMember deepCopy() {
    return new ClusterMember(this);
  }

  @Override
  public void clear() {
    this.communicationId = null;
    this.setId = null;
    this.elementId = null;
  }

  /**
   * UUID of the Communication which contains the item specified by 'elementId'.
   * This is ancillary info assuming UUIDs are indeed universally unique.
   */
  public edu.jhu.hlt.concrete.UUID getCommunicationId() {
    return this.communicationId;
  }

  /**
   * UUID of the Communication which contains the item specified by 'elementId'.
   * This is ancillary info assuming UUIDs are indeed universally unique.
   */
  public ClusterMember setCommunicationId(edu.jhu.hlt.concrete.UUID communicationId) {
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
   * UUID of the Entity|Situation(Mention)Set which contains the item specified by 'elementId'.
   * This is ancillary info assuming UUIDs are indeed universally unique.
   */
  public edu.jhu.hlt.concrete.UUID getSetId() {
    return this.setId;
  }

  /**
   * UUID of the Entity|Situation(Mention)Set which contains the item specified by 'elementId'.
   * This is ancillary info assuming UUIDs are indeed universally unique.
   */
  public ClusterMember setSetId(edu.jhu.hlt.concrete.UUID setId) {
    this.setId = setId;
    return this;
  }

  public void unsetSetId() {
    this.setId = null;
  }

  /** Returns true if field setId is set (has been assigned a value) and false otherwise */
  public boolean isSetSetId() {
    return this.setId != null;
  }

  public void setSetIdIsSet(boolean value) {
    if (!value) {
      this.setId = null;
    }
  }

  /**
   * UUID of the EntityMention, Entity, SituationMention, or Situation that
   * this item represents. This is the characteristic field.
   */
  public edu.jhu.hlt.concrete.UUID getElementId() {
    return this.elementId;
  }

  /**
   * UUID of the EntityMention, Entity, SituationMention, or Situation that
   * this item represents. This is the characteristic field.
   */
  public ClusterMember setElementId(edu.jhu.hlt.concrete.UUID elementId) {
    this.elementId = elementId;
    return this;
  }

  public void unsetElementId() {
    this.elementId = null;
  }

  /** Returns true if field elementId is set (has been assigned a value) and false otherwise */
  public boolean isSetElementId() {
    return this.elementId != null;
  }

  public void setElementIdIsSet(boolean value) {
    if (!value) {
      this.elementId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMMUNICATION_ID:
      if (value == null) {
        unsetCommunicationId();
      } else {
        setCommunicationId((edu.jhu.hlt.concrete.UUID)value);
      }
      break;

    case SET_ID:
      if (value == null) {
        unsetSetId();
      } else {
        setSetId((edu.jhu.hlt.concrete.UUID)value);
      }
      break;

    case ELEMENT_ID:
      if (value == null) {
        unsetElementId();
      } else {
        setElementId((edu.jhu.hlt.concrete.UUID)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMMUNICATION_ID:
      return getCommunicationId();

    case SET_ID:
      return getSetId();

    case ELEMENT_ID:
      return getElementId();

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
    case SET_ID:
      return isSetSetId();
    case ELEMENT_ID:
      return isSetElementId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClusterMember)
      return this.equals((ClusterMember)that);
    return false;
  }

  public boolean equals(ClusterMember that) {
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

    boolean this_present_setId = true && this.isSetSetId();
    boolean that_present_setId = true && that.isSetSetId();
    if (this_present_setId || that_present_setId) {
      if (!(this_present_setId && that_present_setId))
        return false;
      if (!this.setId.equals(that.setId))
        return false;
    }

    boolean this_present_elementId = true && this.isSetElementId();
    boolean that_present_elementId = true && that.isSetElementId();
    if (this_present_elementId || that_present_elementId) {
      if (!(this_present_elementId && that_present_elementId))
        return false;
      if (!this.elementId.equals(that.elementId))
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

    boolean present_setId = true && (isSetSetId());
    list.add(present_setId);
    if (present_setId)
      list.add(setId);

    boolean present_elementId = true && (isSetElementId());
    list.add(present_elementId);
    if (present_elementId)
      list.add(elementId);

    return list.hashCode();
  }

  @Override
  public int compareTo(ClusterMember other) {
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
    lastComparison = Boolean.valueOf(isSetSetId()).compareTo(other.isSetSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.setId, other.setId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetElementId()).compareTo(other.isSetElementId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetElementId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.elementId, other.elementId);
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
    StringBuilder sb = new StringBuilder("ClusterMember(");
    boolean first = true;

    sb.append("communicationId:");
    if (this.communicationId == null) {
      sb.append("null");
    } else {
      sb.append(this.communicationId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("setId:");
    if (this.setId == null) {
      sb.append("null");
    } else {
      sb.append(this.setId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("elementId:");
    if (this.elementId == null) {
      sb.append("null");
    } else {
      sb.append(this.elementId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (communicationId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'communicationId' was not present! Struct: " + toString());
    }
    if (setId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'setId' was not present! Struct: " + toString());
    }
    if (elementId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'elementId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (communicationId != null) {
      communicationId.validate();
    }
    if (setId != null) {
      setId.validate();
    }
    if (elementId != null) {
      elementId.validate();
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

  private static class ClusterMemberStandardSchemeFactory implements SchemeFactory {
    public ClusterMemberStandardScheme getScheme() {
      return new ClusterMemberStandardScheme();
    }
  }

  private static class ClusterMemberStandardScheme extends StandardScheme<ClusterMember> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClusterMember struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.communicationId = new edu.jhu.hlt.concrete.UUID();
              struct.communicationId.read(iprot);
              struct.setCommunicationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.setId = new edu.jhu.hlt.concrete.UUID();
              struct.setId.read(iprot);
              struct.setSetIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ELEMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.elementId = new edu.jhu.hlt.concrete.UUID();
              struct.elementId.read(iprot);
              struct.setElementIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClusterMember struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.communicationId != null) {
        oprot.writeFieldBegin(COMMUNICATION_ID_FIELD_DESC);
        struct.communicationId.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.setId != null) {
        oprot.writeFieldBegin(SET_ID_FIELD_DESC);
        struct.setId.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.elementId != null) {
        oprot.writeFieldBegin(ELEMENT_ID_FIELD_DESC);
        struct.elementId.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClusterMemberTupleSchemeFactory implements SchemeFactory {
    public ClusterMemberTupleScheme getScheme() {
      return new ClusterMemberTupleScheme();
    }
  }

  private static class ClusterMemberTupleScheme extends TupleScheme<ClusterMember> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClusterMember struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.communicationId.write(oprot);
      struct.setId.write(oprot);
      struct.elementId.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClusterMember struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.communicationId = new edu.jhu.hlt.concrete.UUID();
      struct.communicationId.read(iprot);
      struct.setCommunicationIdIsSet(true);
      struct.setId = new edu.jhu.hlt.concrete.UUID();
      struct.setId.read(iprot);
      struct.setSetIdIsSet(true);
      struct.elementId = new edu.jhu.hlt.concrete.UUID();
      struct.elementId.read(iprot);
      struct.setElementIdIsSet(true);
    }
  }

}

