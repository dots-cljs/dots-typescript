(ns dots.typescript.file-watcher)

(defn close
  ^js [file-watcher]
  (.close ^js file-watcher))
