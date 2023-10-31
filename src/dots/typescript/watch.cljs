(ns dots.typescript.watch)

(defn program
  "Synchronize with host and get updated program"
  ^js [watch]
  (.getProgram ^js watch))

(defn close
  "Closes the watch"
  ^js [watch]
  (.close ^js watch))
