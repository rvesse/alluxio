package alluxio.mesos;

/**
 * Possible worker placement strategies.
 *
 */
public enum WorkerPlacement {
  /**
   * Workers may be placed on any Mesos slave that does not have an Alluxio Master placed on it.
   */
  NOT_MASTER,
  /**
   * Workers may be placed on any Mesos slave.
   */
  ANY
}
