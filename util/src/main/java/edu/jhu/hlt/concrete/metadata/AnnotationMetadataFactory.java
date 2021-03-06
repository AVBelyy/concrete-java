/*
 * Copyright 2012-2015 Johns Hopkins University HLTCOE. All rights reserved.
 * See LICENSE in the project root directory.
 */

package edu.jhu.hlt.concrete.metadata;

import edu.jhu.hlt.concrete.AnnotationMetadata;
import edu.jhu.hlt.concrete.util.Timing;

/**
 * Class that allows for construction of semi-built {@link AnnotationMetadata}
 * objects.
 */
public class AnnotationMetadataFactory {

  private AnnotationMetadataFactory() {

  }

  /**
   * @return an {@link AnnotationMetadata} object with the timestamp
   * set to the current "Unix" time, in UTC.
   */
  public static final AnnotationMetadata fromCurrentUTCTime() {
    return new AnnotationMetadata()
      .setTimestamp(Timing.currentLocalTime());
  }

  /**
   * @return an {@link AnnotationMetadata} object with the timestamp
   * set to the current "Unix" time, in the local time zone.
   */
  public static final AnnotationMetadata fromCurrentLocalTime() {
    return new AnnotationMetadata()
      .setTimestamp(Timing.currentLocalTime());
  }

  public static final AnnotationMetadata fromCurrentLocalTime(String tool) {
    return fromCurrentLocalTime()
        .setTool(tool);
  }
}
