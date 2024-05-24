(ns dots.typescript.file-watcher)

(defn close
  "**Returns:** `void`"
  ^js [file-watcher]
  (.close ^js file-watcher))
