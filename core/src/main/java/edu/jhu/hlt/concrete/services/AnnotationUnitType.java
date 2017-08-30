/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete.services;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * An annotation unit is the part of the communication to be annotated.
 */
public enum AnnotationUnitType implements org.apache.thrift.TEnum {
  COMMUNICATION(1),
  SENTENCE(2);

  private final int value;

  private AnnotationUnitType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static AnnotationUnitType findByValue(int value) { 
    switch (value) {
      case 1:
        return COMMUNICATION;
      case 2:
        return SENTENCE;
      default:
        return null;
    }
  }
}
