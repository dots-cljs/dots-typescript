(ns dots.typescript.get-effective-type-roots-host)

(defn directory-exists?
  ^js [get-effective-type-roots-host directory-name]
  (.directoryExists ^js get-effective-type-roots-host directory-name))

(defn current-directory
  ^js [get-effective-type-roots-host]
  (.getCurrentDirectory ^js get-effective-type-roots-host))
