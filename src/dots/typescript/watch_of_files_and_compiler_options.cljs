(ns dots.typescript.watch-of-files-and-compiler-options
  "Creates the watch that generates program using the root files and compiler options")

(defn update-root-file-names
  "Updates the root files in the program, only if this is not config file compilation
   
   **Parameters:**
   - `file-names`: `string[]`
   
   **Returns:** `void`"
  ^js [watch-of-files-and-compiler-options file-names]
  (.updateRootFileNames ^js watch-of-files-and-compiler-options file-names))

(defn program
  "Synchronize with host and get updated program
   
   **Returns:** `T`"
  ^js [watch-of-files-and-compiler-options]
  (.getProgram ^js watch-of-files-and-compiler-options))

(defn close
  "Closes the watch
   
   **Returns:** `void`"
  ^js [watch-of-files-and-compiler-options]
  (.close ^js watch-of-files-and-compiler-options))
