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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class LatticePath implements org.apache.thrift.TBase<LatticePath, LatticePath._Fields>, java.io.Serializable, Cloneable, Comparable<LatticePath> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LatticePath");

  private static final org.apache.thrift.protocol.TField WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("weight", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField TOKEN_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("tokenList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LatticePathStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LatticePathTupleSchemeFactory());
  }

  private double weight; // optional
  private List<Token> tokenList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WEIGHT((short)1, "weight"),
    TOKEN_LIST((short)2, "tokenList");

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
        case 1: // WEIGHT
          return WEIGHT;
        case 2: // TOKEN_LIST
          return TOKEN_LIST;
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
  private static final int __WEIGHT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.WEIGHT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("weight", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.TOKEN_LIST, new org.apache.thrift.meta_data.FieldMetaData("tokenList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Token.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LatticePath.class, metaDataMap);
  }

  public LatticePath() {
  }

  public LatticePath(
    List<Token> tokenList)
  {
    this();
    this.tokenList = tokenList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LatticePath(LatticePath other) {
    __isset_bitfield = other.__isset_bitfield;
    this.weight = other.weight;
    if (other.isSetTokenList()) {
      List<Token> __this__tokenList = new ArrayList<Token>(other.tokenList.size());
      for (Token other_element : other.tokenList) {
        __this__tokenList.add(new Token(other_element));
      }
      this.tokenList = __this__tokenList;
    }
  }

  public LatticePath deepCopy() {
    return new LatticePath(this);
  }

  @Override
  public void clear() {
    setWeightIsSet(false);
    this.weight = 0.0;
    this.tokenList = null;
  }

  public double getWeight() {
    return this.weight;
  }

  public LatticePath setWeight(double weight) {
    this.weight = weight;
    setWeightIsSet(true);
    return this;
  }

  public void unsetWeight() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  /** Returns true if field weight is set (has been assigned a value) and false otherwise */
  public boolean isSetWeight() {
    return EncodingUtils.testBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  public void setWeightIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WEIGHT_ISSET_ID, value);
  }

  public int getTokenListSize() {
    return (this.tokenList == null) ? 0 : this.tokenList.size();
  }

  public java.util.Iterator<Token> getTokenListIterator() {
    return (this.tokenList == null) ? null : this.tokenList.iterator();
  }

  public void addToTokenList(Token elem) {
    if (this.tokenList == null) {
      this.tokenList = new ArrayList<Token>();
    }
    this.tokenList.add(elem);
  }

  public List<Token> getTokenList() {
    return this.tokenList;
  }

  public LatticePath setTokenList(List<Token> tokenList) {
    this.tokenList = tokenList;
    return this;
  }

  public void unsetTokenList() {
    this.tokenList = null;
  }

  /** Returns true if field tokenList is set (has been assigned a value) and false otherwise */
  public boolean isSetTokenList() {
    return this.tokenList != null;
  }

  public void setTokenListIsSet(boolean value) {
    if (!value) {
      this.tokenList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WEIGHT:
      if (value == null) {
        unsetWeight();
      } else {
        setWeight((Double)value);
      }
      break;

    case TOKEN_LIST:
      if (value == null) {
        unsetTokenList();
      } else {
        setTokenList((List<Token>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WEIGHT:
      return getWeight();

    case TOKEN_LIST:
      return getTokenList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WEIGHT:
      return isSetWeight();
    case TOKEN_LIST:
      return isSetTokenList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LatticePath)
      return this.equals((LatticePath)that);
    return false;
  }

  public boolean equals(LatticePath that) {
    if (that == null)
      return false;

    boolean this_present_weight = true && this.isSetWeight();
    boolean that_present_weight = true && that.isSetWeight();
    if (this_present_weight || that_present_weight) {
      if (!(this_present_weight && that_present_weight))
        return false;
      if (this.weight != that.weight)
        return false;
    }

    boolean this_present_tokenList = true && this.isSetTokenList();
    boolean that_present_tokenList = true && that.isSetTokenList();
    if (this_present_tokenList || that_present_tokenList) {
      if (!(this_present_tokenList && that_present_tokenList))
        return false;
      if (!this.tokenList.equals(that.tokenList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_weight = true && (isSetWeight());
    list.add(present_weight);
    if (present_weight)
      list.add(weight);

    boolean present_tokenList = true && (isSetTokenList());
    list.add(present_tokenList);
    if (present_tokenList)
      list.add(tokenList);

    return list.hashCode();
  }

  @Override
  public int compareTo(LatticePath other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWeight()).compareTo(other.isSetWeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.weight, other.weight);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTokenList()).compareTo(other.isSetTokenList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTokenList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tokenList, other.tokenList);
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
    StringBuilder sb = new StringBuilder("LatticePath(");
    boolean first = true;

    if (isSetWeight()) {
      sb.append("weight:");
      sb.append(this.weight);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("tokenList:");
    if (this.tokenList == null) {
      sb.append("null");
    } else {
      sb.append(this.tokenList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (tokenList == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tokenList' was not present! Struct: " + toString());
    }
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

  private static class LatticePathStandardSchemeFactory implements SchemeFactory {
    public LatticePathStandardScheme getScheme() {
      return new LatticePathStandardScheme();
    }
  }

  private static class LatticePathStandardScheme extends StandardScheme<LatticePath> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LatticePath struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.weight = iprot.readDouble();
              struct.setWeightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOKEN_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                struct.tokenList = new ArrayList<Token>(_list64.size);
                Token _elem65;
                for (int _i66 = 0; _i66 < _list64.size; ++_i66)
                {
                  _elem65 = new Token();
                  _elem65.read(iprot);
                  struct.tokenList.add(_elem65);
                }
                iprot.readListEnd();
              }
              struct.setTokenListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LatticePath struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetWeight()) {
        oprot.writeFieldBegin(WEIGHT_FIELD_DESC);
        oprot.writeDouble(struct.weight);
        oprot.writeFieldEnd();
      }
      if (struct.tokenList != null) {
        oprot.writeFieldBegin(TOKEN_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tokenList.size()));
          for (Token _iter67 : struct.tokenList)
          {
            _iter67.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LatticePathTupleSchemeFactory implements SchemeFactory {
    public LatticePathTupleScheme getScheme() {
      return new LatticePathTupleScheme();
    }
  }

  private static class LatticePathTupleScheme extends TupleScheme<LatticePath> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LatticePath struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tokenList.size());
        for (Token _iter68 : struct.tokenList)
        {
          _iter68.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetWeight()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetWeight()) {
        oprot.writeDouble(struct.weight);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LatticePath struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list69 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.tokenList = new ArrayList<Token>(_list69.size);
        Token _elem70;
        for (int _i71 = 0; _i71 < _list69.size; ++_i71)
        {
          _elem70 = new Token();
          _elem70.read(iprot);
          struct.tokenList.add(_elem70);
        }
      }
      struct.setTokenListIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.weight = iprot.readDouble();
        struct.setWeightIsSet(true);
      }
    }
  }

}

