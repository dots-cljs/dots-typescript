(ns dots.typescript.watch-of-config-file
  "Creates the watch what generates program using the config file")

(defn program
  "Synchronize with host and get updated program
   
   **Returns:** `T`"
  ^js [watch-of-config-file]
  (.getProgram ^js watch-of-config-file))

(defn close
  "Closes the watch
   
   **Returns:** `void`"
  ^js [watch-of-config-file]
  (.close ^js watch-of-config-file))
