(ns dots.typescript.get-effective-type-roots-host)

(defn current-directory
  ^js [get-effective-type-roots-host]
  (.getCurrentDirectory ^js get-effective-type-roots-host))
