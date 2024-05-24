(ns dots.typescript.get-effective-type-roots-host)

(defn current-directory
  "**Returns:** `string`"
  ^js [get-effective-type-roots-host]
  (.getCurrentDirectory ^js get-effective-type-roots-host))
