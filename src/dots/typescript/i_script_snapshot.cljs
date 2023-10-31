(ns dots.typescript.i-script-snapshot
  "Represents an immutable snapshot of a script at a specified time.Once acquired, the
   snapshot is observably immutable. i.e. the same calls with the same parameters will return
   the same values.")

(defn text
  "Gets a portion of the script snapshot specified by [start, end)."
  ^js [i-script-snapshot start end]
  (.getText ^js i-script-snapshot start end))

(defn length
  "Gets the length of this script snapshot."
  ^js [i-script-snapshot]
  (.getLength ^js i-script-snapshot))

(defn change-range
  "Gets the TextChangeRange that describe how the text changed between this text and
   an older version.  This information is used by the incremental parser to determine
   what sections of the script need to be re-parsed.  'undefined' can be returned if the
   change range cannot be determined.  However, in that case, incremental parsing will
   not happen and the entire document will be re - parsed."
  ^js [i-script-snapshot old-snapshot]
  (.getChangeRange ^js i-script-snapshot old-snapshot))

(defn dispose
  "Releases all resources held by this script snapshot"
  ^js [i-script-snapshot]
  (.dispose ^js i-script-snapshot))
