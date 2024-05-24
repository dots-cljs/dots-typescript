(ns dots.typescript.watch)

(defn program
  "Synchronize with host and get updated program
   
   **Returns:** `T`"
  ^js [watch]
  (.getProgram ^js watch))

(defn close
  "Closes the watch
   
   **Returns:** `void`"
  ^js [watch]
  (.close ^js watch))
