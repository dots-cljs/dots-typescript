(ns dots.typescript.format-diagnostics-host)

(defn current-directory
  ^js [format-diagnostics-host]
  (.getCurrentDirectory ^js format-diagnostics-host))

(defn canonical-file-name
  ^js [format-diagnostics-host file-name]
  (.getCanonicalFileName ^js format-diagnostics-host file-name))

(defn new-line
  ^js [format-diagnostics-host]
  (.getNewLine ^js format-diagnostics-host))
