namespace java edu.jhu.hlt.concrete
namespace py concrete.metadata
#@namespace scala edu.jhu.hlt.miser

//===========================================================================
// Metadata
//===========================================================================

/** 
 * Analytic-specific information about an attribute or edge. Digests
 * are used to combine information from multiple sources to generate a
 * unified value. The digests generated by an analytic will only ever
 * be used by that same analytic, so analytics can feel free to encode
 * information in whatever way is convenient. 
 */
struct Digest {
  /** 
   * The following fields define various ways you can store the
   * digest data (for convenience). If none of these meets your
   * needs, then serialize the digest to a byte sequence and store it
   * in bytesValue. 
   */
  1: optional binary bytesValue
  2: optional i64 int64Value
  3: optional double doubleValue
  4: optional string stringValue
  5: optional list<i64> int64List
  6: optional list<double> doubleList
  7: optional list<string> stringList
}

/** 
 * Metadata associated with an annotation or a set of annotations,
 * that identifies where those annotations came from. 
 */
struct AnnotationMetadata {
  /** 
   * The name of the tool that generated this annotation. 
   */
  1: string tool

  /** 
   * The time at which this annotation was generated (in unix time
   * UTC -- i.e., seconds since January 1, 1970). 
   */
  2: optional i64 timestamp

  /** 
   * Confidence score. To do: define what this means!
   */
  3: optional double confidence

  /** 
   * A Digest, carrying over any information the annotation metadata
   * wishes to carry over.
   */
  4: optional Digest digest
}
