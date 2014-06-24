/*
 * 
 */
package edu.jhu.hlt.concrete.util;

import edu.jhu.hlt.concrete.UUID;

/**
 * @author max
 *
 */
public class ConcreteUUIDFactory {

  /**
   * 
   */
  public ConcreteUUIDFactory() {
    // TODO Auto-generated constructor stub
  }

  public UUID getConcreteUUID() {
    return new UUID(java.util.UUID.randomUUID().toString());
  }
  
  public UUID convertUUIDString(String uuidString) throws InvalidUUIDException {
    if (Util.isValidUUIDString(uuidString))
      return new UUID(uuidString);
    else
      throw new InvalidUUIDException("Not a UUID: " + uuidString);
  }
  
  public java.util.UUID concreteToJavaUUID(UUID uuid) {
    return java.util.UUID.fromString(uuid.getUuidString());
  }
}